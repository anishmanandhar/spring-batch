package org.akm.integration.report;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		run();
	}
	
	private static void run() {

		String[] springConfig = { "batch/archive-job.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("archiveJob");

		try {

			JobParameters param = new JobParametersBuilder().addString("param", "param").toJobParameters();
			JobExecution execution = jobLauncher.run(job, param);
			LOG.info("Exit Status : " + execution.getStatus());
			LOG.info("Exit Status : " + execution.getAllFailureExceptions());
		} catch (Exception e) {
			e.printStackTrace();

		}
		((ConfigurableApplicationContext)context).close();
		LOG.info("Done");

	}
}

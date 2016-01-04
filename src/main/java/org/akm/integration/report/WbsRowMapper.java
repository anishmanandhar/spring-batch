package org.akm.integration.report;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

/**
 * 
 * @author anish
 *
 */
public class WbsRowMapper extends Thread implements RowMapper<WbsElementDto>{

	private static final Logger LOG = LoggerFactory.getLogger(WbsRowMapper.class);
	
	public WbsElementDto mapRow(ResultSet arg0, int arg1) throws SQLException {
		LOG.info("#####################################################################");
		WbsElementDto wbsElementDto = new WbsElementDto();
		wbsElementDto.setClientId(arg0.getString(1));
		wbsElementDto.setCode(arg0.getString(2));
		wbsElementDto.setDescription(arg0.getString(3));
		wbsElementDto.setCompanyCode(arg0.getString(4));
		LOG.info(String.format("execute thread: %s %s",Thread.currentThread().getName(), this.getName()));
		LOG.info("{}",wbsElementDto);
		return wbsElementDto;
	}

}

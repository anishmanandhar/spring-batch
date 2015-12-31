package com.vroozi.api.integration.report;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * 
 * @author anish
 *
 */
public class WbsRowMapper implements RowMapper<WbsElementDto>{

	private static int count = 0;
	
	public WbsElementDto mapRow(ResultSet arg0, int arg1) throws SQLException {
		System.out.println("Mapping wbs elements");
		WbsElementDto wbsElementDto = new WbsElementDto();
		wbsElementDto.setClientId(arg0.getString(1));
		wbsElementDto.setCode(arg0.getString(2));
		wbsElementDto.setDescription(arg0.getString(3));
		wbsElementDto.setCompanyCode(arg0.getString(4));
		
		count++;
		System.out.println(count);
		System.out.println(wbsElementDto);
		return wbsElementDto;
	}

}

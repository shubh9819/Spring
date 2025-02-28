package com.basic.Spring;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;

public class Empdao {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		System.out.println("im in set jdbc template");
		this.jdbcTemplate=jdbcTemplate;
	}
	public int saveemp(employee e) {
		String querry="insert into emp values('"+e.getId()+"','"+e.getName()+"','"+e.getMail()+"','"+e.getSal()+"')";
		return jdbcTemplate.update(querry);
		
	}
	public List<employee> getdata(){
		return jdbcTemplate.query("select * from emp", new ResultSetExtractor<List<employee>>(){
			public List<employee> extractData(ResultSet rs) throws SQLException {
				List<employee>list=new ArrayList<employee>();
				while (rs.next()) {
					employee e=new employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setMail(rs.getString(3));
					e.setSal(rs.getInt(4));
					list.add(e);
				}
				return list;
			}
		});
	}
//	public int updateEmployee( employee employee) throws ClassNotFoundException, SQLException {
//		int status=0;
//		  String query1="update emp set id=? ,name=? ,mail=? ,sal=? where id=?";
//		   PreparedStatement ps= jdbcTemplate.prepareStatement(query1);
//		   ps.setLong(1,employee.getId());
//		   
//		   ps.setNString(2,employee.getName());
//
//		 
//
//		   ps.setNString(4,employee.getMail());
//
//		   ps.setLong(5,employee.getSal());
//		   ps.setLong(6, employee.getId());
//	    
//	        return jdbcTemplate.update(query1);
//		
//	}
}

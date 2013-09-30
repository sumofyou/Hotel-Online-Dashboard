package com.sample.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.sample.domain.UserRegister;
import javax.sql.DataSource;
 
public class HotelDao {
	
    private JdbcTemplate jdbcTemplate;
	
	
	 public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void validateUser(UserRegister userRegister) {
		 System.out.println("HotelDao.validateUser");
	 }
	 
	 
	 private String driverClassName;	 
	 private String url;
	 private String username;
	 private String password;
	 
	 
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	    public void setDataSource(DataSource dataSource) {
	        this.jdbcTemplate = new JdbcTemplate(dataSource);
	    }

	 
	    public boolean validateUser(String userName) {
	        try {
	            int number = this.jdbcTemplate.queryForInt("select count(*) from huser where userName=?", userName);
	            if (number > 0) {
	                return true;
	            }
	        } catch (Exception exception) {
	            exception.printStackTrace();
	        }
	        return false;
	    } 
	 
}

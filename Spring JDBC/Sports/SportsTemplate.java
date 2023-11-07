package com.springHello;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class SportsTemplate implements SportsDAO {
	String name;
	String Type;
	int noOfPlayer;
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void delete(String name) {
		String SQL = "delete from sports where name=?";
		jdbcTemplateObject.update(SQL, name);
		System.out.println("Record Deleted With sports name " + name);
		return;
	}

	public void insert(String name, String type, int no) {
		String SQL = "insert into sports (name, type, no) values (?, ?, ?)";
		jdbcTemplateObject.update(SQL, name, type, no);
		System.out.println("Created Record Name = " + name + " Type = " + type + " no of player = " + no);
		return;
	}
}

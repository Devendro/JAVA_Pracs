package com.springHello;

import javax.sql.DataSource;
public interface SportsDAO {
	public void setDataSource(DataSource ds);
	public void insert(String name, String type, int no);
	public void delete(String name);
}

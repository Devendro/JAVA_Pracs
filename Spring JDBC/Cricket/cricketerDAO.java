// src/main/java/<package>
// run main.java

package com.springHello;

import java.util.List;
import javax.sql.DataSource;
public interface cricketerDAO {
	public void setDataSource(DataSource ds);
	public void insert(String name, Integer runs, Integer bestRuns);
	public List<cricketer> listCricketers();
}

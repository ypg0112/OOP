package com.personal.db.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseUtils {
	
	private static final String DB_URL_KEY ="DB_URL";
	private static final String USER_NAME_KEY ="UserName";
	private static final String PASSWORD_KEY ="Password";
	
	public static Connection getConnection() throws SQLException {

		Properties prop = getDbConfigProperties("/dbconfig.properties");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		con = DriverManager.getConnection(prop.getProperty(DB_URL_KEY),prop.getProperty(USER_NAME_KEY),prop.getProperty(PASSWORD_KEY));
		return con;
		
	}
	
	private static Properties getDbConfigProperties(String fileName) {
		Properties prop = new Properties();
		
		InputStream inStream = DatabaseUtils.class.getResourceAsStream(fileName);
		
		try {
			prop.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}

package com.java.naga.AzureSpringSQLApp;

import java.sql.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureSpringSqlAppApplication {

	public static void main(String[] args) throws SQLException {
//
//		String connectionString = "jdbc:sqlserver://springapps.database.windows.net:1433;database=testDB;user=nagaraga3761@springapps;password=Babloo@3761;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=120;";
//
//		Connection conn = DriverManager.getConnection(connectionString);
//		Statement statement = conn.createStatement();
//		String sql = "CREATE TABLE REGISTRATION " + "(id INTEGER not NULL, " + " first VARCHAR(255), "
//				+ " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))";
//
//		statement.executeUpdate(sql);
		SpringApplication.run(AzureSpringSqlAppApplication.class, args);
	}

}

package com.company.h2database;

import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.PostConstruct;
import java.sql.SQLException;
import java.util.Arrays;

@SpringBootApplication
public class H2databaseApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(H2databaseApplication.class, args);
	}

	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server h2DatabaseServer() throws SQLException {
		return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
	}

	@PostConstruct
	private void initDb() {
		System.out.println(String.format("****** Creating table: %s, and Inserting test data ******", "Employees"));

		String sqlStatements[] = {
				"drop table employees if exists",
				"create table employees(id serial,first_name varchar(255),last_name varchar(255))",
				"insert into employees(first_name, last_name) values('Alan','Border')",
				"insert into employees(first_name, last_name) values('Messi','Lionel')"
		};

		Arrays.asList(sqlStatements).stream().forEach(sql -> {
			System.out.println(sql);
			jdbcTemplate.execute(sql);
		});

	}
}

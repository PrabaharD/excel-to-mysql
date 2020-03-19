package com.dataexport.exceltomysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dataexport.exceltomysql.service.DataExporter;

@SpringBootApplication
public class ExcelToMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelToMysqlApplication.class, args);
		
		DataExporter dataExporter = new DataExporter();
		dataExporter.testMethod();
	}

}

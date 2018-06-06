package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.Entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	PersonDao personDao;
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		logger.info("ALl one user by id -> {} ", personDao.findById(101));
		logger.info("Delete user by id -> {} ", personDao.deleteById(102));
		logger.info("ALl user -> {} ", personDao.findAll());
		logger.info("Inserting a  user -> {} ", personDao.insert(new Person(104, "Shikhar", "noida",new Date())));
		logger.info("ALl user -> {} ", personDao.findAll());
		logger.info("Updating a  user -> {} ", personDao.update(new Person(103, "Jain", "Noida secto3 ",new Date())));
		logger.info("ALl user -> {} ", personDao.findAll());

	}
}

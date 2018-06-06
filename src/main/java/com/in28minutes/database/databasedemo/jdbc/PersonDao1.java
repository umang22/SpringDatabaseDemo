/*
package com.in28minutes.database.databasedemo.jdbc;

import com.in28minutes.database.databasedemo.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

*/
/**
 * Created by umang on 6/3/2018.
 *//*

@Repository
public class PersonDao1 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    class PersonRowMapper implements RowMapper<Person>{

        @Nullable
        @Override
        public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(resultSet.getInt("id"));

            person.setName(resultSet.getString("name"));
            person.setLocation(resultSet.getString("location"));
            person.setBirthDate(resultSet.getTimestamp("birth_date"));

            return person;
        }
    }

    public List<Person> findAll() {

        return jdbcTemplate.query("SELECT * FROM person", new PersonRowMapper());
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM person WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Person.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM PERSON WHERE ID=? ", new Object[]{id});
    }

    public int insert(Person person) {
        return jdbcTemplate.update(
                "INSERT INTO person (id,name,location,birth_date)" + "VALUES (?,?,?,?)",
                new Object[]{person.getId(), person.getName(), person.getLocation(),
                        new Timestamp(person.getBirthDate().getTime())
                });
    }

    public int update(Person person) {
        return jdbcTemplate.update(
                "UPDATE person " +
                        "SET name=? , location=? , birth_date=? "
                        + "WHERE id = ?",
                new Object[]{person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()), person.getId()}
        );
    }
}























*/

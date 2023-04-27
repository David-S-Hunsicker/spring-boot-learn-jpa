package com.example.learnjpaandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY =
            """
            INSERT into COURSE (id, name, author)
            values(1, 'Learn AWS', 'in28minutes');
            """;
    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}

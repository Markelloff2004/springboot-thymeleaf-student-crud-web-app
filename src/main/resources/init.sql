CREATE DATABASE IF NOT EXISTS StudentDB;

USE StudentDB;

DROP TABLE IF EXISTS students;

CREATE TABLE students (
    student_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

INSERT INTO students (first_name, last_name, email) VALUES
    ('John', 'Doe', 'john.doe@example.com'),
    ('Jane', 'Smith', 'jane.smith@example.com'),
    ('Alice', 'Johnson', 'alice.johnson@example.com'),
    ('Bob', 'Williams', 'bob.williams@example.com'),
    ('Charlie', 'Brown', 'charlie.brown@example.com'),
    ('David', 'Lee', 'david.lee@example.com'),
    ('Emma', 'Taylor', 'emma.taylor@example.com'),
    ('Frank', 'Wilson', 'frank.wilson@example.com'),
    ('Grace', 'Anderson', 'grace.anderson@example.com'),
    ('Henry', 'Martinez', 'henry.martinez@example.com'),
    ('Ivy', 'Garcia', 'ivy.garcia@example.com'),
    ('James', 'Clark', 'james.clark@example.com');

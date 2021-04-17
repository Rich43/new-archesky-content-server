CREATE SCHEMA IF NOT EXISTS content;
CREATE USER 'content'@'localhost' IDENTIFIED BY 'Password1';
GRANT SELECT, INSERT, UPDATE, DELETE ON content TO 'content'@'localhost';

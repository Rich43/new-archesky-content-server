CREATE SCHEMA content;
CREATE USER 'content'@'localhost' IDENTIFIED BY 'Password1';
GRANT SELECT, INSERT, UPDATE, DELETE PRIVILEGES ON content TO 'content'@'localhost';

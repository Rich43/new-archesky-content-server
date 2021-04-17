CREATE SCHEMA IF NOT EXISTS content;
USE content;
CREATE USER IF NOT EXISTS 'content'@'%' IDENTIFIED BY 'Password1';
GRANT SELECT, INSERT, UPDATE, DELETE ON content.* TO 'content'@'%';
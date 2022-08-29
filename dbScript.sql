DROP DATABASE IF EXISTS `spring_db`;
DROP USER IF EXISTS 'spring_user'@'localhost';
CREATE DATABASE `spring_db` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
CREATE USER 'spring_user'@'localhost' IDENTIFIED BY 'spring_pwd';
GRANT ALL ON `spring_db` . * TO 'spring_user'@'localhost' IDENTIFIED BY 'spring_pwd';
USE `spring_db`
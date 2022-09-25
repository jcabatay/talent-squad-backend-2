CREATE DATABASE IF NOT EXISTS `talent_squad` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
DROP TABLE IF EXISTS jobs;

CREATE TABLE `talent_squad`.`jobs` (`id` INT NOT NULL AUTO_INCREMENT ,
     `job_name` VARCHAR(100) NOT NULL ,
     `company_name` VARCHAR(100) NOT NULL ,
     `job_description` VARCHAR(100) NOT NULL ,
     `skills` VARCHAR(50) NOT NULL ,
     `company_sector` VARCHAR(100) NOT NULL ,
     `kind_of_job` VARCHAR(50) NOT NULL ,
     `localization` VARCHAR(100) NOT NULL ,
     `other_info` VARCHAR(100) NOT NULL ,
     PRIMARY KEY (`id`)) ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_spanish_ci;
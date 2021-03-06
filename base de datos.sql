-- MySQL Script generated by MySQL Workbench
-- 05/29/20 00:09:53
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`usuarios` (
  `idusuarios` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NULL,
  `contaseña` VARCHAR(45) NULL,
  PRIMARY KEY (`idusuarios`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`albumes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`albumes` (
  `id` VARCHAR(8) NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `duracion` VARCHAR(45) NULL,
  `nombre_artista` VARCHAR(45) NULL,
  `formato` VARCHAR(45) NULL,
  `informacion` VARCHAR(45) NULL,
  `precio` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`canciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`canciones` (
  `id_album` VARCHAR(8) NOT NULL,
  `id` VARCHAR(8) NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `duracion` VARCHAR(45) NULL,
  `disco` VARCHAR(45) NULL,
  `artista` VARCHAR(45) NULL,
  `formato` VARCHAR(45) NULL,
  `precio` INT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_id_canciones`
    FOREIGN KEY (`id_album`)
    REFERENCES `mydb`.`albumes` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

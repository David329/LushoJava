CREATE DATABASE  IF NOT EXISTS `Academia` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `Academia`;
-- MySQL dump 10.13  Distrib 5.7.15, for Linux (x86_64)
--
-- Host: localhost    Database: Academia
-- ------------------------------------------------------
-- Server version	5.7.15-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Alumno`
--

DROP TABLE IF EXISTS `Alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Alumno` (
  `idAlumno` int(11) NOT NULL AUTO_INCREMENT,
  `estado` char(3) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidoPaterno` varchar(25) DEFAULT NULL,
  `apellidoMaterno` varchar(25) DEFAULT NULL,
  `fechaN` date DEFAULT NULL,
  `DNI` varchar(12) DEFAULT NULL,
  `celular` varchar(12) DEFAULT NULL,
  `nCasa` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`idAlumno`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Alumno`
--

LOCK TABLES `Alumno` WRITE;
/*!40000 ALTER TABLE `Alumno` DISABLE KEYS */;
INSERT INTO `Alumno` VALUES (1,'INA','kodekdo','odkoekdo','odaksokao','2015-10-10','939393','99393','222344'),(2,'INA','Doña Andrea','Pachas','Pachas','1000-10-11','334569592','988513458','3334567'),(3,'ACT','INTO','PRde','BBAdndededede','2013-10-10','8393020','9388390','3453345'),(4,'INA','INTO','PR','BBA','2013-10-10','8393020','9388390','3453345'),(5,'INA','INTO','PR','BBA','2013-10-10','8393020','9388390','3453345'),(6,'INA','INTO','PR','BBA','2013-10-10','8393020','9388390','3453345'),(7,'INA','INTELPSS','kkdk','dkasdas','2015-10-10','3333334','3344','345566653'),(8,'INA','INTELIJ333','kkdk','dkasdas','2015-10-10','33344','3344','345566653'),(9,'ACT','Testiando','Testiando','Testiando','2016-10-11','5534333','9494949','333349'),(10,'ACT','INTELLI','odkoekdo','dkasdas','2015-10-10','292923','33344242','345566653');
/*!40000 ALTER TABLE `Alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `idAdmin` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(15) DEFAULT NULL,
  `contraseña` varchar(20) DEFAULT NULL,
  `nombre` varchar(25) DEFAULT NULL,
  `apellidoPaterno` varchar(45) DEFAULT NULL,
  `apellidoMaterno` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idAdmin`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'a','a','Anuel AA','MAS A','OTRA A'),(2,'b','b','BB','BOB','BOBO'),(3,'c','c','c','c++','c#');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-26  1:46:58

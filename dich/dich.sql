-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: dich
-- ------------------------------------------------------
-- Server version	9.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dichtuvung`
--

DROP TABLE IF EXISTS `dichtuvung`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichtuvung` (
  `iddichtuvung` int NOT NULL AUTO_INCREMENT,
  `idtienganh` int DEFAULT NULL,
  `idtiengviet` int DEFAULT NULL,
  PRIMARY KEY (`iddichtuvung`),
  KEY `tienganh_fk_idx` (`idtienganh`),
  KEY `tiengviet_fk_idx` (`idtiengviet`),
  CONSTRAINT `tienganh_fk` FOREIGN KEY (`idtienganh`) REFERENCES `tienganh` (`idtienganh`),
  CONSTRAINT `tiengviet_fk` FOREIGN KEY (`idtiengviet`) REFERENCES `tiengviet` (`idtiengviet`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichtuvung`
--

LOCK TABLES `dichtuvung` WRITE;
/*!40000 ALTER TABLE `dichtuvung` DISABLE KEYS */;
INSERT INTO `dichtuvung` VALUES (1,1,1),(2,2,2),(3,3,3),(4,4,4),(5,5,5),(6,6,5),(7,7,5),(8,8,6),(9,8,7),(10,9,8),(11,9,9),(12,10,10),(13,10,11);
/*!40000 ALTER TABLE `dichtuvung` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tienganh`
--

DROP TABLE IF EXISTS `tienganh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tienganh` (
  `idtienganh` int NOT NULL AUTO_INCREMENT,
  `tuvungtienganh` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtienganh`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tienganh`
--

LOCK TABLES `tienganh` WRITE;
/*!40000 ALTER TABLE `tienganh` DISABLE KEYS */;
INSERT INTO `tienganh` VALUES (1,'apple'),(2,'banana'),(3,'cat'),(4,'dog'),(5,'stone'),(6,'rock'),(7,'ice'),(8,'spring'),(9,'light'),(10,'bank');
/*!40000 ALTER TABLE `tienganh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiengviet`
--

DROP TABLE IF EXISTS `tiengviet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tiengviet` (
  `idtiengviet` int NOT NULL AUTO_INCREMENT,
  `tuvungtiengviet` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtiengviet`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiengviet`
--

LOCK TABLES `tiengviet` WRITE;
/*!40000 ALTER TABLE `tiengviet` DISABLE KEYS */;
INSERT INTO `tiengviet` VALUES (1,'quả táo'),(2,'quả chuối'),(3,'con mèo'),(4,'con chó'),(5,'đá'),(6,'mùa xuân'),(7,'lò xo'),(8,'ánh sáng'),(9,'nhẹ'),(10,'ngân hàng'),(11,'bờ sông');
/*!40000 ALTER TABLE `tiengviet` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-29 21:55:24

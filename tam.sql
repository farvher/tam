-- MySQL dump 10.14  Distrib 5.5.43-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: tam
-- ------------------------------------------------------
-- Server version	5.5.43-MariaDB

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
-- Table structure for table `ciudades`
--

DROP TABLE IF EXISTS `ciudades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ciudades` (
  `ciudadid` int(10) NOT NULL DEFAULT '0',
  `ciudad` varchar(50) DEFAULT NULL,
  `paisid` int(10) DEFAULT NULL,
  `activa` tinyint(1) DEFAULT NULL,
  `regionid` int(10) DEFAULT NULL,
  `escapital` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ciudadid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciudades`
--

LOCK TABLES `ciudades` WRITE;
/*!40000 ALTER TABLE `ciudades` DISABLE KEYS */;
/*!40000 ALTER TABLE `ciudades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `elementos`
--

DROP TABLE IF EXISTS `elementos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `elementos` (
  `elementoid` int(10) NOT NULL DEFAULT '0',
  `productoid` int(10) DEFAULT NULL,
  `elemento` varchar(50) DEFAULT NULL,
  `descripcion` text,
  PRIMARY KEY (`elementoid`),
  KEY `productoid` (`productoid`),
  CONSTRAINT `elementos_ibfk_1` FOREIGN KEY (`productoid`) REFERENCES `productos` (`productoid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `elementos`
--

LOCK TABLES `elementos` WRITE;
/*!40000 ALTER TABLE `elementos` DISABLE KEYS */;
/*!40000 ALTER TABLE `elementos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estados`
--

DROP TABLE IF EXISTS `estados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estados` (
  `estadoid` int(2) NOT NULL DEFAULT '0',
  `estado` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`estadoid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estados`
--

LOCK TABLES `estados` WRITE;
/*!40000 ALTER TABLE `estados` DISABLE KEYS */;
/*!40000 ALTER TABLE `estados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fotos`
--

DROP TABLE IF EXISTS `fotos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fotos` (
  `fotoid` int(10) NOT NULL DEFAULT '0',
  `productoid` int(10) DEFAULT NULL,
  `fotonombre` varchar(50) DEFAULT NULL,
  `fototitle` varchar(50) DEFAULT NULL,
  `fotourl` varchar(100) DEFAULT NULL,
  `creada` date DEFAULT NULL,
  `modificada` date DEFAULT NULL,
  `ext` varchar(10) DEFAULT NULL,
  `posicion` int(10) DEFAULT NULL,
  `comentario` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`fotoid`),
  KEY `productoid` (`productoid`),
  CONSTRAINT `fotos_ibfk_1` FOREIGN KEY (`productoid`) REFERENCES `productos` (`productoid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fotos`
--

LOCK TABLES `fotos` WRITE;
/*!40000 ALTER TABLE `fotos` DISABLE KEYS */;
/*!40000 ALTER TABLE `fotos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generos`
--

DROP TABLE IF EXISTS `generos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `generos` (
  `generoid` int(2) NOT NULL DEFAULT '0',
  `genero` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`generoid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generos`
--

LOCK TABLES `generos` WRITE;
/*!40000 ALTER TABLE `generos` DISABLE KEYS */;
/*!40000 ALTER TABLE `generos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marcas`
--

DROP TABLE IF EXISTS `marcas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `marcas` (
  `marcaid` int(10) NOT NULL DEFAULT '0',
  `marca` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`marcaid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marcas`
--

LOCK TABLES `marcas` WRITE;
/*!40000 ALTER TABLE `marcas` DISABLE KEYS */;
/*!40000 ALTER TABLE `marcas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `productoid` int(10) NOT NULL DEFAULT '0',
  `tiendaid` int(10) DEFAULT NULL,
  `marcaid` int(10) DEFAULT NULL,
  `estadoid` int(2) DEFAULT NULL,
  `creado` date DEFAULT NULL,
  `modificado` date DEFAULT NULL,
  `nrofotos` int(10) DEFAULT NULL,
  `preciounidad` bigint(20) DEFAULT NULL,
  `unidadmedidaid` int(2) DEFAULT NULL,
  `descripcion` text,
  `diponible` tinyint(4) DEFAULT NULL,
  `urlcanonical` varchar(100) DEFAULT NULL,
  `destacado` tinyint(4) DEFAULT NULL,
  `urlvideo` varchar(100) DEFAULT NULL,
  `condescuento` tinyint(4) DEFAULT NULL,
  `descuento` int(10) DEFAULT NULL,
  `DetalleProductoHtml` text,
  `cantidadelementos` int(5) DEFAULT NULL,
  PRIMARY KEY (`productoid`),
  KEY `tiendaid` (`tiendaid`),
  KEY `unidadmedidaid` (`unidadmedidaid`),
  KEY `estadoid` (`estadoid`),
  KEY `marcaid` (`marcaid`),
  CONSTRAINT `productos_ibfk_4` FOREIGN KEY (`marcaid`) REFERENCES `marcas` (`marcaid`),
  CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`tiendaid`) REFERENCES `tiendas` (`tiendaid`),
  CONSTRAINT `productos_ibfk_2` FOREIGN KEY (`unidadmedidaid`) REFERENCES `unidad_medidas` (`unidadmedidaid`),
  CONSTRAINT `productos_ibfk_3` FOREIGN KEY (`estadoid`) REFERENCES `estados` (`estadoid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `rolid` int(11) NOT NULL DEFAULT '0',
  `nombrerol` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`rolid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'admin');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursales`
--

DROP TABLE IF EXISTS `sucursales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sucursales` (
  `sucursalid` int(10) NOT NULL DEFAULT '0',
  `tiendaid` int(10) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `creada` date DEFAULT NULL,
  `modificada` date DEFAULT NULL,
  `latitud` varchar(50) DEFAULT NULL,
  `longitud` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sucursalid`),
  KEY `tiendaid` (`tiendaid`),
  CONSTRAINT `sucursales_ibfk_1` FOREIGN KEY (`tiendaid`) REFERENCES `tiendas` (`tiendaid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursales`
--

LOCK TABLES `sucursales` WRITE;
/*!40000 ALTER TABLE `sucursales` DISABLE KEYS */;
/*!40000 ALTER TABLE `sucursales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiendas`
--

DROP TABLE IF EXISTS `tiendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tiendas` (
  `tiendaid` int(10) NOT NULL DEFAULT '0',
  `nombretienda` varchar(50) DEFAULT NULL,
  `titulotienda` varchar(50) DEFAULT NULL,
  `urllogo` varchar(100) DEFAULT NULL,
  `estilocss` varchar(50) DEFAULT NULL,
  `telatencioncliente` varchar(50) DEFAULT NULL,
  `correocontactenos` varchar(50) DEFAULT NULL,
  `quienessomos` text,
  `urlicon` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`tiendaid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiendas`
--

LOCK TABLES `tiendas` WRITE;
/*!40000 ALTER TABLE `tiendas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tiendas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_identificaciones`
--

DROP TABLE IF EXISTS `tipo_identificaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_identificaciones` (
  `tipoidentificacionid` int(2) NOT NULL DEFAULT '0',
  `tipoidentificacion` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`tipoidentificacionid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_identificaciones`
--

LOCK TABLES `tipo_identificaciones` WRITE;
/*!40000 ALTER TABLE `tipo_identificaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_identificaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidad_medidas`
--

DROP TABLE IF EXISTS `unidad_medidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unidad_medidas` (
  `unidadmedidaid` int(2) NOT NULL DEFAULT '0',
  `unidadmedida` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`unidadmedidaid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidad_medidas`
--

LOCK TABLES `unidad_medidas` WRITE;
/*!40000 ALTER TABLE `unidad_medidas` DISABLE KEYS */;
/*!40000 ALTER TABLE `unidad_medidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `usuarioid` int(10) NOT NULL DEFAULT '0',
  `cedula` varchar(20) DEFAULT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `nacimiento` date DEFAULT NULL,
  `generoid` int(2) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `direccion2` varchar(100) DEFAULT NULL,
  `creado` date DEFAULT NULL,
  `modificado` date DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `clave` varchar(100) DEFAULT NULL,
  `tipoidentificacionid` int(2) DEFAULT NULL,
  `ciudad_residencia` int(10) DEFAULT NULL,
  `estadoid` int(2) DEFAULT NULL,
  `rolid` int(2) DEFAULT NULL,
  PRIMARY KEY (`usuarioid`),
  KEY `estadoid` (`estadoid`),
  KEY `ciudad_residencia` (`ciudad_residencia`),
  KEY `tipoidentificacionid` (`tipoidentificacionid`),
  KEY `generoid` (`generoid`),
  KEY `rolid` (`rolid`),
  CONSTRAINT `usuarios_ibfk_5` FOREIGN KEY (`rolid`) REFERENCES `roles` (`rolid`),
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`estadoid`) REFERENCES `estados` (`estadoid`),
  CONSTRAINT `usuarios_ibfk_2` FOREIGN KEY (`ciudad_residencia`) REFERENCES `ciudades` (`ciudadid`),
  CONSTRAINT `usuarios_ibfk_3` FOREIGN KEY (`tipoidentificacionid`) REFERENCES `tipo_identificaciones` (`tipoidentificacionid`),
  CONSTRAINT `usuarios_ibfk_4` FOREIGN KEY (`generoid`) REFERENCES `generos` (`generoid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios_tiendas`
--

DROP TABLE IF EXISTS `usuarios_tiendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios_tiendas` (
  `id` int(10) NOT NULL DEFAULT '0',
  `tiendaid` int(10) DEFAULT NULL,
  `usuarioid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `usuarioid` (`usuarioid`),
  KEY `tiendaid` (`tiendaid`),
  CONSTRAINT `usuarios_tiendas_ibfk_2` FOREIGN KEY (`tiendaid`) REFERENCES `tiendas` (`tiendaid`),
  CONSTRAINT `usuarios_tiendas_ibfk_1` FOREIGN KEY (`usuarioid`) REFERENCES `usuarios` (`usuarioid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios_tiendas`
--

LOCK TABLES `usuarios_tiendas` WRITE;
/*!40000 ALTER TABLE `usuarios_tiendas` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios_tiendas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-14 12:07:04

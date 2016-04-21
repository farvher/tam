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
  `elementoid` int(11) NOT NULL,
  `descripcion` longtext,
  `elemento` varchar(50) DEFAULT NULL,
  `productoid` int(11) DEFAULT NULL,
  PRIMARY KEY (`elementoid`),
  KEY `FK_pkov06gy9u6i4s6axrh3j8ymd` (`productoid`),
  CONSTRAINT `FK_pkov06gy9u6i4s6axrh3j8ymd` FOREIGN KEY (`productoid`) REFERENCES `productos` (`productoid`)
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
  `fotoid` int(11) NOT NULL,
  `comentario` varchar(200) DEFAULT NULL,
  `creada` date DEFAULT NULL,
  `ext` varchar(10) DEFAULT NULL,
  `fotonombre` varchar(50) DEFAULT NULL,
  `fototitle` varchar(50) DEFAULT NULL,
  `fotourl` varchar(100) DEFAULT NULL,
  `modificada` date DEFAULT NULL,
  `posicion` int(11) DEFAULT NULL,
  `productoid` int(11) DEFAULT NULL,
  PRIMARY KEY (`fotoid`),
  KEY `FK_hxmnrii5hq4tdkw82rddus79i` (`productoid`),
  CONSTRAINT `FK_hxmnrii5hq4tdkw82rddus79i` FOREIGN KEY (`productoid`) REFERENCES `productos` (`productoid`)
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
  `marcaid` int(11) NOT NULL,
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
  `productoid` int(11) NOT NULL,
  `cantidadelementos` int(11) DEFAULT NULL,
  `condescuento` smallint(6) DEFAULT NULL,
  `creado` date DEFAULT NULL,
  `descripcion` longtext,
  `descuento` int(11) DEFAULT NULL,
  `destacado` smallint(6) DEFAULT NULL,
  `DetalleProductoHtml` longtext,
  `diponible` smallint(6) DEFAULT NULL,
  `modificado` date DEFAULT NULL,
  `nrofotos` int(11) DEFAULT NULL,
  `preciounidad` decimal(19,2) DEFAULT NULL,
  `urlcanonical` varchar(100) DEFAULT NULL,
  `urlvideo` varchar(100) DEFAULT NULL,
  `estadoid` int(11) DEFAULT NULL,
  `marcaid` int(11) DEFAULT NULL,
  `tiendaid` int(11) DEFAULT NULL,
  `unidadmedidaid` int(11) DEFAULT NULL,
  PRIMARY KEY (`productoid`),
  KEY `FK_3fg3i8hl8dwe300309lcjx505` (`estadoid`),
  KEY `FK_hhfluhbxojw08n3txw073puut` (`marcaid`),
  KEY `FK_svikvs6fv9e7nhqb2s843hg8w` (`tiendaid`),
  KEY `FK_gdnp0amdb25kq2ef4cwyua1hx` (`unidadmedidaid`),
  CONSTRAINT `FK_gdnp0amdb25kq2ef4cwyua1hx` FOREIGN KEY (`unidadmedidaid`) REFERENCES `unidad_medidas` (`unidadmedidaid`),
  CONSTRAINT `FK_3fg3i8hl8dwe300309lcjx505` FOREIGN KEY (`estadoid`) REFERENCES `estados` (`estadoid`),
  CONSTRAINT `FK_hhfluhbxojw08n3txw073puut` FOREIGN KEY (`marcaid`) REFERENCES `marcas` (`marcaid`),
  CONSTRAINT `FK_svikvs6fv9e7nhqb2s843hg8w` FOREIGN KEY (`tiendaid`) REFERENCES `tiendas` (`tiendaid`)
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
  `sucursalid` int(11) NOT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `creada` date DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `latitud` varchar(50) DEFAULT NULL,
  `longitud` varchar(50) DEFAULT NULL,
  `modificada` date DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `tiendaid` int(11) DEFAULT NULL,
  PRIMARY KEY (`sucursalid`),
  KEY `FK_r1q3iiinmljuir3x6tb7u6wdx` (`tiendaid`),
  CONSTRAINT `FK_r1q3iiinmljuir3x6tb7u6wdx` FOREIGN KEY (`tiendaid`) REFERENCES `tiendas` (`tiendaid`)
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
  `tiendaid` int(11) NOT NULL,
  `correocontactenos` varchar(50) DEFAULT NULL,
  `estilocss` varchar(50) DEFAULT NULL,
  `nombretienda` varchar(50) DEFAULT NULL,
  `quienessomos` longtext,
  `telatencioncliente` varchar(50) DEFAULT NULL,
  `titulotienda` varchar(50) DEFAULT NULL,
  `urlicon` varchar(50) DEFAULT NULL,
  `urllogo` varchar(100) DEFAULT NULL,
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
  `unidadmedidaid` int(11) NOT NULL,
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
  `usuarioid` int(11) NOT NULL AUTO_INCREMENT,
  `apellidos` varchar(50) DEFAULT NULL,
  `cedula` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `clave` varchar(100) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `creado` date DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `direccion2` varchar(100) DEFAULT NULL,
  `modificado` date DEFAULT NULL,
  `nacimiento` date DEFAULT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `ciudad_residencia` int(11) DEFAULT NULL,
  `estadoid` int(11) DEFAULT NULL,
  `generoid` int(11) DEFAULT NULL,
  `rolid` int(11) DEFAULT NULL,
  `tipoidentificacionid` int(11) DEFAULT NULL,
  PRIMARY KEY (`usuarioid`),
  KEY `FK_xqhrao9th4ydwiyr4hbdgtg2` (`ciudad_residencia`),
  KEY `FK_jnr1ybbamasp9fyx5oaigpyn2` (`estadoid`),
  KEY `FK_mv1t06nf3gxwph1a69pc9120j` (`generoid`),
  KEY `FK_ekwi59fnreo01drgowy8x3c1r` (`rolid`),
  KEY `FK_6b7njo09rd47d7qj1tgead7p` (`tipoidentificacionid`),
  CONSTRAINT `FK_6b7njo09rd47d7qj1tgead7p` FOREIGN KEY (`tipoidentificacionid`) REFERENCES `tipo_identificaciones` (`tipoidentificacionid`),
  CONSTRAINT `FK_ekwi59fnreo01drgowy8x3c1r` FOREIGN KEY (`rolid`) REFERENCES `roles` (`rolid`),
  CONSTRAINT `FK_jnr1ybbamasp9fyx5oaigpyn2` FOREIGN KEY (`estadoid`) REFERENCES `estados` (`estadoid`),
  CONSTRAINT `FK_mv1t06nf3gxwph1a69pc9120j` FOREIGN KEY (`generoid`) REFERENCES `generos` (`generoid`),
  CONSTRAINT `FK_xqhrao9th4ydwiyr4hbdgtg2` FOREIGN KEY (`ciudad_residencia`) REFERENCES `ciudades` (`ciudadid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (12,'sanmiguel','1092352729',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Farith',NULL,NULL,NULL,NULL,NULL,NULL),(13,'Lopez','1092352729',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Farith',NULL,NULL,NULL,NULL,NULL,NULL),(14,'sanmiguel','1092352729',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Farith',NULL,NULL,NULL,NULL,NULL,NULL),(15,'sanmiguel','1092352729',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Farith',NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios_tiendas`
--

DROP TABLE IF EXISTS `usuarios_tiendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios_tiendas` (
  `id` int(11) NOT NULL,
  `tiendaid` int(11) DEFAULT NULL,
  `usuarioid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_jnm4if8axpn2uh6gse1d06pvy` (`tiendaid`),
  KEY `FK_3n192ugvs8qa7j9dyhrb4kjmt` (`usuarioid`),
  CONSTRAINT `FK_3n192ugvs8qa7j9dyhrb4kjmt` FOREIGN KEY (`usuarioid`) REFERENCES `usuarios` (`usuarioid`),
  CONSTRAINT `FK_jnm4if8axpn2uh6gse1d06pvy` FOREIGN KEY (`tiendaid`) REFERENCES `tiendas` (`tiendaid`)
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

-- Dump completed on 2016-04-21  8:27:51

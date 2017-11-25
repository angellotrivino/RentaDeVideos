/*
SQLyog Enterprise - MySQL GUI v8.1 
MySQL - 5.5.39 : Database - almacen
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`almacen` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `almacen`;

/*Table structure for table `actor` */

DROP TABLE IF EXISTS `actor`;

CREATE TABLE `actor` (
  `id_actor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id_actor`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `actor` */

insert  into `actor`(id_actor,nombre,date) values (1,'Jimm Carry','1960-02-14'),(2,'Will Smith','1965-04-20'),(4,'William Ruiz','1968-11-09'),(5,'Ramiro Coco','2014-08-28'),(7,'Millan','2000-08-03'),(8,'Francisco','1997-09-01'),(10,'Fercho Comeback','2032-11-30'),(11,'Fernel','1965-10-04'),(12,'Victor','2000-09-14');

/*Table structure for table `cartucho` */

DROP TABLE IF EXISTS `cartucho`;

CREATE TABLE `cartucho` (
  `id_cartucho` int(10) NOT NULL AUTO_INCREMENT,
  `id_formato` int(10) DEFAULT NULL,
  `id_pelicula` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_cartucho`),
  KEY `FK_cartucho_for` (`id_formato`),
  KEY `FK_cartucho_peli` (`id_pelicula`),
  CONSTRAINT `FK_cartucho_for` FOREIGN KEY (`id_formato`) REFERENCES `formato` (`id_formato`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_cartucho_pel` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id_pelicula`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_cartucho_peli` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id_pelicula`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `cartucho` */

insert  into `cartucho`(id_cartucho,id_formato,id_pelicula) values (1,2,4),(2,3,5),(3,1,3),(4,2,1),(5,3,2),(6,2,6),(7,3,7),(8,2,8);

/*Table structure for table `categoria` */

DROP TABLE IF EXISTS `categoria`;

CREATE TABLE `categoria` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `categoria` */

insert  into `categoria`(id_categoria,nombre) values (2,'Drama'),(3,'Terror'),(4,'Accion'),(5,'Animada'),(6,'Romantica'),(7,'CienciaFiccion');

/*Table structure for table `cliente` */

DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `credito` float NOT NULL,
  `nombre_1` varchar(20) NOT NULL,
  `nombre_2` varchar(20) NOT NULL,
  `telefono` int(11) NOT NULL,
  `direccion` varchar(20) NOT NULL,
  `id_prestamo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`),
  KEY `FK_cliente_pre` (`id_prestamo`),
  CONSTRAINT `FK_cliente_pre` FOREIGN KEY (`id_prestamo`) REFERENCES `prestamo` (`id_prestamo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `cliente` */

insert  into `cliente`(id_cliente,credito,nombre_1,nombre_2,telefono,direccion,id_prestamo) values (1,2500,'Diego','Rincon',2147483647,'Calle 12 N 4-5',1),(2,3000,'Fernel','Moreno',2147483647,'Cra 34 N 6-7',2),(3,1200,'Diego','Arevalo',2147483647,'Calle 1 N 3-6',3);

/*Table structure for table `formato` */

DROP TABLE IF EXISTS `formato`;

CREATE TABLE `formato` (
  `id_formato` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`id_formato`),
  KEY `FK_formato` (`id_formato`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `formato` */

insert  into `formato`(id_formato,nombre) values (1,'VHS'),(2,'DVD'),(3,'Blue-ray');

/*Table structure for table `pel_act` */

DROP TABLE IF EXISTS `pel_act`;

CREATE TABLE `pel_act` (
  `id_pel_act` int(11) NOT NULL AUTO_INCREMENT,
  `id_pelicula` int(10) NOT NULL,
  `id_actor` int(10) NOT NULL,
  `rol` varchar(20) NOT NULL,
  PRIMARY KEY (`id_pel_act`,`id_pelicula`,`id_actor`),
  KEY `FK_pel_act` (`id_actor`),
  CONSTRAINT `FK_pel_act` FOREIGN KEY (`id_actor`) REFERENCES `actor` (`id_actor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `pel_act` */

insert  into `pel_act`(id_pel_act,id_pelicula,id_actor,rol) values (1,1,1,'ActorPrincipal'),(2,2,2,'ActorEstrella'),(4,4,2,'ActorPrincipal'),(5,4,4,'Extra');

/*Table structure for table `pelicula` */

DROP TABLE IF EXISTS `pelicula`;

CREATE TABLE `pelicula` (
  `id_pelicula` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(20) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  PRIMARY KEY (`id_pelicula`),
  KEY `FK_pelicula` (`id_categoria`),
  CONSTRAINT `FK_pelicula_cat` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `pelicula` */

insert  into `pelicula`(id_pelicula,titulo,id_categoria) values (1,'Soy leyenda',4),(2,'Batman',4),(3,'Madagascar',5),(4,'Hancock',4),(5,'La mascara',2),(6,'Todo Poderoso',2),(7,'Scream4',3),(8,'Tengo Ganas de ti',6);

/*Table structure for table `prestamo` */

DROP TABLE IF EXISTS `prestamo`;

CREATE TABLE `prestamo` (
  `id_prestamo` int(11) NOT NULL AUTO_INCREMENT,
  `id_cartucho` int(11) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `fecha_prest` date DEFAULT NULL,
  `fecha_ent` date DEFAULT NULL,
  PRIMARY KEY (`id_prestamo`),
  KEY `FK_prestamo_cli` (`id_cliente`),
  KEY `FK_prestamo_car` (`id_cartucho`),
  CONSTRAINT `FK_prestamo_car` FOREIGN KEY (`id_cartucho`) REFERENCES `cartucho` (`id_cartucho`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_prestamo_cli` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `prestamo` */

insert  into `prestamo`(id_prestamo,id_cartucho,id_cliente,fecha_prest,fecha_ent) values (1,3,1,'2014-09-16','2014-09-17'),(2,4,2,'2014-09-10','2014-09-15'),(3,5,3,'2014-09-01','2014-09-02'),(4,1,1,'2014-09-18','2014-09-20'),(5,3,2,'2014-09-17','2014-09-25'),(6,6,1,'2014-09-16','2014-09-17');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;

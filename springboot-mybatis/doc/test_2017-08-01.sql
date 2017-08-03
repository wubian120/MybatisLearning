# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.19)
# Database: test
# Generation Time: 2017-08-01 01:54:47 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uid` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `create_time` datetime NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;

INSERT INTO `user` (`uid`, `name`, `create_time`, `password`, `mobile`, `updated_time`)
VALUES
	(1,'n1','2017-01-21 00:00:00','111111',NULL,NULL),
	(2,'john','2001-12-01 12:00:05','123456',NULL,NULL),
	(3,'bill','2005-09-21 00:00:00','333333',NULL,NULL),
	(4,'carl','2001-09-16 12:00:00','999999',NULL,NULL),
	(5,'johnson','1991-09-16 12:00:00','88899',NULL,NULL),
	(6,'will','2014-09-16 02:40:10','11111',NULL,NULL),
	(7,'micheal','2011-09-16 12:00:00','999999',NULL,NULL),
	(8,'brady','1999-08-16 12:00:00','111111',NULL,NULL),
	(9,'mond','2001-01-16 12:00:00','123456',NULL,NULL),
	(10,'woody','1999-03-16 12:00:00','123456',NULL,NULL),
	(11,'jobs','1891-12-16 12:00:00','999999',NULL,NULL);

/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

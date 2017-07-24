# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.19)
# Database: test
# Generation Time: 2017-07-24 08:07:16 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table item
# ------------------------------------------------------------

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `item_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL COMMENT '商品名称',
  `price` float(10,1) NOT NULL COMMENT '商品定价',
  `detail` text COMMENT '商品描述',
  `pic` varchar(64) DEFAULT NULL COMMENT '商品图片',
  `createtime` datetime NOT NULL COMMENT '生产日期',
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;

INSERT INTO `item` (`item_id`, `name`, `price`, `detail`, `pic`, `createtime`)
VALUES
	(4,'android',4500.0,'samsung g7','/usr/local/pic','2016-07-12 10:00:00'),
	(5,'iphone',6500.0,'7p','/usr/local/pic','2016-07-12 10:00:00'),
	(6,'android',3500.0,'huawei p9','/usr/local/pic','2015-07-12 10:00:00'),
	(7,'tv',2500.0,'xiaomi tv','/usr/local/pic','2017-07-12 10:00:00'),
	(8,'iphone',3500.0,'6','/usr/local/pic','2011-07-12 10:00:00'),
	(9,'iphone',4500.0,'6p','/usr/local/pic','2012-07-12 10:00:00'),
	(10,'android',2500.0,'xiaomi 6','/usr/local/pic','2016-07-12 10:00:00');

/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table order
# ------------------------------------------------------------

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `oid` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) unsigned NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`oid`),
  KEY `fk_order_user` (`uid`),
  CONSTRAINT `fk_order_user` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;

INSERT INTO `order` (`oid`, `uid`, `create_time`, `note`)
VALUES
	(4,1,'2013-01-21 00:00:00','buy food'),
	(5,1,'2013-01-21 00:00:00','buy water'),
	(6,1,'2013-01-21 00:00:00','buy cloth'),
	(7,1,'2013-01-21 00:00:00','buy toy'),
	(8,3,'2013-01-21 00:00:00','buy food'),
	(9,2,'2013-01-21 00:00:00','buy phone'),
	(10,2,'2013-01-21 00:00:00','buy food'),
	(11,8,'2016-01-21 00:00:00','buy food'),
	(12,4,'2016-07-21 00:00:00','buy food'),
	(13,7,'2017-07-21 00:00:00','buy food'),
	(14,5,'2017-07-21 00:00:00','groceries'),
	(15,6,'2013-01-21 00:00:00','groceries'),
	(16,6,'2017-07-21 00:00:00','buy food'),
	(17,6,'2017-07-21 00:00:00','buy food'),
	(18,6,'2017-01-21 00:00:00','funny'),
	(19,9,'2013-01-21 00:00:00','funny'),
	(20,9,'2013-01-21 00:00:00','groceries');

/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table order_detail
# ------------------------------------------------------------

DROP TABLE IF EXISTS `order_detail`;

CREATE TABLE `order_detail` (
  `detail_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `order_id` bigint(20) unsigned NOT NULL,
  `item_id` bigint(20) unsigned NOT NULL,
  `item_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`detail_id`),
  KEY `fk_order_detail-order` (`order_id`) USING BTREE,
  KEY `fk_orderdetail_item` (`item_id`),
  CONSTRAINT `fk_orderdetail_item` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`),
  CONSTRAINT `fk_orderdetail_order` FOREIGN KEY (`order_id`) REFERENCES `order` (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;

LOCK TABLES `order_detail` WRITE;
/*!40000 ALTER TABLE `order_detail` DISABLE KEYS */;

INSERT INTO `order_detail` (`detail_id`, `order_id`, `item_id`, `item_num`)
VALUES
	(36,4,4,10),
	(37,5,4,10),
	(38,6,4,10),
	(39,7,5,10),
	(40,8,5,10),
	(41,9,6,10),
	(42,10,7,10),
	(43,11,8,10),
	(44,12,8,10),
	(45,13,8,10),
	(46,14,8,10),
	(47,15,9,10),
	(48,16,9,10),
	(49,17,9,10),
	(50,18,9,10),
	(51,19,9,10),
	(52,20,10,10);

/*!40000 ALTER TABLE `order_detail` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uid` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `create_time` datetime NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;

INSERT INTO `user` (`uid`, `name`, `create_time`, `password`)
VALUES
	(1,'n1','2017-01-21 00:00:00','111111'),
	(2,'john','2001-12-01 12:00:05','123456'),
	(3,'bill','2005-09-21 00:00:00','333333'),
	(4,'carl','2001-09-16 12:00:00','999999'),
	(5,'johnson','1991-09-16 12:00:00','88899'),
	(6,'will','2014-09-16 02:40:10','11111'),
	(7,'micheal','2011-09-16 12:00:00','999999'),
	(8,'brady','1999-08-16 12:00:00','111111'),
	(9,'mond','2001-01-16 12:00:00','123456'),
	(10,'woody','1999-03-16 12:00:00','123456'),
	(11,'jobs','1891-12-16 12:00:00','999999');

/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

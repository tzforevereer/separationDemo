/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.29 : Database - customer_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`customer_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `customer_db`;

/*Table structure for table `customer_table` */

DROP TABLE IF EXISTS `customer_table`;

CREATE TABLE `customer_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `sex` varchar(5) DEFAULT NULL COMMENT '性别',
  `tell` varchar(15) DEFAULT NULL COMMENT '电话',
  `addr` varchar(50) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `customer_table` */

insert  into `customer_table`(`id`,`name`,`sex`,`tell`,`addr`) values (1,'刘德华','男','14651640569','香港'),(2,'张学友','男','14651640569','香港'),(3,'黎明','男','14651640569','香港'),(4,'苏有朋','男','14651640569','香港'),(6,'王宝强','男','14651640569','河南'),(7,'张三','男','14651640569','河南');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

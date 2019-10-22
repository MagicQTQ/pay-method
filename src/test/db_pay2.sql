/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.1.49-community : Database - db_pay2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_pay2` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_pay2`;

/*Table structure for table `t_order` */

DROP TABLE IF EXISTS `t_order`;

CREATE TABLE `t_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `body` varchar(800) DEFAULT NULL,
  `buy_time` datetime DEFAULT NULL,
  `is_pay` int(11) NOT NULL,
  `message` varchar(1000) DEFAULT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  `order_no` varchar(200) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `subject` varchar(200) DEFAULT NULL,
  `total_amount` varchar(50) DEFAULT NULL,
  `way` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1629 DEFAULT CHARSET=utf8;

/*Data for the table `t_order` */

insert  into `t_order`(`id`,`body`,`buy_time`,`is_pay`,`message`,`nick_name`,`order_no`,`product_id`,`qq`,`subject`,`total_amount`,`way`) values (1,'29元-请锋哥吃肯德基',NULL,0,'加油','夏红','20180515114708251',2,'32432','请锋哥吃肯德基','29','支付宝');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

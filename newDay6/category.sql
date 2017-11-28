/*
Navicat MySQL Data Transfer

Source Server         : Adele
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : my1stdb

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-28 21:20:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) NOT NULL,
  `category_id` int(11) DEFAULT NULL,
  `sale_price` decimal(10,2) DEFAULT NULL,
  `cost_price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', 'G9x', '3', '485.60', '290.00');
INSERT INTO `category` VALUES ('2', 'M905', '2', '550.05', '470.00');
INSERT INTO `category` VALUES ('3', 'MX1100', '2', '1267.20', '320.00');
INSERT INTO `category` VALUES ('4', 'M950', '2', '2055.04', '405.00');
INSERT INTO `category` VALUES ('5', 'MX Air', '3', '2408.22', '684.00');
INSERT INTO `category` VALUES ('6', 'G500', '1', '541.00', '264.00');

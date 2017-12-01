/*
Navicat MySQL Data Transfer

Source Server         : Adele
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : my2nddb

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-01 21:37:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '吃货');
INSERT INTO `category` VALUES ('3', '运气好');
INSERT INTO `category` VALUES ('4', '傻白甜');
INSERT INTO `category` VALUES ('5', '聪黑苦');

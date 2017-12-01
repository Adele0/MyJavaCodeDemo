/*
Navicat MySQL Data Transfer

Source Server         : Adele
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : my2nddb

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-01 21:37:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category1
-- ----------------------------
DROP TABLE IF EXISTS `category1`;
CREATE TABLE `category1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category1
-- ----------------------------
INSERT INTO `category1` VALUES ('1', '吃货');
INSERT INTO `category1` VALUES ('3', '运气好');
INSERT INTO `category1` VALUES ('4', '傻白甜');
INSERT INTO `category1` VALUES ('5', '聪黑苦');
INSERT INTO `category1` VALUES ('6', '傻白甜');
INSERT INTO `category1` VALUES ('7', '白大厨');

/*
Navicat MySQL Data Transfer

Source Server         : Adele
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : my1stdb

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-28 21:20:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', 'Technology Dept.');
INSERT INTO `department` VALUES ('2', 'Operation Dept.');
INSERT INTO `department` VALUES ('3', 'Administrative Dept.');
INSERT INTO `department` VALUES ('4', 'Sales Dept.');

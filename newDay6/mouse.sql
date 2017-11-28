/*
Navicat MySQL Data Transfer

Source Server         : Adele
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : my1stdb

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-28 21:20:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mouse
-- ----------------------------
DROP TABLE IF EXISTS `mouse`;
CREATE TABLE `mouse` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(255) NOT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mouse
-- ----------------------------
INSERT INTO `mouse` VALUES ('1', '鼠标', null);
INSERT INTO `mouse` VALUES ('2', '无线鼠标', '1');
INSERT INTO `mouse` VALUES ('3', '游戏鼠标', '1');
INSERT INTO `mouse` VALUES ('4', '有线鼠标', '1');

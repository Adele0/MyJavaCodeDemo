/*
Navicat MySQL Data Transfer

Source Server         : Adele
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : my1stdb

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-28 21:21:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `clazz` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '小明', '15', '3');
INSERT INTO `student` VALUES ('2', '小花', '12', '2');
INSERT INTO `student` VALUES ('3', '小草', '14', '3');
INSERT INTO `student` VALUES ('4', '小猪', '13', '1');
INSERT INTO `student` VALUES ('5', '小菜', '15', '2');
INSERT INTO `student` VALUES ('6', '小牛', '13', '3');
INSERT INTO `student` VALUES ('7', '小狗', '14', '2');
INSERT INTO `student` VALUES ('8', '小白', '13', '3');
INSERT INTO `student` VALUES ('9', '小绿', '15', '2');
INSERT INTO `student` VALUES ('10', '小张', '14', '2');
INSERT INTO `student` VALUES ('11', '小黑', '15', '1');

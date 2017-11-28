/*
Navicat MySQL Data Transfer

Source Server         : Adele
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : my1stdb

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-28 21:20:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(255) NOT NULL,
  `emp_id` bigint(20) NOT NULL,
  `salary` bigint(20) NOT NULL,
  `dep_id` bigint(20) NOT NULL,
  `gender` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dep_id` (`dep_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`dep_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', 'Adele', '1', '7000', '1', '0');
INSERT INTO `employee` VALUES ('2', 'Emily', '2', '7000', '1', '0');
INSERT INTO `employee` VALUES ('3', 'Ben', '3', '8000', '2', '1');
INSERT INTO `employee` VALUES ('4', 'Danial', '4', '12000', '2', '1');
INSERT INTO `employee` VALUES ('5', 'Lee', '5', '5000', '3', '1');
INSERT INTO `employee` VALUES ('6', 'Lucy', '6', '5500', '3', '0');
INSERT INTO `employee` VALUES ('7', 'Luke', '7', '10000', '1', '1');
INSERT INTO `employee` VALUES ('8', 'Sam', '8', '8000', '4', '1');
INSERT INTO `employee` VALUES ('9', 'Justin', '9', '6000', '4', '1');
INSERT INTO `employee` VALUES ('10', 'Sawyer', '10', '8000', '4', '1');
INSERT INTO `employee` VALUES ('11', 'Nobody', '11', '1000', '3', null);

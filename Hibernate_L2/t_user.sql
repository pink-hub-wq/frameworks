/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : t_user

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2024-07-11 14:03:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '赵六', '123');
INSERT INTO `t_user` VALUES ('2', '张三', '123');
INSERT INTO `t_user` VALUES ('3', '李四', '123');
INSERT INTO `t_user` VALUES ('4', '李四', '123');
INSERT INTO `t_user` VALUES ('5', '王五', '123');
INSERT INTO `t_user` VALUES ('6', '王五', '789');
INSERT INTO `t_user` VALUES ('7', '麻七', '123');
INSERT INTO `t_user` VALUES ('8', '王五', '123');

/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : t_user

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2024-07-15 14:06:45
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
INSERT INTO `t_user` VALUES ('1', '张三', '123');
INSERT INTO `t_user` VALUES ('2', '李四', '123');
INSERT INTO `t_user` VALUES ('3', '王五', '123');
INSERT INTO `t_user` VALUES ('4', '赵六', '123');
INSERT INTO `t_user` VALUES ('5', '麻七', '123');
INSERT INTO `t_user` VALUES ('6', '小八', '123');
INSERT INTO `t_user` VALUES ('7', '小九', '456');

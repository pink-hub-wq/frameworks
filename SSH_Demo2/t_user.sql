/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : t_user

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2024-07-23 16:48:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_pwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('2', '张三', '123');
INSERT INTO `t_user` VALUES ('3', '张三', '123');
INSERT INTO `t_user` VALUES ('5', '张三', '123');
INSERT INTO `t_user` VALUES ('6', '张三', '123');
INSERT INTO `t_user` VALUES ('11', '张三', '123');
INSERT INTO `t_user` VALUES ('12', '张三', '123');
INSERT INTO `t_user` VALUES ('13', '张三', '123');
INSERT INTO `t_user` VALUES ('14', '张三', '123');
INSERT INTO `t_user` VALUES ('16', '张三', '123');
INSERT INTO `t_user` VALUES ('17', '张三', '123');
INSERT INTO `t_user` VALUES ('18', '张三', '123');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_pwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

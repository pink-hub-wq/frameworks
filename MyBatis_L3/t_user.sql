/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : t_user

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2024-07-17 14:42:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) DEFAULT NULL,
  `user_pwd` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('4', '王五', '456', '男');
INSERT INTO `t_user` VALUES ('5', '赵六', '123', '男');
INSERT INTO `t_user` VALUES ('6', '张三', '123', '男');
INSERT INTO `t_user` VALUES ('7', '李四', '123', '男');
INSERT INTO `t_user` VALUES ('8', '麻七', '123', '男');
INSERT INTO `t_user` VALUES ('9', '小八', '123', '男');
INSERT INTO `t_user` VALUES ('10', '小九', '456', '男');

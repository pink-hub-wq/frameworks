/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : t_user

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2024-07-16 15:07:48
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '张三', '456');
INSERT INTO `t_user` VALUES ('2', '李四', '123');
INSERT INTO `t_user` VALUES ('3', '王五', '123');
INSERT INTO `t_user` VALUES ('4', '赵六', '456');
INSERT INTO `t_user` VALUES ('6', '小八', '123');
INSERT INTO `t_user` VALUES ('8', '小九', '123');

/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : springbatch

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2024-08-23 16:33:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'dafei', '18');
INSERT INTO `user` VALUES ('2', 'xiaofei', '16');
INSERT INTO `user` VALUES ('3', 'laofei', '20');
INSERT INTO `user` VALUES ('4', 'zhongfei', '19');
INSERT INTO `user` VALUES ('5', 'feifei', '15');

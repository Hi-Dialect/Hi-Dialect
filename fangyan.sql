/*
 Navicat Premium Data Transfer

 Source Server         : link1
 Source Server Type    : MySQL
 Source Server Version : 50643
 Source Host           : localhost:3306
 Source Schema         : fangyan

 Target Server Type    : MySQL
 Target Server Version : 50643
 File Encoding         : 65001

 Date: 25/03/2020 10:57:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for activities
-- ----------------------------
DROP TABLE IF EXISTS `activities`;
CREATE TABLE `activities` (
  `actId` int(11) NOT NULL AUTO_INCREMENT,
  `actNa` varchar(50) NOT NULL,
  `actRemark` varchar(300) NOT NULL,
  `startTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `endTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `actType` tinyint(1) NOT NULL COMMENT '活动类型	0 时令活动\r\n1 主题活动',
  `joinNum` int(10) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`actId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activities
-- ----------------------------
BEGIN;
INSERT INTO `activities` VALUES (1, 'testAct1', '123', '2020-03-22 17:05:57', '2020-03-22 17:05:57', 1, 2, '2020-03-22 17:10:36');
INSERT INTO `activities` VALUES (2, 'testAct2', '231', '2020-03-22 17:10:32', '2020-03-22 17:10:32', 2, 2, '2020-03-22 19:58:05');
COMMIT;

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments` (
  `cmtId` int(11) NOT NULL AUTO_INCREMENT,
  `vdoId` int(11) NOT NULL,
  `userNo` int(11) NOT NULL,
  `content` varchar(300) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`cmtId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comments
-- ----------------------------
BEGIN;
INSERT INTO `comments` VALUES (1, 1, 1, '哈哈哈哈哈太好笑啦', '2020-03-24 22:56:04');
COMMIT;

-- ----------------------------
-- Table structure for histlook
-- ----------------------------
DROP TABLE IF EXISTS `histlook`;
CREATE TABLE `histlook` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vdoId` int(11) NOT NULL,
  `userNo` int(11) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for histsearch
-- ----------------------------
DROP TABLE IF EXISTS `histsearch`;
CREATE TABLE `histsearch` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `searchWord` varchar(50) NOT NULL COMMENT '搜索关键词',
  `userNo` int(11) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for labels
-- ----------------------------
DROP TABLE IF EXISTS `labels`;
CREATE TABLE `labels` (
  `labelId` int(11) NOT NULL AUTO_INCREMENT,
  `labelNa` varchar(50) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`labelId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of labels
-- ----------------------------
BEGIN;
INSERT INTO `labels` VALUES (1, 'TestVdo', '2020-03-25 01:25:09');
COMMIT;

-- ----------------------------
-- Table structure for musics
-- ----------------------------
DROP TABLE IF EXISTS `musics`;
CREATE TABLE `musics` (
  `mscId` int(11) NOT NULL AUTO_INCREMENT,
  `mscNa` varchar(50) NOT NULL,
  `mscPath` varchar(255) NOT NULL,
  `standardType` tinyint(1) DEFAULT NULL COMMENT '标准音类型\r\n0 东北话\r\n1 四川话\r\n2 上海话\r\n3 广东话',
  `vdoId` int(11) DEFAULT NULL,
  `bgmType` tinyint(1) DEFAULT NULL COMMENT '背景音标签',
  `mscType` tinyint(1) NOT NULL COMMENT '音频类型',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`mscId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for userattention
-- ----------------------------
DROP TABLE IF EXISTS `userattention`;
CREATE TABLE `userattention` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fanNo` int(11) NOT NULL,
  `starNo` int(11) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for userislike
-- ----------------------------
DROP TABLE IF EXISTS `userislike`;
CREATE TABLE `userislike` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vdoId` int(11) NOT NULL,
  `userNo` int(11) NOT NULL,
  `isLike` tinyint(1) NOT NULL COMMENT '0 不喜欢\r\n1 喜欢',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userislike
-- ----------------------------
BEGIN;
INSERT INTO `userislike` VALUES (1, 1, 2, 1, '2020-03-22 19:37:54');
INSERT INTO `userislike` VALUES (2, 1, 1, 1, '2020-03-22 19:38:11');
INSERT INTO `userislike` VALUES (3, 2, 2, 0, '2020-03-22 19:38:24');
INSERT INTO `userislike` VALUES (4, 1, 1, 1, '2020-03-24 23:03:07');
COMMIT;

-- ----------------------------
-- Table structure for userlabel
-- ----------------------------
DROP TABLE IF EXISTS `userlabel`;
CREATE TABLE `userlabel` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `userNo` int(11) NOT NULL,
  `labelId` int(11) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userNo` int(11) NOT NULL AUTO_INCREMENT,
  `userNa` varchar(50) NOT NULL,
  `password` varchar(32) NOT NULL,
  `userImg` varchar(255) NOT NULL,
  `phone` varchar(12) NOT NULL,
  `QQNum` varchar(30) DEFAULT NULL,
  `WeChatNum` varchar(30) DEFAULT NULL,
  `sex` tinyint(1) NOT NULL COMMENT '0 女\r\n1 男',
  `attentionNum` int(11) NOT NULL,
  `fansNum` int(11) NOT NULL,
  `money` int(11) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`userNo`,`createTime`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
BEGIN;
INSERT INTO `users` VALUES (1, 'testUser1', '1', '1', '1', '1', '1', 1, 0, 0, 0, '2020-03-22 17:07:09');
INSERT INTO `users` VALUES (2, 'testUser2', '1', '1', '1', '1', '1', 1, 0, 0, 0, '2020-03-22 17:10:05');
COMMIT;

-- ----------------------------
-- Table structure for videoactivity
-- ----------------------------
DROP TABLE IF EXISTS `videoactivity`;
CREATE TABLE `videoactivity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userNo` int(11) NOT NULL,
  `vdoId` int(11) NOT NULL,
  `actId` int(11) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of videoactivity
-- ----------------------------
BEGIN;
INSERT INTO `videoactivity` VALUES (1, 1, 1, 1, '2020-03-22 17:08:13');
INSERT INTO `videoactivity` VALUES (2, 1, 1, 2, '2020-03-22 17:11:10');
INSERT INTO `videoactivity` VALUES (3, 2, 2, 1, '2020-03-22 17:11:21');
INSERT INTO `videoactivity` VALUES (4, 2, 2, 2, '2020-03-22 17:11:28');
COMMIT;

-- ----------------------------
-- Table structure for videolabel
-- ----------------------------
DROP TABLE IF EXISTS `videolabel`;
CREATE TABLE `videolabel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vdoId` int(11) NOT NULL,
  `labelId` int(11) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of videolabel
-- ----------------------------
BEGIN;
INSERT INTO `videolabel` VALUES (1, 1, 1, '2020-03-25 01:25:26');
COMMIT;

-- ----------------------------
-- Table structure for videos
-- ----------------------------
DROP TABLE IF EXISTS `videos`;
CREATE TABLE `videos` (
  `vdoId` int(11) NOT NULL AUTO_INCREMENT,
  `vdoNa` varchar(50) NOT NULL,
  `userNo` int(11) NOT NULL,
  `vdoPath` varchar(255) NOT NULL,
  `vdoImg` varchar(255) NOT NULL,
  `vdoType` tinyint(1) NOT NULL COMMENT '0 推送视频  ；1 素材视频；2活动视频',
  `vdoRemark` varchar(500) DEFAULT NULL COMMENT '视频描述',
  `likeNum` int(11) NOT NULL,
  `dislikeNum` int(11) NOT NULL,
  `commentNum` int(11) NOT NULL,
  `watchNum` int(11) NOT NULL,
  `isPublic` tinyint(1) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`vdoId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of videos
-- ----------------------------
BEGIN;
INSERT INTO `videos` VALUES (1, 'testVdo1', 1, '1', '1', 1, '1', 0, 0, 0, 0, 1, '2020-03-24 22:42:04');
INSERT INTO `videos` VALUES (2, 'testVdo2', 2, '1', '1', 1, '1', 0, 0, 0, 0, 1, '2020-03-22 17:11:49');
INSERT INTO `videos` VALUES (3, '第一支vlog', 1, '123', '1', 1, '点进来绝不会后悔', 0, 0, 0, 0, 1, '2020-03-24 23:41:50');
COMMIT;

-- ----------------------------
-- Table structure for words
-- ----------------------------
DROP TABLE IF EXISTS `words`;
CREATE TABLE `words` (
  `wdId` int(11) NOT NULL AUTO_INCREMENT,
  `vdoId` int(11) NOT NULL,
  `startTime` time NOT NULL,
  `endTime` time NOT NULL,
  `word` varchar(500) NOT NULL COMMENT '字幕内容',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`wdId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

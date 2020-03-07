/*
Navicat MySQL Data Transfer

Source Server         : work
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : fangyan

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2020-03-07 16:47:36
*/

SET FOREIGN_KEY_CHECKS=0;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activities
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comments
-- ----------------------------

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
-- Records of histlook
-- ----------------------------

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
-- Records of histsearch
-- ----------------------------

-- ----------------------------
-- Table structure for labels
-- ----------------------------
DROP TABLE IF EXISTS `labels`;
CREATE TABLE `labels` (
  `labelId` int(11) NOT NULL AUTO_INCREMENT,
  `labelNa` varchar(50) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`labelId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of labels
-- ----------------------------

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
-- Records of musics
-- ----------------------------

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
-- Records of userattention
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userislike
-- ----------------------------

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
-- Records of userlabel
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of videoactivity
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of videolabel
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of videos
-- ----------------------------

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

-- ----------------------------
-- Records of words
-- ----------------------------

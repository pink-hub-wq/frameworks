/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : springbatch

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2024-08-22 14:17:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `batch_job_execution`
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_execution`;
CREATE TABLE `batch_job_execution` (
  `JOB_EXECUTION_ID` bigint(20) NOT NULL,
  `VERSION` bigint(20) DEFAULT NULL,
  `JOB_INSTANCE_ID` bigint(20) NOT NULL,
  `CREATE_TIME` datetime NOT NULL,
  `START_TIME` datetime DEFAULT NULL,
  `END_TIME` datetime DEFAULT NULL,
  `STATUS` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `EXIT_CODE` varchar(2500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `EXIT_MESSAGE` varchar(2500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LAST_UPDATED` datetime DEFAULT NULL,
  `JOB_CONFIGURATION_LOCATION` varchar(2500) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`JOB_EXECUTION_ID`),
  KEY `JOB_INST_EXEC_FK` (`JOB_INSTANCE_ID`),
  CONSTRAINT `JOB_INST_EXEC_FK` FOREIGN KEY (`JOB_INSTANCE_ID`) REFERENCES `batch_job_instance` (`JOB_INSTANCE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of batch_job_execution
-- ----------------------------
INSERT INTO `batch_job_execution` VALUES ('1', '2', '1', '2024-08-19 16:39:25', '2024-08-19 16:39:25', '2024-08-19 16:39:25', 'COMPLETED', 'COMPLETED', '', '2024-08-19 16:39:25', null);
INSERT INTO `batch_job_execution` VALUES ('2', '2', '2', '2024-08-22 09:21:53', '2024-08-22 09:21:53', '2024-08-22 09:21:53', 'COMPLETED', 'COMPLETED', '', '2024-08-22 09:21:53', null);
INSERT INTO `batch_job_execution` VALUES ('3', '2', '3', '2024-08-22 09:30:18', '2024-08-22 09:30:18', '2024-08-22 09:30:18', 'COMPLETED', 'COMPLETED', '', '2024-08-22 09:30:18', null);
INSERT INTO `batch_job_execution` VALUES ('4', '2', '4', '2024-08-22 09:32:12', '2024-08-22 09:32:12', '2024-08-22 09:32:13', 'COMPLETED', 'COMPLETED', '', '2024-08-22 09:32:13', null);
INSERT INTO `batch_job_execution` VALUES ('5', '2', '5', '2024-08-22 09:42:30', '2024-08-22 09:42:30', '2024-08-22 09:42:30', 'COMPLETED', 'COMPLETED', '', '2024-08-22 09:42:30', null);
INSERT INTO `batch_job_execution` VALUES ('6', '2', '6', '2024-08-22 09:42:30', '2024-08-22 09:42:30', '2024-08-22 09:42:30', 'COMPLETED', 'COMPLETED', '', '2024-08-22 09:42:30', null);
INSERT INTO `batch_job_execution` VALUES ('7', '2', '7', '2024-08-22 09:42:53', '2024-08-22 09:42:53', '2024-08-22 09:42:53', 'COMPLETED', 'COMPLETED', '', '2024-08-22 09:42:53', null);
INSERT INTO `batch_job_execution` VALUES ('8', '2', '6', '2024-08-22 09:42:53', '2024-08-22 09:42:53', '2024-08-22 09:42:53', 'COMPLETED', 'NOOP', 'All steps already completed or no steps configured for this job.', '2024-08-22 09:42:53', null);
INSERT INTO `batch_job_execution` VALUES ('9', '2', '8', '2024-08-22 09:43:21', '2024-08-22 09:43:21', '2024-08-22 09:43:22', 'COMPLETED', 'COMPLETED', '', '2024-08-22 09:43:22', null);
INSERT INTO `batch_job_execution` VALUES ('10', '2', '6', '2024-08-22 09:43:22', '2024-08-22 09:43:22', '2024-08-22 09:43:22', 'COMPLETED', 'NOOP', 'All steps already completed or no steps configured for this job.', '2024-08-22 09:43:22', null);
INSERT INTO `batch_job_execution` VALUES ('11', '2', '6', '2024-08-22 09:44:39', '2024-08-22 09:44:39', '2024-08-22 09:44:39', 'COMPLETED', 'NOOP', 'All steps already completed or no steps configured for this job.', '2024-08-22 09:44:39', null);
INSERT INTO `batch_job_execution` VALUES ('12', '1', '9', '2024-08-22 09:45:21', '2024-08-22 09:45:21', null, 'STARTED', 'UNKNOWN', '', '2024-08-22 09:45:21', null);
INSERT INTO `batch_job_execution` VALUES ('13', '1', '10', '2024-08-22 09:49:30', '2024-08-22 09:49:31', null, 'STARTED', 'UNKNOWN', '', '2024-08-22 09:49:31', null);
INSERT INTO `batch_job_execution` VALUES ('14', '2', '11', '2024-08-22 09:50:35', '2024-08-22 09:50:35', '2024-08-22 09:50:35', 'COMPLETED', 'COMPLETED', '', '2024-08-22 09:50:35', null);
INSERT INTO `batch_job_execution` VALUES ('15', '2', '12', '2024-08-22 10:05:30', '2024-08-22 10:05:30', '2024-08-22 10:05:30', 'COMPLETED', 'COMPLETED', '', '2024-08-22 10:05:30', null);
INSERT INTO `batch_job_execution` VALUES ('16', '2', '13', '2024-08-22 10:34:18', '2024-08-22 10:34:18', '2024-08-22 10:34:18', 'COMPLETED', 'COMPLETED', '', '2024-08-22 10:34:18', null);
INSERT INTO `batch_job_execution` VALUES ('17', '2', '14', '2024-08-22 10:36:05', '2024-08-22 10:36:05', '2024-08-22 10:36:05', 'COMPLETED', 'COMPLETED', '', '2024-08-22 10:36:05', null);
INSERT INTO `batch_job_execution` VALUES ('18', '2', '15', '2024-08-22 10:37:08', '2024-08-22 10:37:08', '2024-08-22 10:37:09', 'COMPLETED', 'COMPLETED', '', '2024-08-22 10:37:09', null);
INSERT INTO `batch_job_execution` VALUES ('19', '2', '16', '2024-08-22 10:39:45', '2024-08-22 10:39:45', '2024-08-22 10:39:45', 'COMPLETED', 'COMPLETED', '', '2024-08-22 10:39:45', null);
INSERT INTO `batch_job_execution` VALUES ('20', '2', '17', '2024-08-22 10:39:56', '2024-08-22 10:39:56', '2024-08-22 10:39:56', 'COMPLETED', 'COMPLETED', '', '2024-08-22 10:39:56', null);
INSERT INTO `batch_job_execution` VALUES ('21', '2', '18', '2024-08-22 10:40:47', '2024-08-22 10:40:47', '2024-08-22 10:40:47', 'COMPLETED', 'COMPLETED', '', '2024-08-22 10:40:47', null);
INSERT INTO `batch_job_execution` VALUES ('22', '2', '19', '2024-08-22 10:41:33', '2024-08-22 10:41:33', '2024-08-22 10:41:33', 'COMPLETED', 'COMPLETED', '', '2024-08-22 10:41:33', null);
INSERT INTO `batch_job_execution` VALUES ('23', '2', '20', '2024-08-22 10:42:10', '2024-08-22 10:42:10', '2024-08-22 10:42:11', 'FAILED', 'FAILED', 'org.springframework.batch.core.JobExecutionException: Flow execution ended unexpectedly\r\n	at org.springframework.batch.core.job.flow.FlowJob.doExecute(FlowJob.java:143)\r\n	at org.springframework.batch.core.job.AbstractJob.execute(AbstractJob.java:320)\r\n	at org.springframework.batch.core.launch.support.SimpleJobLauncher$1.run(SimpleJobLauncher.java:149)\r\n	at org.springframework.core.task.SyncTaskExecutor.execute(SyncTaskExecutor.java:50)\r\n	at org.springframework.batch.core.launch.support.SimpleJobLauncher.run(SimpleJobLauncher.java:140)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n	at java.lang.reflect.Method.invoke(Unknown Source)\r\n	at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:344)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJoinpoint(ReflectiveMethodInvocation.java:198)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)\r\n	at org.springframework.batch.core.configuration.annotation.SimpleBatchConfiguration$PassthruAdvice.invoke(SimpleBatchConfiguration.java:128)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\r\n	at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:215)\r\n	at com.sun.proxy.$Proxy52.run(Unknown Source)\r\n	at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.execute(JobLauncherApplicationRunner.java:199)\r\n	at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.executeLocalJobs(JobLauncherApplicationRunner.java:173)\r\n	at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.launchJobFromProperties(JobLauncherApplicationRunner.java:160)\r\n	at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.run(JobLauncherApplicationRunner.java:155)\r\n	at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.run(JobLauncherApplicationRunner.java:150)\r\n	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:762)\r\n	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:752)\r\n	at org.springframework.boot.SpringApplication.run(SpringApplication.java:315)\r\n	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306)\r\n	', '2024-08-22 10:42:11', null);
INSERT INTO `batch_job_execution` VALUES ('24', '2', '21', '2024-08-22 10:42:20', '2024-08-22 10:42:20', '2024-08-22 10:42:21', 'COMPLETED', 'COMPLETED', '', '2024-08-22 10:42:21', null);
INSERT INTO `batch_job_execution` VALUES ('25', '2', '22', '2024-08-22 10:42:30', '2024-08-22 10:42:30', '2024-08-22 10:42:31', 'COMPLETED', 'COMPLETED', '', '2024-08-22 10:42:31', null);
INSERT INTO `batch_job_execution` VALUES ('26', '2', '23', '2024-08-22 10:49:21', '2024-08-22 10:49:21', '2024-08-22 10:49:21', 'STOPPED', 'STOPPED', '', '2024-08-22 10:49:21', null);
INSERT INTO `batch_job_execution` VALUES ('27', '2', '24', '2024-08-22 10:49:40', '2024-08-22 10:49:40', '2024-08-22 10:49:40', 'COMPLETED', 'COMPLETED', '', '2024-08-22 10:49:40', null);
INSERT INTO `batch_job_execution` VALUES ('28', '2', '25', '2024-08-22 10:50:34', '2024-08-22 10:50:34', '2024-08-22 10:50:34', 'COMPLETED', 'COMPLETED', '', '2024-08-22 10:50:34', null);
INSERT INTO `batch_job_execution` VALUES ('29', '2', '26', '2024-08-22 11:44:13', '2024-08-22 11:44:13', '2024-08-22 11:44:13', 'COMPLETED', 'COMPLETED', '', '2024-08-22 11:44:13', null);
INSERT INTO `batch_job_execution` VALUES ('30', '2', '27', '2024-08-22 11:59:30', '2024-08-22 11:59:30', '2024-08-22 11:59:30', 'COMPLETED', 'COMPLETED', '', '2024-08-22 11:59:30', null);
INSERT INTO `batch_job_execution` VALUES ('31', '2', '27', '2024-08-22 12:57:48', '2024-08-22 12:57:48', '2024-08-22 12:57:48', 'COMPLETED', 'NOOP', 'All steps already completed or no steps configured for this job.', '2024-08-22 12:57:48', null);
INSERT INTO `batch_job_execution` VALUES ('32', '2', '27', '2024-08-22 12:58:26', '2024-08-22 12:58:26', '2024-08-22 12:58:26', 'COMPLETED', 'NOOP', 'All steps already completed or no steps configured for this job.', '2024-08-22 12:58:26', null);
INSERT INTO `batch_job_execution` VALUES ('33', '2', '27', '2024-08-22 12:58:35', '2024-08-22 12:58:35', '2024-08-22 12:58:35', 'COMPLETED', 'NOOP', 'All steps already completed or no steps configured for this job.', '2024-08-22 12:58:35', null);
INSERT INTO `batch_job_execution` VALUES ('34', '2', '27', '2024-08-22 12:59:46', '2024-08-22 12:59:46', '2024-08-22 12:59:46', 'COMPLETED', 'NOOP', 'All steps already completed or no steps configured for this job.', '2024-08-22 12:59:46', null);
INSERT INTO `batch_job_execution` VALUES ('35', '2', '27', '2024-08-22 13:02:03', '2024-08-22 13:02:03', '2024-08-22 13:02:03', 'COMPLETED', 'NOOP', 'All steps already completed or no steps configured for this job.', '2024-08-22 13:02:03', null);
INSERT INTO `batch_job_execution` VALUES ('36', '2', '28', '2024-08-22 13:26:24', '2024-08-22 13:26:24', '2024-08-22 13:26:24', 'STOPPED', 'STOPPED', '', '2024-08-22 13:26:24', null);
INSERT INTO `batch_job_execution` VALUES ('37', '2', '27', '2024-08-22 13:27:12', '2024-08-22 13:27:12', '2024-08-22 13:27:12', 'COMPLETED', 'NOOP', 'All steps already completed or no steps configured for this job.', '2024-08-22 13:27:12', null);
INSERT INTO `batch_job_execution` VALUES ('38', '2', '28', '2024-08-22 13:27:46', '2024-08-22 13:27:46', '2024-08-22 13:27:46', 'STOPPED', 'STOPPED', '', '2024-08-22 13:27:46', null);
INSERT INTO `batch_job_execution` VALUES ('39', '2', '28', '2024-08-22 13:28:36', '2024-08-22 13:28:36', '2024-08-22 13:28:36', 'STOPPED', 'STOPPED', '', '2024-08-22 13:28:36', null);
INSERT INTO `batch_job_execution` VALUES ('40', '2', '28', '2024-08-22 13:31:00', '2024-08-22 13:31:00', '2024-08-22 13:31:00', 'COMPLETED', 'COMPLETED', '', '2024-08-22 13:31:00', null);
INSERT INTO `batch_job_execution` VALUES ('41', '2', '28', '2024-08-22 13:44:23', '2024-08-22 13:44:23', '2024-08-22 13:44:23', 'COMPLETED', 'COMPLETED', '', '2024-08-22 13:44:23', null);
INSERT INTO `batch_job_execution` VALUES ('42', '2', '29', '2024-08-22 13:46:06', '2024-08-22 13:46:06', '2024-08-22 13:46:06', 'STOPPED', 'STOPPED', 'org.springframework.batch.core.JobInterruptedException', '2024-08-22 13:46:06', null);
INSERT INTO `batch_job_execution` VALUES ('43', '2', '30', '2024-08-22 13:52:13', '2024-08-22 13:52:13', '2024-08-22 13:52:13', 'STOPPED', 'STOPPED', 'org.springframework.batch.core.JobInterruptedException', '2024-08-22 13:52:13', null);
INSERT INTO `batch_job_execution` VALUES ('44', '2', '30', '2024-08-22 13:52:38', '2024-08-22 13:52:38', '2024-08-22 13:52:38', 'STOPPED', 'STOPPED', 'org.springframework.batch.core.JobInterruptedException', '2024-08-22 13:52:38', null);
INSERT INTO `batch_job_execution` VALUES ('45', '2', '30', '2024-08-22 13:53:08', '2024-08-22 13:53:08', '2024-08-22 13:53:08', 'FAILED', 'FAILED', 'org.springframework.batch.core.StartLimitExceededException: Maximum start limit exceeded for step: step1StartMax: 2\r\n	at org.springframework.batch.core.job.SimpleStepHandler.shouldStart(SimpleStepHandler.java:235)\r\n	at org.springframework.batch.core.job.SimpleStepHandler.handleStep(SimpleStepHandler.java:128)\r\n	at org.springframework.batch.core.job.AbstractJob.handleStep(AbstractJob.java:413)\r\n	at org.springframework.batch.core.job.SimpleJob.doExecute(SimpleJob.java:136)\r\n	at org.springframework.batch.core.job.AbstractJob.execute(AbstractJob.java:320)\r\n	at org.springframework.batch.core.launch.support.SimpleJobLauncher$1.run(SimpleJobLauncher.java:149)\r\n	at org.springframework.core.task.SyncTaskExecutor.execute(SyncTaskExecutor.java:50)\r\n	at org.springframework.batch.core.launch.support.SimpleJobLauncher.run(SimpleJobLauncher.java:140)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n	at java.lang.reflect.Method.invoke(Unknown Source)\r\n	at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:344)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJoinpoint(ReflectiveMethodInvocation.java:198)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)\r\n	at org.springframework.batch.core.configuration.annotation.SimpleBatchConfiguration$PassthruAdvice.invoke(SimpleBatchConfiguration.java:128)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\r\n	at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:215)\r\n	at com.sun.proxy.$Proxy63.run(Unknown Source)\r\n	at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.execute(JobLauncherApplicationRunner.java:199)\r\n	at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.executeLocalJobs(JobLauncherApplicationRunner.java:173)\r\n	at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.launchJobFromProperties(JobLauncherApplicationRunner.java:160)\r\n	at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.run(JobLauncherApplicationRunner.java:155)\r\n	at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.run(JobLauncherApplicationRunner.java:150)\r\n	at org.springframework.boot.S', '2024-08-22 13:53:08', null);
INSERT INTO `batch_job_execution` VALUES ('46', '2', '31', '2024-08-22 14:15:02', '2024-08-22 14:15:02', '2024-08-22 14:15:02', 'COMPLETED', 'COMPLETED', '', '2024-08-22 14:15:02', null);
INSERT INTO `batch_job_execution` VALUES ('47', '2', '31', '2024-08-22 14:15:47', '2024-08-22 14:15:47', '2024-08-22 14:15:47', 'COMPLETED', 'NOOP', 'All steps already completed or no steps configured for this job.', '2024-08-22 14:15:47', null);
INSERT INTO `batch_job_execution` VALUES ('48', '2', '31', '2024-08-22 14:16:22', '2024-08-22 14:16:22', '2024-08-22 14:16:23', 'COMPLETED', 'COMPLETED', '', '2024-08-22 14:16:23', null);
INSERT INTO `batch_job_execution` VALUES ('49', '2', '31', '2024-08-22 14:16:50', '2024-08-22 14:16:50', '2024-08-22 14:16:50', 'COMPLETED', 'COMPLETED', '', '2024-08-22 14:16:50', null);

-- ----------------------------
-- Table structure for `batch_job_execution_context`
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_execution_context`;
CREATE TABLE `batch_job_execution_context` (
  `JOB_EXECUTION_ID` bigint(20) NOT NULL,
  `SHORT_CONTEXT` varchar(2500) COLLATE utf8_unicode_ci NOT NULL,
  `SERIALIZED_CONTEXT` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`JOB_EXECUTION_ID`),
  CONSTRAINT `JOB_EXEC_CTX_FK` FOREIGN KEY (`JOB_EXECUTION_ID`) REFERENCES `batch_job_execution` (`JOB_EXECUTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of batch_job_execution_context
-- ----------------------------
INSERT INTO `batch_job_execution_context` VALUES ('1', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('2', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('3', '{\"@class\":\"java.util.HashMap\",\"key-step1-job\":\"value-step1-job\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('4', '{\"@class\":\"java.util.HashMap\",\"key-step1-job\":\"value-step1-job\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('5', '{\"@class\":\"java.util.HashMap\",\"key-step1-job\":\"value-step1-job\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('6', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('7', '{\"@class\":\"java.util.HashMap\",\"key-step1-job\":\"value-step1-job\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('8', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('9', '{\"@class\":\"java.util.HashMap\",\"key-step1-job\":\"value-step1-job\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('10', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('11', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('12', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('13', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('14', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('15', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('16', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('17', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('18', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('19', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('20', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('21', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('22', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('23', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('24', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('25', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('26', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('27', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('28', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('29', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('30', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('31', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('32', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('33', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('34', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('35', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('36', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('37', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('38', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('39', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('40', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('41', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('42', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('43', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('44', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('45', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('46', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('47', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('48', '{\"@class\":\"java.util.HashMap\"}', null);
INSERT INTO `batch_job_execution_context` VALUES ('49', '{\"@class\":\"java.util.HashMap\"}', null);

-- ----------------------------
-- Table structure for `batch_job_execution_params`
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_execution_params`;
CREATE TABLE `batch_job_execution_params` (
  `JOB_EXECUTION_ID` bigint(20) NOT NULL,
  `TYPE_CD` varchar(6) COLLATE utf8_unicode_ci NOT NULL,
  `KEY_NAME` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `STRING_VAL` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DATE_VAL` datetime DEFAULT NULL,
  `LONG_VAL` bigint(20) DEFAULT NULL,
  `DOUBLE_VAL` double DEFAULT NULL,
  `IDENTIFYING` char(1) COLLATE utf8_unicode_ci NOT NULL,
  KEY `JOB_EXEC_PARAMS_FK` (`JOB_EXECUTION_ID`),
  CONSTRAINT `JOB_EXEC_PARAMS_FK` FOREIGN KEY (`JOB_EXECUTION_ID`) REFERENCES `batch_job_execution` (`JOB_EXECUTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of batch_job_execution_params
-- ----------------------------
INSERT INTO `batch_job_execution_params` VALUES ('2', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '1', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('3', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '2', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('4', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '3', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('5', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '4', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('7', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '5', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('9', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '6', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('13', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '1', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('14', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '2', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('15', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '3', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('16', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '1', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('17', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '1', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('18', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '1', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('19', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '1', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('20', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '2', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('21', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '3', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('22', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '4', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('23', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '5', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('24', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '6', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('25', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '7', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('26', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '1', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('27', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '2', '0', 'Y');
INSERT INTO `batch_job_execution_params` VALUES ('28', 'LONG', 'run.id', '', '1970-01-01 08:00:00', '1', '0', 'Y');

-- ----------------------------
-- Table structure for `batch_job_execution_seq`
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_execution_seq`;
CREATE TABLE `batch_job_execution_seq` (
  `ID` bigint(20) NOT NULL,
  `UNIQUE_KEY` char(1) COLLATE utf8_unicode_ci NOT NULL,
  UNIQUE KEY `UNIQUE_KEY_UN` (`UNIQUE_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of batch_job_execution_seq
-- ----------------------------
INSERT INTO `batch_job_execution_seq` VALUES ('49', '0');

-- ----------------------------
-- Table structure for `batch_job_instance`
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_instance`;
CREATE TABLE `batch_job_instance` (
  `JOB_INSTANCE_ID` bigint(20) NOT NULL,
  `VERSION` bigint(20) DEFAULT NULL,
  `JOB_NAME` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `JOB_KEY` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`JOB_INSTANCE_ID`),
  UNIQUE KEY `JOB_INST_UN` (`JOB_NAME`,`JOB_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of batch_job_instance
-- ----------------------------
INSERT INTO `batch_job_instance` VALUES ('1', '0', 'hello-job2', 'd41d8cd98f00b204e9800998ecf8427e');
INSERT INTO `batch_job_instance` VALUES ('2', '0', 'hello-job1', '853d3449e311f40366811cbefb3d93d7');
INSERT INTO `batch_job_instance` VALUES ('3', '0', 'hello-job1', 'e070bff4379694c0210a51d9f6c6a564');
INSERT INTO `batch_job_instance` VALUES ('4', '0', 'hello-job1', 'a3364faf893276dea0caacefbf618db5');
INSERT INTO `batch_job_instance` VALUES ('5', '0', 'hello-job1', '47c0a8118b74165a864b66d37c7b6cf5');
INSERT INTO `batch_job_instance` VALUES ('6', '0', 'step-simple-tasklet-job', 'd41d8cd98f00b204e9800998ecf8427e');
INSERT INTO `batch_job_instance` VALUES ('7', '0', 'hello-job1', 'ce148f5f9c2bf4dc9bd44a7a5f64204c');
INSERT INTO `batch_job_instance` VALUES ('8', '0', 'hello-job1', 'bd0034040292bc81e6ccac0e25d9a578');
INSERT INTO `batch_job_instance` VALUES ('9', '0', 'step-simple-tasklet-job2', 'd41d8cd98f00b204e9800998ecf8427e');
INSERT INTO `batch_job_instance` VALUES ('10', '0', 'step-chunk-tasklet-job', '853d3449e311f40366811cbefb3d93d7');
INSERT INTO `batch_job_instance` VALUES ('11', '0', 'step-chunk-tasklet-job', 'e070bff4379694c0210a51d9f6c6a564');
INSERT INTO `batch_job_instance` VALUES ('12', '0', 'step-chunk-tasklet-job', 'a3364faf893276dea0caacefbf618db5');
INSERT INTO `batch_job_instance` VALUES ('13', '0', 'step-listener-job1', '853d3449e311f40366811cbefb3d93d7');
INSERT INTO `batch_job_instance` VALUES ('14', '0', 'step-multi-job1', '853d3449e311f40366811cbefb3d93d7');
INSERT INTO `batch_job_instance` VALUES ('15', '0', 'condition-multi-job', '853d3449e311f40366811cbefb3d93d7');
INSERT INTO `batch_job_instance` VALUES ('16', '0', 'customize-step-job', '853d3449e311f40366811cbefb3d93d7');
INSERT INTO `batch_job_instance` VALUES ('17', '0', 'customize-step-job', 'e070bff4379694c0210a51d9f6c6a564');
INSERT INTO `batch_job_instance` VALUES ('18', '0', 'customize-step-job', 'a3364faf893276dea0caacefbf618db5');
INSERT INTO `batch_job_instance` VALUES ('19', '0', 'customize-step-job', '47c0a8118b74165a864b66d37c7b6cf5');
INSERT INTO `batch_job_instance` VALUES ('20', '0', 'customize-step-job', 'ce148f5f9c2bf4dc9bd44a7a5f64204c');
INSERT INTO `batch_job_instance` VALUES ('21', '0', 'customize-step-job', 'bd0034040292bc81e6ccac0e25d9a578');
INSERT INTO `batch_job_instance` VALUES ('22', '0', 'customize-step-job', '597815c7e4ab1092c1b25130aae725cb');
INSERT INTO `batch_job_instance` VALUES ('23', '0', 'status-step-job', '853d3449e311f40366811cbefb3d93d7');
INSERT INTO `batch_job_instance` VALUES ('24', '0', 'status-step-job', 'e070bff4379694c0210a51d9f6c6a564');
INSERT INTO `batch_job_instance` VALUES ('25', '0', 'flow-step-job', '853d3449e311f40366811cbefb3d93d7');
INSERT INTO `batch_job_instance` VALUES ('26', '0', 'start-test-job', 'd41d8cd98f00b204e9800998ecf8427e');
INSERT INTO `batch_job_instance` VALUES ('27', '0', 'hello-restful-job', 'd41d8cd98f00b204e9800998ecf8427e');
INSERT INTO `batch_job_instance` VALUES ('28', '0', 'job-stop-job', 'd41d8cd98f00b204e9800998ecf8427e');
INSERT INTO `batch_job_instance` VALUES ('29', '0', 'job-forbid-restart-job', 'd41d8cd98f00b204e9800998ecf8427e');
INSERT INTO `batch_job_instance` VALUES ('30', '0', 'job-restart-limit-job', 'd41d8cd98f00b204e9800998ecf8427e');
INSERT INTO `batch_job_instance` VALUES ('31', '0', 'job-allow-restart-job', 'd41d8cd98f00b204e9800998ecf8427e');

-- ----------------------------
-- Table structure for `batch_job_seq`
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_seq`;
CREATE TABLE `batch_job_seq` (
  `ID` bigint(20) NOT NULL,
  `UNIQUE_KEY` char(1) COLLATE utf8_unicode_ci NOT NULL,
  UNIQUE KEY `UNIQUE_KEY_UN` (`UNIQUE_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of batch_job_seq
-- ----------------------------
INSERT INTO `batch_job_seq` VALUES ('31', '0');

-- ----------------------------
-- Table structure for `batch_step_execution`
-- ----------------------------
DROP TABLE IF EXISTS `batch_step_execution`;
CREATE TABLE `batch_step_execution` (
  `STEP_EXECUTION_ID` bigint(20) NOT NULL,
  `VERSION` bigint(20) NOT NULL,
  `STEP_NAME` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `JOB_EXECUTION_ID` bigint(20) NOT NULL,
  `START_TIME` datetime NOT NULL,
  `END_TIME` datetime DEFAULT NULL,
  `STATUS` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `COMMIT_COUNT` bigint(20) DEFAULT NULL,
  `READ_COUNT` bigint(20) DEFAULT NULL,
  `FILTER_COUNT` bigint(20) DEFAULT NULL,
  `WRITE_COUNT` bigint(20) DEFAULT NULL,
  `READ_SKIP_COUNT` bigint(20) DEFAULT NULL,
  `WRITE_SKIP_COUNT` bigint(20) DEFAULT NULL,
  `PROCESS_SKIP_COUNT` bigint(20) DEFAULT NULL,
  `ROLLBACK_COUNT` bigint(20) DEFAULT NULL,
  `EXIT_CODE` varchar(2500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `EXIT_MESSAGE` varchar(2500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LAST_UPDATED` datetime DEFAULT NULL,
  PRIMARY KEY (`STEP_EXECUTION_ID`),
  KEY `JOB_EXEC_STEP_FK` (`JOB_EXECUTION_ID`),
  CONSTRAINT `JOB_EXEC_STEP_FK` FOREIGN KEY (`JOB_EXECUTION_ID`) REFERENCES `batch_job_execution` (`JOB_EXECUTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of batch_step_execution
-- ----------------------------
INSERT INTO `batch_step_execution` VALUES ('1', '3', 'step2', '1', '2024-08-19 16:39:25', '2024-08-19 16:39:25', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-19 16:39:25');
INSERT INTO `batch_step_execution` VALUES ('2', '3', 'step1', '2', '2024-08-22 09:21:53', '2024-08-22 09:21:53', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:21:53');
INSERT INTO `batch_step_execution` VALUES ('3', '3', 'step1', '3', '2024-08-22 09:30:18', '2024-08-22 09:30:18', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:30:18');
INSERT INTO `batch_step_execution` VALUES ('4', '3', 'step2', '3', '2024-08-22 09:30:18', '2024-08-22 09:30:18', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:30:18');
INSERT INTO `batch_step_execution` VALUES ('5', '3', 'step1', '4', '2024-08-22 09:32:12', '2024-08-22 09:32:12', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:32:12');
INSERT INTO `batch_step_execution` VALUES ('6', '3', 'step2', '4', '2024-08-22 09:32:13', '2024-08-22 09:32:13', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:32:13');
INSERT INTO `batch_step_execution` VALUES ('7', '3', 'step1', '5', '2024-08-22 09:42:30', '2024-08-22 09:42:30', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:42:30');
INSERT INTO `batch_step_execution` VALUES ('8', '3', 'step2', '5', '2024-08-22 09:42:30', '2024-08-22 09:42:30', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:42:30');
INSERT INTO `batch_step_execution` VALUES ('9', '3', 'step1', '6', '2024-08-22 09:42:30', '2024-08-22 09:42:30', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:42:30');
INSERT INTO `batch_step_execution` VALUES ('10', '3', 'step1', '7', '2024-08-22 09:42:53', '2024-08-22 09:42:53', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:42:53');
INSERT INTO `batch_step_execution` VALUES ('11', '3', 'step2', '7', '2024-08-22 09:42:53', '2024-08-22 09:42:53', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:42:53');
INSERT INTO `batch_step_execution` VALUES ('12', '3', 'step1', '9', '2024-08-22 09:43:22', '2024-08-22 09:43:22', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:43:22');
INSERT INTO `batch_step_execution` VALUES ('13', '3', 'step2', '9', '2024-08-22 09:43:22', '2024-08-22 09:43:22', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:43:22');
INSERT INTO `batch_step_execution` VALUES ('14', '1419', 'step2', '12', '2024-08-22 09:45:21', null, 'STARTED', '1418', '0', '0', '0', '0', '0', '0', '0', 'EXECUTING', '', '2024-08-22 09:45:23');
INSERT INTO `batch_step_execution` VALUES ('15', '3745', 'step1', '13', '2024-08-22 09:49:31', null, 'STARTED', '3744', '11232', '0', '11232', '0', '0', '0', '0', 'EXECUTING', '', '2024-08-22 09:49:36');
INSERT INTO `batch_step_execution` VALUES ('16', '4', 'step1', '14', '2024-08-22 09:50:35', '2024-08-22 09:50:35', 'COMPLETED', '2', '3', '0', '3', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 09:50:35');
INSERT INTO `batch_step_execution` VALUES ('17', '6', 'step1', '15', '2024-08-22 10:05:30', '2024-08-22 10:05:30', 'COMPLETED', '4', '10', '0', '10', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:05:30');
INSERT INTO `batch_step_execution` VALUES ('18', '3', 'step1', '16', '2024-08-22 10:34:18', '2024-08-22 10:34:18', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:34:18');
INSERT INTO `batch_step_execution` VALUES ('19', '3', 'step1', '17', '2024-08-22 10:36:05', '2024-08-22 10:36:05', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:36:05');
INSERT INTO `batch_step_execution` VALUES ('20', '3', 'step2', '17', '2024-08-22 10:36:05', '2024-08-22 10:36:05', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:36:05');
INSERT INTO `batch_step_execution` VALUES ('21', '3', 'step1', '18', '2024-08-22 10:37:08', '2024-08-22 10:37:08', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:37:08');
INSERT INTO `batch_step_execution` VALUES ('22', '3', 'successStep', '18', '2024-08-22 10:37:08', '2024-08-22 10:37:09', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:37:09');
INSERT INTO `batch_step_execution` VALUES ('23', '3', 'firstStep', '19', '2024-08-22 10:39:45', '2024-08-22 10:39:45', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:39:45');
INSERT INTO `batch_step_execution` VALUES ('24', '3', 'defaultStep', '19', '2024-08-22 10:39:45', '2024-08-22 10:39:45', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:39:45');
INSERT INTO `batch_step_execution` VALUES ('25', '3', 'firstStep', '20', '2024-08-22 10:39:56', '2024-08-22 10:39:56', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:39:56');
INSERT INTO `batch_step_execution` VALUES ('26', '3', 'stepB', '20', '2024-08-22 10:39:56', '2024-08-22 10:39:56', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:39:56');
INSERT INTO `batch_step_execution` VALUES ('27', '3', 'firstStep', '21', '2024-08-22 10:40:47', '2024-08-22 10:40:47', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:40:47');
INSERT INTO `batch_step_execution` VALUES ('28', '3', 'stepB', '21', '2024-08-22 10:40:47', '2024-08-22 10:40:47', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:40:47');
INSERT INTO `batch_step_execution` VALUES ('29', '3', 'firstStep', '22', '2024-08-22 10:41:33', '2024-08-22 10:41:33', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:41:33');
INSERT INTO `batch_step_execution` VALUES ('30', '3', 'stepB', '22', '2024-08-22 10:41:33', '2024-08-22 10:41:33', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:41:33');
INSERT INTO `batch_step_execution` VALUES ('31', '3', 'firstStep', '23', '2024-08-22 10:42:10', '2024-08-22 10:42:11', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:42:11');
INSERT INTO `batch_step_execution` VALUES ('32', '3', 'firstStep', '24', '2024-08-22 10:42:20', '2024-08-22 10:42:20', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:42:20');
INSERT INTO `batch_step_execution` VALUES ('33', '3', 'stepB', '24', '2024-08-22 10:42:20', '2024-08-22 10:42:20', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:42:20');
INSERT INTO `batch_step_execution` VALUES ('34', '3', 'firstStep', '25', '2024-08-22 10:42:30', '2024-08-22 10:42:30', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:42:30');
INSERT INTO `batch_step_execution` VALUES ('35', '3', 'stepB', '25', '2024-08-22 10:42:31', '2024-08-22 10:42:31', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:42:31');
INSERT INTO `batch_step_execution` VALUES ('36', '3', 'firstStep', '26', '2024-08-22 10:49:21', '2024-08-22 10:49:21', 'ABANDONED', '0', '0', '0', '0', '0', '0', '0', '1', 'FAILED', 'java.lang.RuntimeException: 假装失败了\r\n	at com.edu.seiryo.StatusStepJob$1.execute(StatusStepJob.java:39)\r\n	at org.springframework.batch.core.step.tasklet.TaskletStep$ChunkTransactionCallback.doInTransaction(TaskletStep.java:407)\r\n	at org.springframework.batch.core.step.tasklet.TaskletStep$ChunkTransactionCallback.doInTransaction(TaskletStep.java:331)\r\n	at org.springframework.transaction.support.TransactionTemplate.execute(TransactionTemplate.java:140)\r\n	at org.springframework.batch.core.step.tasklet.TaskletStep$2.doInChunkContext(TaskletStep.java:273)\r\n	at org.springframework.batch.core.scope.context.StepContextRepeatCallback.doInIteration(StepContextRepeatCallback.java:82)\r\n	at org.springframework.batch.repeat.support.RepeatTemplate.getNextResult(RepeatTemplate.java:375)\r\n	at org.springframework.batch.repeat.support.RepeatTemplate.executeInternal(RepeatTemplate.java:215)\r\n	at org.springframework.batch.repeat.support.RepeatTemplate.iterate(RepeatTemplate.java:145)\r\n	at org.springframework.batch.core.step.tasklet.TaskletStep.doExecute(TaskletStep.java:258)\r\n	at org.springframework.batch.core.step.AbstractStep.execute(AbstractStep.java:208)\r\n	at org.springframework.batch.core.job.SimpleStepHandler.handleStep(SimpleStepHandler.java:152)\r\n	at org.springframework.batch.core.job.flow.JobFlowExecutor.executeStep(JobFlowExecutor.java:68)\r\n	at org.springframework.batch.core.job.flow.support.state.StepState.handle(StepState.java:68)\r\n	at org.springframework.batch.core.job.flow.support.SimpleFlow.resume(SimpleFlow.java:169)\r\n	at org.springframework.batch.core.job.flow.support.SimpleFlow.start(SimpleFlow.java:144)\r\n	at org.springframework.batch.core.job.flow.FlowJob.doExecute(FlowJob.java:137)\r\n	at org.springframework.batch.core.job.AbstractJob.execute(AbstractJob.java:320)\r\n	at org.springframework.batch.core.launch.support.SimpleJobLauncher$1.run(SimpleJobLauncher.java:149)\r\n	at org.springframework.core.task.SyncTaskExecutor.execute(SyncTaskExecutor.java:50)\r\n	at org.springframework.batch.core.launch.support.SimpleJobLauncher.run(SimpleJobLauncher.java:140)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n	at java.lang.reflect.Method.invoke(Unknown Source)\r\n	at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:344)\r\n	at org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJ', '2024-08-22 10:49:21');
INSERT INTO `batch_step_execution` VALUES ('37', '3', 'firstStep', '27', '2024-08-22 10:49:40', '2024-08-22 10:49:40', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:49:40');
INSERT INTO `batch_step_execution` VALUES ('38', '3', 'successStep', '27', '2024-08-22 10:49:40', '2024-08-22 10:49:40', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:49:40');
INSERT INTO `batch_step_execution` VALUES ('39', '3', 'stepA', '28', '2024-08-22 10:50:34', '2024-08-22 10:50:34', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:50:34');
INSERT INTO `batch_step_execution` VALUES ('40', '2', 'stepB', '28', '2024-08-22 10:50:34', '2024-08-22 10:50:34', 'COMPLETED', '0', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:50:34');
INSERT INTO `batch_step_execution` VALUES ('41', '3', 'stepB1', '28', '2024-08-22 10:50:34', '2024-08-22 10:50:34', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:50:34');
INSERT INTO `batch_step_execution` VALUES ('42', '3', 'stepB2', '28', '2024-08-22 10:50:34', '2024-08-22 10:50:34', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:50:34');
INSERT INTO `batch_step_execution` VALUES ('43', '3', 'stepB3', '28', '2024-08-22 10:50:34', '2024-08-22 10:50:34', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:50:34');
INSERT INTO `batch_step_execution` VALUES ('44', '3', 'stepC', '28', '2024-08-22 10:50:34', '2024-08-22 10:50:34', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 10:50:34');
INSERT INTO `batch_step_execution` VALUES ('45', '3', 'step1', '29', '2024-08-22 11:44:13', '2024-08-22 11:44:13', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 11:44:13');
INSERT INTO `batch_step_execution` VALUES ('46', '3', 'step1', '30', '2024-08-22 11:59:30', '2024-08-22 11:59:30', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 11:59:30');
INSERT INTO `batch_step_execution` VALUES ('47', '3', 'step1', '36', '2024-08-22 13:26:24', '2024-08-22 13:26:24', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'STOPPED', '', '2024-08-22 13:26:24');
INSERT INTO `batch_step_execution` VALUES ('48', '3', 'step1', '38', '2024-08-22 13:27:46', '2024-08-22 13:27:46', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'STOPPED', '', '2024-08-22 13:27:46');
INSERT INTO `batch_step_execution` VALUES ('49', '3', 'step1', '39', '2024-08-22 13:28:36', '2024-08-22 13:28:36', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'STOPPED', '', '2024-08-22 13:28:36');
INSERT INTO `batch_step_execution` VALUES ('50', '3', 'step1', '40', '2024-08-22 13:31:00', '2024-08-22 13:31:00', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 13:31:00');
INSERT INTO `batch_step_execution` VALUES ('51', '3', 'step2', '40', '2024-08-22 13:31:00', '2024-08-22 13:31:00', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 13:31:00');
INSERT INTO `batch_step_execution` VALUES ('52', '3', 'step1', '41', '2024-08-22 13:44:23', '2024-08-22 13:44:23', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 13:44:23');
INSERT INTO `batch_step_execution` VALUES ('53', '3', 'step1', '42', '2024-08-22 13:46:06', '2024-08-22 13:46:06', 'STOPPED', '1', '0', '0', '0', '0', '0', '0', '0', 'STOPPED', 'org.springframework.batch.core.JobInterruptedException', '2024-08-22 13:46:06');
INSERT INTO `batch_step_execution` VALUES ('54', '3', 'step1', '43', '2024-08-22 13:52:13', '2024-08-22 13:52:13', 'STOPPED', '1', '0', '0', '0', '0', '0', '0', '0', 'STOPPED', 'org.springframework.batch.core.JobInterruptedException', '2024-08-22 13:52:13');
INSERT INTO `batch_step_execution` VALUES ('55', '3', 'step1', '44', '2024-08-22 13:52:38', '2024-08-22 13:52:38', 'STOPPED', '1', '0', '0', '0', '0', '0', '0', '0', 'STOPPED', 'org.springframework.batch.core.JobInterruptedException', '2024-08-22 13:52:38');
INSERT INTO `batch_step_execution` VALUES ('56', '3', 'step1', '46', '2024-08-22 14:15:02', '2024-08-22 14:15:02', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 14:15:02');
INSERT INTO `batch_step_execution` VALUES ('57', '3', 'step2', '46', '2024-08-22 14:15:02', '2024-08-22 14:15:02', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 14:15:02');
INSERT INTO `batch_step_execution` VALUES ('58', '3', 'step1', '48', '2024-08-22 14:16:23', '2024-08-22 14:16:23', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 14:16:23');
INSERT INTO `batch_step_execution` VALUES ('59', '3', 'step2', '48', '2024-08-22 14:16:23', '2024-08-22 14:16:23', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 14:16:23');
INSERT INTO `batch_step_execution` VALUES ('60', '3', 'step1', '49', '2024-08-22 14:16:50', '2024-08-22 14:16:50', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 14:16:50');
INSERT INTO `batch_step_execution` VALUES ('61', '3', 'step2', '49', '2024-08-22 14:16:50', '2024-08-22 14:16:50', 'COMPLETED', '1', '0', '0', '0', '0', '0', '0', '0', 'COMPLETED', '', '2024-08-22 14:16:50');

-- ----------------------------
-- Table structure for `batch_step_execution_context`
-- ----------------------------
DROP TABLE IF EXISTS `batch_step_execution_context`;
CREATE TABLE `batch_step_execution_context` (
  `STEP_EXECUTION_ID` bigint(20) NOT NULL,
  `SHORT_CONTEXT` varchar(2500) COLLATE utf8_unicode_ci NOT NULL,
  `SERIALIZED_CONTEXT` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`STEP_EXECUTION_ID`),
  CONSTRAINT `STEP_EXEC_CTX_FK` FOREIGN KEY (`STEP_EXECUTION_ID`) REFERENCES `batch_step_execution` (`STEP_EXECUTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of batch_step_execution_context
-- ----------------------------
INSERT INTO `batch_step_execution_context` VALUES ('1', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.HelloJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('2', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ExecutionContextJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('3', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ExecutionContextJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\",\"key-step1-step\":\"value-step1-step\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('4', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ExecutionContextJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('5', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ExecutionContextJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\",\"key-step1-step\":\"value-step1-step\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('6', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ExecutionContextJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('7', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ExecutionContextJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\",\"key-step1-step\":\"value-step1-step\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('8', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ExecutionContextJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('9', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.SimpleTaskletJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('10', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ExecutionContextJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\",\"key-step1-step\":\"value-step1-step\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('11', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ExecutionContextJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('12', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ExecutionContextJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\",\"key-step1-step\":\"value-step1-step\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('13', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ExecutionContextJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('14', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.SimpleTaskletJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('15', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"org.springframework.batch.core.step.item.ChunkOrientedTasklet\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('16', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"org.springframework.batch.core.step.item.ChunkOrientedTasklet\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('17', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"org.springframework.batch.core.step.item.ChunkOrientedTasklet\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('18', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.StepListenerJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('19', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.MultiStepJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('20', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.MultiStepJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('21', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ConditionStepJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('22', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ConditionStepJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('23', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('24', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$4\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('25', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('26', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$3\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('27', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('28', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$3\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('29', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('30', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$3\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('31', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('32', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('33', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$3\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('34', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('35', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.CustomizeStatusStepJob$3\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('36', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.StatusStepJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('37', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.StatusStepJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('38', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.StatusStepJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('39', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.FlowStepJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('40', '{\"@class\":\"java.util.HashMap\",\"batch.stepType\":\"org.springframework.batch.core.job.flow.FlowStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('41', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.FlowStepJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('42', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.FlowStepJob$3\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('43', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.FlowStepJob$4\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('44', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.FlowStepJob$5\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('45', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.StartJobTest$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('46', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.BatchConfig$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('47', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ListenerJobStopJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('48', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ListenerJobStopJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('49', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ListenerJobStopJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('50', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ListenerJobStopJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('51', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.ListenerJobStopJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('52', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.SignJobStopJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('53', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.JobForBidRestartJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('54', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.JobLimitRestartJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('55', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.JobLimitRestartJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('56', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.JobAllowRestartJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('57', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.JobAllowRestartJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('58', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.JobAllowRestartJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('59', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.JobAllowRestartJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('60', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.JobAllowRestartJob$1\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);
INSERT INTO `batch_step_execution_context` VALUES ('61', '{\"@class\":\"java.util.HashMap\",\"batch.taskletType\":\"com.edu.seiryo.JobAllowRestartJob$2\",\"batch.stepType\":\"org.springframework.batch.core.step.tasklet.TaskletStep\"}', null);

-- ----------------------------
-- Table structure for `batch_step_execution_seq`
-- ----------------------------
DROP TABLE IF EXISTS `batch_step_execution_seq`;
CREATE TABLE `batch_step_execution_seq` (
  `ID` bigint(20) NOT NULL,
  `UNIQUE_KEY` char(1) COLLATE utf8_unicode_ci NOT NULL,
  UNIQUE KEY `UNIQUE_KEY_UN` (`UNIQUE_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of batch_step_execution_seq
-- ----------------------------
INSERT INTO `batch_step_execution_seq` VALUES ('61', '0');

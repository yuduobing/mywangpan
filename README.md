# 平台介绍
在gitee和github里面基本上找不到一款好用、功能完善、且开放源码的网盘系统，有一些可以免费试用但是只提供安装包，于是在利用业务时间开发了一套轻量级且易于上手的网盘系统，主要基于目前主流的前后端分离和微服务架构模式开发，里面涉及很多的解决方案。网盘系统的核心目的有两个，第一：提供接口给业务系统集成，统一管理业务系统的文件；第二：提供在线协调办公、管理个人文件的功能。系统会陆续更新和完善一些功能。

# 部署架构说明
![部署架构图](https://images.gitee.com/uploads/images/2020/0406/140458_b47366d8_798389.png "部署架构.png")

# 技术栈说明
#### 前端技术
* ①vue.js+ElementUI 作为基础技术框架
* ②WebUploader.js做切块上传框架

#### 后端技术
* ①Maven+SpringBoot+SpringDataJPA作为基础架构
* ②Dubbo+Zookeeper作为服务治理架构
* ③Nacos作为配置中心
* ④Redis做分布式缓存、过期监听
* ⑤Zookeeper做分布式锁
* ⑥WebSocket+Netty做消息推送
* ⑦Solr做全文检索引擎
* ⑧FastDFS做分布式文件系统
* ⑨基于Redis+token+自定义注解实现接口幂等性

# 功能说明
#### 一、网盘系统
* ①上传功能：主要是针对大文件的切块上传、秒传、文件夹上传
* ②下载功能：主要是大文件的切块下载；多文件（夹）合并、压缩下载
* ③文件分享：文件分享包括好友分享、私密链接分享、分享文件的转存
* ④相册管理：可以建立不同的相册来管理图片，并且可以图片在线预览功能
* ⑤回收站：删除的文件进入回收站，可以进行还原或者彻底删除
* ⑥推送功能：主要是好友分享消息推送、过期消息推送、容量更新推送
* ⑦分布式锁：主要是基于Zookeeper实现分布式锁，保证高并发情况下系统的数据安全
* ⑧过期监听：主要是基于Redis过期事件实现监听功能，包括：分享失效监听、删除过期监听等
* ⑨日志采集：通过AOP埋点的方式进行采集用户请求日志，并远程传输到日志服务端；自定义Dubbo的Filter实现`链路ID`的生成
* ⑩文件搜索：集成Solr框架实现全文搜索功能
* ⑪文件存储：集成FastDFS框架实现文件分布式存储
* ⑫其他琐碎功能：比如，复杂、移动、预览、删除、重命名、在线创建、在线编辑、编辑历史版本留痕等等
* ⑬Office在线编辑：<font color=blue> **后期更新** </font>
* ⑭h5版本客户端：<font color=red> **后期更新** </font>
* ⑮c/s版本客户端：<font color=red> **后期更新** </font>
* ⑯业务系统API客户端：<font color=red> **后期更新** </font>
* ⑰图片新增水印：<font color=red> **后期更新** </font>
* ⑱图片在线裁剪：<font color=red> **后期更新** </font>

#### 二、后台系统
* ①组件管理：主要管理文件的预览和编辑组件
* ②类型管理：主要是管理文件的格式、对应的图标、对应的预览和编辑组件
* ③日志管理：存储和展示业务系统的操作日志记录，并且可以根据`追踪ID`来关联所有的日志信息

# 其他相关地址说明
* 慕课网专栏：https://www.imooc.com/read/73
* 前端工程：
* 网盘系统在线演示：[http://106.15.248.223/disk](http://106.15.248.223/disk)
* 网盘后台在线演示：[http://106.15.248.223/disk-manage](http://106.15.248.223/disk-manage)


# 项目效果图
![输入图片说明](https://images.gitee.com/uploads/images/2020/0406/141807_35dda25b_798389.png "效果图-1.png")

![输入图片说明](https://images.gitee.com/uploads/images/2020/0406/141819_aef32e7a_798389.png "效果图-2.png")
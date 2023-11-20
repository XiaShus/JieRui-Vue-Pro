## 本分支为精简版
* 移除了完整版的 工作流、支付、报表、测试等模块，只保留了系统管理、基础设施

## 🐶 新手必读

* 演示地址【Vue3 + element-plus】：<http://dashboard-vue3.jierui.iocoder.cn>
* 演示地址【Vue3 + vben(ant-design-vue)】：<http://dashboard-vben.jierui.iocoder.cn>
* 演示地址【Vue2 + element-ui】：<http://dashboard.jierui.iocoder.cn>
* 启动文档：<https://doc.iocoder.cn/quick-start/>
* 视频教程：<https://doc.iocoder.cn/video/>

已支持 Spring Boot 3.X + JDK 17 版本，可见 [master-boot3](https://gitee.com/zhijiantianya/ruoyi-vue-pro/blob/master/README.md) 分支。

## 🐯 平台简介

**杰瑞**，以开发者为中心，打造中国第一流的快速开发平台，全部开源，个人与企业可 100% 免费使用。

> 有任何问题，或者想要的功能，可以在 _Issues_ 中提给艿艿。
>
> 😜 给项目点点 Star 吧，这对我们真的很重要！

![架构图](/.image/common/ruoyi-vue-pro-architecture.png)

* 管理后台的电脑端：Vue3 提供 [element-plus](https://gitee.com/jieruicode/jierui-ui-admin-vue3)、[vben(ant-design-vue)](https://gitee.com/jieruicode/jierui-ui-admin-vben) 两个版本，Vue2 提供 [element-ui](https://gitee.com/zhijiantianya/ruoyi-vue-pro/tree/master/jierui-ui-admin) 版本
* 管理后台的移动端：采用 [uni-app](https://github.com/dcloudio/uni-app) 方案，一份代码多终端适配，同时支持 APP、小程序、H5！
* 后端采用 Spring Boot 多模块架构、MySQL + MyBatis Plus、Redis + Redisson
* 数据库可使用 MySQL、Oracle、PostgreSQL、SQL Server、MariaDB、国产达梦 DM、TiDB 等
* 权限认证使用 Spring Security & Token & Redis，支持多终端、多种用户的认证系统，支持 SSO 单点登录
* 支持加载动态权限菜单，按钮级别权限控制，本地缓存提升性能
* 支持 SaaS 多租户，可自定义每个租户的权限，提供透明化的多租户底层封装
* 高效率开发，使用代码生成器可以一键生成前后端代码 + 单元测试 + Swagger 接口文档 + Validator 参数校验
* 集成微信小程序、微信公众号、企业微信、钉钉等三方登陆，集成支付宝、微信等支付与退款
* 集成阿里云、腾讯云等短信渠道，集成 MinIO、阿里云、腾讯云、七牛云等云存储服务

##  🐳 项目关系

![架构演进](/.image/common/jierui-roadmap.png)

三个项目的功能对比，可见社区共同整理的 [国产开源项目对比](https://www.yuque.com/xiatian-bsgny/lm0ec1/wqf8mn) 表格。

### 后端项目


| 项目                                                              | Star                                                                                                                                                                                                                                                                                             | 简介                          |
|-----------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------|
| [ruoyi-vue-pro](https://gitee.com/zhijiantianya/ruoyi-vue-pro)  | [![Gitee star](https://gitee.com/zhijiantianya/ruoyi-vue-pro/badge/star.svg?theme=white)](https://gitee.com/zhijiantianya/ruoyi-vue-pro) [![GitHub stars](https://img.shields.io/github/stars/YunaiV/ruoyi-vue-pro.svg?style=social&label=Stars)](https://github.com/YunaiV/ruoyi-vue-pro)       | 基于 Spring Boot 多模块架构        |
| [jierui-cloud](https://gitee.com/zhijiantianya/jierui-cloud)      | [![Gitee star](https://gitee.com/zhijiantianya/jierui-cloud/badge/star.svg?theme=white)](https://gitee.com/zhijiantianya/jierui-cloud) [![GitHub stars](https://img.shields.io/github/stars/YunaiV/jierui-cloud.svg?style=social&label=Stars)](https://github.com/YunaiV/jierui-cloud)               | 基于 Spring Cloud 微服务架构       |
| [Spring-Boot-Labs](https://gitee.com/jieruicode/SpringBoot-Labs) | [![Gitee star](https://gitee.com/jieruicode/SpringBoot-Labs/badge/star.svg?theme=white)](https://gitee.com/zhijiantianya/jierui-cloud) [![GitHub stars](https://img.shields.io/github/stars/jieruicode/SpringBoot-Labs.svg?style=social&label=Stars)](https://github.com/jieruicode/SpringBoot-Labs) | 系统学习 Spring Boot & Cloud 专栏 |

### 前端项目

| 项目                                                                                                       | Star                                                                                                                                                                                                                                                                                                                                                           | 简介                                     |
|----------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------|
| [jierui-ui-admin-vue3](https://gitee.com/jieruicode/jierui-ui-admin-vue3)                                   | [![Gitee star](https://gitee.com/jieruicode/jierui-ui-admin-vue3/badge/star.svg?theme=white)](https://gitee.com/jieruicode/jierui-ui-admin-vue3) [![GitHub stars](https://img.shields.io/github/stars/jieruicode/jierui-ui-admin-vue3.svg?style=social&label=Stars)](https://github.com/jieruicode/jierui-ui-admin-vue3)                                               | 基于 Vue3 + element-plus 实现的管理后台         |
| [jierui-ui-admin-vben](https://gitee.com/jieruicode/jierui-ui-admin-vben)                                   | [![Gitee star](https://gitee.com/jieruicode/jierui-ui-admin-vben/badge/star.svg?theme=white)](https://gitee.com/jieruicode/jierui-ui-admin-vben) [![GitHub stars](https://img.shields.io/github/stars/jieruicode/jierui-ui-admin-vben.svg?style=social&label=Stars)](https://github.com/jieruicode/jierui-ui-admin-vben)                                               | 基于 Vue3 + vben(ant-design-vue) 实现的管理后台 |
| [jierui-ui-admin](https://gitee.com/zhijiantianya/ruoyi-vue-pro/tree/master/jierui-ui-admin)               | [![Gitee star](https://gitee.com/zhijiantianya/ruoyi-vue-pro/badge/star.svg?theme=white)](https://gitee.com/zhijiantianya/ruoyi-vue-pro/tree/master/jierui-ui-admin) [![GitHub stars](https://img.shields.io/github/stars/YunaiV/ruoyi-vue-pro.svg?style=social&label=Stars)](https://github.com/YunaiV/ruoyi-vue-pro/tree/master/jierui-ui-admin)               | 基于 Vue2 + element-ui 实现的管理后台           |
| [jierui-ui-admin-uniapp](https://gitee.com/zhijiantianya/ruoyi-vue-pro/tree/master/jierui-ui-admin-uniapp) | [![Gitee star](https://gitee.com/zhijiantianya/ruoyi-vue-pro/badge/star.svg?theme=white)](https://gitee.com/zhijiantianya/ruoyi-vue-pro/tree/master/jierui-ui-admin-uniapp) [![GitHub stars](https://img.shields.io/github/stars/YunaiV/ruoyi-vue-pro.svg?style=social&label=Stars)](https://github.com/YunaiV/ruoyi-vue-pro/tree/master/jierui-ui-admin-uniapp) | 基于 uni-app + uni-ui 实现的管理后台的小程序        |
| [jierui-ui-go-view](https://gitee.com/jieruicode/jierui-ui-go-view)                                         | [![Gitee star](https://gitee.com/jieruicode/jierui-ui-go-view/badge/star.svg?theme=white)](https://gitee.com/jieruicode/jierui-ui-go-view) [![GitHub stars](https://img.shields.io/github/stars/jieruicode/jierui-ui-go-view.svg?style=social&label=Stars)](https://github.com/jieruicode/jierui-ui-go-view)                                                           | 基于 Vue3 + naive-ui 实现的大屏报表             |
| [jierui-mall-uniapp](https://gitee.com/jieruicode/jierui-mall-uniapp)                   | [![Gitee star](https://gitee.com/jieruicode/jierui-mall-uniapp/badge/star.svg?theme=white)](https://gitee.com/jieruicode/jierui-mall-uniapp) [![GitHub stars](https://img.shields.io/github/stars/jieruicode/jierui-mall-uniapp.svg?style=social&label=Stars)](https://github.com/jieruicode/jierui-mall-uniapp)                   | 基于 uni-app 实现的商城小程序                    |

## 🐰 分支说明

|       | JDK 8 完整版                                                 | JDK 8 精简版                                                          | JDK 17 完整版                                                                  |
|-------|-----------------------------------------------------------|--------------------------------------------------------------------|-----------------------------------------------------------------------------|
| 分支    | [`master`](https://gitee.com/zhijiantianya/ruoyi-vue-pro) | [`mini`](https://gitee.com/zhijiantianya/ruoyi-vue-pro/tree/mini/) | [`master-boot3`](https://gitee.com/zhijiantianya/ruoyi-vue-pro/tree/master-boot3/) |
| 说明    | 包括所有功能                                                    | 只保留核心功能                                                            | 适配 Spring Boot 3.X                                                          |
| 系统功能  | √                                                         | √                                                                  | √                                                                           |
| 基础设施  | √                                                         | √                                                                  | √                                                                           |
| 会员中心  | √                                                         | √                                                                  | √                                                                           |
| 工作流程  | √                                                         | x                                                                  | √                                                                         |
| 数据报表  | √                                                         | x                                                                  | 适配中                                                                         |
| 商城系统  | √                                                         | x                                                                  | √                                                                           |
| 微信公众号 | √                                                         | x                                                                  | √                                                                           |

## 😎 开源协议

**为什么推荐使用本项目？**

① 本项目采用比 Apache 2.0 更宽松的 [MIT License](https://gitee.com/zhijiantianya/ruoyi-vue-pro/blob/master/LICENSE) 开源协议，个人与企业可 100% 免费使用，不用保留类作者、Copyright 信息。

② 代码全部开源，不会像其他项目一样，只开源部分代码，让你无法了解整个项目的架构设计。[国产开源项目对比](https://www.yuque.com/xiatian-bsgny/lm0ec1/wqf8mn)

![开源项目对比](/.image/common/project-vs.png)

③ 代码整洁、架构整洁，遵循《阿里巴巴 Java 开发手册》规范，代码注释详细，57000 行 Java 代码，22000 行代码注释。

## 🤝 项目外包

我们也是接外包滴，如果你有项目想要外包，可以微信联系【**xinyu370**】。

团队包含专业的项目经理、架构师、前端工程师、后端工程师、测试工程师、运维工程师，可以提供全流程的外包服务。

项目可以是商城、SCRM 系统、OA 系统、物流系统、ERP 系统、CMS 系统、HIS 系统、支付系统、IM 聊天、微信公众号、微信小程序等等。

## 🐼 内置功能

系统内置多种多种业务功能，可以用于快速你的业务系统：

![功能分层](/.image/common/ruoyi-vue-pro-biz.png)

* 系统功能
* 基础设施
* 工作流程
* 支付系统
* 会员中心
* 数据报表
* 商城系统
* 微信公众号

> 友情提示：本项目基于 RuoYi-Vue 修改，**重构优化**后端的代码，**美化**前端的界面。
>
> * 额外新增的功能，我们使用 🚀 标记。
> * 重新实现的功能，我们使用 ⭐️ 标记。

🙂 所有功能，都通过 **单元测试** 保证高质量。

### 系统功能

|     | 功能    | 描述                              |
|-----|-------|---------------------------------|
|     | 用户管理  | 用户是系统操作者，该功能主要完成系统用户配置          |
| ⭐️  | 在线用户  | 当前系统中活跃用户状态监控，支持手动踢下线           |
|     | 角色管理  | 角色菜单权限分配、设置角色按机构进行数据范围权限划分      |
|     | 菜单管理  | 配置系统菜单、操作权限、按钮权限标识等，本地缓存提供性能    |
|     | 部门管理  | 配置系统组织机构（公司、部门、小组），树结构展现支持数据权限  |
|     | 岗位管理  | 配置系统用户所属担任职务                    |
| 🚀  | 租户管理  | 配置系统租户，支持 SaaS 场景下的多租户功能        |
| 🚀  | 租户套餐  | 配置租户套餐，自定每个租户的菜单、操作、按钮的权限       |
|     | 字典管理  | 对系统中经常使用的一些较为固定的数据进行维护          |
| 🚀  | 短信管理  | 短信渠道、短息模板、短信日志，对接阿里云、腾讯云等主流短信平台 |
| 🚀  | 邮件管理  | 邮箱账号、邮件模版、邮件发送日志，支持所有邮件平台       |
| 🚀  | 站内信   | 系统内的消息通知，提供站内信模版、站内信消息          |
| 🚀  | 操作日志  | 系统正常操作日志记录和查询，集成 Swagger 生成日志内容 |
| ⭐️  | 登录日志  | 系统登录日志记录查询，包含登录异常               |
| 🚀  | 错误码管理 | 系统所有错误码的管理，可在线修改错误提示，无需重启服务     |
|     | 通知公告  | 系统通知公告信息发布维护                    |
| 🚀  | 敏感词   | 配置系统敏感词，支持标签分组                  |
| 🚀  | 应用管理  | 管理 SSO 单点登录的应用，支持多种 OAuth2 授权方式 |
| 🚀  | 地区管理  | 展示省份、城市、区镇等城市信息，支持 IP 对应城市      |

### 基础设施

|     | 功能       | 描述                                           |
|-----|----------|----------------------------------------------|
| 🚀  | 代码生成     | 前后端代码的生成（Java、Vue、SQL、单元测试），支持 CRUD 下载       |
| 🚀  | 系统接口     | 基于 Swagger 自动生成相关的 RESTful API 接口文档          |
| 🚀  | 数据库文档    | 基于 Screw 自动生成数据库文档，支持导出 Word、HTML、MD 格式      |
| 🚀  | 配置管理     | 对系统动态配置常用参数，支持 SpringBoot 加载                 |
| ⭐️  | 定时任务     | 在线（添加、修改、删除)任务调度包含执行结果日志                     |
| 🚀  | 文件服务     | 支持将文件存储到 S3（MinIO、阿里云、腾讯云、七牛云）、本地、FTP、数据库等   | 
| 🚀  | API 日志   | 包括 RESTful API 访问日志、异常日志两部分，方便排查 API 相关的问题   |
|     | MySQL 监控 | 监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈              |
|     | Redis 监控 | 监控 Redis 数据库的使用情况，使用的 Redis Key 管理           |
| 🚀  | 消息队列     | 基于 Redis 实现消息队列，Stream 提供集群消费，Pub/Sub 提供广播消费 |
| 🚀  | Java 监控  | 基于 Spring Boot Admin 实现 Java 应用的监控           |
| 🚀  | 链路追踪     | 接入 SkyWalking 组件，实现链路追踪                      |
| 🚀  | 日志中心     | 接入 SkyWalking 组件，实现日志中心                      |
| 🚀  | 分布式锁     | 基于 Redis 实现分布式锁，满足并发场景                       |
| 🚀  | 幂等组件     | 基于 Redis 实现幂等组件，解决重复请求问题                     |
| 🚀  | 服务保障     | 基于 Resilience4j 实现服务的稳定性，包括限流、熔断等功能          |
| 🚀  | 日志服务     | 轻量级日志中心，查看远程服务器的日志                           |


## 🐨 技术栈

### 模块

| 项目                                                                       | 说明                 |
|--------------------------------------------------------------------------|--------------------|
| `jierui-dependencies`                                                     | Maven 依赖版本管理       |
| `jierui-framework`                                                        | Java 框架拓展          |
| `jierui-server`                                                           | 管理后台 + 用户 APP 的服务端 |
| `jierui-module-system`                                                    | 系统功能的 Module 模块    |
| `jierui-module-member`                                                    | 会员中心的 Module 模块    |
| `jierui-module-infra`                                                     | 基础设施的 Module 模块    |

### 框架

| 框架                                                                                          | 说明               | 版本             | 学习指南                                                           |
|---------------------------------------------------------------------------------------------|------------------|----------------|----------------------------------------------------------------|
| [Spring Boot](https://spring.io/projects/spring-boot)                                       | 应用开发框架           | 2.7.17         | [文档](https://github.com/YunaiV/SpringBoot-Labs)                |
| [MySQL](https://www.mysql.com/cn/)                                                          | 数据库服务器           | 5.7 / 8.0+     |                                                                |
| [Druid](https://github.com/alibaba/druid)                                                   | JDBC 连接池、监控组件    | 1.2.19         | [文档](http://www.iocoder.cn/Spring-Boot/datasource-pool/?jierui) |
| [MyBatis Plus](https://mp.baomidou.com/)                                                    | MyBatis 增强工具包    | 3.5.3.2        | [文档](http://www.iocoder.cn/Spring-Boot/MyBatis/?jierui)         |
| [Dynamic Datasource](https://dynamic-datasource.com/)                                       | 动态数据源            | 3.6.1          | [文档](http://www.iocoder.cn/Spring-Boot/datasource-pool/?jierui) |
| [Redis](https://redis.io/)                                                                  | key-value 数据库    | 5.0 / 6.0 /7.0 |                                                                |
| [Redisson](https://github.com/redisson/redisson)                                            | Redis 客户端        | 3.18.0         | [文档](http://www.iocoder.cn/Spring-Boot/Redis/?jierui)           |
| [Spring MVC](https://github.com/spring-projects/spring-framework/tree/master/spring-webmvc) | MVC 框架           | 5.3.24         | [文档](http://www.iocoder.cn/SpringMVC/MVC/?jierui)               |
| [Spring Security](https://github.com/spring-projects/spring-security)                       | Spring 安全框架      | 5.7.11         | [文档](http://www.iocoder.cn/Spring-Boot/Spring-Security/?jierui) |
| [Hibernate Validator](https://github.com/hibernate/hibernate-validator)                     | 参数校验组件           | 6.2.5          | [文档](http://www.iocoder.cn/Spring-Boot/Validation/?jierui)      |
| [Quartz](https://github.com/quartz-scheduler)                                               | 任务调度组件           | 2.3.2          | [文档](http://www.iocoder.cn/Spring-Boot/Job/?jierui)             |
| [Springdoc](https://springdoc.org/)                                                         | Swagger 文档       | 1.6.15         | [文档](http://www.iocoder.cn/Spring-Boot/Swagger/?jierui)         |
| [Resilience4j](https://github.com/resilience4j/resilience4j)                                | 服务保障组件           | 1.7.1          | [文档](http://www.iocoder.cn/Spring-Boot/Resilience4j/?jierui)    |
| [SkyWalking](https://skywalking.apache.org/)                                                | 分布式应用追踪系统        | 8.12.0         | [文档](http://www.iocoder.cn/Spring-Boot/SkyWalking/?jierui)      |
| [Spring Boot Admin](https://github.com/codecentric/spring-boot-admin)                       | Spring Boot 监控平台 | 2.7.10         | [文档](http://www.iocoder.cn/Spring-Boot/Admin/?jierui)           |
| [Jackson](https://github.com/FasterXML/jackson)                                             | JSON 工具库         | 2.13.3         |                                                                |
| [MapStruct](https://mapstruct.org/)                                                         | Java Bean 转换     | 1.5.5.Final    | [文档](http://www.iocoder.cn/Spring-Boot/MapStruct/?jierui)       |
| [Lombok](https://projectlombok.org/)                                                        | 消除冗长的 Java 代码    | 1.18.30        | [文档](http://www.iocoder.cn/Spring-Boot/Lombok/?jierui)          |

## 🐷 演示图

### 系统功能

| 模块       | biu                         | biu                       | biu                      |
|----------|-----------------------------|---------------------------|--------------------------|
| 登录 & 首页  | ![登录](/.image/登录.jpg)       | ![首页](/.image/首页.jpg)     | ![个人中心](/.image/个人中心.jpg) |
| 用户 & 应用  | ![用户管理](/.image/用户管理.jpg)   | ![令牌管理](/.image/令牌管理.jpg) | ![应用管理](/.image/应用管理.jpg) |
| 租户 & 套餐  | ![租户管理](/.image/租户管理.jpg)   | ![租户套餐](/.image/租户套餐.png) | -                        |
| 部门 & 岗位  | ![部门管理](/.image/部门管理.jpg)   | ![岗位管理](/.image/岗位管理.jpg) | -                        |
| 菜单 & 角色  | ![菜单管理](/.image/菜单管理.jpg)   | ![角色管理](/.image/角色管理.jpg) | -                        |
| 审计日志     | ![操作日志](/.image/操作日志.jpg)   | ![登录日志](/.image/登录日志.jpg) | -                        |
| 短信       | ![短信渠道](/.image/短信渠道.jpg)   | ![短信模板](/.image/短信模板.jpg) | ![短信日志](/.image/短信日志.jpg) |
| 字典 & 敏感词 | ![字典类型](/.image/字典类型.jpg)   | ![字典数据](/.image/字典数据.jpg) | ![敏感词](/.image/敏感词.jpg)  |
| 错误码 & 通知 | ![错误码管理](/.image/错误码管理.jpg) | ![通知公告](/.image/通知公告.jpg) | -                        |


### 基础设施

| 模块            | biu                           | biu                         | biu                       |
|---------------|-------------------------------|-----------------------------|---------------------------|
| 代码生成          | ![代码生成](/.image/代码生成.jpg)     | ![生成效果](/.image/生成效果.jpg)   | -                         |
| 文档            | ![系统接口](/.image/系统接口.jpg)     | ![数据库文档](/.image/数据库文档.jpg) | -                         |
| 文件 & 配置       | ![文件配置](/.image/文件配置.jpg)     | ![文件管理](/.image/文件管理2.jpg)  | ![配置管理](/.image/配置管理.jpg) |
| 定时任务          | ![定时任务](/.image/定时任务.jpg)     | ![任务日志](/.image/任务日志.jpg)   | -                         |
| API 日志        | ![访问日志](/.image/访问日志.jpg)     | ![错误日志](/.image/错误日志.jpg)   | -                         |
| MySQL & Redis | ![MySQL](/.image/MySQL.jpg)   | ![Redis](/.image/Redis.jpg) | -                         |
| 监控平台          | ![Java监控](/.image/Java监控.jpg) | ![链路追踪](/.image/链路追踪.jpg)   | ![日志中心](/.image/日志中心.jpg) |



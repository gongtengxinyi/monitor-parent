
 ## 技术初衷
    求星！求星！重要的事情说三遍。如果对你学习有用，帮忙点个星星吧，谢谢。
    该项目主要是集成目前流行的各种中间件，
    为java初学者提供简单入门demo(所以划重点！！！！`杠精或者喷子绕路吧`)。
    因为作者时间有限所以会有些bug。
    如有问题请联系 `qq`:1251272104.或者发送邮件到我`m13687672481@163.com`联系。
    项目本身开源，商业用途请联系作者。目前项目开发中，各功能逐步完善......
 
## 项目用到的技术（逐步完善）

* spring+springmvc+mybatis 夹杂一点springboot
* dubbo微服务实践
* 利用mybatis做`分库分表`，动态切换数据源
* rabbitmq消息队列进行系统解耦
* redis热点数据缓存+秒杀案例
* mongodb初步使用
* websocket消息推送服务器搭建（弹幕效果+聊天室）
* java并发包实践教程
* 前后端分离 auth2+shiro权限验证
* 后端必学`vue.js`模板化使用 webpack+npm 
* Jenkins持续集成+docker虚拟化部署
* Nginx负载均衡配置+前后端分离部署
* 后续继续补充





## 有问题反馈
在使用中有任何问题，欢迎反馈给我，可以用以下联系方式跟我交流

* 邮件(m13687672481@163.com)
* QQ: 1251272104
* 微信: kenan13687672481


## 项目讲解
* 通过dubbo+spring boot+mybatis+redis等主流技术搭建成一套分布式服务框架
* 首先安装zookeeper+redis；
* monitor-data-provider服务提供者项目的资源文件dubbo-spring-mybatis.xml下配置zookeeper地址；
* monitor-openapi服务消费者的资源文件dubbo-services.xml下配置zookeeper地址，然后在application.properties下配置redis地址；
* monitor-security服务消费者的资源文件dubbo-services.xml下配置zookeeper地址；
* 建立数据库文件xxxx，创建表单元素
* 启动monitor-data-provider项目下的mainloader注册服务提供者；
* 启动monitor-openapi项目下的App注册服务消费者；
* 整个项目即可完整运行。

##关于作者---别忘记给个星星
```java
  var author = {
    nickName  : "工藤新一",
  }
```

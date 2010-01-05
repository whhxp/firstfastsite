@charset "UTF-8";

== 使用到的Jar,总共 xxx个==

=数据库驱动=
== Mysql==
 # mysql-connector-java-5.0.4-bin.java

= Hibernate3.3.2ga required=
= required=
 # antlr-2.7.6.jar
 # commons-collections-3.1.jar
 # dom4j-1.6.1.jar
 # jta-1.1.jar
 # slf4j-api-1.5.8.jar
 # javassist-3.9.0.GA.jar
= Hibernate自身的文件 =
 # hibernate3.jar  
= Hiberante的log=
 # slf4j-log4j12-1.5.8.jar   使用Hiberante的*.jar内容

==Spring3.0.0.RC3==
 # org.springframework.core-3.0.0.RC3.jar
 # org.springframework.beans-3.0.0.RC3.jar 处理beans 内容
 # org.springframework.web-3.0.0.RC3.jar   web支持
 # org.springframework.context-3.0.0.RC3.jar web上下文支持
 # org.springframework.asm-3.0.0.RC3.jar 这个支持
 # org.springframework.expression-3.0.0.RC3.jar  表达式支持
==增加JSTL的支持 ==
 # jstl.jar
 # standard.jar 
= AOP 支持 =
 # org.springframework.aop-3.0.0.RC3.jar  增加了AOP支持
 # aspectjweaver.jar   aspectj1.6.7
 # aspectjrt.jar      aspectj1.6.7
 # aopalliance.jar   AOP联盟1.0
 # cglib-nodep-2.2.jar 动态代理
 
= Struts2.1.8.1的支持=
== Core ==
 # xwork-core-2.1.6.jar
 # ognl-2.7.3.jar
 # freemarker-2.3.15.jar
 # struts2-core-2.1.8.1.jar
== 使用最新的替换 == 
commons-io-1.3.2.jar  1.4替换 ,commons-fileupload-1.2.1.jar  同样版本
= 插件=
 # struts2-config-browser-plugin-2.1.8.1.jar  struts2配置

== Spring集成 == 
 # struts2-spring-plugin-2.1.8.1.jar    来自struts
 # org.springframework.orm-3.0.0.RC3.jar  来自spring3
 # org.springframework.jdbc-3.0.0.RC3.jar 
 # org.springframework.transaction-3.0.0.RC3.jar  事务处理
 
= 通用的=
 # commons-logging-1.0.4.jar  日志支持
 # commons-io-1.4.jar io   add in 2009-12-28 
 # commons-fileupload-1.2.1.jar 文件上传   add in 2009-12-28 
 # log4j-1.2.15.jar   日志  add in 2010-1-4
 # commons-vfs-1.0.jar 文件系统,虚拟文件系统,可以使用统一的API处理文件
 
= 其他 =
 
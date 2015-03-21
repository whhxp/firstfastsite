# 包名 #
  * org.apachechina.fs模块名
  * 数据库表名 fsCore\_User


# 文档编码 #
  * 全部使用UTF-8编码
    * 对于不支持编码自描述的文件如Java,sql文件使用类CSS语法,使用注释的方式增加UTF-8支持.
      * Java        第一行     `  //@charset "UTF-8";  `
      * SQL         第一行    ` /*@charset "UTF-8";*/ `
    * 对于支持编码自描述的文件使用原来提供的
      * XML      `  <?xml version="1.0" encoding="UTF-8"?>    `
      * HTML/XTHML     `   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" > `
      * CSS  {{{  @charset "UTF-8";  }}

# SVN 提交 #
  1. 必须有注释

# 依赖 #
  * jar管理 如果需要加入jar包需要Owner确认和讨论自己不能随便加入jar包
  * 所有的包都依赖core 和 commons
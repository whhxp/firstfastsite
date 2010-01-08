@charset "UTF-8";

#summary 如何添加一个模块

= 模块的目录结构 =
 # src/${package}.fs${moduleName}
   # domain 领域对象
   # dao 操作数据库
   # manager 放管理
   # action 放页面
   # config 配置
 # WebContent/fs${moduleName}/  放页面
 # WebContent/WEB-INF/cms/ 放一些配置和数据
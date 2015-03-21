# 准备开发的模块 #

  1. core  核心模块,包含权限管理、用户、用户组的管理.所有的内容都依赖本模块.
  1. commons 通用模块  开发过程中可以通用的模块部分。

  1. [message](message.md)  站内信息模块（FSMSG）靳磊做！
  1. bbs  论坛        （FSBBS）范乐做！
  1. [cms](cms.md)   信息发布   （FSCMS）吴科学做!
  1. note  日记   （FSBLOG）任卓卫做！
  1. [photo](photo.md) 相册     王龙飞
  1. chatroom 聊天室  （FSCHAT）  高鑫做！
  1. board 留言板  nisen 作为一个示例

# 模块化的目标 #
  1. 用户开发的模块目录
    1. src/org.apachechina.fs${moduleName}.**1. webContent/${moduleName}
    1. webContent/WEB-INF/${moduleName}
    1. 
  1. 加载任意一个模块的时候不影响其他模块**


# 推后的其他模块 #
  1. 数据字典 , 全文检索, 投票
  1. wiki
  1. 在线视频 , Portal ,上传附件.
  1. wap ,rss支持 ,抓取数据
  1. URL映射
  1. [GAE](GAE.md), [JPA](JPA.md)
  1. CMS静态化 模板技术[Template](Template.md)
  1. environment(Env) 执行本webapp的环境(包括数据库[derby](derby.md)、web容器[jetty](jetty.md)) --不作为第一阶段.
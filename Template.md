# 需求 #
  * 兼容XHTML和HTML,使用XHTML中的属性实现.
  * 标签使用默认的html标签,使用新增加属性的方式处理。
    * stype: 字符串,标签名
    * sdata: 数据,使用JSON方式.
  * 可以自己扩展标签.
  * 使用EL表达式

# fstype #
# 代码 #
```

         <div fstype="for" fsdata="" >
         </div>

```


# 如何实现(两个方法目前验证中) #
  * 考虑使用 Jelly实现http://commons.apache.org/jelly/
  * 自己解释HTML,然后变成 Velocity http://velocity.apache.org/
  * 类似Freemarker有一个自动加载的机制.
# 优点 #
  * 具有可视化编辑器。
  * 不需要程序员技能。
# 参考 #
  * [TAL](TAL.md) 一个另外的模板语言
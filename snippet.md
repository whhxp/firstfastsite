
```
赵光 2009-12-25 18:18:01
老师，用servlet怎么写上传，不用组件
森森  9:30:14
直接查看commons-fileupload的源代码就知道了
森森  9:32:02
如果觉得代码麻烦,因为fileupload考虑的东西很多.可以看
以前给你们的那个manager的代码
 9:32:23
文件 “manager.rar”(46KB)已成功上传至服务器，我们将为您的好友保存 7 天。  
    
森森  9:36:47
browserEn.jsp中的 HttpMultiPartParser类
fileupload.jsp中的HttpMultiPartParser类
貌似一样.
这个需要了解http协议.就是请求body中如何处理处理的file字段的。

在实际开发中一般都是用commons-fileupload,如果不想让你的用户看到你用了fileupload.jar,你可以把源代码直接copy你程序中,改一下包名.这个是commons允许的.

不使用组件研究一下还可以。没有必要自己写。

```
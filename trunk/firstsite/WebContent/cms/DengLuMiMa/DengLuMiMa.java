
public class DengLuMiMa extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
{
doPost(request,response);
}



public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
{


request.setCharacterEncoding("UTF-8");//用UTF-8的格式接收

//User u=new User();//new一个存储类
//UserDAO.setCurrentUser(u);静态方式存储（不好）


String userName=request.getParameter("user");//通过标签名了得到v值
String pwd=request.getParameter("pwd");
if(userName==null)
	userName="";
if(pwd==null)
	pwd="";


String likes[]=request.getParameterValues("like");
//System.out.println(Arrays.asList(likes));

//u.setIsMale(isMale);//添加到User里
//u.setDescription(description);
//u.setUserName(userName);
//u.setPassword(pwd);
//u.setLikes(likes);
//u.setAddress(address);




if(userName.equals("admin")&&pwd.equals("123")))//密码对了返回true
{
	//request.setAttribute("user",u);//将User类存储（转发时传递参数）
	      //setAttribute
	request.getRequestDispatcher("./index2.jsp").forward(request, response);
 //生成RequestDispatcher页对像(转到show页).将源文件的控制权转到另一个资源上
}
else
{
	response.sendRedirect("./index2.jsp");
//转页不能传参数,请求定向  浏览器端处理 （http://127.0.0.1:8080/base/loginError.html?name=test）就是在后面加上
}



}

}

//@charset "UTF-8"
package org.apachechina.fscore;

import org.apachechina.fsboard.manager.BoardManager;
import org.apachechina.fscore.api.UserManager;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SpringEnvTest {
	public static void main(String[] args) {
		/*Spring支持*/
		BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext*.xml");
		UserManager userManger=(UserManager)factory.getBean("userManager");
		System.out.println(userManger.getCurrentUser());
	}
}

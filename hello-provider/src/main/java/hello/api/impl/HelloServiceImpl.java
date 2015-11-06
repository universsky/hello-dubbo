/*
 * 项目:	hello  
 * 文件:	HelloServiceImpl.java  
 * 包名:	hello.provider  
 * 日期:	2015年11月5日下午8:27:46  
 * 版权：Copyright (c) 2015, wacai.com All Rights Reserved.  
 *  
 */

package hello.api.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import hello.api.HelloService;
import hello.api.model.User;

/**
 * 类名:HelloServiceImpl 功能:TODO 日期: 2015年11月5日 下午8:27:46
 * 
 * @author 一剑
 * @version 1.0.0
 * @since JDK 1.7
 * @see
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

	/**
	 * TODO
	 * 
	 * @see hello.provider.HelloService#say(java.lang.String)
	 */
	public String say(String word) {
		String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		return "Say " + word + " " + "say time:" + dateTime;
	}

	public String speak(String content, int times) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < times; i++) {

			String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			result.append("Jade Speak " + content + ", times:" + i + " say time:" + dateTime + " ");
		}
		return result.toString();
	}

	public User queryUser(String id) {
		User user = new User();
		user.setId(id);
		user.setName("Jade");
		user.setAge(100);

		return user;
	}

}

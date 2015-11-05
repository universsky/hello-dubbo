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

/**  
 * 类名:HelloServiceImpl    
 * 功能:TODO     
 * 日期: 2015年11月5日 下午8:27:46    
 * @author 一剑  
 * @version 1.0.0   
 * @since  JDK 1.7  
 * @see        
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    /**  
     * TODO 
     * @see hello.provider.HelloService#say(java.lang.String)  
     */
    public String say(String word) {
        String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return word + " " + "Execute time:" + dateTime;
    }

}


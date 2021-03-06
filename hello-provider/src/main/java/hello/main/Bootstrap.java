package hello.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) throws Exception {
		Bootstrap luncher = new Bootstrap();
		luncher.start();
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}

	public void start() {
		String configLocation = "dubbo-provider.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		String[] beanNames = context.getBeanDefinitionNames();
		System.out.print("Beans in Spring Container : ");
		for (String beanName : beanNames) {
			System.out.print(beanName + ",");
		}
		System.out.println();
	}

}

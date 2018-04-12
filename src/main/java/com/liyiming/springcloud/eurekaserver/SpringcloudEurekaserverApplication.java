package com.liyiming.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
/**
 * <p>Title: SpringcloudEurekaserverApplication</p>  
 * <p>Description:@EnableEurekaServer 不添加此标签 http://localhost:8761/ 将不会出现页面  显示404 </p>  
 * @author liyiming  
 * @date 2018年4月12日
 */
public class SpringcloudEurekaserverApplication {
	/**
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @user liyiming
	 * @date 2018年4月12日
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaserverApplication.class, args);
	}
}

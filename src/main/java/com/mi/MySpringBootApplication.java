package com.mi;
 /**
 * @Author 张东旭
 * @Description
 * @Date 2018.6.12 22:42
 * @Modified
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
@MapperScan("com.mi.dao")//将项目中对应的mapper类的路径加进来就可以了
public class MySpringBootApplication {
	public static void main(String[] args){
		SpringApplication.run(MySpringBootApplication.class);
	}

}

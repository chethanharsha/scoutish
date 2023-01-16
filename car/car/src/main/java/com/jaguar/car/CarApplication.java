package com.jaguar.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {
		ApplicationContext Context= SpringApplication.run(CarApplication.class, args);
		virat v=Context.getBean(virat.class);
		Vathi a=new Vathi();
		a.setRegno(777);
		a.setName("sanvik");
		a.setAge(27);
		Vathi a2=v.save(a);
		System.out.println(a2);
	}

}

package com.dgmf;

import com.dgmf.beans.Person;
import com.dgmf.beans.Vehicle;
import com.dgmf.config.ProjectConfig;
import com.dgmf.services.VehicleServices;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		System.out.println("Before Retrieving the Person Bean from " +
				"the Spring Context");
		Person person = context.getBean(Person.class);
		System.out.println("After Retrieving the Person Bean from " +
				"the Spring Context");
	}

}

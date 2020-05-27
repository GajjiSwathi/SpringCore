package com.mvc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class client {

	public static void main(String[] args) {
		
		//generating way or tradation way to construct the object.
		Employee emp= new Employee();
		emp.setId(1);
		emp.setName("swathi");
		
		System.out.println("employee details :"+emp);
	
		//Spring Way--Inversion OF control
		//1.bean Factory :It construct the objects when we request.
		
		/*Resource resource= new ClassPathResource("employeebean.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Employee e1= beanFactory.getBean("e1", Employee.class);
		Employee e2= beanFactory.getBean("e2", Employee.class);
		Employee e3= beanFactory.getBean("e3", Employee.class);
		System.out.println("e1 are employee:"+e1);
		System.out.println("e2 are employee:"+e2);
		System.out.println("e3 are employee:"+e3);
		*/
		
		//2.Application Context
		//It construct the objects even when we do not request.
		//wen scope as singleton the address of the object is same if we call the same bean(e1) for two times
		//wen scope as protype the address of the object is different if we call the same bean(e1) for two times.
		
		ApplicationContext context= new ClassPathXmlApplicationContext("employeebean.xml");
		Employee emp1= (Employee)context.getBean("e1");
		Employee emp2= context.getBean("e1", Employee.class);
		Employee emp3= context.getBean("e3", Employee.class);
		System.out.println("emp1 are employee:"+emp1);
		
		
		System.out.println("emp2 are employee:"+emp2);
		System.out.println("emp3 are employee:"+emp3);
		
		




		
	

	}

}

package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource = "in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(resource);
		
		Student std = (Student) context.getBean("student");
		std.display();

	}

}

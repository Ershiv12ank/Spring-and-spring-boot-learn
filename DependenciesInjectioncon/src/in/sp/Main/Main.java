package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		String config_loc = "in/sp/resources/ApplicationContext.xml";
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		Student std = (Student) context.getBean("stdId");
		std.display();

	}

}

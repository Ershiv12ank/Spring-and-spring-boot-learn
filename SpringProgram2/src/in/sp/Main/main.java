package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.Springconfigfile;

public class main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Springconfigfile.class);
		// TODO Auto-generated method stub
        Student std = (Student) context.getBean("stdId1");
        std.display();
	}

}

package in.spring.FirstMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class App 
{
    public static void main(String[] args) 
    {
        // XML config ka sahi path
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("in/sp/resources/ApplicationContext.xml");

        // Bean ko fetch karna
        Student std = (Student) context.getBean(Student.class);

        // Method call
        std.display();
    }
}

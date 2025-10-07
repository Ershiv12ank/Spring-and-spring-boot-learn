package in.database.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App {

    public static void main(String[] args) {
        int std_rollno = 101;
        String std_name = "deepak";
        float std_marks = 91.5f;

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        String insert_sql_query = "INSERT INTO student(std_roll, std_name, std_mark) VALUES(?,?,?)";

        int count = jdbcTemplate.update(insert_sql_query, std_rollno, std_name, std_marks);

        if(count > 0) {
            System.out.println("✅ Successfully Inserted");
        } else {
            System.out.println("❌ Failed to insert value");
        }
    }
}

package in.sp.resources;

import in.sp.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createAddObj() {
        Address addr = new Address();
        addr.setHouseno(100);
        addr.setCity("Satna");
        addr.setPincode(1223);
        return addr;
    }

    @Bean
    public Student createStdObj(Address addr) {
        Student std = new Student();
        std.setName("Deepak");
        std.setRoolno(101);
        //std.setAddress(addr);
        return std;
    }
}

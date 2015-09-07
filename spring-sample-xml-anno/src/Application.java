import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.azioth.service.CustomerService;

/**
 * Created by Sebastian Sandri on 27/08/2015.
 */
public class Application {

    public static void main(String[] args) {
        //CustomerService service = new CustomerServiceImpl();

    	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	CustomerService service = appContext.getBean("customerService", CustomerService.class);
        System.out.print(service.findAll().get(0).getFirstName());
    }
}

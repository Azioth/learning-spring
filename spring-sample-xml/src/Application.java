import ar.com.azioth.service.CustomerService;
import ar.com.azioth.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sebastian Sandri on 27/08/2015.
 */
public class Application {

    public static void main(String[] args) {
        //CustomerService service = new CustomerServiceImpl();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-sample-xml/applicationContext.xml");

        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);

        System.out.print(service.findAll().get(0).getFirstName());

    }
}

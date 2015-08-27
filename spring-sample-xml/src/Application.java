import ar.com.azioth.service.CustomerService;
import ar.com.azioth.service.CustomerServiceImpl;

/**
 * Created by Sebastian Sandri on 27/08/2015.
 */
public class Application {

    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();

        System.out.print(service.findAll().get(0).getFirstName());
    }
}

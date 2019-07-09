import com.cg.Service.PersonService;
import com.cg.Service.PersonServiceImpl;

public class HelloApplication {

	public static void main(String[] args) {

		PersonService service=new PersonServiceImpl();

		System.out.println(service.ViewALL().get(0).getName());

	}

}

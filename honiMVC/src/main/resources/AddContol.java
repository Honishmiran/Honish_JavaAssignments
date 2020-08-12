import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddContol {
	
	@RequestMapping("/add")
 public void add() {
	 System.out.println("Im here");
 }
}

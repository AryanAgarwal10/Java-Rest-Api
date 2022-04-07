package firstApp.items;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {

	@RequestMapping("/items")
	public List<Items> showItems (){
		return Arrays.asList(
				new Items("Black","Nigga","Run from police"),
				new Items("White","The problem","Run after black")
				);

	}

}

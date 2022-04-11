package firstApp.topics;

//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@Autowired
	private TopicsService topicsService;
	
	@RequestMapping("/topics")
	public List<Topics> showAllTopics (){
		return topicsService.getAllTopics(); 
	}
	
	@RequestMapping("/topics/{id}")
	public Topics showTopic(@PathVariable String id) {
		return topicsService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topics topic) {
		topicsService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topics topic) {
		topicsService.updateTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicsService.deleteTopic(id);
	}
}

package firstApp.topics;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicsService {

	@Autowired
	private TopicsRepository topicsRepository;
	
//	private List<Topics> topics = new ArrayList<>(Arrays.asList(new Topics("Black", "Nigga", "Run from police"),
//			new Topics("White", "The problem", "Run after black"),
//			new Topics("Brown", "The neutral", "Mind your Buisness")));

	public List<Topics> getAllTopics() {

		List<Topics> topics=new ArrayList<>();
		topicsRepository.findAll().forEach(topics::add);
		return topics;
		//return topics;
	}

	public Topics getTopic(String id) {

//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		//List<Topics> topics=new ArrayList<>();
		 return topicsRepository.findById(id).get();
		 
	}

	public void addTopic(Topics topic) {

		//topics.add(topic);
		topicsRepository.save(topic);
	}

	public void updateTopic(Topics topic) {
//		for (int i = 0; i < topics.size(); i++) {
//			Topics t = topics.get(i);
//			if (t.getId().equals(id))
//				topics.set(i, topic);
//		}
		topicsRepository.save(topic);

	}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicsRepository.deleteById(id);
	}

}

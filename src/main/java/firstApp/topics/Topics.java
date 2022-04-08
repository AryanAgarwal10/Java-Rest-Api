package firstApp.topics;

public class Topics {
 private String id,name,description;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Topics(String id, String name, String description) {
	super();
	this.name = name;
	this.id = id;
	this.description = description;
}
 
}

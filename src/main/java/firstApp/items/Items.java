package firstApp.items;

public class Items {
 private String name,id,description;

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

public Items(String name, String id, String description) {
	super();
	this.name = name;
	this.id = id;
	this.description = description;
}
 
}

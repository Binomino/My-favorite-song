
public class Music {
	String name;
	int id;
	String producer;
	String type;
	
	public Music() {
		
	}
	
	public Music(String name, int id, String producer, String type) {
		this.name = name;
		this.id = id;
		this.producer = producer;
		this.type = type;
	}
	
	public void printInfo() {
		System.out.println("name : " + name + " id : " + id + " producer : " + producer + " type : " + type);
	}
}
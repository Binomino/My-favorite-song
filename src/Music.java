public class Music {
	String name;
	int id;
	String producer;
	String type;
	static int numMusicsRegistered = 0;
	
	public Music() {
		numMusicsRegistered++;
		
	}
	
	public Music(String name, int id, String producer, String type) {
		this.name = name;
		this.id = id;
		this.producer = producer;
		this.type = type;
		numMusicsRegistered++;
	}
	
	public void printInfo() {
		System.out.println("name : " + name + " id : " + id + " producer : " + producer + " type : " + type);
	}
}
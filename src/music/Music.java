package music;

import java.util.Scanner;

public class Music {
	protected MusicKind kind = MusicKind.MainProducer;
	protected String name;
	protected int id;
	protected String type;
	protected String mood;
	
	public Music() {
		
	}
	
	public Music(MusicKind kind) {
		this.kind = kind;
	}
	
	public Music(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Music(String name, int id, String type, String mood) {
		this.name = name;
		this.id = id;
		this.type = type;
		this.mood = mood;
	}
	
	public Music(MusicKind kind, String name, int id, String type, String mood) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.type = type;
		this.mood = mood;
	}
	
	public MusicKind getKind() {
		return kind;
	}

	public void setKind(MusicKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	
	
	public void printInfo() {
		String pkind = "none";
		switch(this.kind) {
		case MainProducer:
			pkind = "MainP";
			break;
		case SubProducer:
			pkind = "SubP";
			break;
		case FeaturingSinger:
			pkind = "FeatureS";
			break;
		default:
		}
		System.out.println("kind : " + pkind + "name : " + name + " id : " + id + " type : " + type + " mood : " + mood);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Music ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Music Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Music Type : ");
		String type = input.next();
		this.setType(type);
		
		System.out.print("Music Mood : ");
		String mood = input.next();
		this.setMood(mood);
	}
}

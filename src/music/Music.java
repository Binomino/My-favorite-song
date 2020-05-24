package music;

import java.io.Serializable;
import java.util.Scanner;

import exception.TypeFormatException;

public abstract class Music implements MusicInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5703645065382415262L;
	
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

	public void setType(String type) throws TypeFormatException {
		if (!type.contains("House") && !type.contentEquals("")) {
			throw new TypeFormatException();
		}
		this.type = type;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public abstract void printInfo();
	
	public void setMusicID(Scanner input) {
		System.out.print("Music ID : ");
		int id = input.nextInt();
		this.setId(id);
	}
	
	public void setMusicName(Scanner input) {
		System.out.print("Music Name : ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setMusicType(Scanner input) {
		String type = "";
		while (!type.contains("House")) {
			System.out.print("Music Type : ");
			type = input.next();
			try {
				this.setType(type);
			} 
			catch (TypeFormatException e) {
				System.out.println("This is not your music type. Try to input house music type");
			}
		}
	}
	
	public void setMusicMood(Scanner input) {
		System.out.print("Music Mood : ");
		String mood = input.next();
		this.setMood(mood);
	}
	
	public String getKindString() {
		String pkind = "none";
		switch(this.kind) {
		case MainProducer:
			pkind = "MainP";
			break;
		case SubProducer:
			pkind = "SubP";
			break;
		case MainSinger:
			pkind = "MainS";
			break;
		case FeaturingSinger:
			pkind = "FeatureS";
			break;
		default:
		}
		return pkind;
	}
}

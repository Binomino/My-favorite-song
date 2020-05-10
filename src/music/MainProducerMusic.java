package music;

import java.util.Scanner;

public class MainProducerMusic extends Music {
	
	public MainProducerMusic(MusicKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMusicID(input);
		setMusicName(input);
		setMusicType(input);
		setMusicMood(input);
	}
	
	public void printInfo() {
		String pkind = getKindString();
		System.out.println("kind : " + pkind + "name : " + name + " id : " + id + " type : " + type + " mood : " + mood);
	}

}

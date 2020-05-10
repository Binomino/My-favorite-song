package music;

import java.util.Scanner;

public class FeaturingSingerMusic extends SingerMusic {
	
	protected String voice;
	protected String voiceMood;
	
	public FeaturingSingerMusic(MusicKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMusicID(input);
		setMusicName(input);
		setMusicTypewithYN(input);
		setVoiceTypewithYN(input);

		
		setMusicMood(input);
	}
	
	public void setVoiceTypewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a voice's type? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setMusicType(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setType("");
				break;
			}
			else {
			}
		}
	}
	
	public void printInfo() {
		String pkind = getKindString();
		System.out.println("kind : " + pkind + "name : " + name + " id : " + id + " type : " + type + " mood : " + mood + "voice's type : " + type + "voice's mood : " + mood);
	}
	

}

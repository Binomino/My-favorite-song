package music;

import java.util.Scanner;

import exception.TypeFormatException;

public abstract class SingerMusic extends Music {

	
	public SingerMusic(MusicKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String pkind = getKindString();
		System.out.println("kind : " + pkind + "name : " + name + " id : " + id + " type : " + type + " mood : " + mood);
	}

	public void setMusicTypewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a music type? (Y/N) ");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					System.out.print("Music Type : ");
					String type = input.next();
					this.setType(type);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setType("");
					break;
				}
				else {
				}
			}
			catch(TypeFormatException e) {
				System.out.println("This is not your music type. Try to input house music type");

			}
		}
	}

}

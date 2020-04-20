package music;

import java.util.Scanner;

public class SubProducerMusic extends Music {

	public void getUserInput(Scanner input) {
		System.out.print("Music ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Music Name : ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a music type? (Y/N) ");
			answer = input.next().charAt(0);
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
		
		System.out.print("Music Mood : ");
		String mood = input.next();
		this.setMood(mood);
	}
}

import java.util.Scanner;

public class MusicManager {
	Music music;
	Scanner input;
	
	MusicManager(Scanner input) {
		this.input = input;
		
	}
	public void addMusic() {
		music = new Music();
		System.out.print("Music ID : ");
		music.id = input.nextInt();
		System.out.print("Music Name : ");
		music.name = input.next();
		System.out.print("Music Producer : ");
		music.producer = input.next();
		System.out.print("Music Type : ");
		music.type = input.next();

	}
	public void deleteMusic() {
		System.out.print("Music ID : ");
		int MusicID = input.nextInt();
		if (music == null) {
			System.out.println("That music is not your music");
			return;
		}
		if (music.id == MusicID) {
			music = null;
			System.out.println("The music is deleted");
		}
	}
	public void editMusic() {
		System.out.print("Music ID : ");
		int MusicID = input.nextInt();
		if (music.id == MusicID) {
			int num = -10;
			while (num != 5) {
				System.out.println("**** Music Edit Menu ****");
				System.out.println(" 1. Edit id");
				System.out.println(" 2. Edit name");
				System.out.println(" 3. Edit producer");
				System.out.println(" 4. Edit type");
				System.out.println(" 5. Exit");
				System.out.println(" Select one number between 1 ~ 5 : ");
				num = input.nextInt();
				if (num == 1) {
					System.out.print("Music ID : ");
					music.id = input.nextInt();
				}
				else if (num == 2) {
					System.out.print("Music Name : ");
					music.name = input.next();
				}
				else if (num == 3) {
					System.out.print("Music Producer : ");
					music.producer = input.next();
				}
				else if (num == 4) {
					System.out.print("Music Type : ");
					music.type = input.next();
				}
				else {
					continue;
				}
			}
		}
	}
	public void viewMusic() {
		System.out.print("Music ID : ");
		int MusicID = input.nextInt();
		if (music.id == MusicID) {
			music.printInfo();
		}
	}

}

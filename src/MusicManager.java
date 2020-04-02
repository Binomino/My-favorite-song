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
			System.out.println("Edited music is : " + MusicID);
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

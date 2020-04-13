import java.util.ArrayList;
import java.util.Scanner;

public class MusicManager {
	ArrayList<Music> musics = new ArrayList<Music>();
	Scanner input;
	
	MusicManager(Scanner input) {
		this.input = input;
		
	}
	public void addMusic() {
		Music music = new Music();
		System.out.print("Music ID : ");
		music.id = input.nextInt();
		System.out.print("Music Name : ");
		music.name = input.next();
		System.out.print("Music Producer : ");
		music.producer = input.next();
		System.out.print("Music Type : ");
		music.type = input.next();
		musics.add(music);

	}
	public void deleteMusic() {
		System.out.print("Music ID : ");
		int MusicID = input.nextInt();
		int index = -1;
		for (int i = 0; i<musics.size(); i++) {
			if (musics.get(i).id == MusicID) {
				index = i;
				break;
			}
		}
		
		if(index >=0) {
			musics.remove(index);
			Music.numMusicsRegistered--;
			System.out.println("Music" + MusicID + "is deleted");
		}
		else {
			System.out.println("That music is not your music");
			return;
		}
	}
	public void editMusic() {
		System.out.print("Music ID : ");
		int MusicID = input.nextInt();
		for (int i = 0; i<musics.size(); i++) {
			Music music = musics.get(i);
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
					} // if
				} // while
				break;
			} // if
		} // for
	}
	public void viewMusics() {
//		System.out.print("Music ID : ");
//		int MusicID = input.nextInt();
		System.out.println("numbers of registered musics : " + Music.numMusicsRegistered);
		for (int i = 0; i<musics.size(); i++) {
			musics.get(i).printInfo();
		}
	}

}

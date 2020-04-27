import java.util.ArrayList;
import java.util.Scanner;

import music.FeaturingSingerMusic;
import music.Music;
import music.MusicKind;
import music.SubProducerMusic;

public class MusicManager {
	ArrayList<Music> musics = new ArrayList<Music>();
	Scanner input;
	
	MusicManager(Scanner input) {
		this.input = input;
		
	}
	public void addMusic() {
		int kind = 0;
		Music music;
		while (kind != 1 && kind !=2 && kind != 3) {
			System.out.println("1 for MainProducer");
			System.out.println("2 for SubProducer");
			System.out.println("3 for FeaturingSinger");
			System.out.println("Select num for Music Kind in 1, 2 or 3 : ");
			kind = input.nextInt();
			if (kind == 1) {
				music = new Music(MusicKind.MainProducer);
				music.getUserInput(input);
				musics.add(music);
				break;
			}
			else if (kind == 2) {
				music = new SubProducerMusic(MusicKind.SubProducer);
				music.getUserInput(input);
				musics.add(music);
				break;
			}
			else if (kind == 3) {
				music = new FeaturingSingerMusic(MusicKind.FeaturingSinger);
				music.getUserInput(input);
				musics.add(music);
				break;
			}
			else {
				System.out.print("Select num for Music Kind in 1, 2 or 3 : ");
			}
		}

	}
	public void deleteMusic() {
		System.out.print("Music ID : ");
		int MusicID = input.nextInt();
		int index = -1;
		for (int i = 0; i<musics.size(); i++) {
			if (musics.get(i).getId() == MusicID) {
				index = i;
				break;
			}
		}
		
		if(index >=0) {
			musics.remove(index);
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
			if (music.getId() == MusicID) {
				int num = -10;
				while (num != 5) {
					System.out.println("**** Music Edit Menu ****");
					System.out.println(" 1. Edit id");
					System.out.println(" 2. Edit name");
					System.out.println(" 3. Edit type");
					System.out.println(" 4. Edit mood");
					System.out.println(" 5. Exit");
					System.out.println(" Select one number between 1 ~ 5 : ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Music ID : ");
						int id = input.nextInt();
						music.setId(id);
					}
					else if (num == 2) {
						System.out.print("Music Name : ");
						String name = input.next();
						music.setName(name);
					}
					else if (num == 3) {
						System.out.print("Music Type : ");
						String type = input.next();
						music.setType(type);
					}
					else if (num == 4) {
						System.out.print("Music Mood : ");
						String mood = input.next();
						music.setMood(mood);
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
		System.out.println("numbers of registered musics : " + musics.size());
		for (int i = 0; i<musics.size(); i++) {
			musics.get(i).printInfo();
		}
	}

}

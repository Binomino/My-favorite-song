package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import music.FeaturingSingerMusic;
import music.MainProducerMusic;
import music.Music;
import music.MusicInput;
import music.MusicKind;
import music.SubProducerMusic;

public class MusicManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1948883069552239912L;
	
	ArrayList<MusicInput> musics = new ArrayList<MusicInput>();
	transient Scanner input;

	MusicManager(Scanner input) {
		this.input = input;

	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public void addMusic() {
		int kind = 0;
		MusicInput musicInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for MainProducer");
				System.out.println("2 for SubProducer");
				System.out.println("3 for FeaturingSinger");
				System.out.println("Select num for Music Kind in 1, 2 or 3 : ");
				kind = input.nextInt();
				if (kind == 1) {
					musicInput = new MainProducerMusic(MusicKind.MainProducer);
					musicInput.getUserInput(input);
					musics.add(musicInput);
					break;
				}
				else if (kind == 2) {
					musicInput = new SubProducerMusic(MusicKind.SubProducer);
					musicInput.getUserInput(input);
					musics.add(musicInput);
					break;
				}
				else if (kind == 3) {
					musicInput = new FeaturingSingerMusic(MusicKind.FeaturingSinger);
					musicInput.getUserInput(input);
					musics.add(musicInput);
					break;
				}
				else {
					System.out.println("Select num for Music Kind in 1, 2 or 3 : ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 ~ 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;

			}
		}

	}
	public void deleteMusic() {
		System.out.print("Music ID : ");
		int MusicID = input.nextInt();
		int index = findIndex(MusicID);
		removefromMusics(index, MusicID);

	}

	public int findIndex(int MusicID) {
		int index = -1;
		for (int i = 0; i<musics.size(); i++) {
			if (musics.get(i).getId() == MusicID) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromMusics(int index, int MusicID) {
		if(index >=0) {
			musics.remove(index);
			System.out.println("Music" + MusicID + "is deleted");
			return 1;
		}
		else {
			System.out.println("That music is not your music");
			return -1;
		}
	}

	public void editMusic() {
		System.out.print("Music ID : ");
		int MusicID = input.nextInt();
		for (int i = 0; i<musics.size(); i++) {
			MusicInput music = musics.get(i);
			if (music.getId() == MusicID) {
				int num = -10;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						music.setMusicID(input);
						break;
					case 2:
						music.setMusicName(input);
						break;
					case 3:
						music.setMusicType(input);
						break;
					case 4:
						music.setMusicMood(input);
						break;
					default:
						continue;
					}
				} // while
				break;
			} // if
		} // for
	}
	public void viewMusics() {
		System.out.println("numbers of registered musics : " + musics.size());
		for (int i = 0; i<musics.size(); i++) {
			musics.get(i).printInfo();
		}
	}
	
	public int size() {
		return musics.size();
	}

	public MusicInput get(int index) {
		return (Music) musics.get(index);
	}
	
	public void showEditMenu() {
		System.out.println("**** Music Edit Menu ****");
		System.out.println(" 1. Edit id");
		System.out.println(" 2. Edit name");
		System.out.println(" 3. Edit type");
		System.out.println(" 4. Edit mood");
		System.out.println(" 5. Exit");
		System.out.println(" Select one number between 1 ~ 5 : ");

	}

}

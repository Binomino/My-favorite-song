import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class EdmManagementSystem {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		MusicManager musicManager = getObject("musicmanager.ser");
		if(musicManager == null) {
			musicManager = new MusicManager(input);
		}
		else {
			musicManager.setScanner(input);
		}

		selectMenu(input, musicManager);
		putObject(musicManager, "musicmanager.ser");
	}
	
	public static void selectMenu(Scanner input, MusicManager musicManager) {
		int num = -10;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					musicManager.addMusic();
					logger.log("add a music");
					break;
				case 2:
					musicManager.deleteMusic();
					logger.log("delete a music");
					break;
				case 3:
					musicManager.editMusic();
					logger.log("edit a music");
					break;
				case 4:
					musicManager.viewMusics();
					logger.log("view a list of music");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 ~ 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
		
	}
	
	public static void showMenu() {
		System.out.println("---------Edm Management System Menu--------");
		System.out.println(" 1. Add Music");
		System.out.println(" 2. Delete Music");
		System.out.println(" 3. Edit Music");
		System.out.println(" 4. View Musics");
		System.out.println(" 5. Exit");
		System.out.println(" Select one number between 1 ~ 5 : ");
		
		
	}
	
	public static MusicManager getObject(String filename) {
		MusicManager musicManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			musicManager = (MusicManager)in.readObject();
			
			in.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			return musicManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return musicManager;
	}
	
	public static void putObject(MusicManager musicManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(musicManager);
			
			out.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}

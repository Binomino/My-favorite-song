import java.util.InputMismatchException;
import java.util.Scanner;

public class EdmManagementSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MusicManager musicManager = new MusicManager(input);
		
		selectMenu(input, musicManager);

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
					break;
				case 2:
					musicManager.deleteMusic();
					break;
				case 3:
					musicManager.editMusic();
					break;
				case 4:
					musicManager.viewMusics();
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


}

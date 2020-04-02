import java.util.Scanner;

public class EdmManagementSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MusicManager musicManager = new MusicManager(input);
		int num = -10;

		while (num != 5) {
			System.out.println("---------Edm Management System Menu--------");
			System.out.println(" 1. Add Music");
			System.out.println(" 2. Delete Music");
			System.out.println(" 3. Edit Music");
			System.out.println(" 4. View Music");
			System.out.println(" 5. Exit");
			System.out.println(" Select one number between 1 ~ 5 : ");
			num = input.nextInt();
			if (num == 1) {
				musicManager.addMusic();
			}
			else if (num == 2) {
				musicManager.deleteMusic();
			}
			else if (num == 3) {
				musicManager.editMusic();
			}
			else if (num == 4) {
				musicManager.viewMusic();
			}
			else {
				continue;
			}
		}
	}


}
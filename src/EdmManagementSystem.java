import java.util.Scanner;

public class EdmManagementSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while (num != 6) {
			System.out.println("---------Edm Management System Menu--------");
			System.out.println(" 1. Add Music");
			System.out.println(" 2. Delete Music");
			System.out.println(" 3. Edit Music");
			System.out.println(" 4. View Music");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.println(" Select one number between 1 ~ 6 : ");
			num = input.nextInt();
			if (num == 1) {
				addMusic();
			}
			else if (num == 2) {
				deleteMusic();
			}
			else if (num == 3) {
				editMusic();
			}
			else if (num == 4) {
				viewMusic();
			}
			else {
				continue;
			}
		}
	}
	public static void addMusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Music ID : ");
		int MusicID = input.nextInt();
		System.out.print("Music Name : ");
		String MusicName = input.next();
		System.out.print("Music Producer : ");
		String MusicProducer = input.next();
		System.out.print("Music Type : ");
		String MusicType = input.next();


	}
	public static void deleteMusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Music ID : ");
		int MusicID = input.nextInt();
	}
	public static void editMusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Music ID : ");
		int MusicID = input.nextInt();
	}
	public static void viewMusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Music ID : ");
		int MusicID = input.nextInt();
	}

}
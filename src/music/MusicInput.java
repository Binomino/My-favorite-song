package music;

import java.util.Scanner;

public interface MusicInput {
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setType(String type);
	
	public void setMood(String mood);

	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setMusicID(Scanner input);
	
	public void setMusicName(Scanner input);
	
	public void setMusicType(Scanner input);
	
	public void setMusicMood(Scanner input);
}
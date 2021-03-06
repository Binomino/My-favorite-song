package music;

import java.util.Scanner;

import exception.TypeFormatException;

public interface MusicInput {
	
	public int getId();
	
	public void setId(int id);
	
	public String getName();
	
	public void setName(String name);
	
	public String getType();
	
	public void setType(String type) throws TypeFormatException;
	
	public String getMood();
	
	public void setMood(String mood);

	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setMusicID(Scanner input);
	
	public void setMusicName(Scanner input);
	
	public void setMusicType(Scanner input);
	
	public void setMusicMood(Scanner input);
}

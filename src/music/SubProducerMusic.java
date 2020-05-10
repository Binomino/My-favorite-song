package music;

import java.util.Scanner;

public class SubProducerMusic extends SingerMusic {
	
	public SubProducerMusic(MusicKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setMusicID(input);
		setMusicName(input);
		setMusicTypewithYN(input);
		setMusicMood(input);
	}
	

	
}

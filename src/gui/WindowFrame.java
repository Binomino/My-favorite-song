package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.MusicManager;

public class WindowFrame extends JFrame{
	
	MusicManager musicManager;
	
	MenuSelection menuSelection;
	MusicAdder musicadder;
	MusicViewer musicviewer;

	public WindowFrame(MusicManager musicManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.musicManager =  musicManager;
		menuSelection = new MenuSelection(this);
		musicadder = new MusicAdder(this);
		musicviewer = new MusicViewer(this, this.musicManager);
		
		this.add(menuSelection);
		
		this.setVisible(true);
	}
	
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuselection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public MusicAdder getMusicadder() {
		return musicadder;
	}

	public void setMusicadder(MusicAdder musicadder) {
		this.musicadder = musicadder;
	}

	public MusicViewer getMusicviewer() {
		return musicviewer;
	}

	public void setMusicviewer(MusicViewer musicviewer) {
		this.musicviewer = musicviewer;
	}
}
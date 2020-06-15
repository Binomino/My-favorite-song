package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.MusicAdder;
import gui.MusicViewer;
import gui.WindowFrame;

public class ButtonAdderListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonAdderListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMusicadder());
		frame.revalidate();
		frame.repaint();
	}
}
package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import manager.MusicManager;
import music.MusicInput;

public class MusicViewer extends JPanel{
	
	WindowFrame frame;
	
	MusicManager musicManager;

	public MusicViewer(WindowFrame frame, MusicManager musicManager) {
		this.frame = frame;
		this.musicManager = musicManager;
		
		System.out.println("***" + musicManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Type");
		model.addColumn("Mood");
		
		for(int i = 0; i<musicManager.size(); i++) {
			Vector row = new Vector();
			MusicInput mi = musicManager.get(i);
			row.add(mi.getId());
			row.add(mi.getName());
			row.add(mi.getType());
			row.add(mi.getMood());
			model.addRow(row);
		}
		
		JTable table  = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
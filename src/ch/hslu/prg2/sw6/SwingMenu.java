package ch.hslu.prg2.sw6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Yves Hohl (yves.hohl@stud.hslu.ch) on 24.10.2014.
 */
public class SwingMenu extends JFrame {

	public static void main(String[] args) {
		new SwingMenu();
	}

	public SwingMenu() {
		super("Awesome Swing Menu");

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();

		// file menu
		JMenu fileMenu = new JMenu("File");
		JMenuItem itemNew = new JMenuItem("New");
		JMenuItem itemOpen = new JMenuItem("Open");
		JMenuItem itemClose = new JMenuItem("Close");
		fileMenu.add(itemNew);
		fileMenu.add(itemOpen);
		fileMenu.add(itemClose);
		menubar.add(fileMenu);

		// help menu
		JMenu helpMenu = new JMenu("Help");
		JMenuItem itemAbout = new JMenuItem("About");
		helpMenu.add(itemAbout);
		menubar.add(helpMenu);

		// action listener für close
		itemClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				System.exit(0);
			}
		});

		// action listener für about
		itemAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				JOptionPane.showMessageDialog(SwingMenu.this, "Copyright 2014 by Foobar");
			}
		});

		// menubar hinzufügen
		setJMenuBar(menubar);

		// platzbedarf ermitteln und anzeigen
		pack();
		setVisible(true);
	}

}

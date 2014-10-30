package ch.hslu.prg2.sw6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Yves Hohl (yves.hohl@stud.hslu.ch) on 24.10.2014.
 */
public class SwingButton extends JFrame {

	private int numClicks = 0;

	public static void main(String[] args) {
		new SwingButton();
	}

	public SwingButton() {
		super("Swing Button Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// basic components
		JButton button = new JButton("Count button clicks");
		JLabel label = new JLabel(createLabelText());
		label.setText(createLabelText());

		// add components
		setLayout(new GridLayout(0, 1));
		add(button);
		add(label);

		// action handler für button
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				numClicks++;
				label.setText(createLabelText());
			}
		});

		// platzbedarf ermitteln und anzeigen
		pack();
		setVisible(true);
	}

	private String createLabelText(){
		return "Number Click: " + numClicks;
	}
}

package ch.hslu.prg2.sw9.Ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Yves Hohl (yves.hohl@stud.hslu.ch) on 20.11.2014.
 */
public class BallsFrame extends JFrame {

	ArrayList<Ball> balls = new ArrayList<>();

	public BallsFrame() {
		setTitle("Balls");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JPanel panel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				Iterator it = balls.iterator();
				while (it.hasNext()) {
					Ball ball = (Ball) it.next();
					if (ball.isVisible()) {
						ball.paint(g);
					} else {
						it.remove();
					}
				}
				g.setColor(Color.black);
				g.drawString("Threads: " + balls.size(), 5, 15);
			}
		};

		// add panel to frame
		add(panel);

		// add mouse listener for panel
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent mouseEvent) {
				super.mouseClicked(mouseEvent);
				Ball b = new Ball(panel.getHeight(), mouseEvent.getX(), mouseEvent.getY());
				Thread t = new Thread(b);
				t.start();
				balls.add(b);
			}
		});

		while (true) {
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

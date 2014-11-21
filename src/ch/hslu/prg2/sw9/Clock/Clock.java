package ch.hslu.prg2.sw9.Clock;

import java.applet.Applet;
import java.awt.*;
import java.util.Date;

/**
 * Created by Yves Hohl (yves.hohl@stud.hslu.ch) on 20.11.2014.
 */
public class Clock extends Applet implements Runnable {

	Thread thread;

	public Clock() {
		thread = new Thread(this);
		thread.start();
	}

	public void paint(Graphics graphics) {
		graphics.drawString(new Date().toString(), 10, 10);
	}

	@Override
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

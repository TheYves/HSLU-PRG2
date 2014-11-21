package ch.hslu.prg2.sw9.Ball;

import java.awt.*;
import java.util.Random;

/**
 * Created by Yves Hohl (yves.hohl@stud.hslu.ch) on 20.11.2014.
 */
public class Ball implements Runnable {

	private Color color;
	private int size;
	private int positionY;
	private int positionX;
	private int speed;
	private int panelHeight;

	public Ball(int frameHeight, int positionX, int positionY) {
		Random random = new Random();

		// random speed
		speed = 5 + random.nextInt(15);

		// random color
		color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

		// random size between 20 and 50
		size = 20 + random.nextInt(31);

		this.positionY = positionY - (size / 2);
		this.positionX = positionX - (size / 2);
		this.panelHeight = frameHeight;
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(positionX, positionY, size, size);
	}

	@Override
	public void run() {
		while (isFalling()) {
			positionY++;
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
			}
		}
		while (isVisible()) {
			color = new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha() - 1);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}

	private boolean isFalling() {
		return positionY < panelHeight - size;
	}

	public boolean isVisible() {
		return color.getAlpha() > 0;
	}
}

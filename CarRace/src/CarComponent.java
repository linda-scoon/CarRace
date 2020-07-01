import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JComponent;

public class CarComponent extends JComponent implements Runnable {

	private Car car;
	private String name;
	private int distance;
	private int counter;
	private long delay;
	private Random r;

	public CarComponent(int x, int y, String name) {
		car = new Car(x, y);
		this.name = name;
		distance = 200;
		counter = 0;
		r = new Random();
		delay = 25 + r.nextInt(50);
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		car.draw(g2);
	}

	@Override
	public void run() {
		while (counter < distance) {
			counter++;
			try {
				car.move();
				repaint();
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " Finished");

	}

}

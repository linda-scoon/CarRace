import java.awt.Graphics2D;

public class Car {

	private int xLeft;
	private int yTop;
	private int width;
	private int height;
	private int xVel;


	public Car(int x, int y) {
		xLeft = x;
		yTop = y;
		width = 60;
		height = 30;
		xVel = 1;
	}

	public void draw(Graphics2D g2) {
		g2.drawRect(xLeft, yTop, width / 2, height / 3);
		g2.drawRect(xLeft, yTop + 10, width, height / 3);

		g2.drawOval(xLeft + 10, yTop + 20, width / 6, width / 6);
		g2.drawOval(xLeft + 40, yTop + 20, width / 6, width / 6);
		g2.drawLine(xLeft + 30, yTop, xLeft + 40, yTop + 10);

	}

	public void move() {
		xLeft += xVel;

	}

}

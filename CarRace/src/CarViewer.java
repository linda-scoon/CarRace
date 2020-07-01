import java.awt.GridLayout;

import javax.swing.JFrame;

public class CarViewer {

	public static void main(String[] args) {

		CarComponent car = new CarComponent(60, 0, "car1");
		CarComponent car2 = new CarComponent(60, 0, "car2");
		CarComponent car3 = new CarComponent(60, 0, "car3");

		Thread t1 = new Thread(car);
		Thread t2 = new Thread(car2);
		Thread t3 = new Thread(car3);
		t1.start();
		t2.start();
		t3.start();

		JFrame frame = new JFrame("Cars");
		frame.setSize(400, 400);
		frame.setLayout(new GridLayout(3, 1));
		frame.add(car);
		frame.add(car2);
		frame.add(car3);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);


	}

}

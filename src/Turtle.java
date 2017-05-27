import javax.swing.JOptionPane;

public class Turtle {

	String color;

	public Turtle(String bob) {
		color = bob;

	}

	public void speak() {
		JOptionPane.showMessageDialog(null, "Hi I'm turtle and I hate " + color);

	}
}

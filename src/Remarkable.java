import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("What is your name?");

		if (name.equalsIgnoreCase("Pyranav")) {
			JOptionPane.showMessageDialog(null, "You are wearing a red shirt.");
		} else if (name.equalsIgnoreCase("Ryan")) {
			JOptionPane.showMessageDialog(null, "You are wearing a blue shirt.");
		} else if (name.equalsIgnoreCase("Max")) {
			JOptionPane.showMessageDialog(null, "You are wearing a gray shirt.");
		} else if (name.equalsIgnoreCase("Kyle")) {
			JOptionPane.showMessageDialog(null, "You are wearing a red shirt.");
		} else if (name.equalsIgnoreCase("Jackie")) {
			JOptionPane.showMessageDialog(null, "You are our teacher.");
		} else {
			JOptionPane.showMessageDialog(null, "I don't know you.");
		}
	}
}
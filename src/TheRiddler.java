import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		int score = 0;

		String one = JOptionPane.showInputDialog("What has a head and a tail, but no body. (Hint: Not a snake)");

		if (one.equalsIgnoreCase("Coin")) {
			JOptionPane.showMessageDialog(null, "You are correct");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. The answer is a coin");
		}

		String two = JOptionPane.showInputDialog("Which is heavier: a pound of feather or a pound of bricks?");

		if (two.equalsIgnoreCase("Neither")) {
			JOptionPane.showMessageDialog(null, "You are correct");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. The answer is same");
		}

		String three = JOptionPane.showInputDialog(
				"What is as light as a feather, but even the world's strongest man couldn't hold it for more than a minute?");

		if (three.equalsIgnoreCase("Air")) {
			JOptionPane.showMessageDialog(null, "You are correct");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. The answer is air");
		}

		JOptionPane.showMessageDialog(null, "Your score is " + score);

	}
}

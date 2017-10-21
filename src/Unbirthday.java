import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args)

	{
		String name = JOptionPane.showInputDialog("When is your birthday? (mm/dd)");
		if (name.equals("10/20")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday");
		} else {
			JOptionPane.showMessageDialog(null, "Merry UNbirthday");
		}
	}
}

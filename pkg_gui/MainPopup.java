package pkg_gui;

import javax.swing.JOptionPane;

public class MainPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
        input = JOptionPane.showInputDialog("Please Enter your name");
        JOptionPane.showMessageDialog(null, "Welcome "+input);
	}

}

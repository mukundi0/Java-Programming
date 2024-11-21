package pkg_gui2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

public class FirstFrame extends JFrame {
	
	private JLabel lblFirstName, lblLastName, lblGender, lblYearofBirth;
	private JTextField txtFirstName, txtLastName, txtYearofBirth;
	private JRadioButton rbtnFemale, rbtnMale;
	private JButton btnRegister;
	
	public FirstFrame() {
		super("Registration Form");
		this.setLayout(new FlowLayout());
	}
	

}

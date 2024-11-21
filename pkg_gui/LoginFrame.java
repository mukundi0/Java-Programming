package pkg_gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener{

	private JLabel lblUser, lblPassword;
	private JTextField txtUser, txtPassword;
	private JButton btnLogin;
	
	public LoginFrame() {

		super("Welcome");
		this.setLayout(new FlowLayout());
		
		lblUser = new JLabel("User: ");
		this.add(lblUser);
		
		txtUser = new JTextField(15);
		add(txtUser);
		
		lblPassword = new JLabel("Password: ");
		add(lblPassword);
		
		txtPassword = new JTextField(15);
		add(txtPassword);
		
		btnLogin = new JButton("Login");
		/*btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Login Button clicked");
				String name = txtUser.getText();
				String msg = "Welcome " + name +". \nLogin successful!";
				JOptionPane.showMessageDialog(null, msg);
			}
			
		});*/
		btnLogin.addActionListener(this);
		add(btnLogin);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLogin) {
			System.out.println("Login button was clicked!");
			String name = txtUser.getText();
			String msg = "Welcome " + name +". \nLogin successful!";
			JOptionPane.showMessageDialog(null, msg);
		}
	}
}

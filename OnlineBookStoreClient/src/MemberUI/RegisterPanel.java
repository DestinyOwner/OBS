package MemberUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import BookUI.BookUIController;

public class RegisterPanel extends JPanel implements ActionListener {
	private JLabel nameLabel, passwordLabel, phoneLabel;
	private JTextField regname = null;
	private JPasswordField regpass = null;
	private JTextField phone = null;
	private JButton registerbtn = null;
	private JButton returnbtn = null;

	private MemberUIController memberUIController;

	public RegisterPanel(MemberUIController memberUIController) {
		this.memberUIController=memberUIController;
	}

	public void init() {
		setSize(800, 600);
		setLayout(null);
		setLocation(0, 0);
		nameLabel = new JLabel("用户ID:");
		nameLabel.setSize(100, 50);
		nameLabel.setLocation(250, 150);
		nameLabel.setFont(new Font("楷体_gb2312", Font.PLAIN, 20));
		passwordLabel = new JLabel("密码:");
		passwordLabel.setSize(60, 50);
		passwordLabel.setLocation(250, 210);
		passwordLabel.setFont(new Font("楷体_gb2312", Font.PLAIN, 20));
		phoneLabel = new JLabel("联系电话:");
		phoneLabel.setSize(100, 50);
		phoneLabel.setLocation(250, 270);
		phoneLabel.setFont(new Font("楷体_gb2312", Font.PLAIN, 20));

		regname = new JTextField(30);
		regname.setSize(180, 35);
		regname.setLocation(350, 160);
		regname.setVisible(true);
		regpass = new JPasswordField(30);
		regpass.setSize(180, 35);
		regpass.setLocation(350, 220);
		regpass.setVisible(true);
		phone = new JTextField(30);
		phone.setSize(180, 35);
		phone.setLocation(350, 280);
		phone.setVisible(true);

		registerbtn = new JButton("注册");
		registerbtn.setSize(90, 40);
		registerbtn.setLocation(320, 350);
		registerbtn.setFont(new Font("楷体_gb2312", Font.PLAIN, 20));
		registerbtn.addActionListener(this);
		returnbtn = new JButton("返回");
		returnbtn.setSize(90, 40);
		returnbtn.setLocation(420, 350);
		returnbtn.setFont(new Font("楷体_gb2312", Font.PLAIN, 20));
		returnbtn.addActionListener(this);

		add(nameLabel);
		add(passwordLabel);
		add(phoneLabel);
		add(regname);
		add(regpass);
		add(phone);
		add(registerbtn);
		add(returnbtn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == registerbtn) {

		} else if (e.getSource() == returnbtn) {
			memberUIController.setReturnView();
		}
	}

}

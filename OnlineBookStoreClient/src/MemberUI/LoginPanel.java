package MemberUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import BookUI.BookUIController;

public class LoginPanel extends JPanel implements ActionListener {
	private JLabel nameLabel, passwordLabel, classifyLabel;
	private JComboBox<String> classify;
	private JTextField loginname = null;
	private JPasswordField loginpass = null;
	private JButton loginbtn = null;
	private JButton returnbtn = null;

	private MemberUIController memberUIController;

	public LoginPanel(MemberUIController memberUIController) {
		this.memberUIController=memberUIController;
	}

	public void init() {
		setSize(800, 600);
		setLayout(null);
		setLocation(0, 0);
		nameLabel = new JLabel("用户ID:");
		nameLabel.setSize(100, 50);
		nameLabel.setLocation(440, 150);
		nameLabel.setFont(new Font("楷体_gb2312", Font.PLAIN, 20));
		passwordLabel = new JLabel("密码:");
		passwordLabel.setSize(60, 50);
		passwordLabel.setLocation(440, 210);
		passwordLabel.setFont(new Font("楷体_gb2312", Font.PLAIN, 20));
		classifyLabel = new JLabel("类别:");
		classifyLabel.setSize(60, 50);
		classifyLabel.setLocation(440, 270);
		classifyLabel.setFont(new Font("楷体_gb2312", Font.PLAIN, 20));

		loginname = new JTextField(30);
		loginname.setSize(180, 35);
		loginname.setLocation(530, 160);
		loginname.setVisible(true);
		loginpass = new JPasswordField(30);
		loginpass.setSize(180, 35);
		loginpass.setLocation(530, 220);
		loginpass.setVisible(true);
		String[] types = { "顾客", "销售经理", "总经理", "系统管理员" };
		classify = new JComboBox<>(types);
		classify.setSelectedItem(types[0]);
		classify.setSize(180, 35);
		classify.setLocation(530, 280);

		loginbtn = new JButton("登陆");
		loginbtn.setSize(90, 40);
		loginbtn.setLocation(520, 340);
		loginbtn.setFont(new Font("楷体_gb2312", Font.PLAIN, 20));
		loginbtn.addActionListener(this);
		returnbtn = new JButton("返回");
		returnbtn.setSize(90, 40);
		returnbtn.setLocation(630, 340);
		returnbtn.setFont(new Font("楷体_gb2312", Font.PLAIN, 20));
		returnbtn.addActionListener(this);

		add(nameLabel);
		add(passwordLabel);
		add(classifyLabel);
		add(loginname);
		add(loginpass);
		add(classify);
		add(loginbtn);
		add(returnbtn);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginbtn) {

		} else if (e.getSource() == returnbtn) {
			memberUIController.setReturnView();
		}
	}
}

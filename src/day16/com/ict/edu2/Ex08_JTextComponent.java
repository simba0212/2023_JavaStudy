package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex08_JTextComponent extends JFrame {
	public Ex08_JTextComponent() {
		super("텍스트컴포넌트");
		JPanel jp = new JPanel();
		// JLabel
		JLabel jla1 = new JLabel("I     D   : ");
		JLabel jla2 = new JLabel("P     W   : ");
		JLabel jla3 = new JLabel("자기소개서 : ");

		// 한줄 글자 입력 : JTextField
		JTextField jtf1 = new JTextField("아이디 입력");
		jtf1.setColumns(20); // 보이는 글자 길이가 20칸
		
		// JTextField jtf2 = new JTextField("비밀번호 입력");
		// 비밀번호 입력받기
		JPasswordField jpf1 = new JPasswordField(20);
		
		// 여러줄 입력받기
		JTextArea jta1 = new JTextArea(5,20);
		
		// JTextArea는 두가지 옵션을 생각해야 한다.
		// 자동 줄바꿈
		jta1.setLineWrap(true);
		// 스크롤기능
		JScrollPane jsp = new JScrollPane(jta1,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jp.add(jla1);
		jp.add(jla2);
		jp.add(jla3);
		jp.add(jtf1);
		jp.add(jpf1);
		jp.add(jsp);
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 500, ds.height / 2 - 200, 1000, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex08_JTextComponent();
	}
}

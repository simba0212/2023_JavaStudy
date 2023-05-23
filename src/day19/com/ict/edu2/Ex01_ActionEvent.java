package day19.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.tools.Tool;

// 이벤트 : 사용자가 어떠한 행동, 동작을 하는 것을 말한다.
// 이벤트 소스 : 이벤트가 발생되는 컴포넌드 (버튼, 체크박스, ...)
// 이벤트 리스너 : 이벤트 감지, 이벤트가 발생되면 실제적으로 이벤트를 처리할 수 있도록 만든 인터페이스
// 이벤트 핸들러 : 리스너에 전달된 이벤트를 실제로 처리할 수 있도록 이벤트 리스너에 포함되어 있는 메서드(추상메서드)
// 즉 이 추상메서드를 구현화하는것은 사용자의 몫이다.

// ActionEvent : 컴포넌트를 눌렀거나, 선택되었을때, Enter키를 눌렀을때 발생하는 이벤트
// ActionListener : actionPerformed() 추상메서드를 가지고 있다.
// addActionListener : 컴포넌트에 ActionListener를 추가해서 이벤트를 감지할 수 있도록 하는 메서드이다.

public class Ex01_ActionEvent extends JFrame implements ActionListener {

	JPanel jp;
	JButton jb1, jb2, jb3;

	public Ex01_ActionEvent() {
		super("ActionEvent");

		jp = new JPanel();
		jb1 = new JButton("입력 1");
		jb2 = new JButton("입력 2");
		jb3 = new JButton("EXIT");

		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);

		add(jp);

		pack();
		setLocationRelativeTo(null);

//		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
//		setBounds(ds.width/2-200 ,ds.height/2-50,400,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 이벤트 소스에 ActionListener를 붙이자.
		// this를 사용한 이유 => 현재 객체가 ActionListener가 붙어있다.
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);

	}

	// 이벤트 핸들러의 한 종류, Action이벤트에서는 이녀석으로 핸들한다.
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼을 눌렀네요");
		JButton obj = (JButton) e.getSource();
		if(obj==jb1) {
			System.out.println("입력 1이 눌렸네");
		}else if(obj==jb2) {
			System.out.println("입력 2가 눌렸네");
		}else if(obj ==jb3) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new Ex01_ActionEvent();
	}
}

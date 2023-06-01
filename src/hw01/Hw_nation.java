package hw01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Hw_nation extends JPanel implements ActionListener {
	JPanel jp;
	JTextField jtf;
	JButton jb1, jb2, jb3;
	JTextArea jta;
	JScrollPane jsp;
	Hw_CardLayout main;

	public Hw_nation(Hw_CardLayout main) {
		this.main = main;
		setLayout(new BorderLayout());
		jp = new JPanel();
		jtf = new JTextField(10);
		jb1 = new JButton("확인");
		jb2 = new JButton("취소");
		jb3 = new JButton("뒤로가기");

		jp.add(new JLabel("나라입력 : "));
		jp.add(jtf);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		add(jp, BorderLayout.NORTH);

		jta = new JTextArea(10, 30);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		add(jsp);
		// 화면부끝

		// 구현부 시작
		jtf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dataPrn();
			}

		});
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dataPrn();
			}
		});
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("");
				jta.setText("");
				// 커서위치 지정
				jtf.requestFocus();
			}
		});
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				main.cardLayout.show(main.pg1, "index");
			}
		});

	}

	public void dataPrn() {
		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("영국", "런던");
		map.put("캐나다", "오타와");
		map.put("일본", "도쿄");

		String key = jtf.getText();
		String val = map.get(key);
		if (map.containsKey(key)) {
			jta.append(key + "의 수도는 " + val + "입니다.\n");
			jtf.setText("");
			jtf.requestFocus();
		} else {
			jta.append("데이터에 없는 나라입니다.\n");
			jtf.setText("");
			jtf.requestFocus();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}

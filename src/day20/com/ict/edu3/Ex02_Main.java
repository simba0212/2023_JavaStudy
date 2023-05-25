package day20.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

// 대한민국, 캐나다, 영국, 스위스 수도 HashMap 저장
// 나라가 key, 화면에서 수도출력

public class Ex02_Main extends JFrame implements ActionListener {
	JPanel jp;
	JTextField jtf;
	JButton jb1, jb2;
	JTextArea jta;
	JScrollPane jsp;

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	public Ex02_Main() {
		super("수도 알아내기");
		jp = new JPanel();
		jtf = new JTextField(10);
		jb1 = new JButton("확인");
		jb2 = new JButton("취소");

		jp.add(new JLabel("나라입력 : "));
		jp.add(jtf);
		jp.add(jb1);
		jp.add(jb2);

		add(jp, BorderLayout.NORTH);

		jta = new JTextArea(10, 30);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		add(jsp);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

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
	}

	// 위 중복된 코드가 있으면 메서드를 만든다
	public void dataPrn() {
		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		if (jtf.getText().length() == 0) {
			jta.append("데이터를 입력하세요\n");
			jtf.setText("");
			jtf.requestFocus();
		}

		else {
			String str = jtf.getText().trim();
			if (map.containsKey(str)) {
				String cap = map.get(str);
				jta.append(str + "의 수도는 " + cap + "입니다.\n");
				jtf.setText("");
				jtf.requestFocus();
			} else {
				jta.append("데이터에 없는 나라 입니다.\n");
				jtf.setText("");
				jtf.requestFocus();
			}

		}
	}
	public static void main(String[] args) {
		new Ex02_Main();
	}

}

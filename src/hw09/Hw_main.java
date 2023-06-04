package hw09;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import day17.com.ict.edu3.Ex01_JTable;

public class Hw_main extends JFrame {
	JPanel jp1, jp2, jp3, jp4, jp01;
	JPanel t1,t2,t3,t4,t5;
	JTextField id, name, phone, addr, comp, searchF;
	JButton add, del, edit, searchB, clean, seeA;
	JTextArea jta;
	JComboBox<String> box;
	JTable table;

	public Hw_main() {
		super("DB 연동정보");
		jp01 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jp1 = new JPanel(new GridLayout(5,0));

		t1 = new JPanel();
		t2 = new JPanel();
		t3 = new JPanel();
		t4 = new JPanel();
		t5 = new JPanel();
		
		id = new JTextField(20);
		t1.add(new JLabel("ID     : "));
		t1.add(id);
		jp1.add(t1);
		

		name = new JTextField(20);
		t2.add(new JLabel("이름 : "));
		t2.add(name);
		jp1.add(t2);

		phone = new JTextField(20);
		t3.add(new JLabel("전화 : "));
		t3.add(phone);
		jp1.add(t3);

		addr = new JTextField(20);
		t4.add(new JLabel("주소 : "));
		t4.add(addr);
		jp1.add(t4);
		
		comp = new JTextField(20);
		t5.add(new JLabel("회사 : "));
		t5.add(comp);
		jp1.add(t5);
		
		jp01.add(jp1);

		jp2 = new JPanel();

		add = new JButton("추가");
		del = new JButton("삭제");
		edit = new JButton("수정");

		String[] items = { "ID", "이름", "전화", "주소", "회사" };
		box = new JComboBox<>(items);
		searchF = new JTextField(10);

		searchB = new JButton("검색");
		clean = new JButton("지우기");
		seeA = new JButton("전체보기");

		jp2.add(add);
		jp2.add(del);
		jp2.add(edit);
		jp2.add(box);
		jp2.add(searchF);
		jp2.add(searchB);
		jp2.add(clean);
		jp2.add(seeA);

		jp3 = new JPanel();
		jp3.add(new JLabel("Address Book"));

		Hw_JTable table = new Hw_JTable();
		JTable jtable = new JTable(table);
		JScrollPane jsp = new JScrollPane(jtable);

		add(jp01, BorderLayout.WEST);
		add(jp2, BorderLayout.SOUTH);
		add(jp3, BorderLayout.NORTH);
		add(jsp, BorderLayout.EAST);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Hw_main();
	}
}

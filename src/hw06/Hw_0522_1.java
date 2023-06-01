package hw06;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Hw_0522_1 extends JFrame implements ActionListener, ItemListener {
	JPanel np;
	JPanel cp;
	JPanel sp;
	JLabel jl1;
	JTextField jtf1;
	JLabel jl2;
	JTextField jtf2;
	JLabel jl3;
	ButtonGroup bg;
	JRadioButton addBtn;
	JRadioButton subBtn;
	JRadioButton mulBtn;
	JRadioButton divBtn;
	JTextArea jta;
	JButton jb1;
	JButton jb2;
	JButton jb3;

	public Hw_0522_1() {
		super("계산기");

		np = new JPanel();
		cp = new JPanel();
		sp = new JPanel();

		jl1 = new JLabel("수1 : ");
		jtf1 = new JTextField(5);
		jl2 = new JLabel("수2 : ");
		jtf2 = new JTextField(5);
		jl3 = new JLabel("연산자 : ");
		bg = new ButtonGroup();
		addBtn = new JRadioButton(" + ");
		subBtn = new JRadioButton(" - ");
		mulBtn = new JRadioButton(" * ");
		divBtn = new JRadioButton(" / ");

		bg.add(addBtn);
		bg.add(subBtn);
		bg.add(mulBtn);
		bg.add(divBtn);

		// 위쪽 패널
		np.add(jl1);
		np.add(jtf1);
		np.add(jl2);
		np.add(jtf2);
		np.add(jl3);

		np.add(addBtn);
		np.add(subBtn);
		np.add(mulBtn);
		np.add(divBtn);
		add(np, BorderLayout.NORTH);

		// 가운데 텍스트필드
		jta = new JTextArea();
		jta.setLineWrap(true); // 자동줄바꿈
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// 편집불가능하게 만들기
		jta.setEditable(false);
		add(jsp);
		// 아래쪽 버튼
		jb1 = new JButton("계   산");
		jb2 = new JButton("종   료");
		jb3 = new JButton("취   소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);

		add(sp, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 화면부 끝

		// 구현부 시작
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		if (obj == jb1) {

			if (addBtn.isSelected()) {
				int num1 = Integer.parseInt(jtf1.getText());
				int num2 = Integer.parseInt(jtf2.getText());
				int sum = num1 + num2;
				jta.append(num1 + " + " + num2 + " = " + sum + "\n");
			} else if (subBtn.isSelected()) {
				int num1 = Integer.parseInt(jtf1.getText());
				int num2 = Integer.parseInt(jtf2.getText());
				int sub = num1 - num2;
				jta.append(num1 + " - " + num2 + " = " + sub + "\n");
			}else if (mulBtn.isSelected()) {
				int num1 = Integer.parseInt(jtf1.getText());
				int num2 = Integer.parseInt(jtf2.getText());
				int mul = num1 * num2;
				jta.append(num1 + " * " + num2 + " = " + mul + "\n");
			}else if (divBtn.isSelected()) {
				int num1 = Integer.parseInt(jtf1.getText());
				int num2 = Integer.parseInt(jtf2.getText());
				double div = ((int)(num1*10.0/num2))/10.0;
				jta.append(num1 + " / " + num2 + " = " + div + "\n");
			}
			

		}
		else if(obj == jb2) {
			System.exit(0);
		}
		else if(obj ==jb3) {
			jta.setText("");
			jtf1.setText("");
			jtf2.setText("");
			bg.clearSelection();
		}
	}

	public static void main(String[] args) {
		new Hw_0522_1();
	}

}

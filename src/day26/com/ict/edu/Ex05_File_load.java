package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05_File_load extends JFrame implements ActionListener {
	JPanel jp;
	JTextArea jta;
	JScrollPane jsp;
	JTextField jtf1;
	JButton jb1;

	public Ex05_File_load() {
		super("불러오기");
		jp = new JPanel();
		jtf1 = new JTextField(30);
		jb1 = new JButton("LOAD");
		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jp.add(new JLabel("파일 경로 : "));
		jp.add(jtf1);
		jp.add(jb1);
		jta.setEditable(false);

		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		// 화면부 끝

		// 기능부
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String readPath = jtf1.getText();
				File readFile = new File(readPath);
				FileInputStream fis = null;
				BufferedInputStream bis = null;

				try {
					fis = new FileInputStream(readFile);
					bis = new BufferedInputStream(fis);

					byte[] b = fis.readAllBytes();
					String msg = new String(b);
					jta.setText(msg);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						bis.close();
						fis.close();

					} catch (Exception e2) {
					}
				}

			}
		});

	}

	public static void main(String[] args) {
		new Ex05_File_load();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}

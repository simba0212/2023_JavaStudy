package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

public class Ex06_File_open extends JFrame implements ActionListener {
	JPanel jp;
	JTextArea jta;
	JScrollPane jsp;
	JTextField jtf1;
	JButton jb1;

	public Ex06_File_open() {
		super("불러오기");
		jp = new JPanel();
		jtf1 = new JTextField(30);
		jb1 = new JButton("불러오기");
		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jp.add(new JLabel("파일 경로 : "));
		jp.add(jtf1);
		jp.add(jb1);

		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		// 화면부 끝

		// 기능부 시작
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				open();

			}

			
		});
		jtf1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				open();

			}
		});
		jtf1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "저장하기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				if (!msg.equals("nullnull")) {
					jtf1.setText(msg);
				}
			}
		});
	}

	public void open() {
		String pathname = jtf1.getText().trim();
		
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			byte[] b = bis.readAllBytes();
			String msg = new String(b).trim();
			jta.setText(msg);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

	public static void main(String[] args) {
		new Ex06_File_open();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}

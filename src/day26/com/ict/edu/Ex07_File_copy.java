package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.FlowLayout;
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
import javax.swing.JTextField;

public class Ex07_File_copy extends JFrame implements ActionListener {
	JPanel jp1, jp2;
	JTextField jtf1, jtf2;
	JButton jb;

	public Ex07_File_copy() {
		super("복사하기");

		jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jtf1 = new JTextField(20);
		jp1.add(new JLabel("원본위치 : ", JLabel.LEFT));
		jp1.add(jtf1);

		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jtf2 = new JTextField(20);
		jb = new JButton("복사하기");
		jp2.add(new JLabel("사본위치 : ", JLabel.LEFT));
		jp2.add(jtf2);
		jp2.add(jb);

		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.SOUTH);

		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		// 화면부

		// 기능부
		jtf1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "원본위치", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				if (!msg.equals("nullnull")) {
					jtf1.setText(msg);
				}

			}
		});
		jtf2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "복사위치", FileDialog.SAVE);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				if (!msg.equals("nullnull")) {
					jtf2.setText(msg);
				}
				save();

			}
		});

		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				save();

			}
		});

	}

	public void save() {
		String pathname1 = jtf1.getText().trim();
		String pathname2 = jtf2.getText().trim();
		if (pathname1.length() > 0) {

			File file1 = new File(pathname1);
			File file2 = new File(pathname2);
			FileOutputStream fos = null;
			BufferedOutputStream bos = null;
			FileInputStream fis = null;
			BufferedInputStream bis = null;

			try {
				fis = new FileInputStream(file1);
				bis = new BufferedInputStream(fis);
				fos = new FileOutputStream(file2);
				bos = new BufferedOutputStream(fos);
				
//				int b=0;
//				while((b=bis.read()) !=-1) {
//					bos.write(b);
//					
//				}
				byte[] b1 = bis.readAllBytes();
				bos.write(b1);
				bos.flush();
				
				jtf1.setText("");
				jtf2.setText("");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		new Ex07_File_copy();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}

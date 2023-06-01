package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.File;
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

public class Ex05_File_save extends JFrame implements ActionListener{
	JPanel jp;
	JTextArea jta;
	JScrollPane jsp;
	JTextField jtf1;
	JButton jb1;

	public Ex05_File_save() {
		super("저장하기");
		jp = new JPanel();
		jtf1 = new JTextField(30);
		jb1 = new JButton("SAVE");
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
				// 파일경로에 jta에 입력한 내용이 저장된다.
				save();
				
			}

			private void save() {
				String pathname = jtf1.getText();
				String story = jta.getText();
				
				File file = new File(pathname);
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				
				try {
					fos = new FileOutputStream(file);
					bos = new BufferedOutputStream(fos);
					byte[] b = story.getBytes();
					
					bos.write(b);
					bos.flush();
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						bos.close();
						fos.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				
			}
		});
	}

	public static void main(String[] args) {
		new Ex05_File_save();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

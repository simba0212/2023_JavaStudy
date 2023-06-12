package hw10;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Main extends JFrame implements ActionListener {
	JPanel jp1, jp2, jp3, jp4;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3, jb4;
	List<VO> list;
	VO vo;
	int res;

	public Main() {
		super("DB 연동 정보");

		jp3 = new JPanel(new GridLayout(1, 2));
		jp1 = new JPanel(new GridLayout(4, 1));

		jp1.add(new JLabel("CUSTID :", JLabel.CENTER));
		jp1.add(new JLabel("NAME :", JLabel.CENTER));
		jp1.add(new JLabel("ADDRESS :", JLabel.CENTER));
		jp1.add(new JLabel("PHONE :", JLabel.CENTER));
		jp3.add(jp1);

		jp2 = new JPanel(new GridLayout(4, 1));
		jtf1 = new JTextField(30);
		jtf2 = new JTextField(30);
		jtf3 = new JTextField(30);
		jtf4 = new JTextField(30);
		jp2.add(jtf1);
		jp2.add(jtf2);
		jp2.add(jtf3);
		jp2.add(jtf4);
		jp3.add(jp2);

		getContentPane().add(jp3, BorderLayout.NORTH);

		jta = new JTextArea();
		jta.setEditable(false);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		getContentPane().add(jsp);

		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");

		jp4 = new JPanel();
		jp4.add(jb1);
		jp4.add(jb2);
		jp4.add(jb3);
		jp4.add(jb4);

		getContentPane().add(jp4, BorderLayout.SOUTH);

		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		// 화면부 끝

		// 구현부

		// 전체보기
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				list = DAO.getList();
				prn(list);
				initjtf();

			}
		});
		// 삽입
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vo = new VO();
				vo.setCustid(jtf1.getText());
				vo.setName(jtf2.getText());
				vo.setAddress(jtf3.getText());
				vo.setPhone(jtf4.getText());
				boolean idchk = DAO.getIdChk(jtf1.getText());
				
				
				if (idchk) {
					res = DAO.getInsert(vo);
					if (res > 0) {
						JOptionPane.showMessageDialog(getParent(), "삽입 성공!");
						list = DAO.getList();
						prn(list);
						initjtf();
					} else {
						JOptionPane.showMessageDialog(getParent(), "삽입 실패!");
					}

				} else {
					JOptionPane.showMessageDialog(getParent(), "같은 custid 가 존재합니다.");
				}
			}
		});

		// 삭제
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vo = new VO();
				vo.setCustid(jtf1.getText());
				res = DAO.getDelete(vo);
				if(res>0) {
					JOptionPane.showMessageDialog(getParent(), "삭제 성공!");
					list = DAO.getList();
					prn(list);
				}else JOptionPane.showMessageDialog(getParent(), "삭제 실패!");
				initjtf();
			}
		});
		
//		 검색 AND 수정하기
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton obj = (JButton) (e.getSource());
				String str = obj.getText();
				vo = new VO();
				if (str.equals("검색")) {
					vo = DAO.getOne(jtf1.getText());
					if (vo == null) {
						JOptionPane.showMessageDialog(getParent(), "없는 아이디입니다!", null, JOptionPane.WARNING_MESSAGE);
						list = DAO.getList();
						prn(list);
						initjtf();
					} else {
						try {
							jtf1.setText(vo.getCustid());
							jtf2.setText(vo.getName());
							jtf3.setText(vo.getAddress());
							jtf4.setText(vo.getPhone());
							jtf1.setEditable(false);
							jb4.setText("고치기");
						} catch (Exception e2) {
						}
					}
				} else {
					vo.setCustid(jtf1.getText());
					vo.setName(jtf2.getText());
					vo.setAddress(jtf3.getText());
					vo.setPhone(jtf4.getText());
					DAO.getUpdate(vo); // 업데이트 완료
					JOptionPane.showMessageDialog(getParent(), "수정 성공~!");
					list = DAO.getList();
					prn(list);
					initjtf();
				}
			}
		});
	}

	public void initjtf() {
		jtf1.setText("");
		jtf2.setText("");
		jtf3.setText("");
		jtf4.setText("");
		jtf1.setEditable(true);
		jb4.setText("검색");
	}



	public static void main(String[] args) {
		new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

	public void prn(List<VO> list) {
		list = DAO.getList();
		jta.setText("CUSTID\tNAME\tADDRESS\tPHONE\n");
		jta.append("=======================================================\n");
		for (VO k : list) {
			jta.append(k.getCustid() + "\t");
			jta.append(k.getName() + "\t");
			jta.append(k.getAddress() + "\t");
			jta.append(k.getPhone() + "\n");
		}
	}

}

package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ex02_Canvas extends JFrame {
	public Ex02_Canvas() {
		super("캔버스");

		add(new CanvasTest());

		setSize(1000, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// 내부클래스 : Canvas도 컨테이너의 한 종류
	private class CanvasTest extends Canvas {
		@Override
		public void paint(Graphics g) {

			// canvas => 도화지, Graphics g => 붓
			setBackground(Color.GRAY);

			// 붓의 색깔 지정
			g.setColor(Color.yellow);

			// 선 그리기
			g.drawLine(10, 10, 110, 10);
			g.drawLine(10, 10, 10, 110);
			g.drawLine(110, 10, 110, 110);
			g.drawLine(10, 110, 110, 110);
			g.setColor(Color.MAGENTA);
			g.drawLine(10, 10, 110, 110);
			g.drawLine(110, 10, 10, 110);

			// 사각형그리기 : drawRect(시작위치, 너비, 높이)
			g.drawRect(120, 10, 100, 100);
			g.drawRect(130, 20, 80, 80);
			g.drawRect(140, 30, 60, 60);
			g.drawRect(150, 40, 40, 40);
			g.drawRect(160, 50, 20, 20);

			// 채워진 사각형 : fillRect(시작위치, 너비, 높이)
			g.setColor(Color.yellow);
			g.fillRect(230, 10, 100, 100);
			g.setColor(Color.MAGENTA);
			g.fillRect(240, 20, 80, 80);
			g.setColor(Color.CYAN);
			g.fillRect(250, 30, 60, 60);
			g.setColor(Color.blue);
			g.fillRect(260, 40, 40, 40);

			// 둥근 모서리 사각형
			g.drawRoundRect(340, 10, 100, 100, 20, 20);
			g.setColor(Color.RED);
			g.fillRoundRect(350, 20, 80, 80, 20, 20);
			g.setColor(Color.yellow);
			g.drawRoundRect(360, 30, 60, 60, 20, 20);
			g.setColor(Color.GREEN);
			g.fillRoundRect(370, 40, 40, 40, 100, 100);

			// 원 : drawOval(시작위치, 너비, 높이)
			// 색 지정 : color(0~255, 0~255, 0~255)
			g.setColor(new Color(0, 0, 0));
			g.drawOval(10, 120, 100, 100);
			g.setColor(new Color(255, 255, 255));
			g.fillOval(20, 130, 80, 80);

			// 글자 : drawString("글자", 시작위치(글자 및 부분이 시작 위치이다.))
			g.drawString("대한민국", 120, 170);
			g.setColor(new Color(0, 0, 0));
			g.drawLine(0, 170, 600, 170);
			g.drawLine(120, 0, 120, 600);

			g.setColor(new Color(255, 255, 0));

			// new Font("글꼴", style, size);
			// style : bold, italic, plain
			g.setFont(new Font("궁서", Font.ITALIC, 50));
			g.drawString("KOREA", 230, 190);

			// 이미지
			Image img = Toolkit.getDefaultToolkit().getImage("src/images/java1.png");
			g.drawImage(img, 10, 230, this); // 원래 크기

			g.drawImage(img, 120, 230, 100, 100, this); // 크기 조절
			try {
				BufferedImage image2 = ImageIO.read(new File("src/images/java2.png"));
				g.drawImage(image2, 240, 230, 100, 100, this);
				g.drawImage(image2, 350, 230, 100, 100, new Color(255, 255, 0, 255), this); // 배경색 추가
			} catch (Exception e) {
			}
			Image img3 = new ImageIcon("src/images/java3.png").getImage();
			g.drawImage(img3, 460, 230, 100, 100, new Color(0, 100, 0, 50), this);
		}
	}

	public static void main(String[] args) {
		new Ex02_Canvas();
	}
}

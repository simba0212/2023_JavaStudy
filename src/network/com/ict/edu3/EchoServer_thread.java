package network.com.ict.edu3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer_thread implements Runnable{
	ServerSocket ss;
	Socket s;
	BufferedInputStream bis;
	BufferedOutputStream bos;
	
	
	
	public EchoServer_thread() throws Exception {
		ss = new ServerSocket(7778);
		System.out.println("서버 대기중 ...");
		new Thread(this).start();
	}
	
	
	
	@Override
	public void run()  {
		try {
			s = ss.accept();
			String ip = s.getInetAddress().getHostAddress();
			
			bis = new BufferedInputStream(s.getInputStream());
			bos = new BufferedOutputStream(s.getOutputStream());
			
			byte[] b= new byte[1024];
			bis.read(b);
			
			String msg = new String(b).trim();
			msg += System.lineSeparator();
			bos.write(msg.getBytes());
			bos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				s.close();
				bos.close();
				bis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		
		}
		
	
	}
	public static void main(String[] args) throws Exception {
		new EchoServer_thread();
	}



}

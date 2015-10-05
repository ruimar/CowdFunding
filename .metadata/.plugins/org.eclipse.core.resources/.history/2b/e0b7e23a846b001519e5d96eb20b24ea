import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class ComunicacaoCliente implements Runnable{
	
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	String ip;
	int port;
	Scanner sc;

	ComunicacaoCliente(Socket socket, BufferedReader in, PrintWriter out, String ip, int port) {
		this.socket = socket;
		this.in = in;
		this.out = out;
		this.ip = ip;
		this.port = port;
		new Thread(this, "").start();
	}
	
	@Override
	public void run() {
		
		
		
	}
	
	
	
}

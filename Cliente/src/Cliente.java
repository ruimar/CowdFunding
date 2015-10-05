import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Cliente {

	Socket socket;
	BufferedReader in;
	PrintWriter out;
	private static Scanner sc;
	
	Cliente(String ip, int port){
		
		try {
			socket = new Socket(ip, port);
		} catch (UnknownHostException e) {
			System.out.println("Erro Desconhecido!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Nao e possivel ligar ao servidor!");
			e.printStackTrace();
		}
		
		try {
			out = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		new ComunicacaoCliente(socket, in, out, ip, port);
		
	}
	
	public static void main(String [] args){
		
		sc = new Scanner(System.in);
		
		System.out.print("IP: ");
		String ip = sc.nextLine();
		System.out.print("Port: ");
		int port = sc.nextInt();
		
		new Cliente(ip, port);
		
	}
	
}



import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class ComunicacaoCliente extends Thread{
	
	Socket socket;
	
	String ip;
	int port;
	Scanner sc;
	ObjectOutputStream oos;
	ObjectInputStream ois;

	ComunicacaoCliente(Socket socket, String ip, int port) {
		this.socket = socket;
		this.ip = ip;
		this.port = port;
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("passei");
			
		}
		new Thread(this, "").start();
	}
	
	
	@Override
	public void run() {
		
		sc = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Kickstarter!");
		
		System.out.println("Escolha a opcao:\n1-Login\n2-Registar");
		
		int op = sc.nextInt();
		String username;
		String password;
		
		if(op==1){
			
			System.out.print("Username: ");
			username = sc.next();
			System.out.print("Password: ");
			password = sc.next();
						
			User userdata = new User(username, password);
			
			Pedido request = new Pedido (1, userdata);
			
			try {
				ligacao(request);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	private void ligacao(Pedido request) throws UnknownHostException, IOException, ClassNotFoundException{
		
		oos.writeObject(request);
		ois.readObject();
		
	}
	
	
	
}

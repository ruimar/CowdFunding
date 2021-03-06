package ServidorRMI;

import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import rmiinterface.RMIInterface;

public class RMIServer extends UnicastRemoteObject implements RMIInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	protected RMIServer() throws RemoteException {
		super();
	}
	
	
	public static void main(String [] args) throws IOException{
		
		RMIInterface ci = new RMIServer();
		System.setProperty("java.rmi.server.hostname", "127.0.0.1");
		
		try {
			LocateRegistry.createRegistry(25055).rebind("calc", ci);
		} catch (AccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Servidor RMI ligado!");
		
	}


	@Override
	public void login(String username, String password) {
		
		System.out.println(username+password);
		
		//checkar aqui se faz login na bd
		
	}
	
	//funcionalidades do RMI

}

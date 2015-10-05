package SevidorRMI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import rmiinterface.RMIInterface;

public class RMIServer extends UnicastRemoteObject implements RMIInterface {

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
	public String helloWorld() {
		System.out.println("Hello World!");
		return null;
	}
	
	//funcionalidades do RMI

}

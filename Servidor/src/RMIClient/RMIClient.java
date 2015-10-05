package RMIClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmiinterface.*;

public class RMIClient {
	
	String name = "//127.0.0.1:25055/calc";
	
	public RMIClient(){
		
	}

	public String helloWorld() throws MalformedURLException, RemoteException, NotBoundException {
		
		RMIInterface ci = (RMIInterface) Naming.lookup(name);
		String temp = ci.helloWorld();
		
		return temp;
		
	}
	
	//funcionalidades do cliente
	
}

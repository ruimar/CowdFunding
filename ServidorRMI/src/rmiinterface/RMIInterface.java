package rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote{
	
	public String helloWorld() throws RemoteException;
	//funcionalidades do RMI
	
}

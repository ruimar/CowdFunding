package rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote{
	
	public void login(String username, String password) throws RemoteException;
	//funcionalidades do RMI
	
}

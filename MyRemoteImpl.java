import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
  public MyRemoteImpl() throws RemoteException {} 
  public String sayHello() {
      return "Server says,  'Wiwat' ";
   }
  public static void main (String[] args) {
      try {
         MyRemote service = new MyRemoteImpl();
         Naming.rebind("RemoteHello", service);
      } catch(Exception ex) {
         ex.printStackTrace();
        }
  }
}
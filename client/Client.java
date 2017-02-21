import java.rmi.*;

public class Client {
   public static void main (String[] args) {
         new Client().go();
   }
   public void go() {
       try {
          MyRemote service = (MyRemote) Naming.lookup("rmi://192.168.43.245/RemoteHello");  
          String s = service.sayHello();
          System.out.println(s);
       } catch (Exception ex) {
         ex.printStackTrace();
       }
   }
}

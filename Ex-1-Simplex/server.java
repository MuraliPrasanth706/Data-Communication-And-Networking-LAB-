import java.io.*;
import java.net.*;
public class server {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(5000);
            Socket s=ss.accept();
            DataOutputStream output = new DataOutputStream(s.getOutputStream());
            String str = "I am ";
            output.writeUTF(str);
            output.flush();
            output.close();
            ss.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

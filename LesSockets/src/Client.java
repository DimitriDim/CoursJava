import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		str = "Bonjour serveur!!!";
		try {
			Socket socket = new Socket(InetAddress.getLocalHost(), 1000);

			OutputStream out = socket.getOutputStream();
			PrintWriter ostream = new PrintWriter(out);
			ostream.println(str);
			ostream.flush();

			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

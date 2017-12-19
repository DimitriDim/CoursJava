import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import java.io.InputStream;

public class Serveur {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket serveur = null;
		Socket socket = null;
		try {
			serveur = new ServerSocket(1000);

			socket = serveur.accept();

			InputStream in = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(in);

			BufferedReader istream = new BufferedReader(reader);
			String line = istream.readLine();

			System.out.println(line);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			socket.close();
			serveur.close();
		}
	}

}

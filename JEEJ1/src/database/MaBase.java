package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MaBase {

	static String url = "jdbc:mysql://localhost:3306/bddtest"; // url de ma base de donnee
	static String user = "root";
	static String password = "";
	static Connection connexion = null;

	static void LoadDatabase() {

		try {
			connexion = DriverManager.getConnection(url, user, password);

		} catch (

		SQLException e) {
			e.printStackTrace();
		}

	}

	static void CloseDatabase() {

		if (connexion != null)
			try {
				connexion.close();
			} catch (SQLException ignore) {
				ignore.printStackTrace();
			}
	}

}

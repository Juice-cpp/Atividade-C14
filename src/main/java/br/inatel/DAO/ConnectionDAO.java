package br.inatel.DAO;

import br.inatel.Model.User;
import java.sql.*;

public class ConnectionDAO {
    public Connection con;
    public PreparedStatement pst;
    public Statement st;
    public ResultSet rs;

    String database = "integracao";
    String user = "root";
    String password = "root";
    String url = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";

    public void connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso!");
        }
        catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }
}

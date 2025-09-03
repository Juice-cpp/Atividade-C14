package br.inatel.comand;

import br.inatel.Model.User;
import br.inatel.DAO.ConnectionDAO;

import java.sql.SQLException;

public class Comand {
    ConnectionDAO conexao = new ConnectionDAO();
    private boolean success;

    public boolean insertUser(User user){
        conexao.connectToDB();

        String sql = "INSERT INTO user (nome, cpf) VALUES (?, ?)";

        try {
            conexao.pst = conexao.con.prepareStatement(sql);
            conexao.pst.setString(1, user.getNome());
            conexao.pst.setString(2, user.getCpf());
            conexao.pst.execute();

            success = true;
        }
        catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            success = false;
        }
        finally {
            try {
                conexao.con.close();
                conexao.pst.close();
            }
            catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return success;
    }
}

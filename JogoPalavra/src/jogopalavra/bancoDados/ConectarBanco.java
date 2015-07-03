package jogopalavra.bancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConectarBanco {

    String driver = "com.mysql.jdbc.Driver";
    String caminho = "jdbc:mysql://localhost:3306/jogoPalavra";
    String usuario = "root";
    String senha = "root";
    Connection con;
    Statement stm;

   // String caminhoM = System.getProperty("user.home") + "/" + "banco.txt";

    public void conectarBanco() {
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public  void desconectarBando()
    {
        try
        {
            con.close();            
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}

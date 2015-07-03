
package jogopalavra.bancoDados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jogopalavra.modelo.Assunto;
import jogopalavra.modelo.Palavra;

public class AssuntoBD extends ConectarBanco
{
    public void cadastrar(Assunto assunto)
    {
        try 
        {
            conectarBanco();
            String sql= "insert into assunto (nomeAssunto) value (?); ";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1,assunto.getNomeAssunto());
            stm.executeUpdate();
            
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
            
        }
        finally
        {
            desconectarBando();
        }
        
    }
    
    public void excluir (int assunto)
    {
        try 
        {
            conectarBanco();
            String sql="delete from assunto where codAssunto="+assunto;
            PreparedStatement stm = con.prepareStatement(sql);
            stm.executeUpdate();
            
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            desconectarBando();
        }
    }
    
    public ArrayList <Assunto> listaAssunto()
    {
        ArrayList <Assunto> listadeAsssunto = new ArrayList();
        Assunto novoAssunto;
        try 
        {
            conectarBanco();
            String sql = "select * from assunto;";
            stm = con.createStatement();
           ResultSet listaResultado = stm.executeQuery(sql);
            while (listaResultado.next())
            {
                novoAssunto =new Assunto();
                
                novoAssunto.setCodAssunto(listaResultado.getInt("codAssunto"));
                novoAssunto.setNomeAssunto(listaResultado.getString("nomeAssunto"));
                listadeAsssunto.add(novoAssunto);     
            }
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally
        {
            desconectarBando();
            return listadeAsssunto;
        }
 
       
    }
    
    public void atualizar(Assunto asunto)
    {
        try 
        {
            conectarBanco();
           // String sql = "update assunto set nomeAssunto='"+asunto.getNomeAssunto()+"' where codAssunto="+asunto.getCodAssunto();
            String sql = "update assunto set nomeAssunto= ? where codAssunto="+asunto.getCodAssunto();
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1,asunto.getNomeAssunto());
            stm.executeUpdate();            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            desconectarBando();
        }
               
            
    }
    
    public ArrayList <Palavra> listaPalavraAssunto(int assunto)
    {
        ArrayList<Palavra> listaPalavrasdoAssunto = new ArrayList();
        Palavra novoPalavra;
        try 
        {
            conectarBanco();
            String sql= "select * from palavra where codAssunto= "+assunto ;
            stm = con.createStatement();
           ResultSet listaResulatado = stm.executeQuery(sql);
            while(listaResulatado.next())
            {
                novoPalavra = new Palavra();
                novoPalavra.setCodPalavra(listaResulatado.getInt("codPalavra"));
                novoPalavra.setCodAssunto(listaResulatado.getInt("codAssunto"));
                novoPalavra.setPalavra(listaResulatado.getString("palavra"));
                novoPalavra.setContador(listaResulatado.getInt("contador"));
               
                listaPalavrasdoAssunto.add(novoPalavra);
            }            
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        finally
        {
            desconectarBando();
            return listaPalavrasdoAssunto;
        }
    }
            
}

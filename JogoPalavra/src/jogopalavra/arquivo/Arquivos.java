package jogopalavra.arquivo;

import jogopalavra.arquivo.*;
import jogopalavra.modelo.Tema;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Arquivos 
{
   public void teste(String campo)
   {
       try 
       {
          FileWriter writer = new FileWriter(new File("teste.txt"),true); 
           PrintWriter saida = new PrintWriter(writer,true);
           saida.println(campo);
           
           saida.close();
           writer.close();
       } 
       catch (IOException e) 
       {
           e.printStackTrace();
       }
   }
    public String lerTextoArquivo()
    {
        String linha = "", texto = "";
        BufferedReader bf= null;
        try
        {
            FileReader leitor = new FileReader("teste.txt"); // Criando um leitor para o arquivo
            bf = new BufferedReader(leitor);    // Armazenando o conteúdo obtido pelo leitor em um buffer
            
            while((linha = bf.readLine())!= null) // Enquanto houverem linhas a serem lidas no buffer...
                {
                   texto+=linha + "\n";
                }
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally
            {
                return texto;
            }
    }
}

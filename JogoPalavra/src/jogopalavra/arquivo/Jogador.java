/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogopalavra.arquivo;

import jogopalavra.arquivo.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Herlen
 */
public class Jogador {
   
     public void teste(String campo)
   {
       try 
       {
          FileWriter writer = new FileWriter(new File("jogador.txt"),true); 
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
        int cont=0;
        String linha = "", texto = "";
        BufferedReader bf= null;
        try
        {
            FileReader leitor = new FileReader("jogador.txt"); // Criando um leitor para o arquivo
            bf = new BufferedReader(leitor);    // Armazenando o conteúdo obtido pelo leitor em um buffer
            
            while((linha = bf.readLine())!= null) // Enquanto houverem linhas a serem lidas no buffer...
                {
                   texto+=linha ;
                   cont++;
                   texto = cont+"";
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

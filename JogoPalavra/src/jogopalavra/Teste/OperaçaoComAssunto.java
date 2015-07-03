
package jogopalavra.Teste;

import jogopalavra.bancoDados.AssuntoBD;
import jogopalavra.modelo.Assunto;
import jogopalavra.modelo.Palavra;

public class OperaçaoComAssunto 
{
    
    public static void main(String[] args)
    {
        Assunto novoAssunto = new Assunto();
        AssuntoBD assuntoBD = new AssuntoBD();
        
        // casdastrar 
        novoAssunto.setNomeAssunto("Projeto");
      //  assuntoBD.cadastrar(novoAssunto);
        
        //listar
        
        for (Assunto temp:assuntoBD.listaAssunto())
        {
            System.out.println(temp.getNomeAssunto());
            
            
            // excluir 
            if (temp.getCodAssunto()==4)
            {
                assuntoBD.excluir(temp.getCodAssunto());
            }
            // Atualizar 
            
            if(temp.getCodAssunto()== 1)
            {
                temp.setNomeAssunto("novo assunto test");
                assuntoBD.atualizar(temp);
            }
            
            // Palavrar com assunto
           
        }
        for(Assunto temp:assuntoBD.listaAssunto())
        {
         for(Palavra tes:assuntoBD.listaPalavraAssunto(temp.getCodAssunto()))
            {
                System.out.println("Assunto: "+ temp.getNomeAssunto()+"\n \t"+tes.getPalavra());
            }
        }       
        
        
    }
    
}

package jogopalavra.interfaces;

import jogopalavra.modelo.Tema;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PalavrasTemas 
{
    ArrayList<Tema> listaTemas = new ArrayList();
    
    Tema tema;
    
    public PalavrasTemas()
    {
        iniciarTemas();
    }
    
    public void iniciarTemas()
    {
        // ====================================================================
        // TEMAS DE INFORMÁTICA 1
        
        tema = new Tema();
        
        // PRIMEIRO TEMA
            tema.setTema("O que mulher usa?");
            
        // PALAVRAS DESSE TEMA
            tema.setPalavra1("secador"); 
            tema.setPorcentagem1(52);
            
            tema.setPalavra2("chapinha"); 
            tema.setPorcentagem2(42);
            
            tema.setPalavra3("maquiagem"); 
            tema.setPorcentagem3(33);
            
            tema.setPalavra4("sapatos"); 
            tema.setPorcentagem4(24);
            
            tema.setPalavra5("sutiã"); 
            tema.setPorcentagem5(5);
            
        // NÍVEL
            tema.setNivel(1);
            
        listaTemas.add(tema); 
        // ================================================================
       
        //Radio e TV 2
        
         tema = new Tema();
        
        //  TEMA
            tema.setTema("Times Brasileiro");
            
        // PALAVRAS DESSE TEMA
            tema.setPalavra1("corinthians"); 
            tema.setPorcentagem1(34);
            
            tema.setPalavra2("flamengo"); 
            tema.setPorcentagem2(55);
            
            tema.setPalavra3("fluminense"); 
            tema.setPorcentagem3(25);
            
            tema.setPalavra4("vasco"); 
            tema.setPorcentagem4(20);
            
            tema.setPalavra5("são paulo"); 
            tema.setPorcentagem5(9);
            
            // NÍVEL
            tema.setNivel(1);
            
        listaTemas.add(tema); 
        
         // ====================================================================
        // TEMAS DE MODA 3
        
        tema = new Tema();
        
        // PRIMEIRO TEMA
            tema.setTema("Esporte");
            
        // PALAVRAS DESSE TEMA
            tema.setPalavra1("futebol"); 
            tema.setPorcentagem1(50);
            
            tema.setPalavra2("basquete"); 
            tema.setPorcentagem2(22);
            
            tema.setPalavra3("volei"); 
            tema.setPorcentagem3(15);
            
            tema.setPalavra4("nataçao"); 
            tema.setPorcentagem4(10);
            
            tema.setPalavra5("mma"); 
            tema.setPorcentagem5(5);
            
        // NÍVEL
            tema.setNivel(1);
            
        listaTemas.add(tema); 
        
          // ====================================================================
        
        
        // TEMAS DE Restaurante e Bar 4
        
        tema = new Tema();
        
        // PRIMEIRO TEMA
            tema.setTema("Objetos de casa");
            
        // PALAVRAS DESSE TEMA
            tema.setPalavra1("cama"); 
            tema.setPorcentagem1(52);
            
            tema.setPalavra2("sofá"); 
            tema.setPorcentagem2(27);
            
            tema.setPalavra3("geladeira"); 
            tema.setPorcentagem3(15);
            
            tema.setPalavra4("tv"); 
            tema.setPorcentagem4(10);
            
            tema.setPalavra5("ventilador"); 
            tema.setPorcentagem5(5);
            
        // NÍVEL
            tema.setNivel(1);
            
        listaTemas.add(tema); 
        
        // ====================================================================
    
        
        // TEMAS DE REDES   5
        
        tema = new Tema();
        
        // PRIMEIRO TEMA
            tema.setTema("Festa");
            
        // PALAVRAS DESSE TEMA
            tema.setPalavra1("bebida"); 
            tema.setPorcentagem1(41);
            
            tema.setPalavra2("comida"); 
            tema.setPorcentagem2(32);
            
            tema.setPalavra3("musica"); 
            tema.setPorcentagem3(20);
            
            tema.setPalavra4("criança"); 
            tema.setPorcentagem4(10);
            
            tema.setPalavra5("cadeira"); 
            tema.setPorcentagem5(5);
            
        // NÍVEL
            tema.setNivel(1);
            
        listaTemas.add(tema); 
        
          // ====================================================================
        
        // TEMAS DE ADMINITRAÇÃO 6
        
        tema = new Tema();
        
        // PRIMEIRO TEMA
            tema.setTema("Brincadeira de criança");
            
        // PALAVRAS DESSE TEMA
            tema.setPalavra1("bola de gudi"); 
            tema.setPorcentagem1(20);
            
            tema.setPalavra2("pipa"); 
            tema.setPorcentagem2(37);
            
            tema.setPalavra3("bola"); 
            tema.setPorcentagem3(20);
            
            tema.setPalavra4("pique esconde"); 
            tema.setPorcentagem4(15);
            
            tema.setPalavra5("policia e ladrao"); 
            tema.setPorcentagem5(7);
            
        // NÍVEL
            tema.setNivel(1);
            
        listaTemas.add(tema);
        
         // ====================================================================
        
        // TEMAS DE EVENTOS 7
        
        tema = new Tema();
        
        // PRIMEIRO TEMA
            tema.setTema("O que homem usa");
            
        // PALAVRAS DESSE TEMA
            tema.setPalavra1("tenis"); 
            tema.setPorcentagem1(5);
            
            tema.setPalavra2("cueca"); 
            tema.setPorcentagem2(30);
            
            tema.setPalavra3("bone"); 
            tema.setPorcentagem3(13);
            
            tema.setPalavra4("barbeador"); 
            tema.setPorcentagem4(20);
            
            tema.setPalavra5("rola"); 
            tema.setPorcentagem5(5);
            
        // NÍVEL
            tema.setNivel(1);
            
        listaTemas.add(tema);
        
        // ====================================================================
        
        // TEMAS DE MODELAGEM DE VESTUARIO 8
        
        tema = new Tema();
        
        // PRIMEIRO TEMA
            tema.setTema("Material escolar");
            
        // PALAVRAS DESSE TEMA
            tema.setPalavra1("lapis"); 
            tema.setPorcentagem1(36);
            
            tema.setPalavra2("caderno"); 
            tema.setPorcentagem2(57);
            
            tema.setPalavra3("mochila"); 
            tema.setPorcentagem3(28);
            
            tema.setPalavra4("borracha"); 
            tema.setPorcentagem4(15);
            
            tema.setPalavra5("apontador"); 
            tema.setPorcentagem5(10);
            
        // NÍVEL
            tema.setNivel(1);
            
        listaTemas.add(tema);
        
        // ====================================================================
        
        // TEMAS DE JOGOS DIGITAIS 9
        
        tema = new Tema();
        
        // PRIMEIRO TEMA
            tema.setTema("Cinema");
            
        // PALAVRAS DESSE TEMA
            tema.setPalavra1("filme"); 
            tema.setPorcentagem1(60);
            
            tema.setPalavra2("pipoca"); 
            tema.setPorcentagem2(35);
            
            tema.setPalavra3("poltrona"); 
            tema.setPorcentagem3(20);
            
            tema.setPalavra4("namoro"); 
            tema.setPorcentagem4(15);
            
            tema.setPalavra5("projetor"); 
            tema.setPorcentagem5(5);
            
        // NÍVEL
            tema.setNivel(1);
            
        listaTemas.add(tema);
        
        // ====================================================================
        
        // TEMAS DE HOSPEDAGEM 10
        
        tema = new Tema();
        
        // PRIMEIRO TEMA
            tema.setTema("Praia");
            
        // PALAVRAS DESSE TEMA
            tema.setPalavra1("sol"); 
            tema.setPorcentagem1(46);
            
            tema.setPalavra2("areia"); 
            tema.setPorcentagem2(35);
            
            tema.setPalavra3("mar"); 
            tema.setPorcentagem3(25);
            
            tema.setPalavra4("turista"); 
            tema.setPorcentagem4(9);
            
            tema.setPalavra5("picole"); 
            tema.setPorcentagem5(15);
            
        // NÍVEL
            tema.setNivel(1);
            
        listaTemas.add(tema);
        
        
        // ================================================================
      
        //comercio exterior 11
        
         tema = new Tema();
        
        //  TEMA
            tema.setTema("Profissao");
            
        // PALAVRAS DESSE TEMA
            tema.setPalavra1("policia"); 
            tema.setPorcentagem1(56);
            
            tema.setPalavra2("medico"); 
            tema.setPorcentagem2(37);
            
            tema.setPalavra3("bombeiro"); 
            tema.setPorcentagem3(25);
            
            tema.setPalavra4("advogado"); 
            tema.setPorcentagem4(5);
            
            tema.setPalavra5("professor"); 
            tema.setPorcentagem5(20);
            
            // NÍVEL
            tema.setNivel(1);
            
        listaTemas.add(tema); 
       
    }
    
    /**
     * Retorna o tema selecionado pelo visitante ou aluno pela PRIMEIRA VEZ
     * @param tema
     * @return 
     */
    public Tema retornarTemaSelecionado(String tema)
     {
         
             // Retornando UM tema dentre os temas selecionados pelo visitante
         for(Tema temaDisponivel : listaTemas)
         {
             
             if(temaDisponivel.getTema().equals(tema))
             {
                 if(temaDisponivel.getNivel() == 1)
                 {
                     return temaDisponivel;
                 }
             }
         }

         return null;
     }
    
     /**
      * Retornar um NOVO tema de forma aleatório, ou seja, após o jogo já ter iniciado
      */
     public Tema retornarNovoTema(int tipoBusca, String cursoAluno, int nivelAtual)
     {
         ArrayList<Tema> listaTemaNivelAtual = new ArrayList();
         
         // Formando uma lista com os temas do nível atual do usuário
         listaTemaNivelAtual = retornarListaTemaAtual(tipoBusca, cursoAluno, nivelAtual);
         
         if(tipoBusca == 0) // SE O ALUNO FOR UM VISITANTE....
         {
             
             // Retornando UM tema
             return listaTemaNivelAtual.get((int)(Math.random()*listaTemaNivelAtual.size())); 
         }else
            {
                // SE O ALUNO FOR UM ALUNO DE UM CURSO DO CEET OU PROFESSOR, EXCLUÍNDO O CURSO DELE COMO UM DOS SORTEADOS
                String cursoSorteado = "";
                Tema temaSorteado;
                
                do
                {
                   temaSorteado = listaTemaNivelAtual.get((int)(Math.random()*listaTemaNivelAtual.size())); 
                   cursoSorteado = temaSorteado.getTema();
                   
                }while(cursoAluno.equalsIgnoreCase(cursoSorteado));
             
                return temaSorteado;
            }
     }
     
     
     private ArrayList<Tema> retornarListaTemaAtual(int tipoBusca, String cursoAluno, int nivelAtual)
     {
         ArrayList<Tema> listaTemp = new ArrayList();
         
         for(Tema tema : listaTemas)
         {
             System.out.println("TEMA: "+tema.getTema());
             if(nivelAtual == tema.getNivel())
             {
                 if(tipoBusca == 0) // SE for um visitante.... 
                 {
                    listaTemp.add(tema);
                 }else
                      // SE for um aluno, precisamos ignorar o tema do curso do mesmo
                      if(!cursoAluno.equals(tema.getTema()))
                      {
                          listaTemp.add(tema);
                      }
             }
             
         }
         
         return listaTemp;
     }
     
    
    
}

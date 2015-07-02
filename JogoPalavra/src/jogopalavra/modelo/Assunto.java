package jogopalavra.modelo;

import java.util.ArrayList;

public class Assunto {

    private int codAssunto;
    private String nomeAssunto;
    private ArrayList <Palavra> palavra = new ArrayList();

    public int getCodAssunto() {
        return codAssunto;
    }

    public void setCodAssunto(int codAssunto) {
        this.codAssunto = codAssunto;
    }

    public String getNomeAssunto() {
        return nomeAssunto;
    }

    public void setNomeAssunto(String nomeAssunto) {
        this.nomeAssunto = nomeAssunto;
    }

    public ArrayList <Palavra> getPalavra() {
        return palavra;
    }

    public void setPalavra(ArrayList <Palavra> palavra) {
        this.palavra = palavra;
    }
}

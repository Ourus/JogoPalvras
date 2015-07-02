
package jogopalavra.modelo;

public class Palavra
{
    private int codPalavra;
    private int codAssunto;
    private String palavra;
    private int contador;

    public int getCodPalavra() {
        return codPalavra;
    }

    public void setCodPalavra(int codPalavra) {
        this.codPalavra = codPalavra;
    }

    public int getCodAssunto() {
        return codAssunto;
    }

    public void setCodAssunto(int codAssunto) {
        this.codAssunto = codAssunto;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
}

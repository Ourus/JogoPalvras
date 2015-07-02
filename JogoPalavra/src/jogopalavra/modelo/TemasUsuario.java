
package jogopalavra.modelo;

import java.util.ArrayList;

public class TemasUsuario
{
    private int codUsuario;
    private int codAssunto;
    private ArrayList <Assunto> assunto = new ArrayList();
    private ArrayList <Usuario> usuario =new ArrayList();

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getCodAssunto() {
        return codAssunto;
    }

    public void setCodAssunto(int codAssunto) {
        this.codAssunto = codAssunto;
    }

    public ArrayList <Assunto> getAssunto() {
        return assunto;
    }

    public void setAssunto(ArrayList <Assunto> assunto) {
        this.assunto = assunto;
    }

    public ArrayList <Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList <Usuario> usuario) {
        this.usuario = usuario;
    }
    
}

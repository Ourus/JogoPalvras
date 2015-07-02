
package jogopalavra.modelo;

public class Usuario
{
    private int codUsuario;
    private String nome;
    private int qtdMoedas;
    private String senha;

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdMoedas() {
        return qtdMoedas;
    }

    public void setQtdMoedas(int qtdMoedas) {
        this.qtdMoedas = qtdMoedas;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}

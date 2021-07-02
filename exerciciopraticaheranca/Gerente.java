package exerciciopraticaheranca;

public class Gerente extends Funcionario {

    private String login;
    private String senha;


    public Gerente(String nome, double salario, String login, String senha) {
        super(nome, salario);
        this.login = login;
        this.senha = senha;
    }

    public Gerente(){
        super();
        this.login = null;
        this.senha = null;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +"GERENTE: " +
                "LOGIN: " + login + "\n" +
                "SENHA: " + senha + "\n";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

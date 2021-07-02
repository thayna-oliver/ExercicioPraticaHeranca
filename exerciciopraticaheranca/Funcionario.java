package exerciciopraticaheranca;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario() {
        this.nome = null;
        this.salario = 0;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "FUNCIONARIO: " +"\n"+
                "NOME: " + nome +"\n" +
                "SALARIO: " + salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

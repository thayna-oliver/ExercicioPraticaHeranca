package exerciciopraticaheranca;

public class Telefonista extends Funcionario {

    private int codigo;

    public Telefonista(String nome, double salario, int codigo) {
        super(nome, salario);
        this.codigo = codigo;
    }

    public Telefonista(){
        super();
        this.codigo = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+ "TELEFONISTA : " + "\n"+
                "CODIGO : " + codigo ;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

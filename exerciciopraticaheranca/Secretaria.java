package exerciciopraticaheranca;

public class Secretaria extends Funcionario {

    private int ramal;

    public Secretaria(String nome, double salario, int ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }

    public Secretaria(){
        super();
        this.ramal = 0;

    }

    @Override
    public String toString() {
        return super.toString() + "\n" +"SECRETARIA: " + "\n" +
                "RAMAL: " + ramal ;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}

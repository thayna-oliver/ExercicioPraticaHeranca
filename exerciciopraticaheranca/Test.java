package exerciciopraticaheranca;

public class Test {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Maria Franisca ", 3000);
        System.out.println("----------FUNCIONARIO-----------");
        System.out.println(funcionario.toString());


        Gerente gerente = new Gerente(" Ana Lucia", 4500, "login1020", "senha1020");
        System.out.println("----------GERENTE-----------");
        System.out.println(gerente.toString());

        Secretaria secretaria = new Secretaria("Julia Barbosa", 2000, 102);
        System.out.println("----------SECRETARIA-----------");
        System.out.println(secretaria.toString());

        Telefonista telefonista = new Telefonista("Joao Pedro", 1200, 1234);
        System.out.println("----------TELEFONISTA-----------");
        System.out.println(telefonista.toString());






    }
}

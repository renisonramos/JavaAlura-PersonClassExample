//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Definindo um Objeto Pessoa
        Pessoa renison = new Pessoa();
        renison.nome = "Renison Ramos";
        renison.email = "renisonramosnegociosonline@gmail.com";
        renison.cpf = "000000000-54";
        System.out.println(renison.exibirDados());

        // Definindo outro Objeto Pessoa
        Pessoa zeca = new Pessoa();
        zeca.nome = "Maria Jose";
        zeca.email = "zecacabral98@gmail.com";
        zeca.cpf = "000000000-78";
        System.out.println(zeca.exibirDados());

    }
}
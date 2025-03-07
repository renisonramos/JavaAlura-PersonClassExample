// Definindo uma classe (Caracteísticas | Propriedades)
    public class Pessoa {
        public String nome;
        public String email;
        public String cpf;

    public String exibirDados() {
        return "=== Dados da Pessoa ===" + "\n" +
                "Nome: " + this.nome + "\n" +
                "Email: " + this.email + "\n" +
                "CPF: " + this.cpf;
    }


}

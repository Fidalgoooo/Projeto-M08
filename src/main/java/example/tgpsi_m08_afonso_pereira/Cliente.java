package example.tgpsi_m08_afonso_pereira;

// Classe Cliente que extends (herança) da classe Pessoa
public class Cliente extends Pessoa {
    // Atributos privados da classe Cliente
    private String endereco;  // Variável para armazenar o endereço do cliente
    private String telefone;  // Variável para armazenar o telefone do cliente

    // Construtor da classe Cliente que recebe informações específicas do cliente
    public Cliente(int id,String nome, String email, String telefone, String endereco) {
        super(id, nome, email); // Chama o construtor da classe pai (Pessoa) para inicializar os atributos herdados
        this.telefone = telefone; // Inicializa o telefone do cliente
        this.endereco = endereco; // Inicializa o endereço do cliente
    }

    // Métodos Getters e Setters específicos para os atributos adicionais da classe Cliente

    // Getter para obter o endereço do cliente
    public String getEndereco() {
        return endereco;
    }

    // Setter para definir ou modificar o endereço do cliente
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Getter para obter o telefone do cliente
    public String getTelefone() {
        return telefone;
    }

    // Setter para definir ou modificar o telefone do cliente
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

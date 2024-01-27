package example.tgpsi_m08_afonso_pereira;

public class Pessoa {
    // Atributos privados da classe Pessoa
    private int id; // ID
    private String nome;  // Variável para armazenar o nome da pessoa
    private String email; // Variável para armazenar o email da pessoa

    // Construtor da classe Pessoa que recebe o ID, nome e email como parâmetros
    public Pessoa(int id,String nome,String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    // Métodos Getters e Setters para acessar e modificar os atributos privados
    public int getId() {
        return id;
    }

    public Pessoa(int id) {
        this.id = id;
    }

    // Getter para obter o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Setter para definir ou modificar o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para obter o email da pessoa
    public String getEmail() {
        return email;
    }

    // Setter para definir ou modificar o email da pessoa
    public void setEmail(String email) {
        this.email = email;
    }

}
package example.tgpsi_m08_afonso_pereira;

// Classe Carro
public class Carro {
    // Atributos privados da classe Carro
    private int idCarro; // Variável para armazenar o id do carro
    private String marca;   // Variável para armazenar a marca do carro
    private String modelo;  // Variável para armazenar o modelo do carro
    private int ano;  // Variável para armazenar o ano do carro
    private String dataInicioAluguer; // Variável para armazenar a data de início do aluguer
    private String dataFimAluguer;    // Variável para armazenar a data de término do aluguer

    // Construtor da classe Carro que recebe ID, marca, modelo e ano como parâmetros
    public Carro(int idCarro, String marca, String modelo, int ano, String dataInicioAluguer, String dataFimAluguer) {
        this.idCarro = idCarro;
        this.marca = marca;     // Inicializa a marca do carro
        this.modelo = modelo;   // Inicializa o modelo do carro
        this.ano = ano;         // Inicializa o ano do carro
        this.dataInicioAluguer = dataInicioAluguer;
        this.dataFimAluguer = dataFimAluguer;
    }

    // Métodos Getters e Setters para acessar e modificar os atributos privados

    public int getIdCarro() {
        return idCarro;
    }

    public Carro(int idCarro)    {
        this.idCarro = idCarro;
    }

    public String getMarca() {
        return marca;
    }

    // Setter para definir ou modificar a marca do carro
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para obter o modelo do carro
    public String getModelo() {
        return modelo;
    }

    // Setter para definir ou modificar o modelo do carro
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter para obter o ano do carro
    public int getAno() {
        return ano;
    }

    // Setter para definir ou modificar o ano do carro
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDataInicio() {
        return dataInicioAluguer;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicioAluguer = dataInicio;
    }

    public String getDataFim() {
        return dataFimAluguer;
    }

    public void setDataFim(String dataFim) {
        this.dataFimAluguer = dataFim;
    }
}

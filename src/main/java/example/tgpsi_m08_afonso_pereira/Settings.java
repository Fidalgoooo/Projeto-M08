package example.tgpsi_m08_afonso_pereira;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

public class Settings {
    private static Stage primaryStage;

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void setPrimaryStage(Stage primaryStage) {
        Settings.primaryStage = primaryStage;
    }
    protected static ObservableList<Carro> listaCarro = FXCollections.observableArrayList();
    public static ObservableList<Carro> getListacarro() {
        return listaCarro;
    }
    protected static ObservableList<Cliente> listaCliente = FXCollections.observableArrayList();
    public static ObservableList<Funcionario> getListaFuncionaro() {
        return listaFuncionario;
    }
    protected static ObservableList<Funcionario> listaFuncionario = FXCollections.observableArrayList();

    public static ObservableList<Cliente> getListaCliente() {
        return listaCliente;
    }
    private static Carro CarroEdit;
    private static Cliente ClienteEdit;
    private static Funcionario FuncionarioEdit;
    public static Cliente getClienteEdit() {
        return ClienteEdit;
    }

    public static void setFuncionarioEdit(Funcionario FuncionarioEdit) {
        FuncionarioEdit = FuncionarioEdit;}

    public static Funcionario getFuncionarioEdit() {
        return FuncionarioEdit;
    }

    public static void setClienteEdit(Cliente ClienteEdit) {
        ClienteEdit = ClienteEdit;
    }
    public static Carro getcarroEdit() {
        return CarroEdit;
    }

    public static void setcarroEdit(Carro CarroEdit) {
        CarroEdit = CarroEdit;
    }
    public static void Listacarro() {
        listaCarro.add(new Carro(1,"Toyota", "Corolla", 2022, "01/01/2023", "01/02/2023" ));
        listaCarro.add(new Carro(2,"Honda", "Civic", 2021, "15/03/2023", "15/04/2023"));
        listaCarro.add(new Carro(3,"Ford", "Fusion", 2020, "10/05/2023", "10/06/2023"));
        listaCarro.add(new Carro(4,"Chevrolet", "Cruze", 2019, "20/07/2023", "20/08/2023"));
        listaCarro.add(new Carro(5,"Volkswagen", "Jetta", 2018, "05/09/2023", "05/10/2023"));
        listaCarro.add(new Carro(6,"Nissan", "Sentra", 2017, "15/11/2023", "15/12/2023"));
        listaCarro.add(new Carro(7,"Hyundai", "Elantra", 2016, "01/01/2024", "01/02/2024"));
        listaCarro.add(new Carro(8,"Kia", "Optima", 2015, "15/03/2024", "15/04/2024"));
        listaCarro.add(new Carro(9,"Mazda", "Mazda6", 2014, "10/05/2024", "10/06/2024"));
        listaCarro.add(new Carro(10,"Subaru", "Legacy", 2013, "20/07/2024", "20/08/2024"));

    }

    public static void ListaCiente() {
        listaCliente.add(new Cliente(1,"João Silva", "joao@icloud.com", "123456789", "Rua Principal, 123"));
        listaCliente.add(new Cliente(2,"Maria Oliveira", "maria@icloud.com", "987654321", "Avenida Secundária, 456"));
        listaCliente.add(new Cliente(3,"Pedro Santos", "pedro@icloud.com", "111222333", "Travessa Estreita, 789"));
        listaCliente.add(new Cliente(4,"Ana Pereira", "ana@icloud.com", "444555666", "Praça Central, 012"));
        listaCliente.add(new Cliente(5,"Carlos Souza", "carlos@icloud.com", "777888999", "Alameda Larga, 345"));
        listaCliente.add(new Cliente(6,"Laura Costa", "laura@icloud.com", "333222111", "Estrada Velha, 678"));
        listaCliente.add(new Cliente(7,"Rafael Lima", "rafael@icloud.com", "555444333", "Avenida Nova, 901"));
        listaCliente.add(new Cliente(8,"Juliana Rodrigues", "juliana@icloud.com", "999888777", "Rua do Comércio, 234"));
        listaCliente.add(new Cliente(9,"Fernando Almeida", "fernando@icloud.com", "666777888", "Travessa dos Artistas, 567"));
        listaCliente.add(new Cliente(10,"Mariana Vieira", "mariana@icloud.com", "222111000", "Praça dos Esportes, 890"));
    }

    public static void ListaFuncionario(){
        listaFuncionario.add(new Funcionario(1,"João Marques", "joao@icloud.com", "Dono", 5000));
        listaFuncionario.add(new Funcionario(2,"António Farbitnyk", "antonio@icloud.com", "Supervisor", 4000));
        listaFuncionario.add(new Funcionario(3,"Andre Ventura", "andre@icloud.com", "Chefe de loja", 3000));
        listaFuncionario.add(new Funcionario(4,"Ricardo Santos", "ricardo@icloud.com", "Porteiro", 3000));
        listaFuncionario.add(new Funcionario(5,"Alexandre Costa", "alexandre@icloud.com", "Segurança", 3500));
        listaFuncionario.add(new Funcionario(6,"Laura Almeida", "laura@icloud.com", "Sub-Chefe", 2500));
        listaFuncionario.add(new Funcionario(7,"Gabriel Lima", "gabriel@icloud.com", "Mecanico", 2800));
        listaFuncionario.add(new Funcionario(8,"João Sousa", "joao@icloud.com", "Secretário", 2700));
        listaFuncionario.add(new Funcionario(9,"Tiago Silva", "tiago@icloud.com", "Assistente", 2600));
        listaFuncionario.add(new Funcionario(10,"Otacilio Alves", "otacilio@icloud.com", "Limpeza", 100));
    }
}
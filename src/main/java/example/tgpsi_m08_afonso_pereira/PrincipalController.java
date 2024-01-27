package example.tgpsi_m08_afonso_pereira;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import static example.tgpsi_m08_afonso_pereira.Settings.*;

public class PrincipalController implements Initializable {

// Carro //

    @FXML
    private TextField txt_IdCarro_Carro;

    @FXML
    private TextField txt_Marca_Carro;

    @FXML
    private TextField txt_Modelo_Carro;

    @FXML
    private TextField txt_Ano_Carro;

    @FXML
    private TextField txt_InicioAluguer_Carro;

    @FXML
    private TextField txt_FimAluguer_Carro;

    @FXML
    private TableView TableViewCarro;

    @FXML
    private TableColumn Tabela_Id;

    @FXML
    private TableColumn Tabela_Marca;

    @FXML
    private TableColumn Tabela_Modelo;

    @FXML
    private TableColumn Tabela_Ano;

    @FXML
    private TableColumn Tabela_InicioAluguer;

    @FXML
    private TableColumn Tabela_FimAluguer;

    @FXML
    private AnchorPane Tela_Carro;

    @FXML
    private Button btnAdicionarCarro;

    @FXML
    private Button btnEditarCarro;

    @FXML
    private Button btnEliminarCarro;

// Cliente //

    @FXML
    private TextField txt_Id_Cliente;

    @FXML
    private TableView TableViewCliente;

    @FXML
    private TableColumn Tabela_Id_Cliente;

    @FXML
    private TableColumn Tabela_Nome_Cliente;

    @FXML
    private TableColumn Tabela_Email_Cliente;

    @FXML
    private TableColumn Tabela_Telefone_Cliente;

    @FXML
    private TableColumn Tabela_Endereco_Cliente;

    @FXML
    private AnchorPane Tela_Cliente;

    @FXML
    private TextField txt_Nome_Cliente;

    @FXML
    private TextField txt_Email_Cliente;

    @FXML
    private TextField txt_Telefone_Cliente;

    @FXML
    private TextField txt_Endereco_Cliente;

    @FXML
    private Button btnAdicionarCliente;

    @FXML
    private Button btnEditarCliente;

    @FXML
    private Button btnEliminarCliente;

// Funcionario //

    @FXML
    private TextField txt_Idfuncionario_Funcionario;

    @FXML
    private TableView TableViewFuncionario;

    @FXML
    private TableColumn Tabela_Id_Funcionario;

    @FXML
    private TableColumn Tabela_Nome_Funcionario;

    @FXML
    private TableColumn Tabela_Email_Funcionario;

    @FXML
    private TableColumn Tabela_Cargo_Funcionario;

    @FXML
    private TableColumn Tabela_Salario_Funcionario;

    @FXML
    private AnchorPane Tela_Funcionario;

    @FXML
    private TextField txt_Nome_Funcionario;

    @FXML
    private TextField txt_Email_Funcionario;

    @FXML
    private TextField txt_Cargo_Funcionario;

    @FXML
    private TextField txt_Salario_Funcionario;

    @FXML
    private Button btn_Adicionar_Funcionario;

    @FXML
    private Button btn_Editar_Funcionario;

    @FXML
    private Button btnEliminar_Funcionario;

//Botões
    @FXML
    private Button btnCarro;

    @FXML
    private Button btnCliente;

    @FXML
    private Button btnFuncionario;

    @FXML
    private Button btnSobreMim;

    @FXML
    private Button btnSair;

// Acerca De //

    @FXML
    private AnchorPane Tela_AcercaDe;
    public void btnCarroEntered() {
        btnCarro.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnCarroExited() {
        btnCarro.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnAcercaDeEntered() {
        btnSobreMim.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnAcercaDeExited() {
        btnSobreMim.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnClienteEntered() {
        btnCliente.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnClienteExited() {
        btnCliente.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnFuncionarioEntered() {
        btnFuncionario.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnFuncionarioExited() {
        btnFuncionario.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnSairEntered() {
        btnSair.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnSairExited() {
        btnSair.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }
    public void btnAdicionarClienteEntered(){
        btnAdicionarCliente.setStyle("-fx-background-color: #999999; -fx-background-radius: 4px; -fx-text-fill: #000;");
    }
    public void btnAdicionarClienteExited(){
        btnAdicionarCliente.setStyle("-fx-background-color: #333333; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }
    public void btnEditarClienteEntered() {
        btnEditarCliente.setStyle("-fx-background-color: #999999; -fx-background-radius: 4px; -fx-text-fill: #000;");
    }
    public void btnEditarClienteExited() {
        btnEditarCliente.setStyle("-fx-background-color: #333333; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }
    public void btnEliminarClienteEntered() {
        btnEliminarCliente.setStyle("-fx-background-color: #999999; -fx-background-radius: 4px; -fx-text-fill: #000;");
    }
    public void btnEliminarClienteExited() {
        btnEliminarCliente.setStyle("-fx-background-color: #333333; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }
    public void btn_Adicionar_Funcionario_Entered(){
        btn_Adicionar_Funcionario.setStyle("-fx-background-color: #9794ac; -fx-background-radius: 5px; -fx-text-fill: #000;");
    }
    public void btn_Adicionar_Funcionario_Exited(){
        btn_Adicionar_Funcionario.setStyle("-fx-background-color: #919de6; -fx-background-radius: 5px; -fx-text-fill: #fff;");

    }
    public void btn_Editar_Funcionario_Entered(){
        btn_Editar_Funcionario.setStyle("-fx-background-color: #9794ac; -fx-background-radius: 5px; -fx-text-fill: #000;");

    }
    public void btn_Editar_Funcionario_Exited(){
        btn_Editar_Funcionario.setStyle("-fx-background-color: #919de6; -fx-background-radius: 5px; -fx-text-fill: #fff;");

    }
    public void btnEliminar_Funcionario_Entered(){
        btnEliminar_Funcionario.setStyle("-fx-background-color: #9794ac; -fx-background-radius: 5px; -fx-text-fill: #000;");

    }
    public void btnEliminar_Funcionario_Exited(){
        btnEliminar_Funcionario.setStyle("-fx-background-color: #919de6; -fx-background-radius: 5px; -fx-text-fill: #fff;");
    }

    public void sair() throws Exception {
            Platform.exit();
    }
    public void btnCliente_On_Action() {
        Tela_Cliente.setVisible(true);
        Tela_Carro.setVisible(false);
        Tela_Funcionario.setVisible(false);
        Tela_AcercaDe.setVisible(false);
    }
    public void btnCarro_On_Action() {
        Tela_Cliente.setVisible(false);
        Tela_Carro.setVisible(true);
        Tela_Funcionario.setVisible(false);
        Tela_AcercaDe.setVisible(false);
    }
    public void Funcionario_On_Action() {
        Tela_Cliente.setVisible(false);
        Tela_Carro.setVisible(false);
        Tela_Funcionario.setVisible(true);
        Tela_AcercaDe.setVisible(false);
    }
    public void SobreMim_On_Action(){
        Tela_Cliente.setVisible(false);
        Tela_Carro.setVisible(false);
        Tela_Funcionario.setVisible(false);
        Tela_AcercaDe.setVisible(true);
    }

    public void TabelaFuncionar() {
        TableViewFuncionario.setItems(Settings.getListaFuncionaro());
        Tabela_Id_Funcionario.setCellValueFactory(new PropertyValueFactory<Funcionario, Integer>("ID"));
        Tabela_Nome_Funcionario.setCellValueFactory(new PropertyValueFactory<Funcionario, String>("Nome"));
        Tabela_Email_Funcionario.setCellValueFactory(new PropertyValueFactory<Funcionario, String>("Email"));
        Tabela_Cargo_Funcionario.setCellValueFactory(new PropertyValueFactory<Funcionario, String>("Cargo"));
        Tabela_Salario_Funcionario.setCellValueFactory(new PropertyValueFactory<Funcionario, String>("Salário"));
    }

    public void TabelaCarro() {
        TableViewCarro.setItems(Settings.getListacarro());
        Tabela_Marca.setCellValueFactory(new PropertyValueFactory<Carro, String>("Marca"));
        Tabela_Modelo.setCellValueFactory(new PropertyValueFactory<Carro, String>("Modelo"));
        Tabela_Ano.setCellValueFactory(new PropertyValueFactory<Carro, Integer>("Ano"));
        Tabela_InicioAluguer.setCellValueFactory(new PropertyValueFactory<Carro, String>("Inicio"));
        Tabela_FimAluguer.setCellValueFactory(new PropertyValueFactory<Carro, String>("Fim"));
    }

    public void TabelaCliente() {
        TableViewCliente.setItems(Settings.getListaCliente());
        Tabela_Id_Cliente.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("ID"));
        Tabela_Nome_Cliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Nome"));
        Tabela_Email_Cliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Email"));
        Tabela_Telefone_Cliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Telefone"));
        Tabela_Endereco_Cliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Endereço"));
    }


    public void ClienteVerInfo() {
        Cliente clienteData = (Cliente) TableViewCliente.getSelectionModel().getSelectedItem();
        txt_Id_Cliente.setText(String.valueOf(clienteData.getId()));
        txt_Nome_Cliente.setText(clienteData.getNome());
        txt_Email_Cliente.setText(clienteData.getEmail());
        txt_Telefone_Cliente.setText(String.valueOf(clienteData.getTelefone()));
        txt_Endereco_Cliente.setText(clienteData.getEndereco());
    }

    public void CarroVerInfo() {
        Carro carroData = (Carro) TableViewCarro.getSelectionModel().getSelectedItem();
        txt_IdCarro_Carro.setText(String.valueOf(carroData.getIdCarro()));
        txt_Marca_Carro.setText(carroData.getMarca());
        txt_Modelo_Carro.setText(carroData.getModelo());
        txt_Ano_Carro.setText(String.valueOf(carroData.getAno()));
        txt_InicioAluguer_Carro.setText(carroData.getDataInicio());
        txt_FimAluguer_Carro.setText(carroData.getDataFim());
    }

    public void FuncionarVerInfo() {
        Funcionario funcionarioData = (Funcionario) TableViewFuncionario.getSelectionModel().getSelectedItem();
        txt_Idfuncionario_Funcionario.setText(String.valueOf(funcionarioData.getIdFuncionario()));
        txt_Nome_Funcionario.setText(String.valueOf(funcionarioData.getNome()));
        txt_Email_Funcionario.setText(funcionarioData.getEmail());
        txt_Cargo_Funcionario.setText(funcionarioData.getCargo());
        txt_Salario_Funcionario.setText(String.valueOf(funcionarioData.getSalario()));
    }


    //Esse é o metodo que criei e o nome eu adicionei no action do butão
    public void AdicionarAction() {
        // Verifica se algum TextField está vazio e exibe um alerta em caso positivo
        if (txt_IdCarro_Carro.getText().isEmpty()
                || txt_Marca_Carro.getText().isEmpty()
                || txt_Modelo_Carro.getText().isEmpty()
                || txt_Ano_Carro.getText().isEmpty()
                || txt_InicioAluguer_Carro.getText().isEmpty()
                || txt_FimAluguer_Carro.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Atenção");
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            // Obtém os valores dos campos
            int novoIdcarro = Integer.parseInt(txt_IdCarro_Carro.getText());
            String novoMarca = txt_Marca_Carro.getText();
            String novoModelo = txt_Modelo_Carro.getText();
            int novoAno = Integer.parseInt(txt_Ano_Carro.getText());
            String novoDataInicioAluguer = txt_InicioAluguer_Carro.getText();
            String novoDataFimAluguer = txt_FimAluguer_Carro.getText();

            // Verifica se o ID já existe na lista
            if (listaCarro.stream().anyMatch(c -> c.getIdCarro() == novoIdcarro)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erro");
                alert.setHeaderText(null);
                alert.setContentText("Esse ID já foi inserido");
                alert.showAndWait();
            } else {
                // Pergunta se deseja realmente adicionar em um alerta
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Adicionar");
                // Mostra o que será adicionado no alerta
                alert.setHeaderText("Deseja mesmo Adicionar?" + "\n" + "ID: " + novoIdcarro + "\n" + "Marca: " + novoMarca
                        + "\n" + "Modelo: " + novoModelo + "\n" + "Ano: " + novoAno + "\n" + "Inicio Aluguer: "
                        + novoDataInicioAluguer + "\n" + "Fim Aluguer: " + novoDataFimAluguer);
                // Adiciona botões personalizados em português
                ButtonType botaoSim = new ButtonType("Sim");
                ButtonType botaoNao = new ButtonType("Não");
                alert.getButtonTypes().setAll(botaoSim, botaoNao);
                Optional<ButtonType> choose = alert.showAndWait();

                if (choose.isPresent() && choose.get() == botaoSim) {
                    // Se escolher sim, adiciona à lista e avisa que foi inserido
                    listaCarro.add(new Carro(novoIdcarro, novoMarca, novoModelo, novoAno, novoDataInicioAluguer,
                            novoDataFimAluguer));
                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("Informação");
                    alert1.setHeaderText(null);
                    alert1.setContentText("O seu Carro foi inserido");
                    alert1.showAndWait();
                } else {
                    // Se for cancelado, também exibe um aviso
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Informação");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Cancelado com Sucesso");
                    alert2.showAndWait();
                }
            }
        }
    }

    public void AdicionarCienteAction() {
        if (txt_Id_Cliente.getText().isEmpty()
                || txt_Nome_Cliente.getText().isEmpty()
                || txt_Email_Cliente.getText().isEmpty()
                || txt_Endereco_Cliente.getText().isEmpty()
                || txt_Telefone_Cliente.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Atenção");
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            // pega o Id da textFild do id
            int novoId = Integer.parseInt(txt_Id_Cliente.getText());
            // Verificar se o ID já existe na lista
            if (listaCliente.stream().anyMatch(p -> p.getId() == novoId)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erro");
                alert.setHeaderText("Atenção");
                alert.setContentText("Esse ID já foi inserido");
                alert.showAndWait();
            } else {
                //Se não tiver ele pega o que está escrito e selecionado de cada caixa e mete num variavel
                String novoNome = txt_Nome_Cliente.getText();
                String novoEmail = txt_Email_Cliente.getText();
                String novoEndereco = txt_Endereco_Cliente.getText();
                String novoTelefone = txt_Telefone_Cliente.getText();

                // Pergunta se quer mesmo adicionar numa alert
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Adicionar");
                //Mostra o que ele vai adicionar no alet
                alert.setHeaderText("Deseja mesmo Adicionar?"+"\n"+"ID: " + novoId + "\n" + "Nome: " + novoNome + "\n" + "Email: " + novoEmail + "\n" + "Endereço: " + novoEndereco + "\n" + "Número de Telefone: " + novoTelefone );
                // Adiciona botões personalizados em português
                ButtonType botaoSim = new ButtonType("Sim");
                ButtonType botaoNao = new ButtonType("Não");
                alert.getButtonTypes().setAll(botaoSim, botaoNao);
                Optional<ButtonType> choose = alert.showAndWait();
                if (choose.get() == botaoSim) {
                    //Se ele escolher sim ele adicionar a lista e avisa que foi inserido
                    listaCliente.add(new Cliente(novoId, novoNome, novoEmail, novoEndereco, novoTelefone));
                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("Informação");
                    alert1.setHeaderText(null);
                    alert1.setContentText("O Cliente foi inserido");
                    alert1.showAndWait();
                } else {
                    //Se for cancelado ele avisa tmb
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Informação");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Cancelado com Sucesso");
                    alert2.showAndWait();
                }
            }
        }
    }

    public void Adicionar_Funcionario_On_Action() {
        if (txt_Idfuncionario_Funcionario.getText().isEmpty()
                || txt_Nome_Funcionario.getText().isEmpty()
                || txt_Email_Funcionario.getText().isEmpty()
                || txt_Cargo_Funcionario.getText().isEmpty()
                || txt_Salario_Funcionario.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            // Pega os valores dos campos
            int novoId = Integer.parseInt(txt_Idfuncionario_Funcionario.getText());
            String novoNome = txt_Nome_Funcionario.getText();
            String novoEmail = txt_Email_Funcionario.getText();
            String novoCargo = txt_Cargo_Funcionario.getText();
            int novoSalario = Integer.parseInt(txt_Salario_Funcionario.getText());

            // Verificar se o ID já existe na lista
            if (listaFuncionario.stream().anyMatch(f -> f.getIdFuncionario() == novoId)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erro");
                alert.setHeaderText(null);
                alert.setContentText("Esse ID já foi inserido");
                alert.showAndWait();
            } else {
                // Mostra um alerta de confirmação
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Adicionar");
                alert.setHeaderText("Deseja mesmo Adicionar?\nID:" + novoId + "\nNome: " + novoNome
                        + "\nEmail: " + novoEmail + "\nCargo: " + novoCargo + "\nSalário: " + novoSalario);
                ButtonType botaoSim = new ButtonType("Sim");
                ButtonType botaoNao = new ButtonType("Não");
                alert.getButtonTypes().setAll(botaoSim, botaoNao);
                Optional<ButtonType> choose = alert.showAndWait();

                if (choose.isPresent() && choose.get() == botaoSim) {
                    // Adiciona o novo funcionário à lista
                    listaFuncionario.add(new Funcionario(novoId, novoNome, novoEmail, novoCargo, novoSalario));
                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("Informação");
                    alert1.setHeaderText(null);
                    alert1.setContentText("O Funcionario foi inserido");
                    alert1.showAndWait();
                } else {
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Informação");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Cancelado com Sucesso");
                    alert2.showAndWait();
                }
            }
        }
    }


    public void EditarAction() {
        if (txt_Marca_Carro.getText().isEmpty()
                || txt_Modelo_Carro.getText().isEmpty()
                || txt_Ano_Carro.getText().isEmpty()
                || txt_InicioAluguer_Carro.getText().isEmpty()
                || txt_FimAluguer_Carro.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Atenção");
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            Carro carroEdit = null;
            int novoIdcarro = Integer.parseInt(txt_IdCarro_Carro.getText());
            for (Carro c : Settings.getListacarro()) {
                if (c.getIdCarro() == novoIdcarro) {
                    carroEdit = c;
                    break;
                }
            }
            if (carroEdit != null) {
                carroEdit.setModelo(txt_Modelo_Carro.getText());
                carroEdit.setMarca(txt_Marca_Carro.getText());
                carroEdit.setAno(Integer.parseInt(txt_Ano_Carro.getText()));
                carroEdit.setDataInicio(txt_InicioAluguer_Carro.getText());
                carroEdit.setDataFim(txt_FimAluguer_Carro.getText());

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Editar");
                alert.setHeaderText("Deseja mesmo Editar?");
                ButtonType botaoSim = new ButtonType("Sim");
                ButtonType botaoNao = new ButtonType("Não");
                alert.getButtonTypes().setAll(botaoSim, botaoNao);
                Optional<ButtonType> choose = alert.showAndWait();

                if (choose.isPresent() && choose.get() == botaoSim) {
                    setcarroEdit(carroEdit);
                    TableViewCarro.refresh();

                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("Informação");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Edição bem-sucedida");
                    alert1.showAndWait();
                } else {
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Informação");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Cancelado com Sucesso");
                    alert2.showAndWait();
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erro");
                alert.setHeaderText(null);
                alert.setContentText("Esse ID não foi encontrado");
                alert.showAndWait();
            }
        }
    }

    public void EditarClienteAction() {
        if (txt_Id_Cliente.getText().isEmpty()
                || txt_Nome_Cliente.getText().isEmpty()
                || txt_Email_Cliente.getText().isEmpty()
                || txt_Telefone_Cliente.getText().isEmpty()
                || txt_Endereco_Cliente.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            Cliente ClienteEdit = null;
            int novoId = Integer.parseInt(txt_Id_Cliente.getText());
            for (Cliente c : Settings.getListaCliente()) {
                if (c.getId() == novoId) {
                    ClienteEdit = c;
                    break;
                }
            }
            if (ClienteEdit != null) {
                ClienteEdit.setNome(txt_Nome_Cliente.getText());
                ClienteEdit.setEndereco(txt_Endereco_Cliente.getText());
                ClienteEdit.setTelefone(txt_Telefone_Cliente.getText());

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Editar");
                alert.setHeaderText("Deseja mesmo Editar?");
                ButtonType botaoSim = new ButtonType("Sim");
                ButtonType botaoNao = new ButtonType("Não");
                alert.getButtonTypes().setAll(botaoSim, botaoNao);
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);

                alert1.setTitle("Informação");
                alert1.setHeaderText(null);
                Optional<ButtonType> choose = alert.showAndWait();
                if (choose.get() == botaoSim) {
                    setClienteEdit(ClienteEdit);
                    TableViewCliente.refresh();
                    alert1.setContentText("Edição bem-sucedida");
                    alert1.showAndWait();
                } else {
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Informação");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Cancelado com Sucesso");
                    alert2.showAndWait();
                }
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erro");
                alert.setHeaderText(null);
                alert.setContentText("Esse ID não foi encontrado");
                alert.showAndWait();}
        }
    }

    public void Editar_Funcionario_On_Action() {
        if (txt_Idfuncionario_Funcionario.getText().isEmpty()
                || txt_Nome_Funcionario.getText().isEmpty()
                || txt_Email_Funcionario.getText().isEmpty()
                || txt_Cargo_Funcionario.getText().isEmpty()
                || txt_Salario_Funcionario.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            Funcionario funcionarioEdit = null;
            int novoId = Integer.parseInt(txt_Idfuncionario_Funcionario.getText());
            for (Funcionario f : Settings.getListaFuncionaro()) {
                if (f.getIdFuncionario() == novoId) {
                    funcionarioEdit = f;
                    break;
                }
            }
            if (funcionarioEdit != null) {
                funcionarioEdit.setNome(txt_Nome_Funcionario.getText());
                funcionarioEdit.setEmail(txt_Email_Funcionario.getText());
                funcionarioEdit.setCargo(txt_Cargo_Funcionario.getText());

                try {
                    // Intenta parsear el salario a un entero
                    int novoSalario = Integer.parseInt(txt_Salario_Funcionario.getText());
                    funcionarioEdit.setSalario(novoSalario);

                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Editar");
                    alert.setHeaderText("Deseja mesmo Editar?");
                    ButtonType botaoSim = new ButtonType("Sim");
                    ButtonType botaoNao = new ButtonType("Não");
                    alert.getButtonTypes().setAll(botaoSim, botaoNao);

                    Optional<ButtonType> choose = alert.showAndWait();
                    if (choose.isPresent() && choose.get() == botaoSim) {
                        setFuncionarioEdit(funcionarioEdit);
                        TableViewFuncionario.refresh();

                        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                        alert1.setTitle("Informação");
                        alert1.setHeaderText(null);
                        alert1.setContentText("Edição bem-sucedida");
                        alert1.showAndWait();
                    } else {
                        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                        alert2.setTitle("Informação");
                        alert2.setHeaderText(null);
                        alert2.setContentText("Cancelado com Sucesso");
                        alert2.showAndWait();
                    }
                } catch (NumberFormatException e) {
                    // Si ocurre una excepción al intentar parsear el salario, muestra un mensaje de error
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Erro");
                    alert.setHeaderText(null);
                    alert.setContentText("Por favor, insira um valor válido para o Salário");
                    alert.showAndWait();
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erro");
                alert.setHeaderText(null);
                alert.setContentText("Esse ID não foi encontrado");
                alert.showAndWait();
            }
        }
    }




    public void EliminarAction(){
        if (txt_IdCarro_Carro.getText().isEmpty()
                || txt_Marca_Carro.getText().isEmpty()
                || txt_Modelo_Carro.getText().isEmpty()
                || txt_Ano_Carro.getText().isEmpty()
                || txt_InicioAluguer_Carro.getText().isEmpty()
                || txt_FimAluguer_Carro.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Por favor selecione algum Carro da tabela");
            alert.showAndWait();}
        else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Eliminar");
            alert.setHeaderText("Deseja mesmo Eliminar?"+"\n"+"ID: " + txt_IdCarro_Carro.getText() + "\n" + "Marca: " + txt_Marca_Carro.getText() + "\n" + "Modelo: " + txt_Modelo_Carro.getText() + "\n" + "Ano: " + txt_Ano_Carro.getText()+ "\n" + "Data Inicio Aluguer: " + txt_InicioAluguer_Carro.getText() + "\n" + "Data Fim Aluguer: " + txt_FimAluguer_Carro.getText());
            ButtonType botaoSim = new ButtonType("Sim");
            ButtonType botaoNao = new ButtonType("Não");
            alert.getButtonTypes().setAll(botaoSim, botaoNao);
            Optional<ButtonType> choose = alert.showAndWait();
            if (choose.get() == botaoSim) {
                int novoId = Integer.parseInt(txt_IdCarro_Carro.getText());
                for (Carro c : listaCarro) {
                    if (c.getIdCarro() == novoId) {
                        Settings.getListacarro().remove(c);
                        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                        alert1.setTitle("Information");
                        alert1.setHeaderText(null);
                        alert1.setContentText("O seu Carro foi Eliminado");
                        alert1.showAndWait();
                        break;
                    }
                }
            }
            else{
                Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                alert2.setTitle("Informação");
                alert2.setHeaderText(null);
                alert2.setContentText("Cancelado com Sucesso");
                alert2.showAndWait();

            }
        }
    }

    public void EliminarClienteAction() {
        if (txt_Id_Cliente.getText().isEmpty()
                || txt_Nome_Cliente.getText().isEmpty()
                || txt_Email_Cliente.getText().isEmpty()
                || txt_Telefone_Cliente.getText().isEmpty()
                || txt_Endereco_Cliente.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Eliminar");
            alert.setHeaderText("Deseja mesmo Eliminar?"+"\n"+"ID: " + txt_Id_Cliente.getText() + "\n" + "Nome: " + txt_Nome_Cliente.getText() + "\n" + "Email: " + txt_Email_Cliente.getText() + "\n" + "Telefone: " + txt_Telefone_Cliente + "\n" + "Endereço: " + txt_Endereco_Cliente.getText());
            ButtonType botaoSim = new ButtonType("Sim");
            ButtonType botaoNao = new ButtonType("Não");
            alert.getButtonTypes().setAll(botaoSim, botaoNao);
            Optional<ButtonType> choose = alert.showAndWait();
            if (choose.get() == botaoSim) {
                int novoId = Integer.parseInt(txt_Id_Cliente.getText());
                for (Cliente c : listaCliente) {
                    if (c.getId() == novoId) {
                        Settings.getListaCliente().remove(c);
                        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                        alert1.setTitle("Informação");
                        alert1.setHeaderText(null);
                        alert1.setContentText("O Cliente foi Eliminado");
                        alert1.showAndWait();
                        break;
                    }
                }
            }
            else{
                Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                alert2.setTitle("Informação");
                alert2.setHeaderText(null);
                alert2.setContentText("Cancelado com Sucesso");
                alert2.showAndWait();

            }
        }
    }

    public void Eliminar_Funcionario_On_Action(){
        if (txt_Idfuncionario_Funcionario.getText().isEmpty()
                || txt_Nome_Funcionario.getText().isEmpty()
                || txt_Email_Funcionario.getText().isEmpty()
                || txt_Cargo_Funcionario.getText().isEmpty()
                || txt_Salario_Funcionario.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Por favor selecione algum Funcionario da tabela");
            alert.showAndWait();}
        else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Eliminar");
            alert.setHeaderText("Deseja mesmo Eliminar?"+"\n" + "ID: " +txt_Idfuncionario_Funcionario.getText() + "\n" + "Nome: " + txt_Nome_Funcionario.getText() + "\n" + "Email: " + txt_Email_Funcionario.getText() + "\n" + "Cargo: " + txt_Cargo_Funcionario + "Salário: " + txt_Salario_Funcionario);
            ButtonType botaoSim = new ButtonType("Sim");
            ButtonType botaoNao = new ButtonType("Não");
            alert.getButtonTypes().setAll(botaoSim, botaoNao);
            Optional<ButtonType> choose = alert.showAndWait();
            if (choose.get() == botaoSim) {
                int novoId = Integer.parseInt(txt_Idfuncionario_Funcionario.getText());
                for (Funcionario f : listaFuncionario) {
                    if (f.getIdFuncionario() == novoId) {
                        Settings.getListaFuncionaro().remove(f);
                        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                        alert1.setTitle("Informação");
                        alert1.setHeaderText(null);
                        alert1.setContentText("O Funcionario foi Eliminado");
                        alert1.showAndWait();
                        break;
                    }
                }
            }
            else{
                Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                alert2.setTitle("Informação");
                alert2.setHeaderText(null);
                alert2.setContentText("Cancelado com Sucesso");
                alert2.showAndWait();

            }
        }
    }
    @Override
    public void initialize (URL url, ResourceBundle resourceBundle){
        TabelaCarro();
        TabelaCliente();
        TabelaFuncionar();
    }


}

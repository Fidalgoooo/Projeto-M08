package example.tgpsi_m08_afonso_pereira;

// Declaração da classe Funcionario no package com.school

public class Funcionario{
    // Atributos privados da classe Funcionario
    private int idFuncionario;
    private String nome;
    private String email;
    private String cargo;   // Variável para armazenar o cargo do funcionário
    private int salario;    // Variável para armazenar o salário do funcionário

    // Construtor da classe Funcionario que recebe informações específicas do funcionário
    public Funcionario(int idFuncionario, String nome, String email, String cargo, int salario) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos Getters e Setters específicos para os atributos adicionais da classe Funcionario

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public Funcionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter para obter o cargo do funcionário
    public String getCargo() {
        return cargo;
    }

    // Setter para definir ou modificar o cargo do funcionário
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Getter para obter o salário do funcionário
    public int getSalario() {
        return salario;
    }

    // Setter para definir ou modificar o salário do funcionário
    public void setSalario(int salario) {
        this.salario = salario;
    }
}

package br.com.zup.Classes;

public class Funcionarios {

  // Aplicando atributos

  private String nome;
  private String CPF;
  private String numeroDeRegistro;
  private String orgaoDeLotacao;
  private double salario;

  //Método construtor

  public Funcionarios(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
    this.nome = nome;
    this.CPF = CPF;
    this.numeroDeRegistro = numeroDeRegistro;
    this.orgaoDeLotacao = orgaoDeLotacao;
    this.salario = salario;
  }


  public Funcionarios(String nome) {
    this.nome = nome;
  }

  //Getters e Setters

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String CPF) {
    this.CPF = CPF;
  }

  public String getNumeroDeRegistro() {
    return numeroDeRegistro;
  }

  public void setNumeroDeRegistro(String numeroDeRegistro) {
    this.numeroDeRegistro = numeroDeRegistro;
  }

  public String getOrgaoDeLotacao() {
    return orgaoDeLotacao;
  }

  public void setOrgaoDeLotacao(String orgaoDeLotacao) {
    this.orgaoDeLotacao = orgaoDeLotacao;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  //Método para aumentar o salário

  public double aumentoSalario() {
    return salario + (salario * 0.1);
    //return novoSalario;
  }
}

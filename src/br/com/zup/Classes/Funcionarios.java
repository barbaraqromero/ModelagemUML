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
}

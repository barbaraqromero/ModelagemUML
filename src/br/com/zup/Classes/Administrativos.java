package br.com.zup.Classes;

public class Administrativos extends Funcionarios{

  //Aplicando atributos
  private String funcao;
  private String senioridade;

  //Método construtor
  public Administrativos(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcao, String senioridade) {
    super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
    this.funcao = funcao;
    this.senioridade = senioridade;
  }
}

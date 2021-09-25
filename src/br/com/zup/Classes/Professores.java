package br.com.zup.Classes;

public class Professores extends Funcionarios{

  //Aplicando atributos
  private String nivelDeGraduacao;
  private String disciplinaMinistrada;
  private int qtdDeAlunos;
  private int qtdDeTurmas;

  //Método construtor
  public Professores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int qtdDeAlunos, int qtdDeTurmas) {
    super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
    this.nivelDeGraduacao = nivelDeGraduacao;
    this.disciplinaMinistrada = disciplinaMinistrada;
    this.qtdDeAlunos = qtdDeAlunos;
    this.qtdDeTurmas = qtdDeTurmas;
  }
}

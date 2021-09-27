package br.com.zup.Classes;

public class Professores extends Funcionarios {

  //Aplicando atributos
  private String nivelDeGraduacao;
  private String disciplinaMinistrada;
  private int qtdDeAlunos;
  private int qtdDeTurmas;
  private Turma turma;

  //Método construtor
  public Professores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int qtdDeAlunos, int qtdDeTurmas, Turma turma) {
    super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
    this.nivelDeGraduacao = nivelDeGraduacao;
    this.disciplinaMinistrada = disciplinaMinistrada;
    this.qtdDeAlunos = qtdDeAlunos;
    this.qtdDeTurmas = qtdDeTurmas;
    this.turma = turma;
  }


  //Getters e Setters
  public String getNivelDeGraduacao() {

    return nivelDeGraduacao;
  }

  public void setNivelDeGraduacao(String nivelDeGraduacao) {

    this.nivelDeGraduacao = nivelDeGraduacao;
  }

  public String getDisciplinaMinistrada() {

    return disciplinaMinistrada;
  }

  public void setDisciplinaMinistrada(String disciplinaMinistrada) {

    this.disciplinaMinistrada = disciplinaMinistrada;
  }

  public int getQtdDeAlunos() {

    return qtdDeAlunos;
  }

  public void setQtdDeAlunos(int qtdDeAlunos) {

    this.qtdDeAlunos = qtdDeAlunos;
  }

  public int getQtdDeTurmas() {

    return qtdDeTurmas;
  }

  public void setQtdDeTurmas(int qtdDeTurmas) {

    this.qtdDeTurmas = qtdDeTurmas;
  }

  public Turma getTurma() {

    return turma;
  }

  public void setTurma(Turma turma) {

    this.turma = turma;
  }

  //Método para adicionar Turma
  public void adicionarTurma(Turma turmaAdicionada){
    turma = turmaAdicionada;

  }
}

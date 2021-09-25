package br.com.zup.Classes;

public class Turma {
  private String serie;
  private int numeroDaChamada;
  private int alunosEmRecuperacao;

  public Turma(String serie, int numeroDaChamada, int alunosEmRecuperacao) {
    this.serie = serie;
    this.numeroDaChamada = numeroDaChamada;
    this.alunosEmRecuperacao = alunosEmRecuperacao;
  }

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public int getNumeroDaChamada() {
    return numeroDaChamada;
  }

  public void setNumeroDaChamada(int numeroDaChamada) {
    this.numeroDaChamada = numeroDaChamada;
  }

  public int getAlunosEmRecuperacao() {
    return alunosEmRecuperacao;
  }

  public void setAlunosEmRecuperacao(int alunosEmRecuperacao) {
    this.alunosEmRecuperacao = alunosEmRecuperacao;
  }
}

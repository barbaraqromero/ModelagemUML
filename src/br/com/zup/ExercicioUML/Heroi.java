package br.com.zup.ExercicioUML;

public class Heroi {
  private String nome;
  private double vida;

  public Heroi(String nome, double vida) {
    this.nome = nome;
    this.vida = vida;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getVida() {
    return vida;
  }

  public void setVida(double vida) {
    this.vida = vida;
  }

  public void nome(String nome){
    String novoNome = getNome();
    setNome(novoNome);
  }

  public void receberDano(double dano){
    double danoAplicado = dano - getVida();
  }

  public double exibirVida(){
    return exibirVida();
  }
}

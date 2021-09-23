package br.com.zup.ExercicioUML;

public class Voadores extends Inimigos {
  private double danoTiro;

  public Voadores(String nome, double vida, double danoTiro) {
    super(nome, vida);
    this.danoTiro = danoTiro;
  }

  public double aplicarDano(){
    return danoTiro;
  }
}

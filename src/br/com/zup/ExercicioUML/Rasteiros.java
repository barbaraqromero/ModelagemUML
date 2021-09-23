package br.com.zup.ExercicioUML;

public class Rasteiros extends Inimigos{
  private double danoEspinhos;

  public Rasteiros(String nome, double vida, double danoEspinhos) {
    super(nome, vida);
    this.danoEspinhos = danoEspinhos;
  }

  public double aplicarDano(int danoAplicado){
    return danoEspinhos;
  }
}

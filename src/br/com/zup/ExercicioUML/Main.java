package br.com.zup.ExercicioUML;

public class Main {

  public static void main(String[] args) {
    Guerreiros guerreiro = new Guerreiros("Tchalla", 200, 500);
    Magos mago = new Magos("Dr. Estranho", 600, 2000);

    Rasteiros rasteiro = new Rasteiros("Thanos", 250, 280);
    Voadores voador = new Voadores("Abutre", 500, 650);

    guerreiro.getVida();
    guerreiro.aplicarDano();

  }
}

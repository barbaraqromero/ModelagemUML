package br.com.zup.ExercicioUML;

public class Main {

  public static void main(String[] args) {
    Heroi heroi = new Heroi();
    Inimigos inimigo = new Inimigos();

    Guerreiros guerreiro = new Guerreiros("Tchalla", 200, 500);
    Magos mago = new Magos("Dr. Estranho", 600, 2000);

    Rasteiros rasteiro = new Rasteiros("Thanos", 250, 280);
    Voadores voador = new Voadores("Abutre", 500, 650);

    guerreiro.trocarNome("Iron Man");
    System.out.println(guerreiro.getNome());
    mago.trocarNome("Jorge");
    System.out.println(mago.getNome());

    guerreiro.receberDano(25);
    System.out.println(guerreiro.exibirVida());

    guerreiro.aplicarDano();





  }
}

package br.com.zup.Classes;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Coordenadores coordenador = new Coordenadores("Ana", "36988564211", "125", "sp", 3000);
    Professores professor1 = new Professores("Rafael", "Mestrado");
    Administrativos adm1 = new Administrativos("Luiz", "36698751255", "269", "SP", 3500, "Tesoureiro", "Pleno");
    Turma turma1 = new Turma("6");

    adm1.aumentoSalario();
    System.out.println(adm1.aumentoSalario());

    coordenador.adicionaProfessor(professor1);
    coordenador.exibirLista();

    professor1.adicionarTurma(turma1);


  }
}

package br.com.zup.Classes;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Coordenadores coordenador = new Coordenadores("Ana", "36988564211", "125", "sp", 3000);
    Professores professor1 = new Professores("Rafael", "Mestrado");

    coordenador.adicionaProfessor(professor1);
    coordenador.exibirLista();


  }
}

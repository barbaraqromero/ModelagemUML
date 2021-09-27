package br.com.zup.Classes;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Coordenadores coordenador = new Coordenadores("Ana", "36988564211", "125", "sp", 3000);
    Professores professor1 = new Professores("Rafael", "Mestrado");
    Professores professor2 = new Professores("Juliana", "Doutorado");
    Professores professor3 = new Professores("Barbara", "Doutorado");
    Professores professor4 = new Professores("Viviane", "Doutorado");
    Professores professor5 = new Professores("José", "Doutorado");
    Professores professor6 = new Professores("Raquel", "Doutorado");
    Professores professor7 = new Professores("Janaina", "Doutorado");

    Administrativos adm1 = new Administrativos("Luiz", "36698751255", "269", "SP", 3500, "Tesoureiro", "Pleno");
    Turma turma1 = new Turma("6");

    adm1.aumentoSalario();
    System.out.println(adm1.aumentoSalario());

    coordenador.adicionaProfessor(professor1);
    coordenador.exibirLista();
    System.out.println("------");
    coordenador.adicionaProfessor(professor2);
    coordenador.exibirLista();
    System.out.println("------");
    coordenador.adicionaProfessor(professor3);
    coordenador.exibirLista();
    System.out.println("--------");
    coordenador.adicionaProfessor(professor4);
    coordenador.exibirLista();
    System.out.println("---------");
    coordenador.adicionaProfessor(professor5);
    coordenador.exibirLista();
    System.out.println("------------");
    coordenador.adicionaProfessor(professor6);
    coordenador.exibirLista();
    System.out.println("-----------");
    coordenador.adicionaProfessor(professor7);


    professor1.adicionarTurma(turma1);


  }
}

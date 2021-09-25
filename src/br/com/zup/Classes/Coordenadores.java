package br.com.zup.Classes;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends  Funcionarios{

  //Aplicando atributos
  List<Professores> professoresSupervisionados = new ArrayList<>();

  //Método construtor
  public Coordenadores(String nome, String CPF, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
    super(nome, CPF, numeroDeRegistro, orgaoDeLotacao, salario);
  }

  public void adicionaProfessor(Professores novoProfessor){
    professoresSupervisionados.add(novoProfessor);

  }

  @Override
  public double aumentoSalario() {
    double valorAumento = getSalario() * 0.05;
    double novoSalario = getSalario() + valorAumento;
    return novoSalario;
  }
}

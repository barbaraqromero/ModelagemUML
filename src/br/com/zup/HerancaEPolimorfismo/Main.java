package br.com.zup.HerancaEPolimorfismo;

public class Main {
  public static void main(String[] args) {
    //Instanciando as classes
    Pessoa pessoa = new Pessoa();
    Fornecedor fornecedor = new Fornecedor("Ana", "Rua 1", "33333333", 2500, 1000);
    Colaborador colaborador = new Colaborador("Bruna", "Rua 2", "4444444444", 157, 3000, 250);
    Administrador administrador = new Administrador("Camila", "Rua 3", "55555555", 155, 5000, 500, 260);

    //Aplicando método para obter saldo do fornecedor
    System.out.println(fornecedor.obterSaldo());

    //Aplicando método para calcular salário do colaborador
    System.out.println(colaborador.calcularSalario());

    //Aplicando método para calcular saário do administrador, que é um colaborador
    System.out.println(administrador.calcularSalario());


  }
}

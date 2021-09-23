package br.com.zup.HerancaEPolimorfismo;

public class Main {
  public static void main(String[] args) {
    //Instanciando as classes
    Pessoa pessoa = new Pessoa();
    Fornecedor fornecedor = new Fornecedor("Ana", "Rua 1", "33333333", 2500, 1000);
    Colaborador colaborador = new Colaborador("Bruna", "Rua 2", "4444444444", 157, 3000, 250);

    //Aplicando método para obter saldo do fornecedor
    System.out.println(fornecedor.obterSaldo());

    //Aplicando método para calcular salário do colaborador
    System.out.println(colaborador.calcularSalario());


  }
}

package br.com.zup.HerancaEPolimorfismo;

public class Main {
  public static void main(String[] args) {
    //Instanciando as classes
    Pessoa pessoa = new Pessoa();
    Fornecedor fornecedor = new Fornecedor("Ana", "Rua 1", "33333333", 2500, 1000);

    //Aplicando para obter saldo do fornecedor
    System.out.println(fornecedor.obterSaldo());





  }
}

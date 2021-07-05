package pratica4;

public class Aplicacao {
 public static void main(String[] args) {
	Produto produto1 = new Produto("jPhone", 500, 6999);
	Produto produto2 = new Produto("airBuds", 1500, 500);
	Produto produto3 = new Produto("Pear Watch", 800, 2999);
	Produto produto4 = new Produto("Carregador sem fio", 250, 250);
	Produto produto5 = new Produto("Carregador com fio", 10, 69.90);
	
	Venda venda1 = new Venda("123.456.789-10", "04/03/2021", 4);
	venda1.registraProduto(produto1, 2);
	venda1.registraProduto(produto2, 2);
	venda1.registraProduto(produto3, 1);
	venda1.registraProduto(produto4, 1);
	venda1.registraProduto(produto5, 2);
	System.out.println("Valor total: "+venda1.calculaTotal()+"\n\n");
	venda1.registraPagamento("04/03/2021", 4596.7f, 1);
	venda1.registraPagamento("04/04/2021", 4596.7f, 2);
	venda1.registraPagamento("04/05/2021", 4596.7f, 3);
	venda1.registraPagamento("04/06/2021", 4596.7f, 4);
	venda1.imprimeRecibo();

}
}

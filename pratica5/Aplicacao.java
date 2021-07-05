package pratica4;

public class Aplicacao {
 public static void main(String[] args) {
	Produto produto1 = new Produto("jPhone", 500, 6999);
	Produto produto2 = new Produto("airBuds", 1500, 500);
	Produto produto3 = new Produto("Pear Watch", 800, 2999);
	Produto produto4 = new Produto("Carregador sem fio", 250, 250);
	Produto produto5 = new Produto("Carregador com fio", 10, 69.90);
	Cliente clientePF= new ClientePFisica("Vitor Simon", "321.654.987-01", "01/03/2021");
	Cliente clientePJ= new ClientePJuridica("Boston Dynamics", "123.456.789-10", "02/03/2021");
	
	Venda venda1 = new Venda(clientePF, "04/03/2021", 2);
	Venda venda2 = new Venda(clientePJ, "05/03/2021", 1);
	venda1.registraProduto(produto1, 1);
	venda1.registraProduto(produto5, 1);
	venda1.registraPagamento("04/03/2021", 3534.45f, 1);
	venda1.registraPagamento("04/04/2021", 3534.45f, 2);
	
	venda2.registraProduto(produto1, 200);
	venda2.registraProduto(produto3, 200);
	venda2.registraPagamento("07/03/2021", 1999600f, 1);
	venda1.imprimeRecibo();
	System.out.println();
	venda2.imprimeRecibo();

}
}

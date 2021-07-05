package pratica4;

public class Venda {
	private  int numeroNFe;
	private static int contVendas;
	private String cpf;
	private String data;
	private int quantidades[];
	private Produto produtos[];
	private Pagamento parcelas[];
	private int contador=0;
	private int numeroParcelas;
	
 public Venda(String cpf, String data, int numeroParcelas) {
	 Venda.contVendas++;
	 numeroNFe= Venda.contVendas;
	 quantidades= new int[15];
	 produtos= new Produto[15];
	 parcelas= new Pagamento[10];
	 this.cpf=cpf;
	 this.data=data;
	 this.numeroParcelas=numeroParcelas;
 }
 public void registraProduto(Produto produto, int quantidade){
	 final int maxVendas= 15;
	 if((quantidade<=produto.getQuantidadeEstoque()) && (quantidade<=maxVendas)) {
		 produtos[contador]=produto;
		 quantidades[contador]=quantidade;
		 produto.setQuantidadeEstoque(quantidade);
		 contador++;
	 }else if((quantidade>produto.getQuantidadeEstoque()) && (quantidade<=maxVendas)) {
		 System.out.println("A quantidade requisitada é maior do que a que temos em estoque!");
	 }else if((quantidade<=produto.getQuantidadeEstoque()) && (quantidade>maxVendas)) {
		 System.out.println("A quantidade requisitada excede o limite de compras!");
	 }else {
		 System.out.println("A quantidade requisitada excede o limite de compras e é maior que nossa quantidade em estoque!");
	 }
 }
 public void registraPagamento(String data, float valor, int identParcela) {
	 if((identParcela<=numeroParcelas) && (identParcela>0)) {
		 parcelas[identParcela-1]= new Pagamento(data, valor);
	 }else {
		 System.out.println("Identificador de parcela não reconhecido!");
	 }
 }
 
 public float calculaTotal() {
	 float totalVenda=0;
	 for(int i=0; i<contador; i++) {
		 totalVenda=(produtos[i].getValor()*quantidades[i])+totalVenda;
	 }
	 return totalVenda;
 }
 public void imprimeRecibo() {
	 System.out.println("Dados da venda: \n"
	 		+ "CPF:"+cpf+"\n"
	 		+ "Data:"+data+"\n"
	 		+ "Total de produtos:"+contador);
	 for(int i=0; i<contador; i++){
		 System.out.println(i+1+"."+produtos[i].getDescricao()+" "+quantidades[i]+" R$"+quantidades[i]*produtos[i].getValor());
	 }
	 System.out.println("Valor total: R$"+calculaTotal()+"\n"
	 		+ "Parcelas: ");
	 for(int i=0; i<numeroParcelas;i++) {
		 System.out.println(i+1+". "+parcelas[i].getData()+" R$"+parcelas[i].getValor());
	 }
	 System.out.println("Nota fiscal: "+numeroNFe);
 }
}
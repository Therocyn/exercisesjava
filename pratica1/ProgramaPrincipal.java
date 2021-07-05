
public class ProgramaPrincipal {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Veiculo();
		Veiculo v3 = v1;
		v1.ano = 2017;
		v1.marca = "GM";
		v1.modelo = "Onix";
		v1.motor = 1.0;
		v1.preco = 42000;
		v1.combustivel = 'f';
		
		v2.ano = 2017;
		v2.marca = "GM";
		v2.modelo = "Onix";
		v2.motor = 1.0;
		v2.preco = 42000;
		v2.combustivel = 'f';
		
		if(v1==v2)
			System.out.println("Os veículos são iguais");
		else
			System.out.println("Os veículos diferem");  /*parte 5: o resultado é que os veiculos são diferentes pois apesar
		dos 2 objetos possuirem os mesmos atributos, eles não são o mesmo objeto */
		
		v1.imprimeDados();
		v1.deprecia(540);
		System.out.println();
		v1.imprimeDados();
		System.out.println();
		System.out.println("Valor do imposto: "+v1.calculaImposto());
		v1.imprimeDados();
		
		
		v3.preco=0;
		System.out.println();
		v3.imprimeDados(); 
		System.out.println("------------");
		v1.imprimeDados(); /*parte 6: os dados imprimidos são os mesmos, pois o v3 não é um objeto novo, ele é uma 
		variavel que faz referência ao objeto v1, como se v3 fosse sinônimo de v1*/
	}
}
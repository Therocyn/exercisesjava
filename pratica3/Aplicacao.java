package pratica3;

public class Aplicacao {
	public static void main(String[] args) {
		Circulo cA = new Circulo(1, 1, 2);
		Circulo cB = new Circulo(3, 0, 3);
		Circulo cC = new Circulo(2, 2, 2);
		Circulo cD = new Circulo(-5, 4, 5);
		
		cA.imprime();
		cB.imprime();
		cC.imprime();
		cD.imprime();
		
		imprimeRelacaoCirculos(cA, cB); //se sobrepoem
		imprimeRelacaoCirculos(cA, cC);	//se sobrepoem
		imprimeRelacaoCirculos(cA, cD); //se sobrepoem
		imprimeRelacaoCirculos(cB, cC); //se sobrepoem
		imprimeRelacaoCirculos(cB, cD); //não se sobrepoem
		imprimeRelacaoCirculos(cC, cD); //não se sobrepoem
		System.out.println();
		
		cA.move("baixo", 1);
		cA.move("esquerda", 1);
		cB.move("direita", 6);
		cB.move("cima", 5);
		cC.move("cima", 2);
		cD.move("cima", 2);
		cD.move("esquerda", 3);
		cD.move("baixo", 1);
		cA.move("esquerda", 1);
		
		cA.imprime();
		cB.imprime();
		cC.imprime();
		cD.imprime();
		
		imprimeRelacaoCirculos(cA, cB); //se sobrepoem
		imprimeRelacaoCirculos(cA, cC); //se sobrepoem
		imprimeRelacaoCirculos(cA, cD); //se sobrepoem
		imprimeRelacaoCirculos(cB, cC); //se sobrepoem
		imprimeRelacaoCirculos(cB, cD); //se sobrepoem
		imprimeRelacaoCirculos(cC, cD); //se sobrepoem
		System.out.println();
		
	}
	public static void imprimeRelacaoCirculos(Circulo c1, Circulo c2) {
		if (Circulo.sobreposicao(c1, c2))
			System.out.println("C"+c1.getIdentificador()+" e C"+c2.getIdentificador()+" se sobrepõem");
		else
			System.out.println("C"+c1.getIdentificador()+" e C"+c2.getIdentificador()+" não se sobrepõem");
		}
	
}
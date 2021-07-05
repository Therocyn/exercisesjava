package pratica6;

public class Cachorro extends Animal{

    /* 
       Implementar o construtor de Cachorro 
    */
	public Cachorro(String nome, String raca, double peso) {
		super(nome, raca, peso);
	}
    /* 
       Sobrescrever o m�todo toString() de Animal.
       Retornar, ao inv�s do valor padr�o em Animal, a indica��o, dentro dos par�nteses,
       n�o somente da ra�a do Cachorro mas tamb�m que o Animal � um Cachorro.
       O nome do Cachorro tamb�m deve aparecer como em Animal.
    */
	public String toString(){
	     return nome+" (Cachorro "+raca+")"; 
	  }
    /* 
       Sobrescrever o m�todo getAlimentacaoDiaria() de Animal.
       Retornar 1.5% do peso do Cachorro.
    */
	public double getAlimentacaoDiaria(){
	      return peso * .015; /* 1% de seu peso (massa) */
	  }
}
package pratica6;

public class Gato extends Animal{

    /* 
       Implementar o construtor de Gato 
    */
	public Gato(String nome, String raca, double peso) {
		super(nome, raca, peso);
	}
    
    /* 
       Sobrescrever o m�todo toString() de Animal.
       Retornar, ao inv�s do valor padr�o em Animal, a indica��o, dentro dos par�nteses,
       n�o somente da ra�a do Gato mas tamb�m que o Animal � um Gato. 
       O nome do Gato tamb�m deve aparecer como em Animal.
    */
	 public String toString(){
	      return nome+" (Gato "+raca+")"; 
	  }
    
    /* 
       Sobrescrever o m�todo getAlimentacaoDiaria() de Animal.
       Retornar 1.25% do peso do Gato.
    */
	 public double getAlimentacaoDiaria(){
	      return peso * .0125; /* 1% de seu peso (massa) */
	  }

}

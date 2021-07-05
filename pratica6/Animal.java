package pratica6;
/*
Classe Animal (gen�rica)
*/
public class Animal{

  protected String nome; /* Nome do Animal */
  protected String raca; /* Ra�a do Animal */
  protected double peso; /* Peso (massa) em quilogramas do Animal */
  
  private int identificador; /* Identificador (�nico) do Animal */
  private static int numAnimais = 0; /* Atributo de classe que permite implementar 'identificador' */
  
  /* Construtor: recebe e manipula atributos de inst�ncia e seta identificador */
  public Animal(String nome, String raca, double peso){
      Animal.numAnimais += 1;
      this.raca = raca;
      this.nome = nome;
      this.peso = peso;
      this.identificador = Animal.numAnimais;
  }
  
  /* Sobrescrevendo o m�todo toString() de Object */
  /* Comente o m�todo to String e veja o que acontece. */    
  public String toString(){
      return nome+" ("+raca+")"; 
  }
  
  /* M�todo que retorna o quanto (em quilogramas) o Animal precisa comer em um dia */
  public double getAlimentacaoDiaria(){
      return peso * .01; /* 1% de seu peso (massa) */
  }
  
  /* Retorna o identificador do Animal */
  public int getIdentificador(){
      return identificador;
  }

}

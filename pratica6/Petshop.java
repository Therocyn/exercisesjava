package pratica6;
import java.lang.Math;

public class Petshop{

    private Animal[] animais; /* Array de Animais do Petshop */
    private Cliente[] clientes; /* Array de Clientes do Petshop */
    private double[] aPagar; /* Array de valores a serem pagos pelos Clientes do Petshop */
    private int[] indiceDonosAnimais; /* Array de indices dos donos (Clientes) dos Animais do Petshop */

    private static final int maxAnimais = 400; /* N�mero m�ximo de Animais do Petshop */
    private static final int maxClientes = 200; /* N�mero m�ximo de Clientes do Petshop */

    private int contadorAnimais=0; /* Atributo para controlar o tamanho �til do array de Animais */
    private int contadorClientes=0; /* Atributo para controlar o tamanho �til do array de Clientes */
      
    /* 
       Construtor
       Implementar inicializa��es/instancia��es 
    */  
   public Petshop() {
	   animais = new Animal[maxAnimais];
	   clientes = new Cliente[maxClientes];
	   aPagar = new double[maxClientes];
	   indiceDonosAnimais = new int[maxAnimais];
	   
   }
    /* 
       M�todo: encontraAnimal
       Implementar funcionalidade de encontrar um Animal no array de Animais. 
       Lembre-se que o identificador de um Animal � �nico. 
       O m�todo retorna -1 se n�o encontrar o Animal passado por argumento. 
    */  
   private int encontraAnimal(Animal animal1) {
	   for(int i=0; i<contadorAnimais; i++) {
		   if(animal1.getIdentificador()==animais[i].getIdentificador())
			   return i;
	   }
	   return -1;
   }

    
    /* 
       M�todo: encontraCliente
       Implementar funcionalidade de encontrar um Cliente no array de Clientes. 
       Lembre-se que o cpf de um Cliente � �nico. 
       O m�todo retorna -1 se n�o encontrar o Cliente passado por argumento.
    */  
   private int encontraCliente(Cliente cliente1) {
	   for(int i=0; i<contadorClientes; i++) {
		   if(cliente1.getCPF().equals(clientes[i].getCPF()))
			   return i;
	   }
	   return -1;
   }

    
    /* 
       M�todo: banho
       Implementar funcionalidade 'banho' em um Animal previamente registrado. 
       O m�todo deve adicionar na posi��o adequada do array aPagar o valor a ser 
       pago pelo servi�o. O servi�o 'banho' em Gatos, Cachorros e outros Animais 
       custam 65,00, 70,00 e 50,00 reais, respectivamente. 
       Se o Animal n�o estiver registrado, n�o fazer nada al�m informar na tela 
       (usando System.err.println("Animal " + animal + " n�o registrado!");).
    */
   public void banho(Animal animal) {
	   int ind=encontraAnimal(animal);
	   if(ind==-1) {
		   System.err.println("Animal "+animal+" n�o registrado!");
	   }else if(animal instanceof Gato) {
		   aPagar[indiceDonosAnimais[ind]]+= 65;
	   }else if(animal instanceof Cachorro) {
		   aPagar[indiceDonosAnimais[ind]]+= 75;
	   }else {
		   aPagar[indiceDonosAnimais[ind]]+= 50;
	   }
	   }

    /* 
       M�todo: tosa
       Implementar funcionalidade 'tosa' em um Animal previamente registrado. 
       O m�todo deve adicionar na posi��o adequada do array aPagar o valor a ser 
       pago pelo servi�o. O servi�o 'tosa' em Gatos, Cachorros e outros Animais 
       custam 80,00, 100,00 e 75,00 reais, respectivamente. 
       Se o Animal n�o estiver registrado, n�o fazer nada al�m informar na tela 
       (usando System.err.println("Animal " + animal + " n�o registrado!");).
    */ 
   public void tosa(Animal animal) {
	   int ind=encontraAnimal(animal);
	   if(ind==-1) {
		   System.err.println("Animal "+animal+" n�o registrado!");
	   }else if(animal instanceof Gato) {
		   aPagar[indiceDonosAnimais[ind]]+= 80;
	   }else if(animal instanceof Cachorro) {
		   aPagar[indiceDonosAnimais[ind]]+= 100;
	   }else {
		   aPagar[indiceDonosAnimais[ind]]+= 75;
	   }
	   }
    
    /* 
       M�todo: hospedagem
       Implementar funcionalidade 'hospedagem' de um Animal previamente registrado. 
       O m�todo deve adicionar na posi��o adequada do array aPagar o valor a ser 
       pago pelo servi�o. O servi�o 'hospedagem' custa 
       (50,00 + 5 x quantidade de alimento di�rio do Animal(em quilogramas)) reais.
       Se o Animal n�o estiver registrado, n�o fazer nada al�m informar na tela 
       (usando System.err.println("Animal " + animal + " n�o registrado!");).
    */ 
   public void hospedagem(Animal animal) {
	   int ind=encontraAnimal(animal);
	   if(ind==-1) {
		   System.err.println("Animal "+animal+" n�o registrado!");
	   }else {
		   aPagar[indiceDonosAnimais[ind]]+= (50+(5*animal.getAlimentacaoDiaria())*1);
	   }
	   }
    
    /* 
       M�todo: hospedagem
       Implementar funcionalidade 'hospedagem' de um Animal previamente registrado. 
       O m�todo deve adicionar na posi��o adequada do array aPagar o valor a ser 
       pago pelo servi�o. O servi�o 'hospedagem' custa 
       ((50,00 + 5 x quantidade de alimento di�rio do Animal (em quilogramas)) x dias) reais.
       Se o Animal n�o estiver registrado, n�o fazer nada al�m informar na tela 
       (usando System.err.println("Animal " + animal + " n�o registrado!");).
    */   
   public void hospedagem(Animal animal, int dias) {
	   int ind=encontraAnimal(animal);
	   if(ind==-1) {
		   System.err.println("Animal "+animal+" n�o registrado!");
	   }else {
		   aPagar[indiceDonosAnimais[ind]]+= (50+5*animal.getAlimentacaoDiaria())*dias;
	   }
	   }
       
    /* 
       M�todo: registraCliente
       Implementar funcionalidade de registrar um Cliente no array de Clientes. 
       Lembre-se de, antes, verificar se o Cliente a ser adicionado j� n�o est� registrado.
    */ 
   public void registraCliente(Cliente cliente1) {
	   if(encontraCliente(cliente1)== -1) {
		   contadorClientes++;
		   clientes[contadorClientes-1]=cliente1;
	   }
   }
    
    /* 
       M�todo: registraAnimal
       Implementar funcionalidade de registrar um Animal no array de Animais. 
       Lembre-se de, antes, verificar se o Animal a ser adicionado j� n�o est� registrado.
       Caso o Cliente associado n�o esteja registrado, deve-se registr�-lo adequadamente.
       O m�todo deve manter o array indiceDonosAnimais. 
       O �ndice do Animal rec�m registrado no array de Animais serve como �ndice de
       indiceDonosAnimais, que armazena, nessa posi��o, o �ndice de seu dono (Cliente)
       no array de Clientes.
    */     
   public void registraAnimal(Cliente cliente1, Animal animal1) {
	   if(encontraAnimal(animal1)== -1) {
		   registraCliente(cliente1);
		   contadorAnimais++;
		   animais[contadorAnimais-1]=animal1;
		   indiceDonosAnimais[contadorAnimais-1]= encontraCliente(cliente1);
	   }
	   
   }
    
    /* 
       M�todo: imprimeAnimaisXClientes
       O m�todo exibe na tela todos os animais registrados no Petshop juntamente de
       seus donos (Cliente). Clientes que n�o possuem animais registrados n�o s�o exibidos.
    */
    public void imprimeAnimaisXClientes(){
        System.out.println("Cliente\t\tAnimal");
        for(int indiceAnimal = 0; indiceAnimal < contadorAnimais; indiceAnimal++)
            System.out.println(clientes[indiceDonosAnimais[indiceAnimal]] + "\t" + animais[indiceAnimal]);
    }
    
    /* 
       M�todo: pagamento
       O m�todo retorna o valor devido (isto �, o que foi gasto com os servi�os 
       contratados para seu(s) animal(is)); O m�todo tamb�m zera o valor a ser 
       pago no devido registro em aPagar.
    */ 
    public double pagamento(Cliente cliente){
        double valorPagamento = 0;
        int indiceCliente = encontraCliente(cliente);
        if (indiceCliente != -1){
            valorPagamento = aPagar[indiceCliente];
            aPagar[indiceCliente] = 0;
        } 
        return Math.round(valorPagamento * 100.0) / 100.0;
    }
}
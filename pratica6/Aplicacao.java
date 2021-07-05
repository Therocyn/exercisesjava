package pratica6;
/*
Aplica��o principal: instancia um Petshop, tr�s Clientes, quatro Animais e os manipula. 
*/
public class Aplicacao{

 public static void main(String[] args){
 	
     /* Instancia��o de um Petshop */	
     Petshop petshopMatriz = new Petshop();
           
     /* Instancia��o de tr�s Clientes */	
     Cliente fulano = new Cliente("123.456.789-10", "Fulano de Tal", "51-1234-5678");
     Cliente beltrana = new Cliente("123.456.789-11", "Beltrana de Tal", "51-1234-5679");
     Cliente cicrano = new Cliente("123.456.789-12", "Cicrano de Tal", "51-1234-5680");
 
     /* Instancia��o de quatro Animais (com polimorfismo de vari�vel) */	
     Animal jerry = new Animal("Jerry", "Rato", 0.2);   
     Animal garfield = new Gato("Garfield", "Persa", 3.5);   
     Animal pateta = new Cachorro("Pateta", "Bloodhound", 30.0);   
     Animal scooby = new Cachorro("Scooby Doo", "Dogue Alem�o", 32.0);   
     
     /* Registro de clientes no Petshop */	
     petshopMatriz.registraCliente(fulano);
     petshopMatriz.registraCliente(cicrano);
     
     /* Registro de animais no Petshop */	
     petshopMatriz.registraAnimal(fulano, garfield);
     petshopMatriz.registraAnimal(fulano, pateta);
     petshopMatriz.registraAnimal(beltrana, scooby);
     petshopMatriz.registraAnimal(cicrano, jerry);

     /* Impress�o dos Animais e seus donos (Clientes) 
        (Clientes sem Animais n�o s�o exibidos) */	
     petshopMatriz.imprimeAnimaisXClientes();
     
     /* Banho, tosa e hospedagens de Animais */	
     petshopMatriz.banho(garfield);
     petshopMatriz.tosa(pateta);
     petshopMatriz.tosa(scooby);
     petshopMatriz.hospedagem(pateta);
     petshopMatriz.hospedagem(jerry, 5);
     
     /* Valores que devem ser pagos pelos Clientes ao retirar seus Animais no Petshop */
     System.out.println(fulano + " pagar� R$" + petshopMatriz.pagamento(fulano));
     System.out.println(beltrana + " pagar� R$" + petshopMatriz.pagamento(beltrana));
     System.out.println(cicrano + " pagar� R$" + petshopMatriz.pagamento(cicrano));
 }

}

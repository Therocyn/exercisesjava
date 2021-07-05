package contas;

public class ContaBancaria{

   // atributos
   private int numero;
   private int agencia;
   private String titular;
   private double saldo;
   private double saqueNoDia;
   private double limSaqueDiario;
   private String senha;
   private double limCredito;
   
   // métodos   
   public void setNumero(int numero){
      this.numero = numero;
   }
   
   public void setAgencia(int agencia){
      this.agencia = agencia;
   }
   
   public void setTitular(String titular){
      this.titular = titular;
   }
      
   public void setLimiteDiario(double limite){
      limSaqueDiario = limite;
   }
   
   public void setLimiteCredito(double limite){
      limCredito = limite;
   }
   
   public int getNumero(){
      return numero;
   }
   
   public int getAgencia(){
      return agencia;
   }
   
   public String getTitular(){
      return titular;
   }
   
   public double getSaldo(){
      return saldo + limCredito;
   }
   
   public double getLimiteDiario(){
      return limSaqueDiario;
   }
   
   public double getLimiteCredito(){
      return limCredito;
   }
   
   public boolean retira(double quantia){
      if (checaSaldoOK(quantia) && checaLimiteDiarioOK(quantia)){
         saldo -= quantia;
         saqueNoDia += quantia;
         return true;
      }
      return false;
   }
   
   private boolean checaSaldoOK(double quantia){
       return (saldo - quantia) >= 0;
   }
   
   private boolean checaLimiteDiarioOK(double quantia){
       return (saqueNoDia + quantia) <= limSaqueDiario;
   }

}



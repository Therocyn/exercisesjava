package teste;

import contas.ContaBancaria;

public class MinhaAplicacaoEmOutroPackage{
   
    public static void main(String []args){
    
        ContaBancaria cb = new ContaBancaria();
        /* ...
           Em algum lugar os dados da Conta são atribuídos ...
           ... 
        */
        boolean saqueOK = cb.retira(50);
        if (saqueOK)
           System.out.println("Saque realizado com sucesso!");
        else
           System.out.println("Não foi possível realizar o saque!");
    }
    
}


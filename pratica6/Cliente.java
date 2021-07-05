package pratica6;
/*
Classe Cliente
*/
public class Cliente{

 private String cpf; /* CPF (�nico) do Cliente */
 private String nome; /* Nome do Cliente */
 private String telefone; /* N�mero de telefone do Cliente */
 
 /* Construtor: recebe e manipula todos os atributos de inst�ncia */
 public Cliente(String cpf, String nome, String telefone){
     this.cpf = cpf;
     this.nome = nome;
     this.telefone = telefone;
 }
 
 /* Retorna o identificador �nico de Cliente (CPF) */
 public String getCPF(){
    return cpf;
 }
 
 /* Sobrescrevendo o m�todo toString() de Object */  
 /* Comente o m�todo to String e veja o que acontece. */ 
 public String toString(){
    return nome;
 }


}
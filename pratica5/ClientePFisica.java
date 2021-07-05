package pratica4;

public class ClientePFisica extends Cliente{
	final private String nome, cpf;
	
	public ClientePFisica(String nome, String cpf, String dataCadastro) {
		super(dataCadastro);
		this.nome=nome;
		this.cpf=cpf;
	}
	
	public void imprimeDados() {
		System.out.println("Cliente: #"+getIdentificador()+"\n"
				+ "Data de cadastro: "+getDataCadastro()+"\n"
				+ "Nome: "+nome+"\n"
				+ "CPF: "+cpf);
	}
}

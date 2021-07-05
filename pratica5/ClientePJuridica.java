package pratica4;

public class ClientePJuridica extends Cliente {
	final private String razaoSocial, cnpj;
	
	public ClientePJuridica(String razaoSocial, String cnpj, String dataCadastro) {
		super(dataCadastro);
		this.razaoSocial=razaoSocial;
		this.cnpj=cnpj;
	}
	
	public void imprimeDados() {
		System.out.println("Cliente: #"+getIdentificador()+"\n"
				+ "Data de cadastro: "+getDataCadastro()+"\n"
				+ "Razão Social: "+razaoSocial+"\n"
				+ "CNPJ: "+cnpj);
	}

}

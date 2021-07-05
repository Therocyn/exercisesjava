package pratica4;

public class Cliente {
	
private final int identificador;
private static int contIdentificador=0;
private final String dataCadastro;

public Cliente(String dataCadastro) {
	contIdentificador++;
	identificador=contIdentificador;
	this.dataCadastro=dataCadastro;
}

public void imprimeDados() {
	System.out.println("Cliente: #"+identificador+"\n"
			+ "Data de cadastro: "+dataCadastro);
}

int getIdentificador() {
	return identificador;
}

String getDataCadastro() {
	return dataCadastro;
}

}

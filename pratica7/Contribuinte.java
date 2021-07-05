package pratica7;

abstract public class Contribuinte {
private String nome;
protected double rendas, deducoes;

public String toString() {
	return nome;
}

public Contribuinte(String nome) {
	this.nome=nome;
}
void registraRendimento(double valor) {
	rendas+=valor;
}
void registraDeducao(double valor) {
	deducoes+=valor;
}
abstract public double calculaImposto();

public String getNome() {
	return nome;
}
}

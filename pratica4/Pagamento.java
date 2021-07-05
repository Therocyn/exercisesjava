package pratica4;

public class Pagamento {
 private final String data;
 private final float valor;
 
 public Pagamento(final String data, final float valor) {
	 this.data=data;
	 this.valor=valor;
 }

public String getData() {
	return data;
}

public float getValor() {
	return valor;
}
}

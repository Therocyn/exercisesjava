
public class Veiculo {
	int ano;
	String marca;
	String modelo;
	double motor;
	double preco;
	char combustivel; //g ou f
	public void imprimeDados() {
		System.out.println("Ano: " +ano);
		System.out.println("Marca: " +marca);
		System.out.println("Modelo: " +modelo);
		System.out.println("Motor: " +motor);
		System.out.println("Preço: " +preco);
		if(combustivel == 'f')
		System.out.println("Combustivel: Flex");
		if(combustivel == 'g')
		System.out.println("Combustivel: Gasolina");
	}

	public void deprecia(double valor) {
		preco-=valor;
	}
	public double calculaImposto() {
		if(motor<= 1.0) {
			preco= preco*1.306;
			return (preco-preco/1.306);
		}
		else if(motor<=2 && combustivel=='g') {
			preco= preco*1.366;
			return (preco-preco/1.366);
		}
		else if(motor<=2 && combustivel=='f') {
			preco= preco*1.346;
			return (preco-preco/1.346);
		}
		else if(motor>2 && combustivel=='g') {
			preco= preco*1.486;
			return (preco-preco/1.486);
		}
		else if(motor>2 && combustivel=='f') {
			preco= preco*1.416;
			return (preco-preco/1.416);
		}
		return 1;
	}
}
package pratica7;

public class ContribPJuridica extends Contribuinte {
	String cnpj;
	
public ContribPJuridica(String nome, String cnpj) {
	super(nome);
	this.cnpj=cnpj;
}
public String toString() {
	return getNome()+"("+cnpj+")";
}

public double calculaImposto() {
	if(rendas>=3600000) {
		return ((rendas*0.30)-720000-deducoes);
	}else if(rendas>=1800000.01 && rendas<=3600000) {
		return ((rendas*0.147)-85500-deducoes);
	}else if(rendas>=720000.01 && rendas<=1800000) {
		return ((rendas*0.112)-22500-deducoes);
	}else if(rendas>=360000.01 && rendas<=720000) {
		return ((rendas*0.1)-13860-deducoes);
	}else if(rendas>=180000.01 && rendas<=360000) {
		return ((rendas*0.079)-5940-deducoes);
	}else {
		return rendas*0.04;
	}
}

}

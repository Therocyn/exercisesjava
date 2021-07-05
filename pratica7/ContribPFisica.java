package pratica7;

public class ContribPFisica extends Contribuinte {
	String cpf;
	
public ContribPFisica(String nome, String cpf) {
	super(nome);
	this.cpf=cpf;
}
public String toString() {
	return getNome()+"("+cpf+")";
}
public double calculaImposto() {
	if(rendas>=55916.16) {
		return ((rendas*0.275)-10432.32-deducoes);
	}else if(rendas>=45012.61 && rendas<=55976.16) {
		return ((rendas*0.225)-7633.51-deducoes);
	}else if(rendas>=33919.81 && rendas<=45012.60) {
		return ((rendas*0.15)-4257.57-deducoes);
	}else if(rendas>=22847.77 && rendas<=33919.80) {
		return ((rendas*0.075)-1713.58-deducoes);
	}else {
		return 0;
	}
}
}
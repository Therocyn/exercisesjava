package pratica7;
import java.util.ArrayList;

public class SistemaDeclaracaoIR {
ArrayList<Contribuinte> contribuintes;

public SistemaDeclaracaoIR() {
	contribuintes = new ArrayList<Contribuinte>();
}

void adicionaContribuinte(Contribuinte contri) {
	contribuintes.add(contri);
}
public double totalRendimentos() {
	double somaTotalRend=0;
	for(int i=0; i<contribuintes.size(); i++) {
		if(contribuintes.get(i).calculaImposto()>0) {
	somaTotalRend+=contribuintes.get(i).calculaImposto();	
	}}
	return somaTotalRend;
}

public double totalRestituicoes() {
	double somaTotalRest=0;
	for(int i=0; i<contribuintes.size(); i++) {
		if(contribuintes.get(i).calculaImposto()<0) {
	somaTotalRest+=contribuintes.get(i).calculaImposto();	
	}}
	return somaTotalRest*-1;
}

public double balanco() {
	return totalRendimentos()-totalRestituicoes();
}
}

package teste;
import ponto.PontoPainel8x6;
import java.util.Scanner;
public class AplicacaoTestaPonto {
	public static void main(String[] args) {
		int MAXY = 8, MAXX = 6, y, x;
		boolean xtrue, ytrue;
		Scanner leitura = new Scanner(System.in);
		PontoPainel8x6 p1 = new PontoPainel8x6();
		PontoPainel8x6 p2 = new PontoPainel8x6();
		
		System.out.printf("Digite a coordenada X do ponto 1: ");
		xtrue=p1.setX(leitura.nextInt());
		System.out.printf("Digite a coordenada Y do ponto 1: ");
		ytrue=p1.setY(leitura.nextInt());
		while((xtrue && ytrue) == false) {
			System.out.printf("Digite uma coordenada válida de X para o ponto 1: ");	
			xtrue=p1.setX(leitura.nextInt());
			System.out.printf("Digite uma coordenada válida de Y para o ponto 1: ");
			ytrue=p1.setY(leitura.nextInt());
		}
		p1.imprime();
		
		System.out.printf("Digite a coordenada X do ponto 2: ");
		xtrue=p2.setX(leitura.nextInt());
		System.out.printf("Digite a coordenada Y do ponto 2: ");
		ytrue=p2.setY(leitura.nextInt());
		while((xtrue && ytrue) == false) {
			System.out.printf("Digite uma coordenada válida de X para o ponto 2: ");	
			xtrue=p2.setX(leitura.nextInt());
			System.out.printf("Digite uma coordenada válida de Y para o ponto 2: ");
			ytrue=p2.setY(leitura.nextInt());
		}
		p2.imprime();
		
		System.out.printf("Distância absoluta entre ponto 1 e ponto 2: %d\n", p1.distancia(p2));
		
		System.out.printf("Localização do ponto 1 e ponto 2:\n");
		for (y = 0; y < MAXY; y++){
		 for (x = 0; x < MAXX; x++){
		 if ((p1.getX()==x && p1.getY()==y) || (p2.getX()==x && p2.getY()==y))
		 System.out.print(" x ");
		 else
		 System.out.print(" - ");
		 }
		 System.out.println("");
		}
		
	}
}

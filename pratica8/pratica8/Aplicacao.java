package pratica8;

import excecoes.*;

public class Aplicacao {

	public static void completarNivel(Cafeteira cafeteira, Estoque estoque) {
		double quantidade;
		System.out.println(cafeteira);
		/* Tratar exce��es CafeteiraException e FaltaEstoqueException! */
		try {
			while (true) { // Usar 'while(true)' n�o � uma boa pr�tica, mas esse comportamento modela bem
							// nosso 'modus operandi' na hora de encher um recipiente!
				quantidade = estoque.get100MililitrosOUGramas();
				if (estoque.getDescricao().equals("Leite"))
					cafeteira.completarNivelLeite(quantidade);
				else if (estoque.getDescricao().equals("�gua"))
					cafeteira.completarNivelAgua(quantidade);
				else if (estoque.getDescricao().equals("Caf�"))
					cafeteira.completarNivelCafe(quantidade);
			}
		} catch (CafeteiraException cafe) {

		} catch (FaltaEstoqueException estq) {
			System.out.println(estq.getMessage());
		}
		System.out.println(cafeteira);
	}

	public static void main(String[] args) {

		int idx = 0;

		Estoque cafe = new Estoque("Caf�", 5000);
		Estoque agua = new Estoque("�gua", 100000);
		Estoque leite = new Estoque("Leite", 20000);

		Cafeteira cafeteira = new Cafeteira();

		completarNivel(cafeteira, leite);
		completarNivel(cafeteira, agua);
		completarNivel(cafeteira, cafe);

		String[] cafes = new String[] { "Americano", "Latte", "Expresso" };
		int[] pedidos = new int[] { 1, 0, 1, 0, 0, 2, 0, 0, 0, 1, 0, 1 };

		/*
		 * Tratar exce��es NivelMuitoBaixoCafeException, NivelMuitoBaixoAguaException e
		 * NivelMuitoBaixoLeiteException!
		 */

		while (idx < pedidos.length) {
			try {
				cafeteira.pedir(cafes[pedidos[idx]]);
				idx += 1;
			} catch (NivelMuitoBaixoCafeException cafeLow) {
				System.out.println(cafeLow.getMessage());
				completarNivel(cafeteira, cafe);
			} catch (NivelMuitoBaixoAguaException aguaLow) {
				System.out.println(aguaLow.getMessage());
				completarNivel(cafeteira, agua);
			} catch (NivelMuitoBaixoLeiteException leiteLow) {
				System.out.println(leiteLow.getMessage());
				completarNivel(cafeteira, leite);
			}

		}

		System.out.println(cafeteira);

	}

}

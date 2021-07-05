import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.System;

public class Aplicacao {
	public static void main(String[] args) {
		ArrayList<String> frases = new ArrayList<String>();
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		Scanner leitor = new Scanner(System.in);
		Jogador jogador = new Jogador();
		Random nRand = new Random();
		String jogada;
		int x;
		long tempoInicio, tempoFim;

		frases = (ArrayList<String>) ManipuladorSerializaveis.desserializa("bancodefrases.poo");
		jogadores = (ArrayList<Jogador>) ManipuladorSerializaveis.desserializa("top3ranking.poo");
		System.out.println("Digite seu nome: ");
		jogador.nome = leitor.nextLine();

		x = nRand.nextInt(frases.size());
		System.out.println("Digite: '" + frases.get(x) + "'");
		tempoInicio = System.nanoTime();
		jogada = leitor.nextLine();
		tempoFim = System.nanoTime();

		if (jogada.equals(frases.get(x))) {
			jogador.score = (double) (frases.get(x).length() / ((tempoFim - tempoInicio) / 1000000000));
		} else {
			jogador.score = 0;
			System.out.println("Você errou a digitação de '" + frases.get(x) + "'!");
		}
		jogadores.add(jogador);
		jogadores.sort(new Ordenador());
		jogadores.remove(3);

		System.out.println("Ranking: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + ". " + jogadores.get(i).toString());
		}
		ManipuladorSerializaveis.serializa("top3ranking.poo", jogadores);
		leitor.close();
	}
}

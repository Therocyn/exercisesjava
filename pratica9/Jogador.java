import java.io.Serializable;

public class Jogador implements Serializable {
	private static final long serialVersionUID = -4955674319680775586L;
	String nome;
	double score;

	public void setScore(double score) {
		if (score > this.score)
			this.score = score;
	}

	public double getScore() {
		return score;
	}

	public String toString() {
		return String.format("%s (%.2f c/s)", nome, score);
	}
}
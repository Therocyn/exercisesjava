package pratica3;

public class Circulo {
 private double x, y, raio;
 private int identificador;
 private static int numCirculos = 0;
 private static final double Pi = 3.1415;
 public Circulo(double x, double y, double raio) {
	 Circulo.numCirculos += 1;
	 identificador = Circulo.numCirculos;
	 this.x=x;
	 this.y=y;
	 this.raio=raio;
 }
 public void move(String direcao, double deslocamento) {
	 if(direcao == "direita") {
		 x+=deslocamento;
	 }
	 if(direcao == "esquerda") {
		 x-=deslocamento;
	 }
	 if(direcao == "cima") {
		 y+=deslocamento;
	 }
	 if(direcao == "baixo") {
		 y-=deslocamento;
	 }
 }
 public double area() {
	 return (Pi*raio*raio);
 }
 public double circunferencia() {
	 return (2*Pi*raio);
 }
 public void imprime() {
	 System.out.println("C"+identificador+" = {("+x+", "+y+"), "+raio+"}\n");
 }
 public int getIdentificador() {
	 return identificador;
 }
 public static boolean sobreposicao(Circulo c1, Circulo c2) {
	 if((((c1.x-c2.x)*(c1.x-c2.x)) + ((c1.y-c2.y)*(c1.y-c2.y))) <= ((c1.raio+c2.raio)*(c1.raio+c2.raio)))
		 return true;
	 else
		 return false;
 }
 
}
package ponto;

import java.lang.Math;
public class PontoPainel8x6 {

	private int x, y;
	
 public boolean setX(int x) {
	 if (x>=0 && x<6) {
	 this.x = x;
	 return true;
	 }
	 else {
	 reset();
	 return false;
	 }
 }	 
 
 public boolean setY(int y) {
	 if (y>=0 && y<8) {
	 this.y = y;
	 return true;
	 }
	 else {
	 reset();
	 return false;
	 }
 }	 
 
 public int getX() {
	 return this.x;
 }
 
 public int getY() {
	 return this.y;
 }
 
 
private void reset() {
	x=0;
	y=0;
}

public void imprime() {
	System.out.printf("Coordenadas: (%d, %d)\n", x, y);
}

public int distancia(PontoPainel8x6 p) {
	int dm;
	dm=Math.abs(p.x-x) + Math.abs(p.y-y);
	return dm;
}

}

package arraylist;

public class point2 {

	public static void main(String[] args) {
		point p1 = new point(2, 7);
		point p2 = new point(3, 8);
		// p1=(2,7) orjine uzaklýðý:

		System.out.println("p1(" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("orijine uzaklýk: " + p1.distancefromorigin());

		System.out.println("p1(" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println("orijine uzaklýk: " + p2.distancefromorigin());

		p1.translate(9, 8);
		System.out.println("p1(" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("orijine uzaklýk: " + p1.distancefromorigin());
		p2.translate(10, 9);
		System.out.println("p1(" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println("orijine uzaklýk: " + p2.distancefromorigin());

	}

}

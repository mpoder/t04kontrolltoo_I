public class test1 {
  public static void main(String[] args) {
    polygon poly1 = new polygon();
    polygon poly2 = new polygon();
    poly1.addX(12);
    poly1.addY(116);
    poly1.addX(32);
    poly1.addY(94);
    poly1.addX(56);
    poly1.addY(78);
    poly1.addX(73);
    poly1.addY(31);
    poly2.addX(1);
    poly2.addY(1);
    poly2.addX(2);
    poly2.addY(2);
    poly2.addX(3);
    poly2.addY(3);
    System.out.println("First x: " + poly1.askX(0));
    System.out.println("Fourth y: " + poly1.askY(3));
  }
}

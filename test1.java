public class test1 {
  public static void main(String[] args) {
    polygon poly1 = new polygon();
    polygon poly2 = new polygon();
    poly1.addX(0);
    poly1.addY(0);
    poly1.addX(2);
    poly1.addY(3);
    poly1.addX(4);
    poly1.addY(0);
    poly2.addX(1);
    poly2.addY(1);
    poly2.addX(4);
    poly2.addY(4);
    poly2.addX(2);
    poly2.addY(2);
    System.out.println("First x: " + poly1.askX(0));
    System.out.println("Third y: " + poly1.askY(2));
    if (poly1.isTriangle()) {
      System.out.println("First polygon is a triangle");
      if (poly1.isEquilateral()) {
        System.out.println("First polygon is equilateral.");
      };
    }
    if (poly2.isTriangle()) {
      System.out.println("Second polygon is a triangle");
      if (poly2.isEquilateral()) {
        System.out.println("Second polygon is equilateral.");
      };
    }
  }
}

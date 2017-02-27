import java.util.ArrayList;
import java.util.List;

public class polygon {
    List<Integer> x = new ArrayList<Integer>();
    List<Integer> y = new ArrayList<Integer>();
    public void addX(int number) {
      x.add(number);
    }
    public void addY(int number) {
      y.add(number);
    }
    public int askX(int number) {
      return x.get(number);
    }

    public int askY(int number) {
      return y.get(number);
    }

    public boolean isTriangle() {
      if (x.size() == 3 && y.size() == 3) {
        return true;
      } else {
        return false;
      }
    }

    public boolean isEquilateral() {
      if (this.isTriangle()) {
        double calcx1 = (x.get(1) - x.get(0))*(x.get(1) - x.get(0));
        double calcx2 = (x.get(2) - x.get(1))*(x.get(2) - x.get(1));
        double calcx3 = (x.get(0) - x.get(2))*(x.get(0) - x.get(2));
        double calcy1 = (y.get(1) - y.get(0))*(y.get(1) - y.get(0));
        double calcy2 = (y.get(2) - y.get(1))*(y.get(2) - y.get(1));
        double calcy3 = (y.get(2) - y.get(0))*(y.get(2) - y.get(0));
        double len1 = Math.round(Math.sqrt(calcx1+calcy1));
        double len2 = Math.round(Math.sqrt(calcx2+calcy2));
        double len3 = Math.round(Math.sqrt(calcx3+calcy3));
        System.out.println("Debug: len1:" + len1);
        System.out.println("Debug: len2:" + len2);
        System.out.println("Debug: len3:" + len3);
        if (len1 == len2 && len2 == len3) {
          return true;
      } else {
        return false;
      }
    } else {return false;}
}
}

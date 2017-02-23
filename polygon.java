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
        return true;
      } else {
        return false;
      }
      
    }
}

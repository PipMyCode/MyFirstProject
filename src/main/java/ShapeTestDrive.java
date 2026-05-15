public class ShapeTestDrive {
    public static void main(String[] args) {

      Circle c = new Circle(3);
      Triangle t = new Triangle(4, 5);
      Rectangle r = new Rectangle(7, 9);


      System.out.println(t.area());
      System.out.println(r.area());
      System.out.println(c.area());


    }
}

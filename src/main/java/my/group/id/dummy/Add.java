package my.group.id.dummy;

public class Add {
  
  // Comentari per git
  public static int add(int a, int b) {
    return a+b;
  }

  public Integer addition(Integer a, Integer b) {
      return Add.add(a, b);
  }

  public static void main(String[] args) {
      Add add = new Add();
      System.out.println(add.addition(3,2));
      System.out.println(add(3,2));
  }
}

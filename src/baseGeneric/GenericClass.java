package baseGeneric;

// class yg bisa menerima parameter type apapun - general
public class GenericClass<T> {
  private T t;
  private static String text;

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public static String getText() {
    return text;
  }

  public static void setText(String text) {
    GenericClass.text = text;
  }

  public static void main(String[] args) {
    GenericClass<String> genericString = new GenericClass<>();
    GenericClass<Integer> genericInt = new GenericClass<>();

    genericString.setT("Testing generic class");
    genericInt.setT(1000);

    System.out.println(genericString.getT());
    System.out.println(genericInt.getT());

    setText("text");
    System.out.println(getText());
  }
}

class Tester {
  public static void main(String[] args) {
    GenericClass.setText("ini text");
    System.out.println(GenericClass.getText());
  }
}

public class Learn{
  public static void main(String[] args) {
    System.out.println("Today i will learn about Class Inheritance in Java.");

    
        ClassA objectA = new ClassA();
        
        objectA.firstMethod();

        String responseFromFirstMethod = objectA.firstMethod();

        System.out.println(responseFromFirstMethod);
        ClassB objectB = new ClassB();
        objectB.methodInClassB();

        String varResponse = objectB.firstMethod();
        System.out.println(varResponse);
  }
}

class ClassA{
  public String firstMethod(){
    return"This response is return by invocation of method firstMethod in ClassA";
  }
}

class ClassB extends ClassA{
  public void methodInClassB()
  {
    System.out.println("This statment i an output from invocation of method named methodInClassB.");
  }
}
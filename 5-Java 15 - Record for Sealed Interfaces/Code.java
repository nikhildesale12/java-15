public class APITester {
   public static void main(String[] args) {
      Person employee = new Employee(23, "nIKHIL");
      System.out.println(employee.id());
	   System.out.println(employee.name());
   }
}
sealed interface Person permits Employee, Manager {
   int id();
   String name();
}
record Employee(int id, String name) implements Person {}
record Manager(int id, String name) implements Person {}
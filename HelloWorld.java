public class HelloWorld { 
   public static void main(String[] args) { 
      String name = args[0];
	  showHello(name);
   }
   
   private void showHello(String name){
	   System.out.println("Hi " + name + ", welcome to hello world!");
   }
}

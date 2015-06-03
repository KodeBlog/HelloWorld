public class HelloWorld { 
   public static void main(String[] args) { 
        FORMHelloWorld stForm = new FORMHelloWorld(null, true);
		FORMHelloWorld.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		FORMHelloWorld.pack();
		FORMHelloWorld.setLocationRelativeTo(null);

		FORMHelloWorld.setVisible(true);
   }
}

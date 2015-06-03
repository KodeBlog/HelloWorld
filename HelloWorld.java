public class HelloWorld { 
   public static void main(String[] args) { 
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            // handle exception
        }
		
		FORMHelloWorld stForm = new FORMHelloWorld(null, true);
		FORMHelloWorld.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		FORMHelloWorld.pack();
		FORMHelloWorld.setLocationRelativeTo(null);

		FORMHelloWorld.setVisible(true);
   }
}

/****************************************************************************** 
*  Compilation:  javac R01_DCL00_J.java 
*  Execution:    java R01_DCL00_J.java
*  Prevent class initialization cycles
 * ******************************************************************************/

public class R01_DCL00_J {
    public static class Cycle {
        private final int balance;
        private static final int deposit = (int) (Math.random() * 100); // Gives random deposit
        private static final Cycle c = new Cycle();

        public Cycle() {
            balance = deposit - 10; // Processing fee subtracted
        }
        
        public static void main(String[] args) {
            System.out.println("The account balance is: $" + c.balance );
        }
    }
    public static void main(String[] args){
        Cycle.main(args);
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        System.out.println("Same instance? " + (logger1 == logger2));
        
        logger1.log("Test message from logger1");
        logger2.error("Test error from logger2");
        
        try {
            // Try to break Singleton via reflection (should fail)
            Logger logger3 = Logger.class.getDeclaredConstructor().newInstance();
            logger3.warn("This should not print!");
        } catch (Exception e) {
            System.out.println("Failed to create new instance: " + e.getMessage());
        }
    }
}
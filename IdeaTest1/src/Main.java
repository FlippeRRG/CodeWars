public class Main {
    public static void main(String[] args) throws Exception {
        opaopa();
    }
    private static void opaopa() throws Exception {
        System.out.println(">");
        if (Math.random() <= 0.33) {
            throw new Exception();
        }
        System.out.println("<");
    }
}

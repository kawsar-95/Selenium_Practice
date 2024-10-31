class JavaBasic {

    public static void main(String[] args) {
        // String literal
        String s5 = "hello";

        // New String object
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String s = "Rahul Shetty Academy";
        String[] splittedString = s.split("Shetty");

        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());

        // Print characters in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }
}
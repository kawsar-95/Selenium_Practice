 class JavaMethod {

    public static void main(String[] args) {
        JavaMethod d = new JavaMethod();
        String name = d.getData();
        System.out.println(name);

        JavaMethod.JavaMethod2 d1 = d.new JavaMethod2();
        d1.getUserData();

        getData2();
    }

    public String getData() {
        System.out.println("hello world");
        return "rahul shetty";
    }

    public static String getData2() {
        System.out.println("hello world");
        return "rahul shetty";
    }

    public class JavaMethod2 {
        public void getUserData() {
            System.out.println("User data");
        }
    }
}
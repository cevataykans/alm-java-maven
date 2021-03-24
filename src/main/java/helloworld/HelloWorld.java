package helloworld;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World, Maven, please review me");
		
        System.out.println(mavenResponder());
		System.out.println("Thank you for the review");
    }

    public static String mavenResponder(){
        return "Hi, nice to meet you, I will review you";
    }
}

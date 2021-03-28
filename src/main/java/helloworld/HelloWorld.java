package helloworld;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World, Maven, please review me");
		
        System.out.println(mavenResponder());
    }

    public static String mavenResponder(){
        return "Hi, nice to meet you, I have finished my review";
    }
}

package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Alice"));
        System.out.println(sayHelloToSomeone("Bob"));
        System.out.println(sayHelloToSomeone("Charlie"));
        System.out.println(sayHelloToSomeone("Zena"));
        System.out.println(sayHelloToSomeone("Tapasi"));
        System.out.println(sayHelloToSomeone("Sharief"));
        System.out.println(sayHelloToSomeone("Victoria"));
        System.out.println(sayHelloToSomeone("Adam"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}

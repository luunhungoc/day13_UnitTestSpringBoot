package demo;

import org.springframework.stereotype.Component;

@Component
public class MathHelper {

    public MathHelper() {
        System.out.println("MathHelper is initialized.");
    }
     int add(int a, int b){
        return a+b;
    }
     double divide(int a, int b){
        return (double) a/b;
    }

}

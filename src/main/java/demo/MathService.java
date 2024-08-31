package demo;

import org.springframework.stereotype.Component;

@Component
public class MathService {

    MathHelper mathHelper;
    public MathService(){
        this.mathHelper=new MathHelper();
    }

    public int add(int a, int b){
        return mathHelper.add(a,b);
    }
    double divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Division by zero");
        }
        return mathHelper.divide(a,b);
    }
}

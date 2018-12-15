package lesson.lesson1;

public class Calculator {
    public int sum(int a, int b){
        return Math.abs(a)+ Math.abs(b);
    }
    public int div(int d, int c){
        if (c == 0)
            throw new IllegalArgumentException("c can not be zero!");
        else
        return Math.abs(d)/Math.abs(c);
    }

}

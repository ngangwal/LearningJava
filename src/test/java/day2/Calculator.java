package day2;

public class Calculator {

    public void addNumber(int x, int y){
        int sum =  x + y ;
        System.out.println("sum "  + sum  );
    }

    public void subNumber(int x, int y){
        int sub  =  x - y ;
        System.out.println("Sub "  + sub  );
    }

    public void multiplyNumber(int x, int y){
        int multiply =  x * y ;
        System.out.println("multiply "  + multiply  );
    }
    public void divNumber(int x, int y){
        int div =  x / y ;
        System.out.println("division "  + div  );
    }
public void addNumber(int x, float y , int z){
        float sumoverload = x+y+z;
        System.out.println("overload example " + sumoverload);
}
    public static void main(String a[]){
        Calculator calc = new Calculator();
        calc.addNumber(10,5);
        calc.subNumber(10,5);
        calc.divNumber(10,5);
        calc.multiplyNumber(10,5);
        calc.addNumber(10,5.5f,2);


    }
}

/**
 * Main class
 * @author Mirko Franco
 */


public class Start {

    public static void main(String[] args) {

        ArithmeticOperators sum = new ArithmeticOperators();
        ArithmeticOperators sub = new ArithmeticOperators();
        ArithmeticOperators mul = new ArithmeticOperators();
        ArithmeticOperators div = new ArithmeticOperators();


        sum.sum(6, 6);
        sub.sub(7, 4);
        mul.mul(6, 8);
        div.div(20, 5);


    }
}

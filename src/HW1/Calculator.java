package HW1;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //при попытке делить на ноль должна выходить ошибка ArithmeticException
    BinaryOperator<Integer> devide = Calculator::apply;


    UnaryOperator<Integer> pow = x -> x * x;

    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;


    private static int apply(Integer x, Integer y) {
        if (y == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return x/y;
    }
}

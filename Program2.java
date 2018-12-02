package ru.geekbrains;
public class Program {
    public static void main(String[] args) {
        Expression expr = new Expression("(a + 4) * ((b - 7) / [a - 5 * {a - 2)])");
        System.out.println(expr.checkBrackets());
    }
}

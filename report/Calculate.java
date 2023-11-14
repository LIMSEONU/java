package classes;

import java.util.Scanner;

class Add {
    private int a;
    private int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return this.a + this.b;
    }
}

class Sub {
    private int a;
    private int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return this.a - this.b;
    }
}

class Mul {
    private int a;
    private int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return this.a * this.b;
    }
}

class Div {
    private int a;
    private int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return this.a / this.b;
    }
}

public class Calculate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1;
        int n2;
        String oper;

        System.out.print("두 정수와 연산자를 입력하시오>>");
        n1 = scn.nextInt();
        n2 = scn.nextInt();
        oper = scn.next();

        switch (oper) {
            case "+":
                Add add = new Add();
                add.setValue(n1, n2);
                System.out.println(add.calculate());
                break;
            case "-":
                Sub sub = new Sub();
                sub.setValue(n1, n2);
                System.out.println(sub.calculate());
                break;
            case "*":
                Mul mul = new Mul();
                mul.setValue(n1, n2);
                System.out.println(mul.calculate());
                break;
            case "/":
                Div div = new Div();
                div.setValue(n1, n2);
                System.out.println(div.calculate());
                break;
        }
    }
}

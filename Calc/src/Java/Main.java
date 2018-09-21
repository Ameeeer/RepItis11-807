package Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag = false;
        double first = 0;
        double x = 0;
        while (1 == 1) {
            Scanner sc = new Scanner(System.in);
            if (!flag) {
                first = sc.nextInt();
            }
            String oper = sc.next();
            double second = sc.nextInt();
            if (oper.equals("+")) {
                if (oper.equals("+") && flag == true) {
                    x += second;
                } else {
                    x = first + second;
                }
            }
            if (oper.equals("-")) {
                if (oper.equals("-") && flag == true) {
                    x = first - second;
                } else {
                    x = first - second;
                }
            }
            if (oper.equals("*")) {
                if (oper.equals("*") && flag == true) {
                    x = first * second;
                } else {
                    x = first * second;
                }
            }
            if (oper.equals("/")) {
                if (oper.equals("/") && flag == true) {
                    x = first / second;
                } else {
                    x = first / second;
                }
            }
            System.out.println("Ответ =" + " " + x);
            System.out.println("Сбросить результат?" + " " + "yes = y" + " " + "no = n");
            String flagS = sc.next();
            flag = false;
            if (flagS.equals("n")) {
                first = x;
                flag = true;
            }
        }

    }
}


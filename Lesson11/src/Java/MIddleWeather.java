package Java;

import javax.swing.text.html.parser.Parser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MIddleWeather {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("src/Java/Files/weather.txt");
        Scanner sc = new Scanner(f1);
        PrintWriter pw = new PrintWriter("src/Java/Files/out.txt");
        double sum = 0;
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            String[] arr =  str.split(" ");
            int a = Integer.parseInt(arr[2]);
            sum+=a;
        }
        System.out.println(sum/7);
        sum/=7;
        pw.println(sum);
        pw.close();
    }
}

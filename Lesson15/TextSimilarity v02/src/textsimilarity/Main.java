package textsimilarity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //то же, что в v00
        TextAnalyzer a = new CosinusAnalyze();
        TextAnalyzer b = new JaccardAnalyze();
        String s1 = "Мама мыла раму, а я ничего не делал Мама";
        String s2 = "Я совсем ничего не делал";
        String s3 = "Мама";
        String s4 = "Рама и мама";
        String s5 = "Мама мыла";
        String s6 = "Рама мыла маму";
        /*double coef1 = a.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
        System.out.println("Жаккард для просто строк: " + coef1);*/

        //Тоже вычисляем коэффициент, только сравниваем текст, хранящийся в двух файлах.
        //Текст в файлах точно такой же как при сравнении выше, поэтому результаты одинаковые
        File f1 = createFile("f1.txt", s1);
        File f2 = createFile("f2.txt", s2);
        File f3 = createFile("f2.txt", s3);
        File f4 = createFile("f2.txt", s4);
        File f5 = createFile("f2.txt", s5);
        File f6 = createFile("f2.txt", s6);
        double coef2 = b.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
        System.out.println("Жаккард для содержимого файлов: " + coef2);
        double coef3 = a.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
        System.out.println("Cosinus для содержимого файлов: " + coef3);
    }

    //Method for testing only.
    static File createFile(String fileName, String content) throws FileNotFoundException {
        File f = new File(fileName);
        PrintWriter pw = new PrintWriter(f);
        pw.print(content);
        pw.close();
        return f;
    }
}
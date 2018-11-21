package textsimilarity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchEngineTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextProvider query = new SimpleTextProvider("Мама мыла");
        TextProvider tp1 = new SimpleTextProvider("Мама мыла раму");
        TextProvider tp2 = new SimpleTextProvider("Мама раму мыла");
        TextProvider tp3 = new SimpleTextProvider("Мама помыла раму");
        TextProvider tp4 = new SimpleTextProvider("Мама и рама");
        List<TextProvider> providers = new ArrayList<>();
        providers.add(tp1);
        providers.add(tp3);
        providers.add(tp4);
        providers.add(tp2);
        int x = sc.nextInt();
        if (x == 1) {
            JaccardAnalyze ja = (JaccardAnalyze) new JaccardAnalyze();
            SearchEngine se = new SearchEngineImpl( ja);
            List<TextProvider> results = se.getSortedByRelevanceList(query,providers);
            for (TextProvider tp : results) {
                System.out.println(tp);
            }
        }
//        if (x == 0) {
//            SearchEngine se = new SearchEngineImpl();
//            List<TextProvider> results = se.getSortedByRelevanceList(query, providers);
//            for (TextProvider tp : results) {
//                System.out.println(tp);
//            }
//        }
    }
}

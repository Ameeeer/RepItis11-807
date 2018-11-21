package textsimilarity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JaccardAnalyze implements SearchEngine,TextAnalyzer{
    private List<Double> getDoubles(List<String> target, List<TextProvider> sources) {
        List<Double> listDoubles = new ArrayList<>();
        for (int i = 0; i < sources.size(); i++) {
            List<String> list2 = moveToString(sources.get(i));
            double toList = jaccardSimilarity(target, list2);
            listDoubles.add(toList);
        }
        return listDoubles;
    }

    private void sortList(List<Double> list, List<TextProvider> listString) {
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    TextProvider textProvider = listString.get(j);
                    listString.set(j, listString.get(j + 1));
                    listString.set(j + 1, textProvider);
                    Double tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
            }
        }
    }


    private List<String> tokenizeForJaccard(String text) {
        text = text.replace(",", "");
        String[] words = text.split(" ");
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (!uniqueWords.contains(word))
                uniqueWords.add(word);
        }
        return uniqueWords;
    }

    private List<String> moveToString(TextProvider source) {
        List<String> list = tokenizeForJaccard(source.getText());
        return list;
    }

    private double jaccardSimilarity(List<String> l1, List<String> l2) {
        int commonWordsCount = 0;
        for (String word : l1) {
            if (l2.contains(word)) {
                commonWordsCount++;
            }
        }
        return (double) commonWordsCount / (l1.size() + l2.size() - commonWordsCount);
    }

    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources) {
        List<String> list1 = tokenizeForJaccard(target.getText());
        List<TextProvider> isSortedProviders = new ArrayList<>();
        for (int i = 0; i < sources.size(); i++) {
            isSortedProviders.add(sources.get(i));
        }
        sortList(getDoubles(list1, sources), isSortedProviders);
        Collections.reverse(getDoubles(list1, sources));
        Collections.reverse(isSortedProviders);
        return isSortedProviders;
    }

    @Override
    public double analyze(TextProvider te1, TextProvider te2) {
        return 0;
    }
}
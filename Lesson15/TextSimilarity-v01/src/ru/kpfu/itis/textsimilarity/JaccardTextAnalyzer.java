package ru.kpfu.itis.textsimilarity;

import java.util.ArrayList;
import java.util.List;



class JaccardAnalyze implements TextAnalyzer {
    @Override
    public double analyze(TextProvider te1, TextProvider te2) {
        List<String> list1 = tokenizeForJaccard(te1.getText());
        List<String> list2 = tokenizeForJaccard(te2.getText());
        return (double) jaccardSimilarity(list1, list2);
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

    private double jaccardSimilarity(List<String> l1, List<String> l2) {
        int commonWordsCount = 0;
        for (String word : l1) {
            if (l2.contains(word)) {
                commonWordsCount++;
            }
        }
        return (double) commonWordsCount / (l1.size() + l2.size() - commonWordsCount);
    }
}

class CosinusAnalyze implements TextAnalyzer {
    final class VectorResult {
        private final double[] arr1;
        private final double[] arr2;

        VectorResult(double[] arr1, double[] arr2) {
            this.arr1 = arr1;
            this.arr2 = arr2;
        }

        public double[] getArr1() {
            return arr1;
        }

        public double[] getArr2() {
            return arr2;
        }
    }
    @Override
    public double analyze(TextProvider te1, TextProvider te2) {
        List<String> list1 = tokenize(te1.getText());
        List<String> list2 = tokenize(te2.getText());
        List<String> list3 = unionTokens(list1, list2);
        VectorResult vector = getVector(list1, list2, list3);
        double[] vector1 = vector.getArr1();
        double[] vector2 = vector.getArr2();
        return (double) cosSimilarity(vector1, vector2);
    }

    /**
     * Returns a list of unique words found in an input text.
     * Words in the text can be delimited by one space or a space with a comma
     */

    private List<String> tokenize(String text) {
        text = text.replace(",", "");
        String[] words = text.split(" ");
        List<String> tokens = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            tokens.add(word);
        }
        return tokens;
    }

    private List<String> unionTokens(List<String> token1, List<String> token2) {
        List<String> unionTokes = new ArrayList<>();
        for (String tokens : token1) {
            if (!unionTokes.contains(token1)) {
                unionTokes.add(tokens);
            }
        }
        for (String tokens : token2) {
            if (!unionTokes.contains(token2)) {
                unionTokes.add(tokens);
            }
        }
        return unionTokes;
    }

    private VectorResult getVector(List<String> token1, List<String> token2, List<String> token3) {
        double[] arr1 = new double[token3.size()];
        double[] arr2 = new double[token3.size()];
        int count1 = 0;
        int count2 = 0;
        for (String tokens : token3) {
            if (token1.contains(tokens)) {
                arr1[count1] += 1;
            }
            count1++;
        }
        for (String tokens : token2) {
            if (token2.contains(tokens)) {
                arr2[count2] += 1;
            }
            count2++;
        }
        return new VectorResult(arr1, arr2);
    }

    /**
     * Calculates Jaccard similarity between two lists of unique string.
     * Returns the value of coefficient.
     */


    private double cosSimilarity(double[] vector1, double[] vector2) {
        double multiSum = 0;
        double sumOfSquaresVector1 = 0;
        double sumOfSquaresVector2 = 0;
        for (int i = 0; i < vector1.length; i++) {
            multiSum += vector1[i] * vector2[i];
            sumOfSquaresVector1 += Math.pow(vector1[i], 2);
            sumOfSquaresVector2 += Math.pow(vector2[i], 2);
        }
        return (double) multiSum / (Math.sqrt(sumOfSquaresVector1) * Math.sqrt(sumOfSquaresVector2));
    }
}

















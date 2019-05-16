package com.company.anonymous;

public class ToUpperCaseTextProcessingRule implements TextProcessingRule {
    //все строчные буквы заменяет на заглавные
    @Override
    public String process(String s) {
        char[] symbols = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < symbols.length; i++) {
            char symbol = symbols[i];
            if (symbol >= 'a' && symbol <= 'z') {
                symbol = (char) (symbol - 32);
            }
            result.append(symbol);//fixme use StringBuilder instead
        }
        return result.toString();
    }
}

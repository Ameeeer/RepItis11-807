package textsimilarity;

import java.util.List;


public class SearchEngineImpl implements SearchEngine {
    TextAnalyzer analyzer;

    public SearchEngineImpl(JaccardAnalyze ja) {
        analyzer = ja;
    }
    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources) {
        List<TextProvider> toEnd = ((JaccardAnalyze) analyzer).getSortedByRelevanceList(target, sources);
        return toEnd;
    }
}

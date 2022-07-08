package service;

import org.junit.platform.commons.util.StringUtils;

public final class SentenceFinder {

    /*
        Find the sentence containing the largest number of words in some given text.
    */
    public static int getLongestSequenceSize(String text){
        if(StringUtils.isBlank(text)) return 0;
        int longestSequenceSize = 0;
        String[] sentenceList = text.split("[!?.]+");
        for(int i = 0; i < sentenceList.length; i++){
            longestSequenceSize = Math.max(countWordOfSentence(sentenceList[i]), longestSequenceSize);
        }
        return longestSequenceSize;
    }

    public static int countWordOfSentence(String sentence){
        if(sentence.length() > 1) sentence = sentence.trim();
        String words[] = sentence.split("\\s+");
        if(words.length != 0 && !words[0].isEmpty()) {
            return words.length;
        }
        return 0;
    }
}

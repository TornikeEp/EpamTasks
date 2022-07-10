package service;

import org.junit.platform.commons.util.StringUtils;

public final class SentenceFinder {

    /*
        Find the sentence containing the largest number of words in some given text.
    */
    public static int getLongestSentenceSize(String text){
        if(StringUtils.isBlank(text)) return 0;
        int longestSentenceSize = 0;
        String[] sentenceList = text.split("[!?.]+");
        for(int i = 0; i < sentenceList.length; i++){
            longestSentenceSize = Math.max(countWordOfSentence(sentenceList[i]), longestSentenceSize);
        }
        return longestSentenceSize;
    }

    public static int countWordOfSentence(String sentence){
        if(sentence.length() > 1) sentence = sentence.trim();
        String words[] = sentence.split("\\s+");
        if(words.length != 0 && !words[0].isEmpty()) {
            return words.length;
        }
        return 0;
    }

    /*
        Implementation with arrays and without split
     */
    public static int getLongestSentenceWithArray(String text){
        if(StringUtils.isBlank(text)) return 0;
        int sentenceStartIndex, sentenceEndIndex, textIndex, longestSentenceSize;
        sentenceStartIndex = sentenceEndIndex = textIndex = longestSentenceSize = 0;
        while(textIndex < text.length()){
            char ch = text.charAt(textIndex);
            if(ch == '!' || ch == '.' || ch == '?'){
                String sentence = text.substring(sentenceStartIndex, sentenceEndIndex);
                textIndex = sentenceEndIndex + 1;
                sentenceEndIndex = sentenceStartIndex = textIndex;
                longestSentenceSize = Math.max(longestSentenceSize, getWordCountInSentence(sentence));
            } else {
                sentenceEndIndex++;
                if(textIndex == text.length() - 1){
                    String sentence = text.substring(sentenceStartIndex, sentenceEndIndex);
                    return Math.max(longestSentenceSize, getWordCountInSentence(sentence));
                }
                textIndex++;
            }
        }
        return longestSentenceSize;
    }

    public static int getWordCountInSentence(String sentence) {
        if(StringUtils.isBlank(sentence)) return 0;
        int numberOfWords = 0;
        boolean isWord = false;
        char[] characters = sentence.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i])) {
                if (i == sentence.length() - 1) return numberOfWords + 1;
                isWord = true;
            } else if (!Character.isLetter(characters[i]) && isWord) {
                numberOfWords++;
                isWord = false;
            }
        }
        return numberOfWords;
    }
}

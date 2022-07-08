package service;

public final class SentenceFinder {

    /*
        Find the sentence containing the largest number of words in some given text.
    */
    public static int getLongestSequenceSize(String s){
        if(s == null || s.isEmpty()) return 0;
        int result = 0;
        String[] sentenceList = s.split("[!?.]+");
        for(int i = 0; i < sentenceList.length; i++){
            if(sentenceList[i].length() > 1) sentenceList[i] = sentenceList[i].trim();
            String words[] = sentenceList[i].split("\\s+");
            if(words.length != 0 && !words[0].isEmpty()) result = Math.max(result, words.length);
        }
        return result;
    }
}

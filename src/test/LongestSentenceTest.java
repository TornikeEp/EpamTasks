package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.SentenceFinder;

public class LongestSentenceTest {

    @Test
    public void testEmptyString(){
        Assertions.assertEquals(0, SentenceFinder.getLongestSentenceSize(null));
        Assertions.assertEquals(0, SentenceFinder.getLongestSentenceSize(""));
        Assertions.assertEquals(0, SentenceFinder.getLongestSentenceSize("  !  "));
        Assertions.assertEquals(0, SentenceFinder.getLongestSentenceSize("!.?.!"));
        Assertions.assertEquals(0, SentenceFinder.getLongestSentenceSize(". ! ? ? . ?"));
    }

    @Test
    public void testConcatenatedString(){
        String s1 = "We are the best test coders. Give us a try? !";
        String s2 = "But he will almost certainly spend more time behind bars following the sentencing. His sentence is " +
                "due to be followed by five years of supervised release.";
        String concatenatedStr = s1 + s1;
        String concatenatedStr2 = s2 + s2;
        String concatenatedStr3 = s1 + s2;
        Assertions.assertEquals(6, SentenceFinder.getLongestSentenceSize(s1));
        Assertions.assertEquals(13, SentenceFinder.getLongestSentenceSize(s2));
        Assertions.assertEquals(6, SentenceFinder.getLongestSentenceSize(concatenatedStr));
        Assertions.assertEquals(13, SentenceFinder.getLongestSentenceSize(concatenatedStr2));
        Assertions.assertEquals(13, SentenceFinder.getLongestSentenceSize(concatenatedStr3));
    }

    @Test
    public void testSameWords(){
        String s1 = "    Car   is   going   ";
        String s2 = "    Car   is   going   .";
        String s3 = ".    Car   is   going   .";
        String s4 = ".    Car  ? is  ! going   .";
        Assertions.assertEquals(3, SentenceFinder.getLongestSentenceSize(s1));
        Assertions.assertEquals(3, SentenceFinder.getLongestSentenceSize(s2));
        Assertions.assertEquals(3, SentenceFinder.getLongestSentenceSize(s3));
        Assertions.assertEquals(1, SentenceFinder.getLongestSentenceSize(s4));
    }
}

package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.SentenceFinder;

public class SentenceFinderTest {

    @Test
    public void testEmptyString(){
        Assertions.assertEquals(0, SentenceFinder.getLongestSequenceSize(null));
        Assertions.assertEquals(0, SentenceFinder.getLongestSequenceSize(""));
        Assertions.assertEquals(0, SentenceFinder.getLongestSequenceSize("  !  "));
        Assertions.assertEquals(0, SentenceFinder.getLongestSequenceSize("!.?.!"));
        Assertions.assertEquals(0, SentenceFinder.getLongestSequenceSize(". ! ? ? . ?"));
    }

    @Test
    public void testConcatenatedString(){
        String s1 = "We are the best test coders. Give us a try? !";
        String s2 = "But he will almost certainly spend more time behind bars following the sentencing. His sentence is " +
                "due to be followed by five years of supervised release.";
        String concatenatedStr = s1 + s1;
        String concatenatedStr2 = s2 + s2;
        String concatenatedStr3 = s1 + s2;
        Assertions.assertEquals(6, SentenceFinder.getLongestSequenceSize(s1));
        Assertions.assertEquals(13, SentenceFinder.getLongestSequenceSize(s2));
        Assertions.assertEquals(6, SentenceFinder.getLongestSequenceSize(concatenatedStr));
        Assertions.assertEquals(13, SentenceFinder.getLongestSequenceSize(concatenatedStr2));
        Assertions.assertEquals(13, SentenceFinder.getLongestSequenceSize(concatenatedStr3));
    }

    @Test
    public void testSameWords(){
        String s1 = "    Car   is   going   ";
        String s2 = "    Car   is   going   .";
        String s3 = ".    Car   is   going   .";
        String s4 = ".    Car  ? is  ! going   .";
        Assertions.assertEquals(3, SentenceFinder.getLongestSequenceSize(s1));
        Assertions.assertEquals(3, SentenceFinder.getLongestSequenceSize(s2));
        Assertions.assertEquals(3, SentenceFinder.getLongestSequenceSize(s3));
        Assertions.assertEquals(1, SentenceFinder.getLongestSequenceSize(s4));
    }
}

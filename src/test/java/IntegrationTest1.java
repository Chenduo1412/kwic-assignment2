import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class IntegrationTest1 {

    @org.junit.jupiter.api.Test
    void testCase1() {
        String input="Back to the Future\n" +
                "Desperado\n" +
                "Night at the Museum\n" +
                "Robocop\n" +
                "Ghostbusters\n" +
                "Cool World\n" +
                "Donnie Darko\n" +
                "Double Indemnity";
        String wordsToIgnore="";
        String wordsRequired="";
        ArrayList<String> orgls = new ArrayList<String>();
        ArrayList<String> fullStrArr = new ArrayList<String>();
        contertToList(input,orgls);
        CircularShifter cs=new CircularShifter(ls,wordsToIgnore,wordsRequired);
        cs.shift(orgls,fullStrArr);

        Alphabetizer alp=new Alphabetizer(fullStrArr);
        alp.alpha();

        String result = "";
        convertToString(fullStrArr,result);
        assertEquals(result,"at the Museum Night\n" +
                "Back to the Future\n" +
                "Cool World\n" +
                "Darko Donnie\n" +
                "Desperado\n" +
                "Donnie Darko\n" +
                "Double Indemnity\n" +
                "Future Back to the\n" +
                "Ghostbusters\n" +
                "Indemnity Double\n" +
                "Museum Night at the\n" +
                "Night at the Museum\n" +
                "Robocop\n" +
                "the Future Back to\n" +
                "the Museum Night at\n" +
                "to the Future Back\n" +
                "World Cool");
    }


    @org.junit.jupiter.api.Test
    void testCase2() {
    }

    @org.junit.jupiter.api.Test
    void testCase3() {
    }

    @org.junit.jupiter.api.Test
    void testCase4() {
    }

    @org.junit.jupiter.api.Test
    void testCase5() {
    }
}
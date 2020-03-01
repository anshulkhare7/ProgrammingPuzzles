import java.util.*;
import AlienLanguage;

class AlienLanguageTest {

    private AlienLanguage alienLanguage;

    AlienLanguageTest(){
        alienLanguage = new AlienLanguage();
    }

    public static void main(String[] args) {

        AlienLanguageTest alt = new AlienLanguageTest();
        
        alt.test01_AlienLanguageV1("pqr", new String[] {"pq", "pr", "qr", "rqp"});
        alt.test02_AlienLanguageV1("xyz", new String[] {"xyz", "yyy", "yyz"});
        alt.test03_AlienLanguageV1("defg", new String[] {"def", "eg", "fee", "fg", "gdd", "geg"});

        alt.test01_AlienLanguageV2(true, new String[] {"hello","dear"}, "hlabcdefgijkmnopqrstuvwxyz".toCharArray());
        alt.test02_AlienLanguageV2(false, new String[] {"colony","cold"}, "hlabcdefgijkmnopqrstuvwxyz".toCharArray());
        alt.test03_AlienLanguageV2(false, new String[] {"hello", "hell"}, "hlabcdefgijkmnopqrstuvwxyz".toCharArray());

    }

    void test01_AlienLanguageV1(String expected, String[] input){
        String result = alienLanguage.version_1(input);
        if(expected.equals(result)){
            System.out.println("Test Case test01_AlienLanguageV1 passed.");
        }else{
            System.out.println("Test Case test01_AlienLanguageV1 FAILED. Expected: "+expected+" Actual: "+result);
        }
    }

    void test02_AlienLanguageV1(String expected, String[] input){    
        String result = alienLanguage.version_1(input);        
        if(expected.equals(result)){
            System.out.println("Test Case test02_AlienLanguageV1 passed.");
        }else{
            System.out.println("Test Case test02_AlienLanguageV1 FAILED. Expected: "+expected+" Actual: "+result);
        }
    }
    
    void test03_AlienLanguageV1(String expected, String[] input){
        String result = alienLanguage.version_1(input);        
        if(expected.equals(result)){
            System.out.println("Test Case test03_AlienLanguageV1 passed.");
        }else{
            System.out.println("Test Case test03_AlienLanguageV1 FAILED. Expected: "+expected+" Actual: "+result);
        }

    }

    void test01_AlienLanguageV2(boolean expected, String[] input, char[] order){
        boolean result = alienLanguage.version_2(input, order);
        if(result==expected){
            System.out.println("Test Case test01_AlienLanguageV2 passed.");
        }else{
            System.out.println("Test Case test01_AlienLanguageV2 FAILED. Expected: "+expected+" Actual: "+result);
        }
        
    }

    void test02_AlienLanguageV2(boolean expected, String[] input, char[] order){
        boolean result = alienLanguage.version_2(input, order);
        if(result==expected){
            System.out.println("Test Case test02_AlienLanguageV2 passed.");
        }else{
            System.out.println("Test Case test02_AlienLanguageV2 FAILED. Expected: "+expected+" Actual: "+result);
        }        
    }

    void test03_AlienLanguageV2(boolean expected, String[] input, char[] order){
        boolean result = alienLanguage.version_2(input, order);
        if(result==expected){
            System.out.println("Test Case test03_AlienLanguageV2 passed.");
        }else{
            System.out.println("Test Case test03_AlienLanguageV2 FAILED. Expected: "+expected+" Actual: "+result);
        }        
    }    
}
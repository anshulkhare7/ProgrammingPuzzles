import java.util.*;

class AlienLanguageTest {

    private AlienLanguage alienLanguage;

    AlienLanguageTest(){
        alienLanguage = new AlienLanguage();
    }

    public static void main(String[] args) {

        AlienLanguageTest alt = new AlienLanguageTest();
        
        alt.test01_AlienLanguage("pqr", new String[] {"pq", "pr", "qr", "rqp"});
        alt.test02_AlienLanguage("xyz", new String[] {"xyz", "yyy", "yyz"});
        alt.test03_AlienLanguage("defg", new String[] {"def", "eg", "fee", "fg", "gdd", "geg"});                
    }

    void test01_AlienLanguage(String expected, String[] input){
        String result = alienLanguage.getOrder(input);
        if(expected.equals(result)){
            System.out.println("Test Case test01_AlienLanguage passed.");
        }else{
            System.out.println("Test Case test01_AlienLanguage FAILED. Expected: "+expected+" Actual: "+result);
        }
    }

    void test02_AlienLanguage(String expected, String[] input){    
        String result = alienLanguage.getOrder(input);        
        if(expected.equals(result)){
            System.out.println("Test Case test02_AlienLanguage passed.");
        }else{
            System.out.println("Test Case test02_AlienLanguage FAILED. Expected: "+expected+" Actual: "+result);
        }
    }
    
    void test03_AlienLanguage(String expected, String[] input){
        String result = alienLanguage.getOrder(input);        
        if(expected.equals(result)){
            System.out.println("Test Case test03_AlienLanguage passed.");
        }else{
            System.out.println("Test Case test03_AlienLanguage FAILED. Expected: "+expected+" Actual: "+result);
        }

    }    
}
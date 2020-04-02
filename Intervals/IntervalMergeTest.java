import java.util.*;

public class IntervalMergeTest {

    public static void main(String[] args) {
        IntervalMergeTest imt = new IntervalMergeTest();
        imt.testMergeInterval();
    }

    void testMergeInterval(){

        IntervalMerge im = new IntervalMerge();

        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(2,5));
        input.add(new Interval(7,9));
        input.add(new Interval(1,3));        
        input.add(new Interval(8,9));

        List<Interval> actual = im.mergeIntervals(input);
        List<Interval> expected = new ArrayList<Interval>();
        expected.add(new Interval(1,5));
        expected.add(new Interval(7,9));

        if(actual.size()!=expected.size()){
            System.out.println("Test Case testMergeInterval FAILED. Expected: "+expected.toString()+" Actual: "+actual.toString()); 
        }else{
            for(int i=0; i < actual.size(); i++){
                if(actual.get(i).start != expected.get(i).start || actual.get(i).end != expected.get(i).end){
                    System.out.println("Test Case testMergeInterval FAILED. Expected: "+expected.toString()+" Actual: "+actual.toString());                 
                    return;
                }
            }
            System.out.println("Test Case testMergeInterval Passed.");
        }                
    }
}
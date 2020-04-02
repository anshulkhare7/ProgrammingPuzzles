import java.util.*;

public class IntervalMerge {
    public static void main(String[] args) {
        
    }

    List<Interval> mergeIntervals(List<Interval> input){
        if(input==null || input.size() < 1){
            return new ArrayList<Interval>();
        }

        List<Interval> mergedInterval = new ArrayList<Interval>();

        Collections.sort(input, (x,y) -> Integer.compare(x.start, y.start));

        int start = input.get(0).start;
        int end = input.get(0).end;
                
        for(int i=1; i < input.size(); i++){
            if(input.get(i).start < end){
                end = input.get(i).end;
            }else{
                mergedInterval.add(new Interval(start, end));
                start = input.get(i).start;
                end = input.get(i).end;
            }                        
        }
        mergedInterval.add(new Interval(start, end));

        return mergedInterval;
    }
}
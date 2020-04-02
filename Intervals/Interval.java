
public class Interval {

    int start;
    int end;

    public Interval(int a, int b){
        this.start = a;
        this.end = b;
    }

    @Override
    public String toString() {        
        return "["+start+","+end+"]";
    }
}
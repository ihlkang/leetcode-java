package Array;

import java.util.ArrayList;
import java.util.List;

/*
 * 56 Ìâ
 * Merge Intervals
 */
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class Merge_Intervals {
	
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> result=new ArrayList<>();
		if(intervals.size()<=1){
			return intervals;
		}
		intervals.sort((i1,i2)->Integer.compare(i1.start, i2.start));
		int start=intervals.get(0).start;
		int end=intervals.get(0).end;
		for(int i=1;i<intervals.size();i++){
			if(intervals.get(i).start<=end){
				end=Math.max(end, intervals.get(i).end);
			}else{
				Interval inter=new Interval(start,end);
				result.add(inter);
				start=intervals.get(i).start;
				end=intervals.get(i).end;
			}
		}
		result.add(new Interval(start,end));
		return result;
	}
	public static void main(String[] args) {
		List<Interval> intervals=new ArrayList<>();
		Interval i1=new Interval(46,52);
		Interval i2=new Interval(51,54);
		Interval i3=new Interval(61,63);
		Interval i4=new Interval(74,78);
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		intervals.add(i4);
		Merge_Intervals mi=new Merge_Intervals();
		mi.merge(intervals);
	}

}

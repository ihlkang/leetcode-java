package Array;

import java.util.ArrayList;
import java.util.List;

/*
 * 57 Ìâ
 * Insert Interval
 */
public class Insert_Interval {

	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> result=new ArrayList<>();
		if(intervals.size()==0){
			result.add(newInterval);
			return result;
		}
		int i=0;
		intervals.sort((i1,i2)->Integer.compare(i1.start, i2.start));
		while(i<intervals.size() && intervals.get(i).end<newInterval.start){
			result.add(new Interval(intervals.get(i).start,intervals.get(i).end));
			i++;
		}
		while(i<intervals.size() && intervals.get(i).start<=newInterval.end){
			newInterval.start=Math.min(intervals.get(i).start,newInterval.start);
			newInterval.end=Math.max(intervals.get(i).end, newInterval.end);
			i++;
		}
		result.add(newInterval);
		while(i<intervals.size()){
			result.add(intervals.get(i));
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		
	}

}

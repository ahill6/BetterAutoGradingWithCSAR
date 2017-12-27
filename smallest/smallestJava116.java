package tmpStorage;
//9013bd3be8c00de447e6ed49a0fe0fab037251c28e26954bf780f2f3b929a9e7ce9da037811c76028e4069d3857410f82b8f399c7fa4386ea8f97f80aab1f191_001
//9013bd3be8c00de447e6ed49a0fe0fab037251c28e26954bf780f2f3b929a9e7ce9da037811c76028e4069d3857410f82b8f399c7fa4386ea8f97f80aab1f191_000
public class smallestJava116{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int first,int second,int third,int fourth){
	if ((first<second) && (first<third) && (first<fourth))
		return first;
	if ((second<first) && (second<third) && (second<fourth))
		return second;
	if ((third<first) && (third<second) && (third<fourth))
		return third;
	if ((fourth<third) && (fourth<second) && (fourth<first))
		return fourth;

	return -1;
}}

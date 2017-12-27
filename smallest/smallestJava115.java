package tmpStorage;
//9013bd3be8c00de447e6ed49a0fe0fab037251c28e26954bf780f2f3b929a9e7ce9da037811c76028e4069d3857410f82b8f399c7fa4386ea8f97f80aab1f191_000
//8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_001
public class smallestJava115{
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

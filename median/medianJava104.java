package tmpStorage.median;


//9013bd3be8c00de447e6ed49a0fe0fab037251c28e26954bf780f2f3b929a9e7ce9da037811c76028e4069d3857410f82b8f399c7fa4386ea8f97f80aab1f191_000
public class medianJava104{
	public static void main(String[] args){
	median(1.0,2.0,3.0);
}

	public static double median(double first, double second, double third){
	if ((first>second && first<third) || (first<second && first>third))
return first;
	if ((second>first && second<third) || (second<first && second>third))
return second;
	if ((third>first && third<second) || (third<first && third>second))
return third;
return -1;
}
}

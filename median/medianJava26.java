package tmpStorage.median;


//1bf73a9ca02e8d64fd54aaf8de9ad5d029ebfff775224c3f5b010db80793ea8698863524436d122a100abc08c3486a795eb1caf39f78fc55d3948124861669ac_000
public class medianJava26{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int first,int second,int third){
int ans;
	if ((first>second&&first<third) || (first>third&&first<second))
		ans=first;
	else if ((second>first&&second<third) || (second>third&&second<first))
		ans=second;
	else
		ans=third;
return ans;
}
}

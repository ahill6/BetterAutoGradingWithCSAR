package tmpStorage;
//6e464f2b5ba1d5ad3d4fc366e7d7712b424aabd8b41ca36257115a16416d202feb27397a413d04944c9ac76976fa8ff8ae646144855e08791ebf9593d1caaaca_000
//6aaeaf2ffb623b5736c0c0b9e8a1a3b080e8aef14d963d899eb3e4073245ad1171e26fb2a64fb88db6e40aa59e894a55eac832e38d444755cb3b6ad10ba74c62_001
public class medianJava80{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int median;
	if (((a > b) && (a < c)) || ((a < b) && (a > c)))
		median = a;
	else if (((b > a) && (c > b)) || ((b < a) && (b > c)))
		median = b;
	else
		median = c;
return median;
}
}

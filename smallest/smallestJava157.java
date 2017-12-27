package tmpStorage;
//d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_001
//d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_000
public class smallestJava157{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int first,int second,int third,int fourth){
		int lowest=-1;
			if (first<second) {
				lowest=first;
			}else if (second<first) {
				lowest=second;}
			if (third<lowest) {
				lowest=third;}
			if(fourth<lowest) {
				lowest=fourth;}
		return lowest;
	}
}

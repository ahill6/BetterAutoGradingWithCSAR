package tmpStorage;
//d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_000
//d009aa71ece41454c68d8038b5462d8eea8feb291bce1d53ee149f8477b5eab62ee28c7f690bf14dc6ce1d70c8943f7f3b3e4300965cb24da4cd2d2807dab19a_001
public class smallestJava156{
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

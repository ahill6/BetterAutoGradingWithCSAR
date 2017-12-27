package tmpStorage;
//fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_001
//fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_000
public class medianJava225{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
	while (a<b && a<c){
		if (b<c){
return b;

		}
		else{
return c;

		}
	}
	while (b<a && b<c){
		if (a<c){
return a;

		}
		else{
return c;

		}
	}
	while (c<a && c<b){
		if (b<a){
return b;

		}
		else{
return a;

		}
	}
return -1;
}
}

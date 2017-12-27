package tmpStorage;
//b1924d63a2e25b7c8d9a794093c4ae97fdceec9e0ea46b6a4b02d9a18b9ba9cecf07cb0c42c264a0947aec22b0bacff788a547a8250c2265f601581ab545bf82_007
//b1924d63a2e25b7c8d9a794093c4ae97fdceec9e0ea46b6a4b02d9a18b9ba9cecf07cb0c42c264a0947aec22b0bacff788a547a8250c2265f601581ab545bf82_002
public class smallestJava144{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int num1,int num2,int num3,int num4){
		int smallest=-1;
		if (num1<= num2){
			smallest = num1;
		} else {
			 smallest = num2;
		 }
		if (num3 <= smallest){
			smallest = num3;}
		if (num4 <= smallest){
			smallest = num4;}
		return smallest;
	}
}

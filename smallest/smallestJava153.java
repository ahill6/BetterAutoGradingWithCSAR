package tmpStorage;
//cb243bebea400595cc274d1246f3307c507ba6a0e891f6e318cde2b80a72de40dab19eb7f76d3b6573a08e446bce6fb4435cdb016ae6489973b855a9bddd3b11_000
//c9d718f379a877bd04e4544ee830a1c4c256bb4f104f214afd1ccaf81e7b25dea689895678bb1e6f817d8b0939eb175f8e847130f30a9a22e980d38125933516_003
public class smallestJava153{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int n1,int n2,int n3,int n4){
		int min;
		if (n1 <= n2)
			min=n1;
		else
			min=n2;
		if (min >= n3)
			min=n3;
		if (min >= n4)
			min=n4;
		return min;
	}
}

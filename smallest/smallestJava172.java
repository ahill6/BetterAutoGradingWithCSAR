package tmpStorage.smallest;


//f8d57deac89e46f99354a70e8f6bc830e0bded0c297d7a0765348de79d6071cb076d4e8f2cd60cff584cb220049d6065827a29904a7e1f9144f510f7773e6d0e_001
public class smallestJava172{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int v1,int v2,int v3,int v4){
		if (v1<v2 && v1<v3 && v1<v4)
			return v1;
		else if (v2<v1 && v2<v3 && v2<v4)
			return v2;
		else if (v3<v1 && v3<v2 && v3<v4)
			return v3;
		else
			return v3;
		}
	}

package tmpStorage;
//15cb07a72bc49f3f4b4a1000410c388b4d03b9f36236365ba4b611ca0617243b6de4e2e0868abf9ccb667e5ff71ccd3ce631cd59fcf13ee22addabf66c1824fa_006
//15cb07a72bc49f3f4b4a1000410c388b4d03b9f36236365ba4b611ca0617243b6de4e2e0868abf9ccb667e5ff71ccd3ce631cd59fcf13ee22addabf66c1824fa_005
public class smallestJava11{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int frst, int scnd, int thrd, int frth){
		if (frst < scnd && frst < thrd && frst < frth)
			return frst;
		else if (scnd < frst && scnd < thrd && scnd < frth)
			return scnd;
		else if (thrd < frst && thrd < scnd && thrd < frth)
			return thrd;
		else 	return frth;
	}
}

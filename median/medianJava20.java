package tmpStorage.median;


//15cb07a72bc49f3f4b4a1000410c388b4d03b9f36236365ba4b611ca0617243b6de4e2e0868abf9ccb667e5ff71ccd3ce631cd59fcf13ee22addabf66c1824fa_003
public class medianJava20{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int frst, int scnd, int thrd){
	int	cmp1 = -1;
	int cmp2 = -1;
	int med = -1;
	if(frst <= scnd)
		cmp1 = frst;
	else cmp1 = scnd;
	if(scnd <= thrd)
		cmp2 = scnd;
	else cmp2 = thrd;
	if(cmp1 >= cmp2)
		med = cmp1;
	else med = cmp2;
return med;
}
}

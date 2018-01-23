package tmpStorage.median;


//e9c6206d3a4862876b0dead881ac55078f11e291f60215ab028651f06fcbee2a591a31a7727037774542df4fe051a89460d85f6067a0b9729ae86e4afe1e6e92_001
public class medianJava223{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
if ((a < b && b < c) || (c < b && b < a))		
return b;		
else if ((b < a && a < c) || (c < a && a < b))		
return a;		
else if ((a < c && c < b) || (b < c && c < a))		
return c;
return -1;
}
}
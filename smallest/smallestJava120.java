package tmpStorage.smallest;


//90a14c1ac8f56395389fade6f67872a9684e61f83099e634ac675eae04f391f3cc2b6f6ebe966f2488ce7e00a2cabb218f3b1372d4161b3c05d134b1b7f296d2_000
public class smallestJava120{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int one,int two,int three,int four){
	if ((one < two)&&(two < three)&&(three < four))
		return one;
	if ((two < one)&&(one < three)&&(three < four))
		return two;
	if ((three < one)&&(one < two)&&(two < four))
		return three;
	if ((four < one)&&(one < two)&&(two < three))
		return four;

	return -1;
}}

package tmpStorage;
//93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_000
//90a14c1ac8f56395389fade6f67872a9684e61f83099e634ac675eae04f391f3cc2b6f6ebe966f2488ce7e00a2cabb218f3b1372d4161b3c05d134b1b7f296d2_001
public class smallestJava121{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int first,int second,int third,int fourth){
	if (first < second && first < third && first < fourth)
	return first;
	else if (second < first && second < third && second < fourth)
	return second;
	else if (third < first && third < second && third < fourth)
	return third;
	else if (fourth < first && fourth < second && fourth < third)
	return fourth;

	return -1;
}}

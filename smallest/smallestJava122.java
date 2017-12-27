package tmpStorage;
//93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_001
//93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_000
public class smallestJava122{
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

package tmpStorage;
//3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_006
//3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_005
public class medianJava62{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
	if ((a > b && b > c) || (c > b && b > a)) {
return b;
		}
	else if ((b > a && a > c) || (c > a && a > b)) {
return a;
		}
	else if ((a > c && c > b) || (b > c && c > a)) {
return c;
		}
return -1;
}
}

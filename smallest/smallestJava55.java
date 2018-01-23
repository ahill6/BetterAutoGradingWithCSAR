package tmpStorage.smallest;


//3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_004
public class smallestJava55{
	public static void main(String[] args){
	smallest(1.0,2.0,3.0,4.0);
}

	public static double smallest(double a, double b, double c, double d){
	  if (a < b && a < c && a < d) {
	    return a;
	  }
	  else if (b < a && b < c && b < d) {
	    return b;
	  }
	  else if (c < a && c < b && c < d) {
	    return c;
	  }
	  else if (d < a && d < b && d < c) {
	    return d;
	  }
	return -1.0;
	}
}

package tmpStorage;
//95362737dcd262ddd67b0fe1381c25f1e6b885860b4e51efb6f57223dceb77b4c6c7d855e3fe891c10cd51b48c9b052cf2c74f181a28d3020d77a4a2d6e4db18_018
//95362737dcd262ddd67b0fe1381c25f1e6b885860b4e51efb6f57223dceb77b4c6c7d855e3fe891c10cd51b48c9b052cf2c74f181a28d3020d77a4a2d6e4db18_017
public class gradeJava141{
	public static void main(String[] args){
	grade(1.0,2.0,3.0,4.0,5.0);
}

	public static char grade(double a,double b,double c,double d,double score){
	if (score >= a)
		 return 'A';
	else if (score >= b)
		 return 'B';
	else if (score >= c)
		 return 'C';
	else if (score >= d)
		 return 'D';
	else
		 return 'F';
}
}

package tmpStorage.grade;


//95362737dcd262ddd67b0fe1381c25f1e6b885860b4e51efb6f57223dceb77b4c6c7d855e3fe891c10cd51b48c9b052cf2c74f181a28d3020d77a4a2d6e4db18_011
public class gradeJava135{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float score){
	if (score >= a)
	 return 'A';
	else if (score >= b && score < a)
	 return 'B';
	else if (score >= c && score < b)
	 return 'C';
	else if (score >= d && score < c)
	 return 'D';
	else if (score < d)
	 return 'F';
	return (char) score;
}
}

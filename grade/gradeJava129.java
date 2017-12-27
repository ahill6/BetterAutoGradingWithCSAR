package tmpStorage;
//95362737dcd262ddd67b0fe1381c25f1e6b885860b4e51efb6f57223dceb77b4c6c7d855e3fe891c10cd51b48c9b052cf2c74f181a28d3020d77a4a2d6e4db18_006
//93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_016
public class gradeJava129{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float score){
	if (score>=a)
	 return 'A';
	else if (score>=b)
	 return 'B';
	else if (score>=c)
	 return 'C';
	else if (score>=d)
	 return 'D';
	else
	 return 'F';
}
}

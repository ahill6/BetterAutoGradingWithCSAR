package tmpStorage.grade;


//af81ffd4bc47e4f84cbf87051d82d15af14833eaba6c57ae82fc503a67eb939f3e6552182124605c38a77a6774f41fac2cc95082320ba5e29d303277c098c4ae_009
public class gradeJava182{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float score){
if(score>=a)
 return 'A';
else if (score>=b)
 return 'B';
else if (score>=c)
 return 'C';
else if (score>=d)
 return 'D';
return (char) score;
}
}

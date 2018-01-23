package tmpStorage.grade;


//6e464f2b5ba1d5ad3d4fc366e7d7712b424aabd8b41ca36257115a16416d202feb27397a413d04944c9ac76976fa8ff8ae646144855e08791ebf9593d1caaaca_000
public class gradeJava94{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float s){
	char g;
if	(s<d)
	 return 'F';
else if (s<c)
	g='C';
else if (s<b)
	g='B';
else	g='A';
if	(g=='A'||g=='B'||g=='C')
	 return g;
return g;
}
}

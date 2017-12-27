package tmpStorage;
//6e464f2b5ba1d5ad3d4fc366e7d7712b424aabd8b41ca36257115a16416d202feb27397a413d04944c9ac76976fa8ff8ae646144855e08791ebf9593d1caaaca_000
//68ea5d3466c7a9fb4a9219015d32f37de45f50df920793d79bc6028242a1913e9fa55a6da8262f1bc1f64b15e481dcd74d30dc36a54704a8abeac07d06f0f591_001
public class gradeJava93{
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

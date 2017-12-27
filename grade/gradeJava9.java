package tmpStorage;
//0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_004
//0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_003
public class gradeJava9{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float score){
if(score >=A){
	return 'A'; }
else if(score<A && score>=B)
{ return 'B';		}
else if(score<B && score>=C){
 return 'C';		}
else if(score<C && score>=D)
{ return 'D';		}
else
{ return 'F';}
}
}

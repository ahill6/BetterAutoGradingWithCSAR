package tmpStorage.grade;


//0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_000
public class gradeJava6{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float num){
//
if(a>b && b>c && c>d ){
if(num >= a)
{ return 'A';		}
else if(num < a && num >=b)
{ return 'B';		}
else if(num<b && num >=c){
 return 'C';		}
else if(num<c && num >=d)
{ return 'D';		}
else if(num<d)
{ return 'F';		}
else{}
}
return (char) num;
}}

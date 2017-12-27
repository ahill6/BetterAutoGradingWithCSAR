package tmpStorage;
//48b82975576f07f162163145b334648a73321d003a0a8cd4577172e48ce4836e63953dffd4460a9a7aadc511a695ff93de0ce2baf953e4b78b747440caa736a6_000
//489253253c866aa61b6b0d95c6072d3912f6b78dfbc01bdb2fbb663aefe33d6d353b1a61bb5fc567c9d6c334994111816edd3d43db47e4ea4a84953198736ff7_012
public class gradeJava84{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float e){
if (e>=a)
 return 'A';
else if(e>=b)
 return 'B';
else if (e>=c)
 return 'C';
else if(e>=d)
 return 'D';
return 0;
}
}

package tmpStorage;
//af81ffd4bc47e4f84cbf87051d82d15af14833eaba6c57ae82fc503a67eb939f3e6552182124605c38a77a6774f41fac2cc95082320ba5e29d303277c098c4ae_000
//aaceaf4ad658a90db957967d2852b7dfa81b42f4ab8dbdf2f7c9847a6072e1741a6b0cbd2ea52f5669f2da1cdf925ec565d257320cf93b97bc9bc99f000e1871_006
public class gradeJava172{
	public static void main(String[] args){
	grade(1.0,2.0,3.0, 4.0);
}

	public static char grade(double a, double b, double c, double d){
double per;
per = (a+b+c+d)/4;
if(per<60)
 return 'D';
else if (per>=60 && per<70)
	return 'C';
else if (per>=70 && per<80)
 return 'B';
else if (per>=80)
	return 'A';
return 0;

}
}

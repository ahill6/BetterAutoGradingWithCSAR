package tmpStorage;
//af81ffd4bc47e4f84cbf87051d82d15af14833eaba6c57ae82fc503a67eb939f3e6552182124605c38a77a6774f41fac2cc95082320ba5e29d303277c098c4ae_004
//af81ffd4bc47e4f84cbf87051d82d15af14833eaba6c57ae82fc503a67eb939f3e6552182124605c38a77a6774f41fac2cc95082320ba5e29d303277c098c4ae_003
public class medianJava177{
	public static void main(String[] args){
	median(1.0,2.0,3.0);
}

	public static double median(double first, double second, double third){
double median;
double comp_fir, comp_sec, comp_thi;
median=(first+second+third)/3;
comp_fir=Math.abs(first-median);
comp_sec=Math.abs(second-median);
comp_thi=Math.abs(third-median);
if (comp_fir < comp_sec && comp_fir < comp_thi)
return first;
else if (comp_sec < comp_fir && comp_sec < comp_thi)
return second;
else if (comp_thi < comp_fir && comp_thi < comp_sec)
return third;
return -1;
}
}

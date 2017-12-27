package tmpStorage;
//b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_000
//af81ffd4bc47e4f84cbf87051d82d15af14833eaba6c57ae82fc503a67eb939f3e6552182124605c38a77a6774f41fac2cc95082320ba5e29d303277c098c4ae_011
public class medianJava181{
	public static void main(String[] args){
	median(1,2,3);
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
else if (comp_fir == comp_sec)
return first;
else if (comp_fir == comp_thi)
return first;
else if (comp_thi == comp_sec)
return second;
return -1;
}
}

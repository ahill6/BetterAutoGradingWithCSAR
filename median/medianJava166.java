package tmpStorage;
//aaceaf4ad658a90db957967d2852b7dfa81b42f4ab8dbdf2f7c9847a6072e1741a6b0cbd2ea52f5669f2da1cdf925ec565d257320cf93b97bc9bc99f000e1871_000
//9c9308d4cdf5bc5dfe6efc2b1a9c9bc9a44fbff73c5367c97e3be37861bbb3ba9ac7ad3ddec74dc66e34fe8f0804e46186819b4e90e8f9a59d1b82d9cf0a6218_013
public class medianJava166{
	public static void main(String[] args){
	median(1.0,2.0,3.0);
}

	public static double median(double n1, double n2, double n3){
double median;
if(n1>=n2||n1>=n3)
    if(n1>=n3 && n1>=n2)
    {
        if(n2>=n3)
        median=n2;
        else
        median=n3;
    }
    else
    median=n1;
else if(n2>=n3)
median=n3;
else
median=n2;
return median;
}
}

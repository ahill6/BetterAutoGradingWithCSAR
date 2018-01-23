package tmpStorage.median;


//90a14c1ac8f56395389fade6f67872a9684e61f83099e634ac675eae04f391f3cc2b6f6ebe966f2488ce7e00a2cabb218f3b1372d4161b3c05d134b1b7f296d2_004
public class medianJava126{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int n1,int n2,int n3){
	if ((n1>n2)&&(n1>n3)&&(n2>n3))
return n2;
	else if ((n1>n2)&&(n1>n3)&&(n3>n2))
return n3;
	else if ((n2>n1)&&(n2>n3)&&(n3>n1))
return n3;
	else if ((n2>n1)&&(n2>n3)&&(n1>n3))
return n1;
	else if ((n3>n1)&&(n3>n2)&&(n1>n2))
return n1;
	else if ((n3>n1)&&(n3>n2)&&(n2>n1))
return n2;
	else if ((n1==n2)&&(n2==n3))
return n1;
return -1;
}
}

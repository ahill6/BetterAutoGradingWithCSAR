package tmpStorage;
//93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_001
//90a14c1ac8f56395389fade6f67872a9684e61f83099e634ac675eae04f391f3cc2b6f6ebe966f2488ce7e00a2cabb218f3b1372d4161b3c05d134b1b7f296d2_005
public class medianJava127{
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

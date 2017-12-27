package tmpStorage;
//88394fc00b7053b386e97564e28ef68421ae09c0baeaf887bba7e254f452419783ed8f774bff3c0c7d23bdc8f6c1443fb47c7af97323d4d3d63cc088d3b6841a_007
//88394fc00b7053b386e97564e28ef68421ae09c0baeaf887bba7e254f452419783ed8f774bff3c0c7d23bdc8f6c1443fb47c7af97323d4d3d63cc088d3b6841a_006
public class smallestJava101{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
	if(a < b && a < c && a < d)
    	return a;
    	else if(b < a && b < c && b < d)
    	return b;
    	else if(c < a && c < b && c < d)
    	return c;
    	else if(d < a && d < b && d < c )
    	return d;
return -1;
}
}

package tmpStorage;
//b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001
//b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_000
public class medianJava182{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int n1,int n2,int n3){
int temp;		
	if(n2<n1)
	{
		temp=n2;
		n2=n1;
		n1=temp;
	}
	if((n3<n2)&&(n3>n1))
	{
		temp=n2;
		n2=n3;
		n3=temp;
	}
return n2;
}
}
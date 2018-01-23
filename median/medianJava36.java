package tmpStorage.median;


//1c2bb3a40a82cba97b2937bc6825903a28ecfe91f993fc177a0f2ae003bcc7b1073eb49e35d3f0f69d6b612e8347e9c1b93306bf25a7e5390098c1a06845baac_016
public class medianJava36{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int x,int y,int z){
int temp=-1;
if (x >= y)
temp = x;
x = y;
y = temp;
if (x >= z)
temp = x;
x = z;
z = temp;
if (y >= z)
x = z;
else
x = y;
return x;
}
}

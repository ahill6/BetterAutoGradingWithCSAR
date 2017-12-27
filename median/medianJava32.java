package tmpStorage;
//1c2bb3a40a82cba97b2937bc6825903a28ecfe91f993fc177a0f2ae003bcc7b1073eb49e35d3f0f69d6b612e8347e9c1b93306bf25a7e5390098c1a06845baac_000
//1bf73a9ca02e8d64fd54aaf8de9ad5d029ebfff775224c3f5b010db80793ea8698863524436d122a100abc08c3486a795eb1caf39f78fc55d3948124861669ac_006
public class medianJava32{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int first,int second,int third){
int ans;
	if ((first>second&&first<third) || (first>third&&first<second))
		ans=first;
	else if ((second>first&&second<third) || (second>third&&second<first))
		ans=second;
	else
		ans=third;
return ans;
}
}

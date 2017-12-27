package tmpStorage;
//1bf73a9ca02e8d64fd54aaf8de9ad5d029ebfff775224c3f5b010db80793ea8698863524436d122a100abc08c3486a795eb1caf39f78fc55d3948124861669ac_000
//1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_003
public class medianJava25{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int num1,int num2,int num3){
	if((((num1 >= num2) && (num1 <= num3))) || ((num1 >= num3) && (num1 <= num2)))
	{
return num1;
	}
	else if((((num2 >= num1) && (num2 <= num3))) || ((num2 >= num3) && (num2 <= num1)))
        {
return num2;
        }
	else
        {
return num3;
        }
}
}

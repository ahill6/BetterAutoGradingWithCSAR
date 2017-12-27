package tmpStorage;
//d2b889e1ac42bc85f9df5c45c10708f46784be93d69acd1415cfd4d028cb50b19f50c374a9498c8e8b909173053a100e20c279ddb06c6359a06a920ead3e8080_001
//d2b889e1ac42bc85f9df5c45c10708f46784be93d69acd1415cfd4d028cb50b19f50c374a9498c8e8b909173053a100e20c279ddb06c6359a06a920ead3e8080_000
public class medianJava214{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int median=-1;
if ((a<=b && b<+c) || (c<=b &&b<=a)){
        median=b;}
else if ((b<=c && c<=a) || (a<=c && c<=b)){
	median=b;}
else if ((c<=a && a<=b) || (b<=a && a<=c)){
	median=c;}
return median;
}
}

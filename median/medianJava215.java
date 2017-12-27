package tmpStorage;
//d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_000
//d2b889e1ac42bc85f9df5c45c10708f46784be93d69acd1415cfd4d028cb50b19f50c374a9498c8e8b909173053a100e20c279ddb06c6359a06a920ead3e8080_001
public class medianJava215{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
if ((a <= b && b <= c) || (c <= b && b <= a)){
return b;
        }
else if ((b <= c && c <= a) || (a <= c && c <= b)){
return c;
        }
else if ((c <= a && a <= b) || (b <= a && a <= c)){
return a;
        }
return -1;
}
}

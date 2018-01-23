package tmpStorage.smallest;


//f94e261284a925b931cca5a89f73ae19039f2699f0416d5e4e7e673bb7a2c746760ae35adf47cfa94ad5af1623209b17a0e53c1300d3771c5b0b0cada1561d3f_004
public class smallestJava174{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int n1,int n2,int n3,int n4){
	if( n1<=n2 && n1<=n3 && n1<= n4)
		return n1;
	else if( n2<=n1 && n2<=n3 && n2<=n4)
		return n2;
	else if( n4<=n1 && n4<=n2 && n4<=n3)
		return n4;
	else if( n3<=n1 && n3<=n2 && n3<= n4)
		return n3;
return -1;
}
}

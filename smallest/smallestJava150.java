package tmpStorage.smallest;


//c9d718f379a877bd04e4544ee830a1c4c256bb4f104f214afd1ccaf81e7b25dea689895678bb1e6f817d8b0939eb175f8e847130f30a9a22e980d38125933516_000
public class smallestJava150{
	public static void main(String[] args){
	smallest(1.0,2.0,3.0,4.0);
}

	public static double smallest(double num1, double num2, double num3, double num4){
	if (num1<num2 && num1<num3 && num1<num4)
	return num1;
	if (num2<num1 && num2<num3 && num2<num4)
	return num2;
	if (num3<num1 && num3<num2 && num3<num4)
	return num3;
	if (num4<num1 && num4<num2 && num4<num4)
	return num4;

	return -1.0;
}}

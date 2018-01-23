package tmpStorage.median;


//070455301c2e18c7c89b850c2e86c311ac5fd223c84e723591012e163d60f11f5fd030343a444049a44940f8607d36c463f30556bf1efa98916d7417c2b4393c_000
public class medianJavaAlt1{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int num1, int num2, int num3){
  if ((num1 <= num2 && num1 >= num3) || (num1 >= num2 && num1 <= num3)){
	  return num1;
  }
  else if ((num2 <= num3 && num2 >= num1) || (num2 >= num3 && num2 <= num1)){
	  return num2;
  }
  else{
	  return num3;
  }
}
}

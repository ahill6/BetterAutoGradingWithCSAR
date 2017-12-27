package tmpStorage;
//070455301c2e18c7c89b850c2e86c311ac5fd223c84e723591012e163d60f11f5fd030343a444049a44940f8607d36c463f30556bf1efa98916d7417c2b4393c_000
public class medianJava0{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int num1, int num2, int num3){
  int median, big, small;
  if( num1 >= num2 ){
    small = num2;
    big = num1;
  }
  else{
    big = num2;
    small = num1;
  }
  if( num3 >= big )
    median = big;
  else if( num3 <= small )
    median = small;
  else
    median = num3;
return median ;
}
}

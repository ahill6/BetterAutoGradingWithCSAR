package tmpStorage.median;


//instructorSolution_000
public class medianJava0{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int num1, int num2, int num3){

  int	median=-1; 		
  int bigger12, smaller12;

  if (num1 < num2){
    bigger12 = num2;
    smaller12 = num1;
  }
  else {
    bigger12 = num1;
    smaller12 = num2;
  };
  if (bigger12 < num3)
    median = bigger12;
  else if (num3 > smaller12)
    median = num3;
  else
    median = smaller12;

return median;
}
}

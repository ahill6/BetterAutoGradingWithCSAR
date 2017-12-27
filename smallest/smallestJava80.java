package tmpStorage;
//818f8cf4e2e713753d02db9ee70a099b71f2a5a6bdc904191cf9ba68cfa5f64328464dccdd9b02fe0822e14a403dc196fe88b9964969409e60c93a776186a86a_002
//769cd811312cbbb82c87033a78ac9584ad282550bcb9cc3ae8c4e3da44c288c1a5b3954e01998c3c0654ee6774ceab66e9fe5b135750905c917d2b0bb5fab98b_011
public class smallestJava80{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int num1,int num2,int num3,int num4){
		int num_smallest;
	if ((num1 < num2) && (num1 < num3) && (num1 < num4))
		{
		num_smallest = num1;
		return num_smallest;
		}
        else if ((num2 < num1) && (num2 < num3) && (num2 < num4))
                {
		 num_smallest = num2;
                 return num_smallest;
                }
        else if ((num3 < num1) && (num3 < num2) && (num3 < num4))
                {
		num_smallest = num3;
                return num_smallest;
                }
        else if ((num4 < num1) && (num4 < num2) && (num4 < num3))
            	{
		num_smallest = num1;
                return num_smallest;
              	}
return -1;
}
}

package tmpStorage;
//818f8cf4e2e713753d02db9ee70a099b71f2a5a6bdc904191cf9ba68cfa5f64328464dccdd9b02fe0822e14a403dc196fe88b9964969409e60c93a776186a86a_005
//818f8cf4e2e713753d02db9ee70a099b71f2a5a6bdc904191cf9ba68cfa5f64328464dccdd9b02fe0822e14a403dc196fe88b9964969409e60c93a776186a86a_003
public class smallestJava82{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int num1,int num2,int num3,int num4){
	if (num1 <= num2 && num1 <= num3 && num1 <= num4)
	       	return num1;
        else if (num2 <= num1 && num2 <= num3 && num2 <= num4)
                return num2;

        else if (num3 <= num1 && num3 <= num2 && num3 <= num4)
                return num3;

        else if (num4 <= num1 && num4 <= num2 && num4 <= num3)
                return num4;
		return -1;
}
}
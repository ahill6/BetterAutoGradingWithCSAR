package tmpStorage;
//b1924d63a2e25b7c8d9a794093c4ae97fdceec9e0ea46b6a4b02d9a18b9ba9cecf07cb0c42c264a0947aec22b0bacff788a547a8250c2265f601581ab545bf82_000
//af81ffd4bc47e4f84cbf87051d82d15af14833eaba6c57ae82fc503a67eb939f3e6552182124605c38a77a6774f41fac2cc95082320ba5e29d303277c098c4ae_001
public class smallestJava141{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int num1,int num2,int num3,int num4){
		int smallest=-1;
		if (num1 < num2){
			if (num1 < num3){
				if (num1 < num4){
					smallest = num1;
				}
			}
	        if (num2 < num1){
	                if (num2 < num3){
	                        if (num2 < num4){
	                                smallest = num2;
	                        }
	                }
	        }
	        if (num3 < num1){
	                if (num3 < num2){
	                        if (num3 < num4){
	                                smallest = num3;
	                        }
	                }
	        }
	        if (num4 < num1){
	                if (num4 < num2){
	                        if (num4 < num3){
	                                smallest = num4;
	                        }
	                }
	        }
		}
		return smallest;
	}
}
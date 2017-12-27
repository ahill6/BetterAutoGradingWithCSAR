package tmpStorage;
//a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_002
//a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_001
public class smallestJava134{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int int_1,int int_2,int int_3,int int_4){
		if (int_1 < int_2 && int_1 < int_3 && int_1 <  int_4)
		return int_1;
		else if(int_2 < int_1 && int_2 < int_3 && int_2 < int_4)
		return int_2;
		else if (int_3 < int_1 && int_3 < int_2 && int_3 < int_4)
		return int_3;
		else return int_4;
		}
	}

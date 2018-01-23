package tmpStorage.smallest;


//1391c9b132764431738ca64d39293c8f76de61bab8169ea5e4daf9d14441ee02bf9cf5e448136f7f58d730052ff1c3803688d9e65680d8b757ee1ffdabd4b01f_003
public class smallestJava5{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int N1,int N2,int N3,int N4){
		int Small=-1;
		if (N1 < N2 && N1 < N3 && N1 < N4)
			Small = N1;
		if (N2 < N1 && N2 < N3 && N2 < N4)
			Small = N2;
		if (N3 < N1 && N3 < N2 && N3 < N4)
			Small = N3;
		if (N4 < N1 && N4 < N2 && N4 < N3)
			Small = N4;

		return Small;
		}
	}

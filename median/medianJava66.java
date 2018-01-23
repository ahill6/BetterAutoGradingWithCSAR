package tmpStorage.median;


//489253253c866aa61b6b0d95c6072d3912f6b78dfbc01bdb2fbb663aefe33d6d353b1a61bb5fc567c9d6c334994111816edd3d43db47e4ea4a84953198736ff7_007
public class medianJava66{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int A, int B, int C){
	int small =-1;
	int large=-1;
	int median=-1;
	if (A > B){
		small = B;
		large = A;
	}
	else if (A < B) {
		small = A;
		large = B;
	}
	if (C > large)
		median = large;
	else if (C < small)
		median = small;
	else
		median = C;

return median;
}
}

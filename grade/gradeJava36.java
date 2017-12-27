package tmpStorage;
//30074a0e036669b5681720e6481cc101877d52ee589bab434417ece22b4133ed584c6a84f80047c10ab47aa73a7807720b5375983e8b489e8e69978e5e0e8b71_003
//30074a0e036669b5681720e6481cc101877d52ee589bab434417ece22b4133ed584c6a84f80047c10ab47aa73a7807720b5375983e8b489e8e69978e5e0e8b71_002
public class gradeJava36{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float Grade){
if(Grade >= A) return 'A';
if(Grade >=B && Grade < A) return 'B';
if(Grade >=C && Grade < B) return 'C';
if(Grade < C && Grade >= D) return 'D';
if (Grade < D) return 'F';
return 0;
}
}

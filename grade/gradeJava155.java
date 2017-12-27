package tmpStorage;
//a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_000
//9c9308d4cdf5bc5dfe6efc2b1a9c9bc9a44fbff73c5367c97e3be37861bbb3ba9ac7ad3ddec74dc66e34fe8f0804e46186819b4e90e8f9a59d1b82d9cf0a6218_013
public class gradeJava155{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float th_1,float th_2,float th_3,float th_4,float score){
if (score >= th_1){
 return 'A';}
else
{ if (th_2 <= score && score < th_1){
 return 'B';}
else
{  if (th_3 <= score && score < th_2){
 return 'C';}
else {if (th_4 <= score && score < th_3){
  return 'D';}
else { if (score < th_4){
 return 'F';}
}}
}}
return 0;}
}

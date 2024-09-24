import java.util.Scanner;
class AvgWeight{
	public static void main(String args[]){
	float weights[] = new float[10];
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter the weights of the persons");
	for(int i=0;i<weights.length;i++){
		weights[i] = sc.nextFloat();
	}
	float sum = 0;
	for(float f:weights){
		sum+= f;
	}
	float avg = sum/weights.length;
	System.out.println(avg);
   }
}
	
			
	
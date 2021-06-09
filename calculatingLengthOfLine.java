import java.util.*;
class calculatingLengthOfLine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start co-ordinates of Line i.e x1 and y1: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter end co-ordinates of Line i.e x2 and y2: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double lengthOfLine;
		lengthOfLine = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("The length of the line is : "+lengthOfLine);
	}
}

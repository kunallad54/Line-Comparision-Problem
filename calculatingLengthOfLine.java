import java.util.*;
class calculatingLengthOfLine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start co-ordinates of First Line i.e x1 and y1: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter end co-ordinates of First Line i.e x2 and y2: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double lengthOfLine1;
		lengthOfLine1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Enter start co-ordinates of Second Line i.e x3 and y3: ");
                int x3 = sc.nextInt();
                int y3 = sc.nextInt();
                System.out.println("Enter end co-ordinates of Second Line i.e x4 and y4: ");
                int x4 = sc.nextInt();
                int y4 = sc.nextInt();
                double lengthOfLine2;
                lengthOfLine2 = Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
		String str1 = String.valueOf(lengthOfLine1);
		String str2 = String.valueOf(lengthOfLine2);
		if(str1.compareTo(str2) == 0)
			System.out.println("The length of both line are equal");
		else if(str1.compareTo(str2)<0)
			System.out.println("The length of line 1 is greater than lenght of line 2");
		else if (str1.compareTo(str2)>0){
			System.out.println("The lenght of line 1 is less than length of line 2");
		}
		System.out.println("The length of the first line is : "+lengthOfLine1);
		System.out.println("The length of the second line is : "+lengthOfLine2);
	}
}

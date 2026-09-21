import java.util.Scanner;
public class IT26101824Lab9Q2
{
	public static void main(String[] args){
		
		double area,radius;
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		radius=input.nextDouble();
		
		area  = Math.PI *Math.pow(radius, 2);
		
		System.out.println("The area of the cirrcle with radius " +radius +" :" +area);
		
		
		
		
	}
}
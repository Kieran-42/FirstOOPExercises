//Remember, all of the methods and variables defined in Polygon are being "carried over" here. 
import java.util.Arrays;
public class Triangle extends Polygon{
//	java.util.Arrays;
	
	//This constructor is used for regular Triangles. If the constructor of the superclass exists, it must call it.
	public Triangle(double sideLength) {
		super(3, sideLength);
		/*The keyword "super" means the constructor of the superclass is being called.*/
	}
	
	/*
	 The function below will use three "tests" to see if the values inputted could a triangle
	 It is static because it does not rely on the creation of a Triangle object, or any of the 
	 nonstatic properties(variables) of the Triangle class 
	*/
	public static Boolean possibleTriangle(double[] sideLengths, double[] angleValues) {
		//TODO EXERCISE 2.1 - COMPLETE THIS FUNCTION
		
		/*
		EXAMPLE: Check that "sideLengths" and "angleValues" have 3 values. 
		If it does not, return false (which also terminates the function) 
		*/
		if(sideLengths.length != 3 && angleValues.length != 3) {
			return false;
		}
		
		/*
		 Make sure the sum of all "angleValues" is 180. HINT: Use a for loop to find the sum.
		 If they don't add up to 180, return false 
		*/
		double sum = 0;
		for(int i = 0; i<angleValues.length;){
			sum+=angleValues[i];	
		}
		if(sum!=180){
			return false;
		}
		/*
		Sort "sideLengths" by lowest to highest. If the sum of the first 2 elements in that
		sorted array is less than the third element, return false
		*/
		Arrays.sort(sideLengths);
		double lines;
		lines=sideLengths[0]+sideLengths[1];
		if(lines<sideLengths[3]){
			return false;
		}
		/*Remember that when you return something, the function immediately terminates. If it got to this point,
		 it has not terminated yet, and therefore passed all three checks. So, we can return true.
		 */
		return true;
	}
	
	
	
	
	public Triangle(double[] sideLengths, double[] angleValues) {
		//TODO EXERCISE 2.2 - COMPLETE THIS CONSTRUCTOR
		
		this.exists = Triangle.possibleTriangle(sideLengths, angleValues); //checks if a triangle can be formed, and sets "exists" to that value
		if(exists) {
		//Use the "super" keyword to call the appropriate constructor of the superclass Polygon
			
		}
	}

	@Override
	public double getArea() {
		// TODO EXERCISE 2.3 - WRITE THIS FUNCTION
		
		/*
		 You are only required to find the area for regular triangles.
		 First, check if a triangle is regular, simply by accessing the "regular" variable.
		 If it is not regular, return -1
		 */
		if(regular = true){
			return (Math.pow(sideLengths[0], 3) * Math.sqrt(3))/4;
		}
		else{
			return -1;
		}
		/*Find the formula for finding the area of regular triangles and implement it
		 */
		
		//return; //the area here;
	}
	
	
	
}

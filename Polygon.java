
public abstract class Polygon {
	//The keyword protected means only subclasses can access these properties
	protected Boolean regular = false;// I initialized this to false out of personal preference
	
	/*
	I did include a setter, because we don't want the user modifying this property.
	Whether a polygon is regular or not is determined by the lengths of its sides and its angle values
	*/
	public Boolean getRegular() {
		return regular;
	}
	
	protected Boolean exists = true; // same here
	//The Boolean above exists(no pun intended) to indicate whether the Polygon can be formed. 
	
	//TODO EXERCISE 1.1
	//Write a getter for the variable "exists". Just like for the variable "regular", do not include a setter
	public Boolean getExists(){
		return exists;
	}
	
	//TODO EXERCISE 1.2
	//Write getters and setters for all three of the variables below
	protected int sides;
	public int getSides(){
		return sides;
	}
	public void setSides(int newSides){
		sides = newSides;
	}
	protected double[] sideLengths;
	public double[] getSideLengths(){
		return sideLengths;
	}
	public void setSideLengths(double[] newSideLengths){
		sideLengths = newSideLengths;
	}
	protected double[] angleValues;
	public double[] getAngleValues(){
		return angleValues;
	}
	public void setAngleValues(double[] newAngleValues){
		angleValues = newAngleValues;
	}
	//this constructor is called when you want to create regular polygons
	public Polygon(int sides, double sideLength) {
		//TODO EXERCISE 1.3 - COMPLETE THIS FUNCTION
		
		/*
		In the next lines of code, create an if statement that checks if sides is less than 3.
			If sides is less than 3:
				Set the variable "exists" to false because polygons must have more than 3 sides.
				Use the "return" keyword to terminate this function. If a Polygon does not exist, there is no
				point defining its other properties
		*/
		if(sides<3){
			exists = false;
			return;
		}
		
		
		regular = true;
		this.sides = sides;		
	
		
		//In the next line of code, initialize the "sideLengths" array and set the length of the array to the number of sides
		sideLengths = new double[sides];
		/*
		In the next lines of code, create a for loop that loops through "sideLengths", and sets each value to the "sideLength" defined in the constructor.
		For example, if the user inputs 3 for "sides" and 10.0 for "sideLength" in the constructor, the array "sideLengths" should be {10.0,10.0,10.0}
		*/
		for(int i = 0; i < sides; i++){
			sideLengths[i] = sideLength;
		}
		
	
		/*
		The formula for determining the SUM of angles of a regular polygon is 180(n - 2), where n is the number of sides
		Regular polygons also have equal angles.
		In the next line(s) of code, find out the angle for ONE side of a regular polygon. Make sure you use a double.
		For example, if a user inputs 4, then the sum of the angles is 180(4 - 2) = 360.0. Since there are four sides,
		the value of one angle is 360/4, which is 90.0.
		*/
		double angleValue = 180*(sides - 2);
		
		/*
		Use the same process you used with "sideLengths" to populate "angleValues" with the angle length of one side(the variable you found earlier).
		For example, if the user inputs 4 for sides, the array angleValues should be {90.0,90.0,90.0,90.0}. 
		*/
		angleValues = new double[sides];
		for(int i = 0;i<sides; i++){
			angleValues[i] = angleValue;
		}
	}
	
	
	
	public Polygon(double[] sideLengths, double[] angleValues) {
		//TODO EXERCISE 1.4 - WRITE THIS FUNCTION
		
		/*
		In the next lines of code, write an if statement that checks whether the length of the two arrays are not the same.
		If they are not the same:
			Set the variable "exists" to false(one of the properties of a polygon is that the number of sides is equal to the number of angles)
			Terminate this function by using "return"
		*/
		if(sideLengths.length != angleValues.length){
			exists = false;
			return;
		}
		//In the next line of code, set the variable "sides" to the length of one of the arrays
		sides = sideLengths.length;
		/*
		In the next lines of code, set the local parameters "sideLengths" and "angleValues" to the global variables "sideLengths" and "angleValues"(which are defined above). 
		HINT: You need to use the keyword "this"
		*/
		this.sideLengths = sideLengths;
		this.angleValues = angleValues;
		//CHALLENGE: Check if the polygon is regular. If it is, then set the variable "regular" to true.
	}
	
	//This constructor should only be used by subclasses when the polygon they get does not exist.
	//Don't worry about it if you do not understand it.
	protected Polygon() {
		this.exists = false;
	}
	
	public abstract double getArea(); //Every polygon class should have a getArea function. 
	//However, for every polygon, there is a different formula used to get its area.
	//This is why getArea is abstract
	
	//If you have finished all the tasks outlined in 1.1, 1.2, 1.3 and 1.4, go to Triangle.java.
	
	
}

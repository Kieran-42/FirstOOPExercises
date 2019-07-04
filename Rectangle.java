public class Rectangle{
    private float length;
    private float width;
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;

    }
    public double getLength() {
        return length; 
    }
    public double getWidth(){
        return width;
    }
    public double getArea() {
         return length*width;
      }
    public double getPerimeter(){
        return width*2 + length *2;
    }
    public void setLength(float newLength){
        length = newLength;
      }
    public void setWidth(float newWidth){
        width = newWidth;
    }
    public String toString() {
       return "Circle[length=" + length + " width=" + width + "]";
       }
}
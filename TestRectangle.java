public class TestRectangle{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(20, 15);
        System.out.println("The rectangle has an area of " + r1.getArea() + " and a peremeter of " + r1.getPerimeter());
        System.out.println("The rectangle has a width of " + r1.getWidth() + " and a length of " + r1.getLength());
        r1.setLength(30);
        r1.setWidth(20);
        System.out.println(r1);
    }
}
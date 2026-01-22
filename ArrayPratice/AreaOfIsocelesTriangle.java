public class AreaOfIsocelesTriangle {
    public static void main (String [] args){
          int side = 12;
          int base = 10;
          double height = Math.sqrt((side*side) - (base*base)/4.0);
          double area = (base * height)/2;
System.out.println("The area of the isosceles triangle is: " + area);
    }
    
}

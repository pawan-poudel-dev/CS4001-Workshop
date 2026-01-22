public class AreaOfScleneTriangle {
    public static void main (String [] args){
        int sideA = 12;
        int sideB = 13;
        int sideC = 15;
        double side =(sideA +sideB +sideC)/2;
        double area = Math.sqrt(side *(side-sideA) *(side-sideB) *(side- sideC));
        System.out.println("The area of the sclene triangle is : " + area);
    }
    
}

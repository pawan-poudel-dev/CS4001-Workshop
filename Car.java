public class Car {
    public String brand;
    public  String color;
    //initializing the constructor 
    public Car(String brand , String color){
        this.brand = brand;
        this.color = color;
    }
    public void displayCar(){
        System.out.println("brand of car is : " + brand + ", color: " + color);


    }
    public static void main(String [] args){
        Car car1 = new Car("BMW","red");
        Car car2 = new Car("Marcedes","violet");
        
       car1.displayCar();

        car2.displayCar();
    }

    
}


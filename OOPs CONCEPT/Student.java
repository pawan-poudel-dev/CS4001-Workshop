public class Student {
    

    // Private attributes
    private String name;
    private int id;
    private int age;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id ) {
        this.id = id;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setage(int age){
        if(age < 0){
            System.out.println("Invalid age.");


        }else{
            this.age= age;
        }
    }
}




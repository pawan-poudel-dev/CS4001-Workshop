

public class Characters {
    public static void main(String[] args) {
        char [] vowels = {'a','e','i','o','u'};//ude of traditional for loop 
        for(int i = 0; i < vowels.length;i++){
            System.out.println(vowels[i]);
        }
        //using for each loop
        for(char items : vowels ){
            System.out.println(items);
        }
    }
    
}

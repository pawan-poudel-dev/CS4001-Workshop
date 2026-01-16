public class Star3 {
    public static void main(String[] args){
        int i,j,k;
        for(i = 0; i <= 8;i++){
            for(j= 3;j>= i;j--){
                System.out.print("  ");
            }
            for(k = 0;k<= i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

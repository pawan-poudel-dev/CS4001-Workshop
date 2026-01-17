public class MixedTriangle {
    public static void main(String[] args ){
        int i , j , k , l;
        for(i = 1; i <= 7; i++){
            for(j = 1; j <= i; j++){
                System.out.print("@");
            }
            System.out.println();
            
        }
        for(k = 1 ; k <= 4;k++){
                for(l = 4;l>= k;l--){
                    System.out.print("@");
                }
                System.out.println();
            }

    }
    
}

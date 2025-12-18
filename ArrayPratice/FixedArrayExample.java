public class FixedArrayExample {
    public static void main(String [] args ){
        int a [] =  new int[7];
         a[0]= 10;//assigining value in arrray 
         a[1]= 20;//assigining value in arrray 
         a[2]= 30;//assigining value in arrray 
         a[3]= 40;//assigining value in arrray 
         a[4]= 50;//assigining value in arrray 
         a[5]= 60;//assigining value in arrray 
         a[6]= 70;//assigining value in arrray 
         a[7]= 80;//assigining value in arrray 
         
//here we get the error because we  already set the length or value of array element as 5 
for(int i = 0; i <= 7; i++ ){
    System.out.println(a[i]);
}
    }
    
}

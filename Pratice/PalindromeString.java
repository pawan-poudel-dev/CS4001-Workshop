import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String name: ");
        String name = sc.nextLine();
        String org_name = name;
        String rev = "";
        int len = name.length();
        for(int i= len -1; i >= 0;i--){
            rev = rev + name.charAt(i);


            }
            if(org_name.equals(rev)){
                System.out.println(org_name + "This is a palindrome String .");

            }else{
                System.out.println("This is not a palindrome String.");
            }
            sc.close();;
        }
    }
    


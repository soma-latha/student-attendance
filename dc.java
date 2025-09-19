import java.util.*;
class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double price=sc.nextDouble();
        double dis=sc.nextDouble();
        System.out.println("Final Price:"+(price-(price*dis/100)));
       System.out.println("succesfully deployed");
    }
}


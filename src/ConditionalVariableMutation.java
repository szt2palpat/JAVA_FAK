import java.util.Scanner;

public class ConditionalVariableMutation {
    public static void main(String[] args) {
        System.out.println("Addj meg egy számot:");
        Scanner szam=new Scanner(System.in);
        int a=szam.nextInt();
        if(a%2==0){
            System.out.println(a+1);
        }
        System.out.println("Addj meg egy számot 0 és 30 között:");
        int b=szam.nextInt();
        if (b>10&&b<20){
            System.out.println("Sweet!");
        } else if (b<10) {
            System.out.println("less!");

        }else if (b<20){
            System.out.println("more!");
        }
System.out.println("Addj meg egy számot 0 és 100 között:");
        int c=szam.nextInt();
        boolean isBOnus=false;
        if(c>=50 && isBOnus==false){
            System.out.println(c-2);
        } else if (c<=50 && isBOnus==false) {
            System.out.println(c-1);
        }
        System.out.println("Addj meg egy számot 0 és 50 között:");
        int d=szam.nextInt();
        System.out.println("Addj meg egy számot 0 és 500 között:");
        int idő=szam.nextInt();
        if(d%4==0&& idő>200){
            System.out.println("Time out");
        } else if (d%4==0 && idő<200) {
            System.out.println("Check");
        }else {
            System.out.println("Run Forest Run");
        }
    }
}
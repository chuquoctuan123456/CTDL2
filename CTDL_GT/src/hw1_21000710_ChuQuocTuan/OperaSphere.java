package hw1_21000710_ChuQuocTuan;

import java.util.Scanner;

public class OperaSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sphere sphere1 = inputSphere(sc);
        printSphere(sphere1);

        Sphere sphere2 = inputSphere(sc);
        printSphere(sphere2);

        System.out.println("Area Sphere : " + areaSphere(sphere1));
        System.out.println("Peremeter Sphere : " + peremterSphere(sphere1));

        relativePosion(sphere1 ,sphere2);

    }
    public static double areaSphere(Sphere sphere){
        return 4 * Math.PI * sphere.getR() * sphere.getR();
    }

    public static double peremterSphere(Sphere sphere){
        return 4 * Math.PI * Math.pow(sphere.getR() ,3) / 3;
    }

    public static void relativePosion(Sphere sphere1 ,Sphere sphere2){
        double distance = Math.sqrt(Math.pow(sphere1.getX() - sphere2.getX() ,2) +
                Math.pow(sphere1.getY() - sphere2.getY() ,2) +
                Math.pow(sphere1.getZ() - sphere2.getZ() ,2));
        if(distance > (sphere1.getR() + sphere2.getR())){
            System.out.println("Sphere not intersect");
        } else if (distance < (sphere1.getR() + sphere2.getR())) {
            System.out.println("Sphere intersect");
        } else{
            System.out.println("Sphere contact");
        }
    }
    public static Sphere inputSphere(Scanner sc){
        double r = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        Sphere sphere = new Sphere(r ,x ,y ,z);

        return sphere;
    }

    public static void printSphere(Sphere sphere){
        System.out.println(sphere.toString());
    }


}

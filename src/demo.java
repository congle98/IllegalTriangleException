import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Mời nhập cạnh a");
//        double a = scanner.nextDouble();
//        System.out.println("Mời nhập cạnh b");
//        double b = scanner.nextDouble();
//        System.out.println("Mời nhập cạnh c");
//        double c = scanner.nextDouble();

        Scanner input = new Scanner(System.in);

        // create triangle
        Triangle triangle = new Triangle();
        boolean done = false;
        double side1 = 1.0;
        double side2 = 1.0;
        double side3 = 1.0;

        System.out.println("Enter three sides: ");

        while (!done) {
            try {
                side1 = input.nextDouble();
                side2 = input.nextDouble();
                side3 = input.nextDouble();
                triangle = new Triangle(side1, side2, side3);
                done = true;
            }
            catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
                System.out.print("Enter three sides:  ");
                input.nextLine();
            }
        }


        System.out.println();

        System.out.println(triangle.toString() +
                "\narea: " + triangle.getArea() +
                "\nperimeter " + triangle.getPerimeter() );





















//
//        try {
//            if (a+b<=c||a+c<=b||b+c<=a){
//                throw new  IllegalTriangleException();
//            }
//            else if(a<0||b<0||c<0){
//                throw new IllegalTriangleException();
//            }
//        }
//        catch (IllegalTriangleException ex){
//            System.out.println("đã nhập sai rồi");
//        }


    }
}

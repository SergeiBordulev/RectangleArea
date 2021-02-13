import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of side A:");
        double length = scanner.nextDouble();

        System.out.println("Enter the size of side B:");
        double width = scanner.nextDouble();

        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);

        System.out.printf("Size A = %.2f%nSize B = %.2f%nThe area of the rectangle = %.2f%nThe perimeter of the rectangle = %.2f", length, width, rectangleArea, rectanglePerimeter);
    }
}

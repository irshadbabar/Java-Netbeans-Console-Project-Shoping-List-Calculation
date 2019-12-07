package javaapplication2;

public class PartImageTester {
    public static void main(String[] args) {
        PartImage piA = PartImage.exampleA();
        PartImage piB = PartImage.exampleB();
        PartImage piC = PartImage.exampleC();
        PartImage piD = PartImage.exampleD();
        
        System.out.println("\nPart A:");
        System.out.println("  starts at: " + PartImage.exampleA().findStart());
        System.out.println("  size:      " + PartImage.exampleA().partSize());
        System.out.println("  broken:    " + PartImage.exampleA().isBroken());
        System.out.println("  perimeter: " + PartImage.exampleA().perimeter() + "\n");
        piA.print();
        System.out.println("\nPart B:");
        System.out.println("  starts at: " + PartImage.exampleB().findStart());
        System.out.println("  size:      " + PartImage.exampleB().partSize());
        System.out.println("  broken:    " + PartImage.exampleB().isBroken());
        System.out.println("  perimeter: " + PartImage.exampleB().perimeter() + "\n");
        piB.print();
        System.out.println("\nPart C:");
        System.out.println("  starts at: " + PartImage.exampleC().findStart());
        System.out.println("  size:      " + PartImage.exampleC().partSize());
        System.out.println("  broken:    " + PartImage.exampleC().isBroken());
        System.out.println("  perimeter: " + PartImage.exampleC().perimeter() + "\n");
        piC.print();
        System.out.println("\nPart D:");
        System.out.println("  starts at: " + PartImage.exampleD().findStart());
        System.out.println("  size:      " + PartImage.exampleD().partSize());
        System.out.println("  broken:    " + PartImage.exampleD().isBroken());
        System.out.println("  perimeter: " + PartImage.exampleD().perimeter() + "\n");
        piD.print();
    }
}

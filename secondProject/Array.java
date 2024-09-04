package secondProject;

import java.util.Scanner;

class Bag {
    private String colour;
    private int weight;
    private static int totalWeight;
    private static int totalCount;

    public Bag() {
        colour = "red";
        weight = 10;
        totalCount += 1;
        totalWeight = weight + totalWeight;
    }

    public Bag(int weight) {
        colour = "green";
        this.weight = weight;
        totalCount += 1;
        totalWeight = weight + totalWeight;
    }

    public Bag(String colour) {
        this.colour = colour;
        weight = 30;
        totalCount += 1;
        totalWeight = weight + totalWeight;
    }

    public Bag(int weight, String colour) {
        this.colour = colour;
        this.weight = weight;
        totalCount += 1;
        totalWeight = weight + totalWeight;
    }

    public String getColour() {
        return colour;
    }

    public int getWeight() {
        return weight;
    }

    public static int getTotalWeight(){
      return totalWeight;
    }

    public static int getTotalCount(){
      return totalCount;
    }


}

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bag[] bags = new Bag[4];
       

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Create Object");
            System.out.println("2. Display Total Weight");
            System.out.println("3. Display Total Count");
            System.out.println("4. Display All Objects");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("Choose constructor:");
                        System.out.println("1. Default Constructor");
                        System.out.println("2. Constructor with Weight");
                        System.out.println("3. Constructor with Colour");
                        System.out.println("4. Constructor with Weight and Colour");
                        System.out.println("5. Back");
                        int constructorChoice = scanner.nextInt();

                        if (constructorChoice == 5) {
                            break;
                        }

                        if (Bag.getTotalCount() >= bags.length) {
                            System.out.println("Bag array is full!");
                            break;
                        }

                        switch (constructorChoice) {
                            case 1:
                                bags[Bag.getTotalCount()] = new Bag();
                                break;
                            case 2:
                                System.out.print("Enter weight: ");
                                int weight = scanner.nextInt();
                                bags[Bag.getTotalCount()] = new Bag(weight);
                                break;
                            case 3:
                                System.out.print("Enter colour: ");
                                String colour = scanner.next();
                                bags[Bag.getTotalCount()] = new Bag(colour);
                                break;
                            case 4:
                                System.out.print("Enter weight: ");
                                weight = scanner.nextInt();
                                System.out.print("Enter colour: ");
                                colour = scanner.next();
                                bags[Bag.getTotalCount()] = new Bag(weight, colour);
                                break;
                            default:
                                System.out.println("Invalid constructor choice");
                                continue;
                        }
                        
                        System.out.println("Object created !!");
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Total Weight: " + Bag.getTotalWeight());
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Total Count: " + Bag.getTotalCount());
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    for (int i = 0; i < Bag.getTotalCount(); i++) {
                        System.out.println((i + 1) + " " + bags[i].getColour() + " " + bags[i].getWeight());
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

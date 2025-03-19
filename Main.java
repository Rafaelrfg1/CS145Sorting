//Name: Rafael Figueroa
//Date: 3/19/25
//Extra Credit: I gave the user the option to have numbers randomly generated or manually entered with as many integers as they want to be sorted. 
//Extra Credit: I also added a timer to see how long it took for the computer to process each sort. 


//Description: This program gives you the option to either create an arraylist of random integers or manually enter them. 
//It then sorts the arraylist using 2 methods, Bubble sort and Selection sort. It then prints the sorted arraylist with the orginal arraylist created.
//It also prints the amount of time it took the computer to process each sort. 
//You are allowed to enter as many integers as you want to be sorted and the program will accommodate for that. 

//Assignment: Sorting Lab
//Partners: Ben and Kennedi


import java.util.Scanner;




public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Bubble bubble = new Bubble();
        Selection selection = new Selection();
        System.out.println("Would you like to have integers randomly generated or would you like to enter them manually? (R for Random, M for Manual)");
        String choice = scanner.nextLine();
        
        if(choice.equalsIgnoreCase("r")){
            System.out.print("How many integers would you like to have randomized?: ");
            int rIntegers = scanner.nextInt();
            UserArrayList list = new UserArrayList();
            list.randomList(rIntegers);
            System.out.println("The list before sorting: ");
            list.print();//Original List
            long startTimeB = System.currentTimeMillis();
            bubble.bSort(list);
            System.out.println("The randomized list after using Bubble Sort: ");
            list.print();
            long endTimeB = System.currentTimeMillis();
            long durationB = endTimeB - startTimeB;
            System.out.println("The Time is took for the computer to process Bubble sort: " + durationB + "ms");
            long startTimeS = System.currentTimeMillis();
            selection.sSort(list);
            System.out.println("The randomized list after using Selection Sort: ");
            list.print();//Sorted list
            long endTimeS = System.currentTimeMillis();
            long durationS = endTimeS - startTimeS;
            System.out.println("The Time it took for the computer to process Selection sort: " + durationS + "ms");
        } else if (choice.equalsIgnoreCase("m")){
            System.out.print("How many integers would You like to be sorted?: ");
        int numIntegers = scanner.nextInt();
        UserArrayList list = new UserArrayList();
        list.manualList(numIntegers);
        System.out.println("The list before sorting: ");
        list.print();
        //Orginal list
        long startTimeB = System.currentTimeMillis();
        bubble.bSort(list);
        System.out.println("The list after using Bubble Sort: ");
        list.print();
        long endTimeB = System.currentTimeMillis();
        long durationB = endTimeB - startTimeB;
        System.out.println("The Time it took for the computer to process Selection sort: " + durationB + "ms");


        long startTimeS = System.currentTimeMillis();
        selection.sSort(list);
        System.out.println("The list after using Selectino Sort:");
        list.print();
        long endTimeS = System.currentTimeMillis();
        long durationS = endTimeS - startTimeS;
        System.out.println("The Time it took for the computer to process Selection sort: " + durationS + "ms");


        }

        scanner.close();
    }

}
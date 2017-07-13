import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * XULA Parking Lot Co. manages $2 reserved parking lots on Xavier's campus and they want
     * us to write a Java app to automate their system.
     * <p>
     * The The reserved parking lots are labeled and only permit entry by particular students.
     * Lot SENIORS has 11 spaces reserved for seniors.
     * Lot JUNIORS has 22 spaces reserved for seniors and juniors.
     * Lot SOPHOMORES has 33 spaces reserved for seniors, juniors, and sophomores.
     * Lot FRESHMEN has 44 spaces reserved for any student.
     * <p>
     * A Car has an vin (integer [1..10]) and the driver's classification (String).
     * *
     *
     * @param args the command line arguments
     * @author CSSP, Xavier University of Louisiana, 7/13/2017
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\nHello, XULA Parking Lot App!\n");

        // TODO #1:  Create file with 100 "vin  classification" pairs per line.
        // TODO #2:  Read values from file and output # of upperclassmen.
        // TODO #3:  Read values from the file and output largest vin.
        int largestVin = largestVin();
        System.out.println("the largest vin is " + largestVin);
        // TODO #4:  Read values from the file and sort the vins.


        // TODO #5:  Read file into a Car object, store in ArrayList.
        // TODO #6:  How many cars?
        // TODO #7:  What is the smallest VIN?
        // TODO #8:  How many sophomores?
        // TODO #9:  How many sophomores and juniors?

        // TODO #10: Sort the Cars by vin.
        // TODO #11: Sort the Cars by classification.

        // TODO #12: Did anyone have to park in an overflow lot?
        // TODO #13: How full is each lot?
        // TODO #14: Are there enough parking spaces for each classification?
    }

    private static int largestVin() throws FileNotFoundException {
        int largest = 0;
        Scanner scan = new Scanner(new File("lgfile"));

        while (scan.hasNextLine()) {
            int vin = scan.nextInt();
            if (vin > largest) {
                largest = vin;
            }

        }
        return largest;

    }

}


import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * ============================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic list to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * @author Developer
 * @version 1.0
 */
public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===\n");

        // Initialize empty train consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        // Display initial state
        System.out.println("Train initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Display consist summary
        System.out.println("\nCurrent Train Consist: " + trainConsist);
    }
}
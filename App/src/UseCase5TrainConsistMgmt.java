import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5TrainConsistMgmt {
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("===================================\n");

        Set<String> train = new LinkedHashSet<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");
        train.add("Sleeper");

        System.out.println("Final Train Formation:");
        for (String b : train) {
            System.out.println(b);
        }
    }
}
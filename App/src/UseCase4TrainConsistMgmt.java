
import java.util.LinkedList;
import java.util.List;

public class UseCase4TrainConsistMgmt {
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("===================================\n");

        List<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        train.add(2, "Pantry");

        train.remove(0);
        train.remove(train.size() - 1);

        System.out.println("Final Train Consist:");
        for (String b : train) {
            System.out.println(b);
        }
    }
}
public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("===================================\n");

        String[] bogieIds = {};

        String searchId = "BG101";

        if (bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        System.out.println("Search Result:");
        if (found) {
            System.out.println("Bogie " + searchId + " FOUND");
        } else {
            System.out.println("Bogie " + searchId + " NOT FOUND");
        }
    }
}
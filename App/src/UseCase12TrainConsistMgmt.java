import java.util.*;

public class UseCase12TrainConsistMgmt {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("===================================\n");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}

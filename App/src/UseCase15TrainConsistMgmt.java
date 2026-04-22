import java.util.*;

public class UseCase15TrainConsistMgmt {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Rectangular bogie cannot carry Petroleum");
                }
                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo);
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Assignment attempt completed\n");
            }
        }

        public String toString() {
            return shape + " -> " + (cargo == null ? "No Cargo" : cargo);
        }
    }

    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("===================================\n");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");
        b2.assignCargo("Petroleum");
        b2.assignCargo("Coal");

        System.out.println("Final State:");
        System.out.println(b1);
        System.out.println(b2);
    }
}
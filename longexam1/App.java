import Spots.*;
import Visitor.*;

public class App {
    public static void main(String[] args) throws Exception {

        Locations Boracay = new Boracay();
        Locations Cavite = new Cavite();
        Locations Laguna = new Laguna();
        Locations Batangas = new Batangas();
        Locations Rizal = new Rizal();
        Locations Quezon = new Quezon();

        Tourist Me = new Me();

        Boracay.accept(Me);
        Cavite.accept(Me);
        Laguna.accept(Me);
        Batangas.accept(Me);
        Rizal.accept(Me);
        Quezon.accept(Me);
    }
}
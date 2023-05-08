package Visitor;
import Spots.*;

public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Cavite cavite);

    void visit(Laguna laguna);

    void visit(Batangas batangas);

    void visit(Rizal rizal);

    void visit(Quezon quezon);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
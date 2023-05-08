package Spots;
import Visitor.Tourist;

public class Rizal implements Locations {

    public int airFare = 100;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
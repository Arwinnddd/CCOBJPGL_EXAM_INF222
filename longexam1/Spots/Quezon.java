package Spots;
import Visitor.Tourist;

public class Quezon implements Locations {

    public int airFare = 100;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
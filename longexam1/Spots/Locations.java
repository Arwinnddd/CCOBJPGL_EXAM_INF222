package Spots;
import Visitor.Tourist;

public interface Locations {

    int airFare = 0;

    void accept(Tourist tourist);
}
package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;


public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating) {
        super(name, rating);
    }


    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if Visitor.age < 15
        return false;
    }
}

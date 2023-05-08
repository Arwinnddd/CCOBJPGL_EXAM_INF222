package Visitor;
import Spots.*;

public class Me implements Tourist {
    static int budget = 1000;
    

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    //Boracay
    public void visit(Boracay boracay) {
        System.out.println("My budget " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("Sarap naman Boracay" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("Ipon muna.");
        }

      checkBudget();
        
    }

    //Cavite
    public void visit(Cavite cavite) {

        if(budget >cavite.airFare){
            System.out.println("Sarap naman Cavite");
            budget -= cavite.airFare;
        }else{
            System.out.println("Ipon muna.");
        }

        checkBudget();
    }

    //Laguna
    public void visit(Laguna laguna) {
        if(budget >laguna.airFare){
            System.out.println("Sarap naman Laguna");
            budget -= laguna.airFare;
        }else{
            System.out.println("Ipon muna.");
        }

        checkBudget();
    }

    //Batangas
    public void visit(Batangas batangas) {
        if(budget >batangas.airFare){
            System.out.println("Sarap naman Batangas");
            budget -= batangas.airFare;
        }else{
            System.out.println("Ipon muna.");
        }

        checkBudget();
    }

    //Rizal
    public void visit(Rizal rizal) {
        if(budget >rizal.airFare){
            System.out.println("Sarap naman Rizal");
            budget -= rizal.airFare;
        }else{
            System.out.println("Ipon muna.");
        }

        checkBudget();
    }

    //Quezon
    public void visit(Quezon quezon) {
        if(budget >quezon.airFare){
            System.out.println("Sarap naman Quezon");
            budget -= quezon.airFare;
        }else{
            System.out.println("Ipon muna.");
        }

        checkBudget();
    }

    //Budget update method
    public void checkBudget() {
        System.out.println("My budget is " + budget);
    }
    
    public static int getBudget() {
        return budget;
    }


   
}
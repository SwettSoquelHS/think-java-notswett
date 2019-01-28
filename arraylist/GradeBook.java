import java.util.ArrayList;

/*
    A sample program demonstrating how an 
    ArrayList can be used to keep track of 
    a collection of similar items.
*/
public class GradeBook {
    
    public static void main(String[] args){

        //Create an instance of a gradebook to add 
        GradeBook book1 = new GradeBook();
        book1.addAssignment("Exam1", 0.9 , 1.0);
        book1.addAssignment("Exam2", 0.75, 1.0);
        book1.addAssignment("Quiz" , 0.2 , 0.25);

        book1.printGradebook();
        System.out.println("Current grade is: " + book1.calculateGrade());

        System.out.println("Removing Exam2...");
        book1.deleteAssignment("Exam2");
        book1.printGradebook();
        System.out.println("Current grade is: " + book1.calculateGrade());
    }

    /* Gradbook Properties */
    ArrayList assignments;

    /*
        Default constructor.
    */
    GradeBook(){
        assignments = new ArrayList();
    }

    void deleteLessthan(double thresh){
        for(int i=assignment.size()-1; i >= 0; i--){
            Assignment asg = (Assignment)assignments.get(i);
            double calcScore = asg.getScore()/asg.getTotalPoints();
            if( calcScore < thresh){
                assignments.remove(i);
            }
        }
    }

    /*
        Adds an assignment to the gradebook.
    */
    void addAssignment(String assignmentName, double score, double totalPointsPossible){
        Assignment newAssignment = new Assignment(assignmentName,
            score, totalPointsPossible ); 
        assignments.add( newAssignment );
    }

    /*
        Look for the assignment and remove it from the
        gradebook.
    */
    boolean deleteAssignment(String assignmentName){
        boolean result = false;
        int deleteAt = -1;
        for(int i = 0; i < assignments.size(); i++){
            Assignment asg = (Assignment)assignments.get(i);
            if( assignmentName.equals(asg.getName()) ){
                deleteAt = i;
                break;
            }
        }

        if( deleteAt >= 0){
            result = true;
            assignments.remove(deleteAt);
        }

        return result;
    }

    /*
        Adds up the total points available, the total points
        given for each assignment and returns the score.
    */
    double calculateGrade( ){
        double result = -1;
        double myScore = 0;
        double totalScore = 0;

        //Loop over assignments and add up the points
        for(Object item: assignments){
            Assignment asg = (Assignment)item;
            myScore += asg.getScore();
            totalScore += asg.getTotalPoints();
        }

        if(totalScore > 0)
            result = myScore / totalScore;

        return result;
    }

    /*
        Print the gradebook:
            Assignment Name:  score/Total
    */
    void printGradebook(){
        for(Object o: assignments){
            Assignment asg = (Assignment)o;
            //asg.getName()
            //    The Assignment name:  # / #
            System.out.println("\t" + asg.getName() + ": " + asg.getScore() +
                " / " + asg.getTotalPoints());
        }

    }

}
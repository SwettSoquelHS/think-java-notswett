/*
    A simple container class to hold onto 
    the values of an assignment.
*/
public class Assignment {
    protected String assignmentName;
    protected double scoreRecieved;
    protected double totalPoints;

    /*
        Constructor for Assignment
    */
    Assignment(String name, double points, double totalPoints){
        assignmentName = name;
        scoreRecieved = points;
        this.totalPoints = totalPoints;
    }

    
    /*
        Return the name of the assignment.
    */
    String getName(){ return assignmentName; }

    /*
        Return the score received for the assignment
    */
    double getScore(){return scoreRecieved; }

    /* 
    Return the points possible for the assignment
    */
    double getTotalPoints(){ return totalPoints; }
}



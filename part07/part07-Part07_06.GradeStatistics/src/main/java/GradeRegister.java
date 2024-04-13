import java.util.ArrayList;

public class GradeRegister {
    
    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points =new ArrayList<>();
    }
    
    public void addGradeBasedOnPoints(int points) {
        
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        
        return count;
    }
    
    public static int pointsToGrade(int points) {
        
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        
        return grade;
    }
    public double averageOfGrades(){
        if(grades.isEmpty()){
            return -1;
        }
        int sum=0;
        for(Integer g : grades){
            sum+=g.intValue();
        }
        return (double)sum/grades.size();
    }
    public double averageOfPoints(){
        if(points.isEmpty()){
            return -1;
        }
        int sum=0;
        for(Integer g : points){
            sum+=g.intValue();
        }
        return (double)sum/ points.size();
    }
    
    public double averageOfPointsPassing(){
        if(points.isEmpty()){
            return -1;
        }
        int sum=0;
        int numsPassed=0;
        for(Integer g : points){
            if(g.intValue()>=50){
                sum+=g.intValue();
                numsPassed++;
            }
        }
        if(sum==0){
            return -2;
        }
        return (double)sum/ numsPassed;
    }
    
    public double passingPercentage(){
        int passed=0;
        for(Integer g : points){
            if(g.intValue()>=50){
                passed++;
            }
        }
        return (double)passed/points.size();
    }
    
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");
            
            grade = grade - 1;
        }
        
    }
    
    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    
}
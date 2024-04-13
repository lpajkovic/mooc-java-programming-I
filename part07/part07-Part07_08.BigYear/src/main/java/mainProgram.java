
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds=new ArrayList<>();
        
        while(true){
            System.out.println("?");
            String command=scan.nextLine();
            
            if(command.equals("Add")){
                System.out.println("Name:");
                String name=scan.nextLine();
                System.out.println("Name in Latin:");
                String latin=scan.nextLine();
                addBird(birds,new Bird(name,latin));
            }else if(command.equals("Observation")){
                System.out.println("Bird?");
                String name=scan.nextLine();
                increaseObservation(birds,name);
            }else if(command.equals("All")){
                printAll(birds);
            }else if(command.equals("One")){
                System.out.println("Bird?");
                String name=scan.nextLine();
                printOne(birds,name);
            }else if(command.equals("Quit")){
                break;
            }
        }

    }
    
    public static void addBird(ArrayList<Bird> birds, Bird bird){
        birds.add(bird);
    }
    public static void increaseObservation(ArrayList<Bird> birds, String name){
        boolean exists=false;
        for(Bird b : birds){
            if(b.getName().equals(name)){
                b.setObservation();
                exists=true;
            }
        }
        if(!exists){
            System.out.println("Not a bird!");
        }
    }
    public static void printAll(ArrayList<Bird> birds){
        for(Bird b : birds){
            System.out.println(b);
        }
    }
    public static void printOne(ArrayList<Bird> birds, String name){
        for(Bird b : birds){
            if(b.getName().equals(name)){
                System.out.println(b);
            }
        }
    }

}

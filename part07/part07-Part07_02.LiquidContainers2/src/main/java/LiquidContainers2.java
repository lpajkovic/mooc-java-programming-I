
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cn1=new Container();
        Container cn2=new Container();

        while (true) {
            //System.out.print("> ");
            System.out.println("First: " + cn1);
            System.out.println("Second: " + cn2);
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }else{
                String[] parts=input.split(" ");
                String command=parts[0];
                int value=Integer.valueOf(parts[1]);
                if(command.equals("add")){
                    cn1.add(value);
                }else if(command.equals("remove")){
                    cn2.remove(value);
                }else if(command.equals("move")){
                    if (value<=0 || cn1.contains()==0) {
                        return;
                    }
                    if (cn1.contains()-value<0) {
                        value=cn1.contains();
                    }
                    
                    cn1.remove(value);
                    
                    cn2.add(value);
                }
            }

        }
    }

}

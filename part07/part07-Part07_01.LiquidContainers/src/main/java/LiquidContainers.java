
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first=0;
        int second=0;
        
        while (true) {
            //System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }else{
                String[] parts=input.split(" ");
                if(parts[0].equals("add") && Integer.valueOf(parts[1])>0){
                    if(first+Integer.valueOf(parts[1])>100){
                        first=100;
                    }else{
                        first+=Integer.valueOf(parts[1]);
                    }
                }else if(parts[0].equals("move") && Integer.valueOf(parts[1])>0){
                    if(first>=Integer.valueOf(parts[1])){
                        if(second+Integer.valueOf(parts[1])>100){
                            second=100;
                            first=0;
                        }else{
                            second+=Integer.valueOf(parts[1]);
                            first-=Integer.valueOf(parts[1]);
                        }
                    }else{
                        if(first!=0){
                            int toMove=Integer.valueOf(parts[1])-first;
                            if(second+toMove>100){
                                second=100;
                                first=0;
                            }else{
                                second=first;
                                first=0;
                            }
                        }
                        
                    }
                }else if(parts[0].equals("remove") && Integer.valueOf(parts[1])>0){
                    if(second-Integer.valueOf(parts[1])<0){
                        second=0;
                    }else{
                        second-=Integer.valueOf(parts[1]);
                    }
                }
            }

        }
    }

}

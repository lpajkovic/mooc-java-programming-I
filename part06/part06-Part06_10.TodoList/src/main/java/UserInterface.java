import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    public void start(){
        while(true){
            System.out.println("Command:");
            String input=scanner.nextLine();
            if(input.equals("stop")){
                break;
            }else if(input.equals("add")){
                System.out.println("To add:");
                String line=scanner.nextLine();
                todoList.add(line);
            }else if(input.equals("list")){
                todoList.print();
            }else if(input.equals("remove")){
                int num=Integer.valueOf(scanner.nextLine());
                todoList.remove(num);
            }
        }
    }
}

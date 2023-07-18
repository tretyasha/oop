package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com;

        while (true) {
            String command = prompt(
            "Enter the command:"
            +"\n(CREATE, READ, LIST, UPDATE, DELETE, EXIT): ");
            
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    User u = userContact();
                    userController.saveUser(u);
                    break;
                case READ:
                    String id = prompt("Input id: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    List<User> users = userController.getAllUsers();
                    for(User user: users) {
                        System.out.println(user);
                    }
                    break;
                case UPDATE:
                    Long userId = Long.parseLong(prompt("Enter user id: "));
                    userController.userUpdate(userId, userContact());
                    break;
                case DELETE:
                    String userIdDelete = prompt("Delete a contact: ");
                    userController.deleteUser(userIdDelete);
                    break;
                default: 
                }
            }
        }


    // Метод получения данных контакта
    private User userContact() {
        String firstName = prompt("Name: ");
        String lastName = prompt("Last name: ");
        String phone = prompt("Phone number: ");
        return new User(firstName, lastName, phone);
    }
    
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

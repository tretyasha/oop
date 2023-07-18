package notebook.controller;
import notebook.model.User;
import notebook.repository.GBRepository;


import java.util.List;
import java.util.Objects;
import notebook.log.Logger;


public class UserController {
    private final GBRepository<User, Long> repository;
    private Logger logger;

    public UserController(GBRepository<User, Long> repository,Logger logger) {
        this.repository = repository;
        this.logger = logger;
    }
    // сохранить контакт
    public void saveUser(User user) {
        repository.create(user);
        System.out.println();
        logger.log("Created a new user: " +
                user.getId() + " " + user.getFirstName() + " " +
                user.getLastName() + " " + user.getPhone());
    }
    // найти контакт по id
    public User readUser(Long userId) throws Exception {
        List<User> users = repository.findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                return user;
            }
        }

        throw new RuntimeException("User not found");
    }
    // получить все контакты
    public List<User> getAllUsers() {
        return repository.findAll();
    }
    // заменить контакт на другой
    public boolean userUpdate(Long id, User update) {
        try {
            repository.update(id, update);
            System.out.println();
            logger.log("Updated contact: " + update.getFirstName() + " " + 
                update.getLastName() + " " + update.getPhone());
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // удалить контакт из списка
    public void deleteUser(String userId) {
        repository.delete(Long.parseLong(userId));
        System.out.println();
        logger.log("Deleted contact with id: " + userId);
    }
}
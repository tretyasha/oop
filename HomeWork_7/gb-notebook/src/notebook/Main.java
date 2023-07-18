package notebook;

import notebook.controller.UserController;
import notebook.file.impl.FileOperation;
import notebook.log.impl.ConsoleLogger;
import notebook.log.Logger;
import notebook.model.User;
import notebook.repository.GBRepository;
import notebook.repository.impl.UserRepository;
import notebook.view.UserView;
import static notebook.util.DBConnector.DB_PATH;
import static notebook.util.DBConnector.createDB;


public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository<User, Long> repository = new UserRepository(fileOperation);
        Logger logger = new ConsoleLogger();
        UserController controller = new UserController(repository, logger);
        UserView view = new UserView(controller);
        view.run();
    }
}

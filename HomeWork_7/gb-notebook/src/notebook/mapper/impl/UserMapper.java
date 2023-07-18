package notebook.mapper.impl;

import notebook.mapper.Mapper;
import notebook.model.User;

public class UserMapper implements Mapper<User, String> {
    private final String format;

    public UserMapper(String format) {
        this.format = format;
    }
    // Можем менять формат сохранения записей
    public UserMapper() {
        this(" ");
    }
    
    @Override
    public String toInput(User user) {
        return String.join(format
        , user.getId().toString()
        , user.getFirstName()
        , user.getLastName()
        , user.getPhone());
    }

    @Override
    public User toOutput(String s) {
        String[] lines = s.split(format);
        long id;
        if (isDigit(lines[0])) {
            id = Long.parseLong(lines[0]);
            return new User(id, lines[1], lines[2], lines[3]);
        }
        throw new NumberFormatException("Id must be a large number");
    }

    private boolean isDigit(String s) throws NumberFormatException {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
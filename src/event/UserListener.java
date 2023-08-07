package event;

import model.UserModel;

public interface UserListener {
    public void onChange(UserModel model);
}

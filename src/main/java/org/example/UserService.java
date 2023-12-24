package org.example;

import java.util.List;

public interface UserService <T extends User> {

    List<T> getAll();

}

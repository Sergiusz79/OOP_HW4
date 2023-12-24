package org.example;

import java.util.List;

public interface UserViev<T extends User> {

    void sendOnConsole(List<T> users);
}

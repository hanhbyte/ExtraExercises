package Lesson4.controller;

public interface DoAll<T> {
    void showAll();
    void addNew(T var1);
    void updateById(String var1, T var2);
    void removeById(String var1);
    int findById(String var1);
}

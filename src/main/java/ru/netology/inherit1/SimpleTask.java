package ru.netology.inherit1;

public class SimpleTask extends Task {
    protected String title;

    public SimpleTask(int id, String title) {
        super(id); // вызов родительского конструктора
        this.title = title; // заполнение своих полей
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean matches(String query) {
        if (title.contains(query)) { //проверяем содержит ли строка title у любой строки есть метод contains который проверяет есть ли внутри строки такая подстрока в данном случае title
            return true;
        } else {
            return false;
        }
    }
}

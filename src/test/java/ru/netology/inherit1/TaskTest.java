package ru.netology.inherit1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

//    @Test
//    public void testSimpleTaskMatches() {
//
//        SimpleTask task = new SimpleTask(12, "Позвонить начальнику");
//
//        boolean expected = true;
//        boolean actual = task.matches("Позвонить");
//
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void testSimpleTaskMatchesSecondVersion() {

        SimpleTask task = new SimpleTask(12, "Позвонить начальнику");

        boolean actual = task.matches("Позвонить");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testSimpleTaskNotMatches() {

        SimpleTask task = new SimpleTask(12, "Позвонить начальнику");

        boolean actual = task.matches("Написать");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testMeetingMatches() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Выкатка");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMeetingMatches2() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Приложение");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMeetingNotMatches() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("после");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testEpicMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Молоко");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testEpicNotMatches() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(19, subtasks);

        boolean actual = epic.matches("Сыр");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testSimpleTaskGetCorrectTitle() {

        SimpleTask task = new SimpleTask(12, "Позвонить начальнику");

        String expected = "Позвонить начальнику";
        String actual = task.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSimpleTaskEmptyString() {

        SimpleTask task = new SimpleTask(12, "");

        String expected = "";
        String actual = task.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTaskGetCorrectId() {

        Task task = new Task(12);

        int expected = 12;
        int actual = task.getId();

        Assertions.assertEquals(expected, actual);
    }


}

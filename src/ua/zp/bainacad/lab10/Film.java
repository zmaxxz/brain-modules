package ua.zp.bainacad.lab10;

/**
 * Класс <b>Film</b> c полями <b>name<b> - название фильма, </b>duration</b> - продолжительность, <b>genre</b> - жанр
 *
 * @author Максим Деенков
 * @version 1.0
 * @since 1.0
 */
public class Film {

    /**
     * Поле название фильма
     */
    private String name;

    /**
     * Поле продолжительность фильма
     */
    private int duration;

    /**
     * Поле жанр фильма
     */
    private final String genre;

    // При инициализации класса Film выводим на печать сообщение "Создается новый Фильм"
    {
        System.out.println("Создается новый Фильм");
    }

    /**
     * Конструктор нового обЪекта <b>Film</b> с параметрами.
     * Выводит на печать сообщение <b>"Фильм {@link Film#name}, успешно создана"</b>
     *
     * @param name     название фильма
     * @param duration продолжительность
     * @param genre    жанр
     */
    public Film(String name, int duration, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Фильм " + this.name + ", успешно создана");
    }

    /**
     * Метод получения значения поля {@link Film#name}
     *
     * @return - название фильма
     */
    public String getName() {
        return name;
    }

    /**
     * Метод передачи значения полю {@link Film#name}
     *
     * @param name - название фильма
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод получения значения поля {@link Film#duration}
     *
     * @return duration - продолжительность фильма
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Метод передачи значения полю {@link Film#duration}
     *
     * @param duration - продолжительность фильма
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Метод получения значения поля {@link Film#genre}
     *
     * @return genre - жанр фильма
     */
    public String getGenre() {
        return genre;
    }
}

package ua.zp.bainacad.lab10;

public class Main {
    public static void main(String[] args) {
        //Инициализируем новый елемет класса Library с названием библиотеки "My Library"
        Library l1 = new Library("My Library");

        //Пытаемся добавить новые фильмы в библиотеку
        tryAddNewFilm(l1, "Film 1", 11, "фантастика", l1.getIdNullPoint());
        tryAddNewFilm(l1, "Film 2", 222, "ужасы", l1.getIdNullPoint());
        tryAddNewFilm(l1, "Film 3", 333, "фантастика", l1.getIdNullPoint());
        tryAddNewFilm(l1, "Film 4", 4444, "комедия", l1.getIdNullPoint());
        tryAddNewFilm(l1, "Film 5", 55555, "комедия", l1.getIdNullPoint());
    }

    /**
     * Статический метод <b>tryAddNewFilm</b> реализовует проверку на наличие пустой ячейки {@link Library#films}
     * и добавляет в нее новый фильм, если пустой ячейки уже нет – выводит сообщение: «Вы достигли лимита».
     *
     * @param library  библиотека фильмов, типа {@link Library}
     * @param name     название фильма
     * @param duration продолжительность фильма
     * @param genre    жанр фильма
     * @param id       идентификатор пустой ячейки
     */
    public static void tryAddNewFilm(Library library, String name, int duration, String genre, int id) {
        if (id >= 0 && id <= library.getFilms().length) {
            library.getFilms()[id] = new Film(name, duration, genre);
            return;
        }
        System.out.println("Вы достигли лимита");
    }
}

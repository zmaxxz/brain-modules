package ua.zp.bainacad.lab10;

/**
 * Класс <b>Library</b> c полями <b>[]films<b> - массив фильмов, </b>nameLibrary</b> - название библиотеки
 *
 * @author Максим Деенков
 * @version 1.0
 * @since 1.0
 */
public class Library {
    private Film[] films;
    private final String nameLibrary;

    /**
     * При инициализации класса <b>Library</b> создаем массив <b>[]films<b> размером в 5 элементов,
     * добовляем два любимых фильма
     * Выводим на печать сообщение <b>"Добавлены любимые фильмы"</b>
     */ {
        films = new Film[5];
        films[1] = new Film("Favorite film1", 123, "фантастика");
        films[2] = new Film("Favorite film2", 231, "комедия");
        System.out.println("Добавлены любимые фильмы");
    }

    /**
     * Конструктор нового обЪекта <b>Library</b> с параметром
     * Выводит на печать сообщение <b>"Библиотека {@link Library#nameLibrary}, успешно создана"</b>
     *
     * @param nameLibrary название библиотеки
     */
    public Library(String nameLibrary) {
        this.nameLibrary = nameLibrary;
        System.out.println("Библиотека " + getNameLibrary() + ", успешно создана.");
    }

    /**
     * Метод поиска идентификатора массива <b>[]{@link Library#films}==null</b>
     *
     * @return возвращает первую встретившуюся позию в <b>[]{@link Library#films}==null</b>, иначе <b>-1</b>
     */
    public int getIdNullPoint() {
        int i = 0;
        for (Film value : films) {
            if (value == null) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /**
     * Метод получения значения поля {@link Library#films}
     *
     * @return films - массив фильмов
     */
    public Film[] getFilms() {
        return films;
    }

    /**
     * Метод получения значения поля {@link Library#nameLibrary}
     *
     * @return nameLibrary - имя библиотеки
     */
    public String getNameLibrary() {
        return nameLibrary;
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Необходимо реализовать следующий метод:
//
//        На вход получаем список названий книг.
//        Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг.
//        Все книги должны быть отсортированы по алфавиту с первой до последней полки.
//        Количество полок константное — 5 штук.
//        Вернуть книги, распределенные по полкам.

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        addBooks(list);
    }

    public static final int NUM_SHELVES = 5;
    public static final int MAX_BOOKS_PER_SHELF = 6;

    public static List<List<String>> sortBooks(List<String> books) {
        Collections.sort(books);

        List<List<String>> shelves = new ArrayList<>();

        for (int i = 0; i < NUM_SHELVES; i++) {
            int startIndex = i * MAX_BOOKS_PER_SHELF;
            int endIndex = Math.min((i+1) * MAX_BOOKS_PER_SHELF, books.size());

            List<String> shelf = new ArrayList<>(books.subList(startIndex, endIndex));
            shelves.add(shelf);
        }

        for (int i = 0; i < shelves.size(); i ++) {
            System.out.println("Полка" + (i + 1) + ": " + shelves.get(i));
        }
        return shelves;
    }


    private static void addBooks(List<String> list) {
        list = new ArrayList<>();

        list.add("Л. Толстой: Война и мир");
        list.add("Ф. Достоевский: Преступление и наказание");
        list.add("А. Пушкин: Евгений Онегин");
        list.add("М. Булгаков: Мастер и Маргарита");
        list.add("Ж. Верн: 20 000 лье под водой");
        list.add("Дж. Остин: Гордость и предубеждение");
        list.add("Э. Бронте: Джейн Эйр");
        list.add("М. Митчелл: Унесенные ветром");
        list.add("Г. Оруэлл: 1984");
        list.add("Р. Брэдбери: 451 градус по Фаренгейту");
        list.add("С. Кинг: Темная башня");
        list.add("Д. Браун: Утраченный символ");
        list.add("П. Коэльо: Алхимик");
        list.add("Т. Моррисон: Возлюбленный");
        list.add("А. Кристи: Десять негритят");
        list.add("А. Дюма: Граф Монте-Кристо");
        list.add("Л. Кэрролл: Алиса в стране чудес");
        list.add("С. Лем: Солярис");
        list.add("Х. Ли: Темный лес");
        list.add("А. Сапковский: Ведьмак");
        list.add("У. Голдинг: Повелитель мух");
        list.add("Д.Т. Суэнд: Записки охотника");
        list.add("Ж. Кюрассе: Графиня де Монте-Кристо");
        list.add("М. Льюис: Хроники Нарнии");
        list.add("С. Мейер: Сумерки");
        list.add("Г. Маркес: Сто лет одиночества");
        list.add("И. Шэффер: Голодные игры");
        list.add("Э. Хемингуэй: Старик и море");
        list.add("А. Конан Дойл: Приключения Шерлока Холмса");
        sortBooks(list);
    }
}
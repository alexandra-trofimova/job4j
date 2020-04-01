package ru.job4j.tracker;

import java.util.Objects;
import java.util.Random;
import java.util.Arrays;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод, реализующий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        if (item.getName() != null) {
            item.setId(generateId());
            this.items[position++] = item;
        }
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
    /**
     * Метод, возвращающий копию массива без пустых ячеек
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }
    /**
     * Метод, выполняющий поиск заявки по имени
     * @param key имя заявки, которую ищет метод
     */
    public Item[] findByName(String key) {
        Item[] equalNames = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item tmp = this.items[index];
            if (tmp.getName().equals(key)) {
                equalNames[size] = tmp;
                size++;
            }
        }
        return Arrays.copyOf(equalNames, size);
    }
    /**
     * Метод, выполняющий поиск заявки по уникальному ID
     * @param id - идентификатор заявки, которую ищет метод
     */
    public Item findById(String id) {
        Item result = new Item(null);
        for (int index = 0; index < position; index++) {
            Item tmp = this.items[index];
            if (tmp.getId().equals(id)) {
                result = tmp;
                break;
            }
        }
        return result;
    }
}

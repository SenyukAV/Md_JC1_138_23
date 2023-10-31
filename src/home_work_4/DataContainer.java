package home_work_4;

import java.util.Arrays;
import java.util.Objects;

public class DataContainer <T>   {
    // внутренний массив, который предназначен для хранения передаваемых объектов
    private T[] data;

    //колличестов элиментов массива
    private int size;

    //конструктор
    public DataContainer(T[] data) {
        this.data = data;

    }

    public DataContainer() {
        this.data = ((T[]) new Object[]{null, null, null, null, null, null});
    }

    /*
    4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data и возвращает номер позиции в которую были вставлены данные, начиная с 0.
        4.1 Если поле data не переполнено то данные нужно добавлять в первую позицию (ячейку) после последней заполненной позиции (ячейки).
            4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777, null, null]. Метод add вернёт число 3.
            4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data = [1, 2, 3, null, null, null]. Метод add вернёт число -1.
     -1 будет индикатором того что данный элемент в наш контейнер вставлять нельзя.
            4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 777, 3, null, null, null]. Метод add вернёт число 1.
        4.2 В случае если поле data переполнено, нужно придумать механизм который будет расширять пространство для новых элементов. Тут вам поможет Arrays.copyOf.
            4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777]. Метод add вернёт число 3.
            4.2.2 Пример: data = []. Вызвали add(777). Должно получиться data = [777]. Метод add вернёт число 0.
     */
    public int add(T item) {
        int buf = -1;
        int len = data.length;
        if (item != null && size >= len - 1) {
            data = Arrays.copyOf(data, len + 1);
            data[size] = item;
            return size++;
        } else if (item != null && size <= len - 1) {
            for (int i = 0; i < len; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    buf = i;
                    size++;
                    break;
                }
            }
            return buf;
        }
        return -1;
    }

    /*
    В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из поля data, предварительно сохранённый объект который мы передали
    на предыдущем шаге через метод add.
        5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0. Вызываем get(0). Метод get возвращает 9999
        5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
     */
    public T get(int index) {
        int len = data.length;
        if (index < len && index >= 0) {
            return data[index];
        }
        return null;
    }

    /*
В данном классе должен быть метод T[] getItems(). Данный метод возвращает массив из поля data.
    }
     */
    public T[] getItems() {
        return Arrays.copyOf(data, data.length);
    }

    /*
7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
	7.1 Метод возвращает true если у нас получилось удалить данные.
		7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
	7.2 Метод возвращает false если нет такого индекса.
		7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
	7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
		7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777]. Метод delete вернёт true
     */

    public boolean delete(int index) {
        int len = data.length;
        if (index < len && index > 0) {
            data[index] = null;
            size--;
            return true;
        }
        return false;
    }

    /*
Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
	8.1 Метод возвращает false если передают null.
		8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(null). Метод delete вернёт false a data = [1, 2, 3, 777]
		8.1.2 Пример data = [1, 2, 3, 777, null]. Вызывают delete(null). Метод delete вернёт false a data = [1, 2, 3, 777, null]
	8.2 Метод возвращает true если у нас получилось удалить данные.
		8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
	8.3 Метод возвращает false если нет такого элемента.
		8.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
	8.4 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
		8.4.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3]. Метод delete вернёт true
     */
    public boolean delete(T item) {
        if (item == null) return false;
        for (int i = 0; i < size; i++) {
            if (data[i].equals(item)) {
                for (int n = i; n < size - 1; n++) {
                    data[n] = data[n + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }



    }



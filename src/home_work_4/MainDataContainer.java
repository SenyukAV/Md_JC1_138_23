package home_work_4;

public class MainDataContainer {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>();
        DataContainer<Integer> container1 = new DataContainer<>();

        // Данные типа String

        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        container.getItems();
        container.delete(text1);
        container.delete(index2);
        System.out.println(container.get(index1));

        // Данные типа Integer
        int index_1 = container1.add(1);
        int index_2 = container1.add(2);
        int index_3 = container1.add(77);
        int text_1 = container1.get(index1);
        int text_2 = container1.get(index2);
        int text_3 = container1.get(index3);
        System.out.println(text_1);
        System.out.println(text_2);
        System.out.println(text_3);

    }
}

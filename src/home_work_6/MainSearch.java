package home_work_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainSearch {
    public static void main(String[] args) {
        //путь к файлу
        String s="untitled/src/home_work_6/wp.txt";
        EasySearch es =new EasySearch();

        /**
         * метод для считывания содержимого файла в StringBuffer
         * @param s - путь к файлу
         *
         * @return  - StringBuffer с соджержанием файла
         */
        StringBuffer strBuffer=es.readFlile(s);

        /**
         * метод для получения массива слов из StringBuffer при условии разделения через пробелы ( с заменой пунктуации на пробелы)
         * @param strBuffer  - содержимое файла в StringBuffer
         *
         * @return array - массив слов с учетом необходимого разделения текста
         */

        String [] array=es.getArrayWord(strBuffer);

        /**
         * метод для получения  уникального слова (ключ) и коолечества повторения данного слова
         * @param array  - массив слов с учетом необходимого разделения текста
         *
         * @return mapWord - Map c уникальными словами (ключ) и коолечеством повторения данного слова
         */

        Map< String,Integer> mapWord= es.getStatisticWords(array);

        /**
         * отсортировать получившуюся коллекцию ,
         * создавать для этого List
         * и наполнять лист Entry из Map
         */

        List<String> list = new ArrayList<>();
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(mapWord.entrySet());
        entries.sort(new MyComparator());

        for (Map.Entry wordStatistic: entries) {
           System.out.println(wordStatistic);
        }

        /**
         * Используя реализации интерфейса
         * ISearchEngine вывести информацию как часто встречаются слова "война", "и" (как союз), "мир".
         */

        String word1="Война";
        String word2=" и ";
        String word3="Мир";

        long count1 =es.search(strBuffer.toString(),word1);
        System.out.println("Слово " + word1+ " встречается в тексте " + count1 + " раз");
        long count2 =es.search(strBuffer.toString(),word2);
        System.out.println("Слово " + word2+ " встречается в тексте " + count2 + " раз");
        long count3 =es.search(strBuffer.toString(),word3);
        System.out.println("Слово " + word3+ " встречается в тексте " + count3 + " раз");

        long count4= es.searchWithoutRegistr(strBuffer.toString(),word1);
        System.out.println("Слово " + word1+ " встречается в тексте без учета регистра " + count1 + " раз");



    }
}

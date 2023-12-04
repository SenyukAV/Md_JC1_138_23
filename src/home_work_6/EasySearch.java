package home_work_6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

public class EasySearch implements  ISearchEngine {


    /**
     * метод для поиска повторений с помощью indexOf . Поиск происходит с учетом регитсра
     * @param text  - текст в котором происходит поиск
     * @param word - слово которое ищется
     * @return  - коллечество повторений
     */
    public  long search(String text, String word) {
        long count = 0;

        for (int i=text.indexOf(word);i>=0;i=text.indexOf(word,i+1)){

            count++;
        }
        return count;
    }

    /**
     * метод для поиска повторений с помощью indexOf. Поиск происходит без учета регистра
     * @param text  - текст в котором происходит поиск
     * @param word - слово которое ищется
     * @return  - коллечество повторений без учета регистра
     */
    public  long searchWithoutRegistr(String text, String word) {
        long count = 0;
        String wordWithoutRegistr =word.toLowerCase();
        String text1=text.toLowerCase();

        for (int i=text1.indexOf(wordWithoutRegistr);i>=0;i=text1.indexOf(wordWithoutRegistr,i+1)){
            count++;
        }
        return count;
    }

    /**
     * метод для считывания содержимого файла в StringBuffer
     * @param filePath  - путь к файлу
     *
     * @return  - StringBuffer с соджержанием файла
     */

    public StringBuffer  readFlile (String filePath) {
        StringBuffer stringBuffer = null;
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            stringBuffer = new StringBuffer();
            int result = -1;
            while ((result = bufferedReader.read()) != -1) {
                stringBuffer.append(Character.toChars(result));
            }

        } catch (
                IOException ioException
        ) {
            ioException.printStackTrace(System.out);
        }
        return stringBuffer;
    }
    /**
     * метод для получения массива слов из StringBuffer при условии разделения через пробелы ( с заменой пунктуации на пробелы)
     * @param strB  - содержимое файла в StringBuffer
     *
     * @return words - массив слов с учетом необходимого разделения текста
     */

    public  String[] getArrayWord(StringBuffer strB) {
        String stringBuffer1;
        stringBuffer1=strB.toString().replaceAll("\\p{P}", "") ;

        HashSet<String> hashSet = new HashSet<String>();
        String [] words= stringBuffer1.toString().split("[,\\s]+");
        return words;

    }
    /**
     * метод для получения  уникального слова (ключ) и коолечества повторения данного слова
     * @param words  - массив слов с учетом необходимого разделения текста
     *
     * @return mapWord - Map c уникальными словами (ключ) и коолечеством повторения данного слова
     */

    public Map< String,Integer> getStatisticWords (String[] words) {
        HashSet<String> hashSet = new HashSet<String>();
        Map< String,Integer> mapWord = new HashMap<String,Integer>();
        for (String word :words) {
            hashSet.add(word);
        }
        for (String word :words) {
            if (!(mapWord.containsKey(word))){
                mapWord.put(word,0);
            }
            if ((mapWord.containsKey(word))){
                mapWord.put(word,mapWord.get(word)+1);
            }
        }
        return mapWord;

    }






}

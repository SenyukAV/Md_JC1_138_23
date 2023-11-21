package home_work_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Comparator;


public class DataGeneration  {

    /**
     * массив символов из цифр и букв латинского алфавита
     * Нужно что бы генерировать рандомную строку (не важно из чего состоит)
     */

    private String[] AlphabetWithDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    /**
     * массив букв руссого алфавита алфавита
     * Нужно что бы генерировать рандомную строку (состоящую из русских букв)
     */
    private String[] AlphabetRus ={ "а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};
    /**
     * массив имен
     * Нужно что бы генерировать рандомное имя (настоящее имя)
     */

    private String[] NameRus={"Иван","Петр","Михаил","Олег","Геннадий","Александр","Павел","Сергей","Виктор","Игорь"};

    /**
     * массив кличек
     * Нужно что бы генерировать рандомное рандомное имя/псевданим
     */
    private String[] NickRus={"Геракл","Аид","Зевс","Аполлон","Дионис","Гермес","Песейдон","Арес","Гефест","Афина"};

    /**
     * путь к файлу с именами
          */
    private String path;

    /**
     * путь к файлу с кличками
     */
    private String path1;

    public String getPath() {
        return path;
    }

    public String getPath1() {
        return path1;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public void setPath1(String path1) {
        this.path1 = path1;
    }
    public String[] getNameRus() {
        return NameRus;
    }

    public String[] getAlphabetWithDigits() {
        return AlphabetWithDigits;
    }

    public String[] getAlphabetRus() {
        return AlphabetRus;
    }

    /**
     * метод генерации рандомного числа
     * @param a  минимальное число рандома
     * @param b  максимальное число рандома
     * @return  рандомное чилсо
     */
    public int generateRandomNumber(int a, int b){

        int random_number= a + (int) (Math.random() * b);
        return  random_number;

    }

    /**
     * метод генерации рандомного имена из массива
     *
     * @param person ссылка на объект
     * @param array массив имен
     * @return  имя
     */
    public Person generateRandomName(Person person,String[] array) {
        int countOfName=generateRandomNumber(0,array.length);
        person.setName(array[countOfName]);

        return person;

    }
    /**
     * метод генерации рандомного клички из массива
     *
     * @param person ссылка на объект
     * @param array массив имен
     * @return  кличка для Animal
     */

    public Animal generateRandomNick(Animal animal,String[] array) {
        int countOfName=generateRandomNumber(0,array.length);
        animal.setNick(array[countOfName]);

        return animal;

    }

    /**
     * метод генерации рандомного набора символа для имени
     *
     * @param person ссылка на объект
     * @param array массив
     * @param a  b  - длина слова
     * @return  имя
     */
    public Person generateRandomNameRandom(Person person,String[]array,int a,int b){

        int countOfWord=generateRandomNumber(a,b);
        String resultName="";
        String buffer="";
        for (int i=0;i<countOfWord;i++) {
            buffer=array[generateRandomNumber(0,array.length)];
            resultName=resultName+buffer;


        }
       person.setName(resultName);
        return person;
    }

    /**
     * метод генерации рандомного набора символа для клички
     *
     * @param person ссылка на объект
     * @param array массив
     * @param a  b  - длина слова
     * @return  кличка
     */
    public Animal generateRandomNickRandom(Animal animal,String[]array,int a,int b){

        int countOfWord=generateRandomNumber(a,b);
        String resultName="";
        String buffer="";
        for (int i=0;i<countOfWord;i++) {
            buffer=array[generateRandomNumber(0,array.length)];
            resultName=resultName+buffer;


        }
        animal.setNick(resultName);
        return animal;
    }

    /**
     * метод генерации рандомного набора символа для псевдонима
     *
     * @param person ссылка на объект
     * @param array массив
     * @param a  b  - длина слова
     * @return  псевдоним
     */
    public Person generateRandomNickRandom(Person person,String[]array,int a,int b){

        int countOfWord=generateRandomNumber(a,b);
        String resultName="";
        String buffer="";
        for (int i=0;i<countOfWord;i++) {
            buffer=array[generateRandomNumber(0,array.length)];
            resultName=resultName+buffer;


        }
        person.setNick(resultName);
        return person;
    }
    /**
     * метод генерации рандомного набора символа для пароля
     *
     * @param person ссылка на объект
     * @param array массив
     * @param a  b  - длина слова
     * @return  пароль
     */

    public Person generateRandomPasswordRandom(Person person,String[]array,int a,int b){

        int countOfWord=generateRandomNumber(a,b);
        String resultName="";
        String buffer="";
        for (int i=0;i<countOfWord;i++) {
            buffer=array[generateRandomNumber(0,array.length)];
            resultName=resultName+buffer;


        }
        person.setPassword(resultName);
        return person;
    }

    /**
     * метод для опредедления количества сторк для возможности взять рандомную страку из файла
     * @param path - путь к файлу
     * @return  количества сторк
     */

    public int countLinefile(String path) {
        int count=0;
        try {

            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
          //      System.out.println(line);
                count++;
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(count);
        return count;
    }

    /**
     * метод для опредедления рандомного имени из файла на основании номера рандомной страку из файла
     * @param p ссылка на объект
     * @param path - путь к файлу
     * @return  ссылка на объект
     */
    public Person generateRandomNameFromFile(Person p,String path) {
        int count1=1;
        int count2=generateRandomNumber(1,countLinefile(path));
        String line="";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
             line = reader.readLine();
            while (line != null) {
                if (count1==count2)  break;

                count1++;
                line = reader.readLine();

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        p.setName(line);
        return p;
    }


    public String toString(Person person) {
        return "{" + "nick= " + person.getNick() + ',' + "password= " + person.getPassword() + ','+ "name= " + person.getName()+ '}';
    }

    public String toString(Animal animal) {
        return "{" + "nick= " + animal.getNick() + ',' + "age= " + animal.getAge() +  '}';
    }

    /**
     * метод для для наполнения коллекции для Person
     * @param p ссылка на объект
     * @param path - путь к файлу
     * @param n  коллечество добавленых объектов в калецию
     * @return  коллекцию
     */
    public  Collection addCollection(Collection collection,Person person,int n) {
        for (int i=0;i<n;i++) {
        collection.add(new Person(this.generateRandomNickRandom(person,this.getAlphabetWithDigits(),5, 10 ).getNick(),this.generateRandomPasswordRandom(person,this.getAlphabetWithDigits(), person.getMinPoinPassword(), person.getMaxPoinPassword() ).getPassword(),this.generateRandomNameRandom(person,this.getAlphabetWithDigits(),5, 10 ).getName()));
    }
        return collection;
    }

    /**
     * метод для для наполнения коллекции для Animal
     * @param p ссылка на объект
     * @param path - путь к файлу
     * @param n  коллечество добавленых объектов в калецию
     * @return  коллекцию
     */

    public  Collection addCollection(Collection collection,Animal animal,int n) {
        for (int i=0;i<n;i++) {
            collection.add(new Animal(this.generateRandomNickRandom(animal,this.getAlphabetWithDigits(),5, 10 ).getNick(),this.generateRandomNumber(animal.getMinPoinAge(),animal.getMaxPoinAge())));
        }
        return collection;
    }

    /**
     * метод для определения времени наполнения коллекции
     * @param p ссылка на объект
     * @param path - путь к файлу
     * @param n  коллечество добавленых объектов в калецию
     * @return  инофрмация по времени
     */

    public String getTimeAdd(Collection collection,Person person,int n) {
        long startTime1=System.currentTimeMillis();
        addCollection( collection, person, n);
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  addCollection. Заняла " + Long.toString(resultTime1) +" мс";

    }

    /**
     * метод для определения времени наполнения коллекции
     * @return  инофрмация по времени
     */

    public String getTimeAdd(Collection collection,Animal animal,int n) {
        long startTime1=System.currentTimeMillis();
        addCollection( collection, animal, n);
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  addCollection. Заняла " + Long.toString(resultTime1) +" мс";

    }

    /**
     * метод для итерации коллекции с помощью Iterator
     * @return  инофрмация по времени
     */

    public String iteratorIteratorTime(Collection collection) {
        long startTime1=System.currentTimeMillis();
        Iterator<Person> iter= collection.iterator();
        while(iter.hasNext()){
            System.out.println(this.toString(iter.next()));
        }
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  iteratorIteratorTime. Заняла" + Long.toString(resultTime1) +"мс";

    }

    /**
     * метод для замера времени  итерации коллекции с помощью Iterator
     * @return  инофрмация по времени
     */
    public String iteratorIteratorTime1(Collection collection) {
        long startTime1=System.currentTimeMillis();
        Iterator<Animal> iter= collection.iterator();
        while(iter.hasNext()){
            System.out.println(this.toString(iter.next()));
        }
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  iteratorIteratorTime. Заняла" + Long.toString(resultTime1) +"мс";

    }

    /**
     * метод для замера времени  итерации коллекции с помощью for
     * @return  инофрмация по времени
     */
    public String iteratorTimeFor(ArrayList collection) {
        long startTime1=System.currentTimeMillis();
        for (int i=0;i<collection.size();i++){
            System.out.println(this.toString((Person) collection.get(i)));
        }
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  iteratorTimeFor. Заняла" + Long.toString(resultTime1) +"мс";

    }

    /**
     * метод для замера времени по удалению коллекции с помощью Iterator
     * @return  инофрмация по времени
     */
    public String iteratorRemoveTime(Collection collection) {
        long startTime1=System.currentTimeMillis();
        Iterator<Person> iter= collection.iterator();
        while(iter.hasNext()){
           iter.next();
           iter.remove();
        }
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  iteratorRemoveTime. Заняла" + Long.toString(resultTime1) +"мс";

    }

    /**
     * метод для сортировки  Collections.sort
     * @return  инофрмация по времени
     */

    public String  sort1( List list, Comparator comparator) {
        long startTime1=System.currentTimeMillis();
        Collections.sort(list, comparator);
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  sort1. Заняла" + Long.toString(resultTime1) +"мс";

    }

    /**
     * метод для сортировки  по нескольким параметрам для Animal
     * @return  инофрмация по времени
     */
    public String  sort2 (Collection collection) {

        long startTime1=System.currentTimeMillis();
        TreeSet<Animal> animals = new TreeSet(new NickComparator1().thenComparing(new AgeComparator()));
        animals.addAll(collection);
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  sort2. Заняла" + Long.toString(resultTime1) +"мс";
    }

    /**
     * метод для сортировки  по нескольким параметрам для Person
     * @return  инофрмация по времени
     */

    public String  sort3(Collection collection) {

        long startTime1=System.currentTimeMillis();
        TreeSet<Person> people = new TreeSet((new NickComparator().thenComparing(new PasswordComparator())));
        people.addAll(collection);
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  sort3. Заняла" + Long.toString(resultTime1) +"мс";
    }


    }




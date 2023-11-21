package home_work_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Comparator;


public class DataGeneration  {

    /**
     *
     */

    private String[] AlphabetWithDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    private String[] AlphabetRus ={ "а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};

    private String[] NameRus={"Иван","Петр","Михаил","Олег","Геннадий","Александр","Павел","Сергей","Виктор","Игорь"};

    private String[] NickRus={"Геракл","Аид","Зевс","Аполлон","Дионис","Гермес","Песейдон","Арес","Гефест","Афина"};

    private String path;

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

    public int generateRandomNumber(int a, int b){

        int random_number= a + (int) (Math.random() * b);
        return  random_number;

    }

    public Person generateRandomName(Person person,String[] array) {
        int countOfName=generateRandomNumber(0,array.length);
        person.setName(array[countOfName]);

        return person;

    }

    public Animal generateRandomNick(Animal animal,String[] array) {
        int countOfName=generateRandomNumber(0,array.length);
        animal.setNick(array[countOfName]);

        return animal;

    }

    //
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

    public  Collection addCollection(Collection collection,Person person,int n) {
        for (int i=0;i<n;i++) {
        collection.add(new Person(this.generateRandomNickRandom(person,this.getAlphabetWithDigits(),5, 10 ).getNick(),this.generateRandomPasswordRandom(person,this.getAlphabetWithDigits(), person.getMinPoinPassword(), person.getMaxPoinPassword() ).getPassword(),this.generateRandomNameRandom(person,this.getAlphabetWithDigits(),5, 10 ).getName()));
    }
        return collection;
    }

    public  Collection addCollection(Collection collection,Animal animal,int n) {
        for (int i=0;i<n;i++) {
            collection.add(new Animal(this.generateRandomNickRandom(animal,this.getAlphabetWithDigits(),5, 10 ).getNick(),this.generateRandomNumber(animal.getMinPoinAge(),animal.getMaxPoinAge())));
        }
        return collection;
    }

    public String getTimeAdd(Collection collection,Person person,int n) {
        long startTime1=System.currentTimeMillis();
        addCollection( collection, person, n);
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  addCollection. Заняла " + Long.toString(resultTime1) +" мс";

    }

    public String getTimeAdd(Collection collection,Animal animal,int n) {
        long startTime1=System.currentTimeMillis();
        addCollection( collection, animal, n);
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  addCollection. Заняла " + Long.toString(resultTime1) +" мс";

    }

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

    public String iteratorTimeFor(ArrayList collection) {
        long startTime1=System.currentTimeMillis();
        for (int i=0;i<collection.size();i++){
            System.out.println(this.toString((Person) collection.get(i)));
        }
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  iteratorTimeFor. Заняла" + Long.toString(resultTime1) +"мс";

    }

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


    public String  sort1( List list, Comparator comparator) {
        long startTime1=System.currentTimeMillis();
        Collections.sort(list, comparator);
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  sort1. Заняла" + Long.toString(resultTime1) +"мс";

    }

    public String  sort2 (Collection collection) {

        long startTime1=System.currentTimeMillis();
        TreeSet<Animal> animals = new TreeSet(new NickComparator1().thenComparing(new AgeComparator()));
        animals.addAll(collection);
        long endTime1=System.currentTimeMillis();
        long resultTime1=endTime1-startTime1;

        return "Операция:  sort2. Заняла" + Long.toString(resultTime1) +"мс";
    }


    }




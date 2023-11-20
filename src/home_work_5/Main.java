package home_work_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p =new Person();
        Animal a =new Animal();


        DataGeneration dg= new DataGeneration();

        dg.setPath("untitled/src/home_work_5/name");
        dg.setPath1("untitled/src/home_work_5/nick");

        /**
         * Создание коллекции ArrayList
         */

        ArrayList<Person> arrayListEntity = new ArrayList<>();
        ArrayList<Animal> arrayListEntity1 = new ArrayList<>();

        /**
         * Создание коллекции LinkedList
         */
        LinkedList<Person> linkedListEntity = new LinkedList<>();
        LinkedList<Animal> linkedListEntity1 = new LinkedList<>();

        /**
         * Создание коллекции HashSet
         */
        HashSet<Person> hashSetEntity=new  HashSet<>();
        HashSet<Animal> hashSetEntity1=new  HashSet<>();



        /**
         * Наполнение коллекций с замером скорости
         * @param1 коллекция
         * @param2 ссылка на объект
         * @param3 колечество объектов в коллекции
         */
        System.out.println(  dg.getTimeAdd(arrayListEntity,p,100000));
        System.out.println(  dg.getTimeAdd(arrayListEntity1,a,100000));
        System.out.println(  dg.getTimeAdd(linkedListEntity,p,100000));
        System.out.println(  dg.getTimeAdd(linkedListEntity1,a,100000));
        System.out.println(  dg.getTimeAdd(hashSetEntity,p,100000));
        System.out.println(  dg.getTimeAdd(hashSetEntity1,a,100000));



        /**
         * Итерирование коллекций с замером скорости
         * @param1 коллекция
         */

        System.out.println( dg.iteratorIteratorTime1(arrayListEntity1));
        System.out.println( dg.iteratorIteratorTime(arrayListEntity));

        System.out.println( dg.iteratorIteratorTime1(linkedListEntity1));
        System.out.println( dg.iteratorIteratorTime(linkedListEntity));

        System.out.println( dg.iteratorIteratorTime1(hashSetEntity1));
        System.out.println( dg.iteratorIteratorTime(hashSetEntity));

        /**
         * Очищение коллекций с замером скорости
         * @param1 коллекция
         */

        System.out.println( dg.iteratorRemoveTime(arrayListEntity1));
        System.out.println( dg.iteratorRemoveTime(arrayListEntity));
        System.out.println( dg.iteratorRemoveTime(linkedListEntity1));
        System.out.println( dg.iteratorRemoveTime(linkedListEntity));
        System.out.println( dg.iteratorRemoveTime(hashSetEntity1));
        System.out.println( dg.iteratorRemoveTime(hashSetEntity));

        }

    }

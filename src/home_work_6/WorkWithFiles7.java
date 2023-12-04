package home_work_6;

import java.io.*;

public class WorkWithFiles7 {
    public static void main(String[] args) {
        startWorkWithFile();

    }

    public static void startWorkWithFile() {

        do {
            System.out.println("Введи дерикторию - untitled/src/home_work_6/Books/Books");

            String fileName1=read();

            File dir = new File(fileName1);
            // если объект представляет каталог
            if(dir.isDirectory())
            {
                // получаем все вложенные объекты в каталоге
                for(File item : dir.listFiles()){

                    if(item.isDirectory()){
                        //выводим каталоги

                        System.out.println(item.getName() + "  folder");
                    }
                    else{
                        //выводим файлы

                        System.out.println(item.getName() + "   file");
                    }
                }
            }
            System.out.println("Выбирите книгу для ввода");

            String fileName=read();

            //ввод слова
            System.out.println("Введи слово");
            String word3=read();


            try(FileWriter writer = new FileWriter("untitled/src/home_work_6/result.txt", true))
            {


                String text =  search(dir.getAbsolutePath()+"/"+fileName,word3);
                writer.write(text);
                writer.append('\n');
                writer.flush();
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }


        } while (1==1);

    }

    public static String search(String file, String word) {
        StringBuffer stringBuffer=null;
        try(BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            stringBuffer=new StringBuffer();
            int result=-1;
            while ((result=bufferedReader.read())!=-1) {
                stringBuffer.append(Character.toChars(result));
            }

        }
        catch (IOException ioException
        ) { ioException.printStackTrace(System.out);  }
        long count = 0;
        String text1=stringBuffer.toString();

        for (int i=text1.indexOf(word);i>=0;i=text1.indexOf(word,i+1)){

            count++;
        }
        String text2=word +" -" + file+ " -" +count ;
        return text2;
    }

    public static String read () {
        BufferedReader reader0 = new BufferedReader(new InputStreamReader(System.in));
        String fileName1="";
        try {

            fileName1 = reader0.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  fileName1;
    }

}

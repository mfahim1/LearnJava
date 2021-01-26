package datareader;

import java.io.BufferedReader;
import java.io.FileReader;

public class LearnDataReader {
    //Path means location - Types of Path:
    //Absolute Path: Full Path: C:\Users\Owner\IdeaProjects\LearnJava\DataTest\Sample.txt
    //Relative Path: Partial Path: DataTest/Sample.txt

    public static void main(String[] args) {
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        String filePath="DataTest/Sample.txt";

        try{
            fileReader=new FileReader(filePath); //created object, parameterized the filePath
            bufferedReader=new BufferedReader(fileReader);
            String data;
            while ( (data=bufferedReader.readLine())     !=null){
                System.out.println(data);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("File not found Exception");
        } finally {
            try{
                fileReader.close();
                bufferedReader.close();
            }catch(Exception e){
                System.out.println("File Already closed");
            }
        }
    }
}

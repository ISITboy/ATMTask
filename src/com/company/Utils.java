package com.company;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;

public class Utils {

    private static int getRandomNumber(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    private static String getRandomPersonalAccount(){
        String personalAccount="";
        for(int i=0 ;i < 20 ; i++){
            personalAccount += getRandomNumber(0,10);
        }
        return personalAccount;
    }

    public static void writeFileTextCardNumber(String number){
        try(FileWriter writer = new FileWriter("CardNumber.txt", false))
        {

            for(int i=0;i<number.length();i++){
                if((i!=0&&i%4==0)&&i%4==0) {
                    writer.append("-");
                }
                writer.append(number.charAt(i));
            }

            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


    public static String readFileTextPA(){
        String str="";
        try(FileReader reader = new FileReader("PersonalAccountNumber.txt"))
        {

            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                str +=(char)c;
            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return str;
    }
    public static String readFileTextCN(){
        String str="";
        try(FileReader reader = new FileReader("CardNumber.txt"))
        {

            int c;
            while((c=reader.read())!=-1){

                str +=(char)c;
            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return str;
    }


    public static void writeFileTextPersonalAccount(){
        try(FileWriter writer = new FileWriter("PersonalAccountNumber.txt", false))
        {
            String text = getRandomPersonalAccount();
            writer.write(text);
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }

}

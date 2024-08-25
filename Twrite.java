import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Scanner;

public class Twrite{

    public static void main(String[] args) {

        boolean donu = true;
        File fl = new File("file path");
        FileWriter fw = null;

        try{
            fw = new FileWriter(fl);
            donu = true;
        }catch(Exception e){
            e.printStackTrace();
        }

        Calendar ca;
        if(donu){

            Scanner scr = new Scanner(System.in);
            System.out.print("Enter seconds : ");
            int noofscd = scr.nextInt();
            scr.close();

            if(noofscd >0 && noofscd < 60){

                try{

                    for(int i=1; i<=noofscd; i++){
                        ca = Calendar.getInstance();
                        String ttext = ca.get(Calendar.HOUR_OF_DAY)+":"+ca.get(Calendar.MINUTE)+":"+ca.get(Calendar.SECOND);
                        System.out.println(ttext);
                        fw.write(ttext+"\n");
                        Thread.sleep(1000);
                    }

                    fw.close();

                }catch(Exception e){
                    e.printStackTrace();
                }
            }else{
                System.out.println("INVALID INPUT");
            }
        }

    }

}
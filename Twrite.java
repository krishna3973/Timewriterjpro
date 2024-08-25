import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;

public class Twrite{

    public static void main(String[] args) {

        boolean donu = false;
        File fl = new File("file path");
        FileWriter fw = null;

        try{
            fw = new FileWriter(fl, true);
            donu = true;
        }catch(Exception e){
            e.printStackTrace();
        }

        Calendar ca;
        if(donu){

            try{

                for(int i=1; i<=10; i++){
                    ca = Calendar.getInstance();
                    System.out.println(ca.get(Calendar.HOUR_OF_DAY)+":"+ca.get(Calendar.MINUTE)+":"+ca.get(Calendar.SECOND));
                    fw.write((ca.get(Calendar.HOUR_OF_DAY)+":"+ca.get(Calendar.MINUTE)+":"+ca.get(Calendar.SECOND))+"\n");
                    Thread.sleep(1000);
                }

                fw.close();

            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }

}
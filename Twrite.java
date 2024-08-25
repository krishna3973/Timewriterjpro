import java.util.Calendar;

public class Twrite{

    public static void main(String[] args) {

        Calendar ca;
        
        for(int i=1; i<=10; i++){

            ca = Calendar.getInstance();
            System.out.println(ca.get(Calendar.HOUR_OF_DAY)+":"+ca.get(Calendar.MINUTE)+":"+ca.get(Calendar.SECOND));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
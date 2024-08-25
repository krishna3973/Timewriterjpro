public class Twrite{

    public static void main(String[] args) {
        
        for(int i=1; i<=10; i++){
            System.out.println(i);
            try {
                Thread.sleep(i*100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
import java.util.Calendar;

public class check {
    public static void main(String[] args) {
        check object=new check();
        object.waitMethod();
    }

    private synchronized void waitMethod(){
        while(true){
            System.out.println("always running program ==> "+ Calendar.getInstance().getTime());
            try{
                this.wait(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

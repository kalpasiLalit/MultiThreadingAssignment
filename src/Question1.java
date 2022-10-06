class Thread1 extends  Thread{
    @Override
    public void run(){
        System.out.println(currentThread().getName() + " started");
       for(int i= 1;i < 5;i++) {
           System.out.print(i + " ");
       }
        System.out.println("");

    }
}
class  Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");
    }
}

public class Question1 {
    public static void main(String[] args) throws InterruptedException {
         Thread1 t1 = new Thread1();
         Thread1 t2 = new Thread1();
         t1.start();
         t1.join();

         Thread.sleep(1000);
         t2.start();
         // thread 2 created by implementing Runnable interface
         Thread2 obj = new Thread2();
         Thread  t3 = new Thread(obj);
         t3.start();

    }
}

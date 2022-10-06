class PrintTable{
    public void printTable(int n){
        synchronized(this){
            System.out.println("Table of " + n);
            for(int i=1;i<=5;i++){
               System.out.println(n*i);
//                try{
//                    Thread.sleep(500);
//                }catch(Exception e){
//                    System.out.println(e);
//                }
            }
        }
    }
}

class MyThread1 extends Thread{
    PrintTable pt;
    MyThread1(PrintTable pt){
        this.pt=pt;
    }
    public void run(){
        pt.printTable(2);
    }
}


public class MultiThreadingExample {
    public static void main(String args[]){
        //creating PrintTable object.
        PrintTable obj = new PrintTable();

        //creating threads.
        MyThread1 t1=new MyThread1(obj);
        MyThread1 t3=new MyThread1(obj);


        //start threads.
        t1.start();
        t3.start();

    }
}

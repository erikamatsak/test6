package client;

public class Class2 implements Runnable {
    public Class2() {
        super();
    }

    @Override
    public void run() {
        // TODO Implement this method
        
        
        while(true){
        //###################
          Class1.y5=Class1.y5+10;  
             
             if(Class1.y5>=480){
                 Class1.y5=0;
             }
            try{
          Thread.currentThread().sleep(50);
            }
            catch(InterruptedException e){
                System.out.println("Katkestas Thread 2");
            }
            
        //######################  
        }
    }
}

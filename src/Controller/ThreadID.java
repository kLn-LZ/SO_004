package Controller;

public class ThreadID extends Thread{

    private int idThread;
    public ThreadID(int idThread){

        this.idThread = idThread;

    }
    public ThreadID(){
        super();
    }

    @Override
    public void run(){

        System.out.println("TID #" + getId());


    }


}

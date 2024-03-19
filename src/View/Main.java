package View;

import Controller.ThreadID;

public class Main {
    public static void main(String[] args) {




        for(int idThread = 0; idThread < 5; idThread ++){
            //ThreadID threadID = new ThreadID(idThread);
            Thread threadID = new ThreadID();
            threadID.start();


        }

    }
}

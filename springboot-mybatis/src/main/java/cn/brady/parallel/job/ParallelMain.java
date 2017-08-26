package cn.brady.parallel.job;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelMain {

    private List<String> filePath;


    public static void main(String[] args){

        ExecutorService exec = Executors.newFixedThreadPool(10);

        ScriptJob sj = null;

        List<String> listSJ = new ArrayList<>();

        int i = 0;
        while(i < 10){
            listSJ.add("i: " + i);

            sj = new ScriptJob();
            sj.setInfo(listSJ.get(i));
            exec.execute(sj);
            i++;
        }



        exec.shutdown();
        System.out.println(" The end ");











    }

}

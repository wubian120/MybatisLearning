package cn.brady.parallel.job;

public class ScriptJob implements Runnable{

    private String info;

    @Override
    public void run() {

        doScript(info);

    }



    public void doScript(String fileName){
        System.out.println(fileName);
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

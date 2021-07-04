package li.jesse.jdbasics.call;

public class Teacher implements Callback {

//    @Override
    public void taskResult(String name) {
        System.out.println("任务:" + name + "完成");
    }
}

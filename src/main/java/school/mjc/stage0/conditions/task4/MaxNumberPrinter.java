package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max;
        if(first>=second){
            if (first>=third){
                max=first;
            }else {
                max=third;
            }
        } else if (second>third) {
            max=second;
        }else {
            max=third;
        }
        System.out.println(max);
    }
}

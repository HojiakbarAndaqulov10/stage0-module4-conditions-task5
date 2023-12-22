package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        switch (number){
            case 1:
                System.out.println("number is between 1 and 5");
                break;
            case 10:
                System.out.println("number is between 6 and 10");
                break;
            case 0:
                System.out.println("out of range");
        }
    }
}

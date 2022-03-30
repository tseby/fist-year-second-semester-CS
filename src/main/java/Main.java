import java.util.Scanner;

public class Main {
    //private static bubbleSort bubble = new bubbleSort();
    //private static selectSort select = new selectSort();
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Choose sorting method" +
                "1)Bubble sorting;" +
                "2)Select sort.");
        int choice = scanner.nextInt();
        switch(choice){
            case 1 -> //select.selectSort();
            case 2 -> //bubble.bubbleSort();
        }

    }
}

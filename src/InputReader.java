import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {

    public int W;
    public int H;
    public int D;
    public int M;
    public ArrayList<Developer> emp;
    public ArrayList<Manager> man;

    private Scanner scanner = new Scanner(System.in);

    InputReader() { }

    void readInput() {
        // Width and height of grid
        W = scanner.nextInt();
        H = scanner.nextInt();

        // Read grid
        for (int h = 0; h < H; h++) {
            String input = scanner.next();
            for (int w = 0; w < W; w++) {
                
            }
        }
        
        // Amount of developers
        D = scanner.nextInt();

        for (int d = 0; d < D; d++) {
            String c = scanner.next();
            int b = scanner.nextInt();
            int S = scanner.nextInt();
            String[] skills = new String[S];
            for (int s = 0; s < S; s++) {
                skills[s] = scanner.next();
            }
            emp.add(new Developer(c, b, skills));
        }
        
        // Amount of managers
        M = scanner.nextInt();

        for (int m = 0; m < M; m++) {
            String c = scanner.next();
            int b = scanner.nextInt();
            man.add(new Manager(c, b));
        }
        
    }
}

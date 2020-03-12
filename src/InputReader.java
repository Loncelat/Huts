import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class InputReader {

    public int W;
    public int H;
    public int D;
    public int M;
    public ArrayList<Developer> emp;
    public ArrayList<Manager> man;

    HashMap<String, ArrayList<Developer>> emplo = new HashMap<>();
    HashMap<String, ArrayList<Manager>> managers = new HashMap<>();

    private Scanner scanner = new Scanner(System.in);

    InputReader() { }

    void readInput() {
        // Width and height of grid
        W = scanner.nextInt();
        H = scanner.nextInt();

        Grid grid = Grid.setGrid(W, H);

        // Read grid
        for (int h = 0; h < H; h++) {
            String input = scanner.next();
            for (int w = 0; w < W; w++) {
                char temp = input.charAt(w);
                switch (temp) {
                    case '#': break;
                    case '_': grid.addCell(w, h, false);
                    case 'M': grid.addCell(w, h, true);;
                }
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
            Developer dev = new Developer(c, b, skills);
            emp.add(dev);

            if (emplo.containsKey(c)) {
                emplo.get(c).add(dev);
            } else {
                emplo.put(c, new ArrayList<>());
                emplo.get(c).add(dev);
            }

        }

        for (ArrayList<Developer> e: emplo.values()) {
            Collections.sort(e);
        }
        
        // Amount of managers
        M = scanner.nextInt();

        for (int m = 0; m < M; m++) {
            String c = scanner.next();
            int b = scanner.nextInt();
            Manager mangr = new Manager(c, b);
            man.add(mangr);

            if (managers.containsKey(c)) {
                managers.get(c).add(mangr);
            } else {
                managers.put(c, new ArrayList<>());
                managers.get(c).add(mangr);
            }
        }

        for (ArrayList<Manager> e: managers.values()) {
            Collections.sort(e);
        }
        
    }
}

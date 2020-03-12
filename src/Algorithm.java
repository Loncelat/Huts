import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Algorithm {

    final int[][] off = { {1,0}, {0, 1}, {-1, 0}, {0, -1} };

    public void run(InputReader inp) {

        Grid grid = Grid.getGrid();

        ArrayList<Manager> managers = (ArrayList<Manager>) inp.man.clone();
        HashMap<String, Integer> taken = new HashMap<>();

        Collections.sort(managers);
        int manidx = 0;

        boolean broken = false;

        for (int x = 0; x < grid.W; x++) {
            for (int y = 0; y < grid.H; y++) {

                Cell cur = grid.grid[x][y];

                if (cur == null) { continue; }

                if (cur.isManager) {

                    if (manidx >= managers.size()) { broken = true; break; }

                    Manager largeman = managers.get(manidx++);
                    largeman.x = x;
                    largeman.y = y;
                    cur.man = largeman;

                    for (int[] delta: off) {

                        if (x+delta[0] >= 0 && x+delta[0] <grid.W && y+delta[1] >= 0 && y+delta[1] < grid.H) {

                            if ((grid.grid[x+delta[0]][y+delta[1]] == null) || (grid.grid[x+delta[0]][y+delta[1]].isManager)) {continue; }
                            if (grid.grid[x+delta[0]][y+delta[1]].dev != null) { continue; }

                            if (inp.emplo.containsKey(largeman.company)) {

                                int eidx = 0;
                                if (taken.containsKey(largeman.company)) {
                                    eidx = taken.get(largeman.company);
                                }

                                if (eidx >= inp.emplo.get(largeman.company).size()) {
                                    continue;
                                }

                                taken.put(largeman.company, eidx + 1);

                                Developer adder = inp.emplo.get(largeman.company).get(eidx);

                                grid.grid[x+delta[0]][y+delta[1]].dev = adder;

                                adder.x = x+delta[0];
                                adder.y = y+delta[1];

                            }

                        }

                    }

                }

            }
            if (broken) { break; }
        }

        int eidx = 0;

        for (int x = 0; x < grid.W; x++) {
            for (int y = 0; y < grid.H; y++) {

                if (grid.grid[x][y] == null || grid.grid[x][y].isManager || grid.grid[x][y].dev != null) { continue; }

                for (; eidx < inp.emp.size(); eidx++) {
                    Developer cur = inp.emp.get(eidx);
                    if (cur.x != -1) { continue; }
                    cur.x = x;
                    cur.y = y;
                    break;
                }

            }
        }

    }

}

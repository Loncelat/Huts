public class Grid {

    public int W;
    public int H;
    public Cell[][] grid;

    private static Grid actualGrid;

    private Grid(int W, int H) {
        this.W = W;
        this.H = H;
        grid = new Cell[W][H];
    }

    static Grid getGrid() {
        return actualGrid;
    }

    static void setGrid(int W, int H) {
        if (actualGrid == null) {
            actualGrid = new Grid(W, H);
        }
    }

    void addCell() {

    }

}


class Cell {
    public boolean isManager;
    public Manager man;
    public Developer dev;

    Cell(boolean isManager) {
        this.isManager = isManager;
    }
}

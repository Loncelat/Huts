public class Main {

    public static void main(String[] args) {
        InputReader input = new InputReader();
        input.readInput();

        Algorithm alg = new Algorithm();
        alg.run(input);

        for (int i = 0; i < input.emp.size(); i++) {

            Developer cur = input.emp.get(i);
            if (cur.x == -1) { System.out.println("X"); }
            else { System.out.println(cur.x + " " + cur.y); }

        }

         for (int i = 0; i < input.man.size(); i++) {

             Manager cur = input.man.get(i);
             if (cur.x == -1) { System.out.println("X"); }
             else { System.out.println(cur.x + " " + cur.y); }
         }

        // Params params = input.getParams();
        // Solver solver = new Solver();
        // Solution solution =  solver.getSolution();
    }

}
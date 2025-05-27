public class BlindMaze {
    private int currentRow;
    private int currentCol;
    private String wall = "XXX";
    private String emptySpace = "   ";
    private String wheel = " 7 ";
    private String start = " 0 ";
    private String end = " W ";
    //private String eye = "";

    private String[][] maze = 
    {
        {"XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX"},
        {"XXX","   ","   ","   ","XXX","   ","   ","   ","   ","   ","   ","XXX","   ","   ","XXX"},
        {"XXX","   ","XXX","   ","XXX","   ","XXX","XXX","   ","XXX","XXX","XXX","   ","XXX","XXX"},
        {"XXX","XXX","XXX","   ","   ","   ","   ","XXX","   ","   ","   ","XXX","   ","   ","XXX"},
        {"XXX","   ","XXX","   ","XXX","XXX","   ","XXX","XXX","   ","   ","   ","   ","   ","XXX"},
        {"XXX","   ","   ","   ","XXX","   ","   ","   ","   ","   ","XXX","   ","XXX","   ","XXX"},
        {"XXX","   ","XXX","XXX","XXX","XXX","XXX","XXX","   ","XXX","XXX","   ","XXX","XXX","XXX"},
        {"XXX","   ","XXX","   ","   ","XXX","   ","   ","   ","XXX","   ","   ","XXX","   ","XXX"},
        {"XXX","   ","   ","   ","   ","XXX","XXX","   ","   ","   ","   ","   ","XXX","   ","XXX"},
        {"XXX","   ","   ","XXX","   ","XXX","   ","   ","XXX","   ","XXX","   ","   ","   ","XXX"},
        {"XXX","   ","XXX","XXX","   ","   ","   ","   ","XXX","XXX","XXX","XXX","   ","XXX","XXX"},
        {"XXX","   ","   ","XXX","   ","XXX","XXX","   ","XXX","   ","XXX","   ","   ","   ","XXX"},
        {"XXX","XXX","   ","XXX","   ","   ","XXX","   ","XXX","   ","   ","   ","XXX","XXX","XXX"},
        {"XXX","   ","   ","XXX","XXX","^v^","XXX","   ","XXX","   ","XXX","   ","   ","   ","XXX"},
        {"XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX","XXX"}
    };

    public BlindMaze(int r, int c) {
        maze[r][c] = "0-0";
        currentRow = r;
        currentCol = c;
    }

    public void getMaze() {
        for(int r=0; r<maze.length; r++) {
            for(int c=0; c<maze[r].length; c++) {
                System.out.print(maze[r][c]);
            }
            System.out.println();
        }
    }

    public boolean rightAvail() {
        return maze[currentRow][currentCol+1] == "   ";
    }

    public boolean leftAvail() {
        return maze[currentRow][currentCol-1] == "   ";
    }

    public boolean upAvail() {
        return maze[currentRow-1][currentCol] == "   ";
    }

    public boolean downAvail() {
        return maze[currentRow+1][currentCol] == "   ";
    }

    public void move(String input) {
        if(input.equals("right")) {
            if(rightAvail()) {
                maze[currentRow][currentCol] = "   ";
                maze[currentRow][currentCol+1] = "0-0";
            }
        }
    }
}
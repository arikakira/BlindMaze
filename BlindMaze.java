public class BlindMaze {
    private int currentRow;
    private int currentCol;
    private String wall = "XXX";
    private String emptySpace = "   ";
    private String wheel = " 7 ";
    private String start = " 0 ";
    private String end = " W ";
    private int endRow = 13;
    private int endCol = 5;
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
        return maze[currentRow][currentCol+1] == "   " || maze[currentRow][currentCol+1] == "^v^";
    }

    public boolean leftAvail() {
        return maze[currentRow][currentCol-1] == "   " || maze[currentRow][currentCol-1] == "^v^";
    }

    public boolean upAvail() {
        return maze[currentRow-1][currentCol] == "   " || maze[currentRow-1][currentCol] == "^v^";
    }

    public boolean downAvail() {
        return maze[currentRow+1][currentCol] == "   " || maze[currentRow+1][currentCol] == "^v^";
    }

    public boolean reachEnd() {
        return (currentRow==endRow && currentCol == endCol);
    }

    public boolean move(String input) {
        if(input.equals("right")) {
            if(rightAvail()) {
                maze[currentRow][currentCol] = "   ";
                maze[currentRow][currentCol+1] = "0-0";
                currentCol = currentCol + 1;
                return true;
            } else {
                System.out.println("You can't move in that direction!");
                return false;
            }
        }
        if(input.equals("left")) {
            if(leftAvail()) {
                maze[currentRow][currentCol] = "   ";
                maze[currentRow][currentCol-1] = "0-0";
                currentCol = currentCol - 1;
                return true;
            } else {
                System.out.println("You can't move in that direction!");
                return false;
            }
        }
        if(input.equals("up")) {
            if(upAvail()) {
                maze[currentRow][currentCol] = "   ";
                maze[currentRow-1][currentCol] = "0-0";
                currentRow = currentRow - 1;
                return true;
            } else {
                System.out.println("You can't move in that direction!");
                return false;
            }
        }
        if(input.equals("down")) {
            if(downAvail()) {
                maze[currentRow][currentCol] = "   ";
                maze[currentRow+1][currentCol] = "0-0";
                currentRow = currentRow + 1;
                return true;
            } else {
                System.out.println("You can't move in that direction!");
                return false;
            }
        }
        return false;
    }
}
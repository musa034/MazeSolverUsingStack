package com.musaahotoro;

public class MazeSolver {
    final private int[][] maze;
    final private boolean[][] visited;
    final private Stack myStack;
    final private Coordinate START;
    final private Coordinate EXIT;

    private static final int[][] directions = {
            {-1, 0},
            {0, 1},
            {1, 0},
            {0, -1}
    };

    MazeSolver(int[][] maze, int size) {
        this.maze = maze;
        this.visited = new boolean[size][size];
        this.myStack = new Stack(size*size);
        this.START = new Coordinate(0, 1);
        this.EXIT = new Coordinate(14, 13);
    }

    public boolean solve() {
        myStack.push(START);
        visited[START.getRows()][START.getColumns()] = true;

        while(!myStack.isEmpty() ) {
            Coordinate curPosition = myStack.top();
            boolean moved = false;

            if(curPosition.equals(EXIT)) {
                return true;
            }

            for(int[] d : directions) {

                int newRow = curPosition.getRows() + d[0];
                int newCol = curPosition.getColumns() + d[1];

                if(isValidMove(newRow, newCol)) {
                    Coordinate nextPosition = new Coordinate(newRow, newCol);
                    myStack.push(nextPosition);
                    visited[newRow][newCol] = true;
                    moved = true;
                    break;
                }
            }

            if(!moved ){
                System.out.println("Dead end, backtracking from: " + curPosition);
                myStack.pop();
            }
        }
        return false;
    }

    private boolean isValidMove(int newRow, int newCol) {
        return ((newRow >= 0 && newRow < maze.length) &&
                (newCol >= 0 && newCol < maze[0].length) &&
                (!visited[newRow][newCol]) &&
                (maze[newRow][newCol] == 0));
    }

    public void printPath() {
        System.out.println("Path from START to EXIT: ");
        for (int i = 0; i <= myStack.getTopIndex(); i++) {
            System.out.println(myStack.getElementAt(i));
        }
    }
}



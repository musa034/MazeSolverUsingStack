package com.musaahotoro;

public class Main {
    public static void main(String[] args) {
        int size = 15;

        MazeReader reader = new MazeReader("maze.txt");
        int[][] maze = reader.getMaze();

        MazeSolver solver = new MazeSolver(maze, size);
        solver.solve();
    }
}
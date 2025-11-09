package com.musaahotoro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazeReader {
    private int[][] maze;

    MazeReader(String filepath) {
        readFile(filepath);
    }

    private void readFile(String filepath) {
        File file = new File(filepath);
        int size = 15;
        maze = new int[size][size];

        try(Scanner scanner = new Scanner(file)) {
            for(int i = 0; i < size; i++) {
                String line = scanner.nextLine();
                for(int j = 0; j < size; j++) {
                    maze[i][j] = Character.getNumericValue(line.charAt(j));
                }
            }
        }catch(FileNotFoundException e) {
            System.out.println("File " + filepath + " not found");
        }
    }

    public int[][] getMaze() {
        return maze;
    }
}

package com.musaahotoro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        String filepath = "maze.txt";
        File file = new File(filepath);
        int size = 15;
        int[][] maze = new int[size][size];

        try(Scanner reader = new Scanner(file)) {
            for(int i = 0; i < size; i++) {
                String line = reader.nextLine();
                for(int j = 0; j < size; j++) {
                    maze[i][j] = Character.getNumericValue(line.charAt(j));
                    System.out.print(maze[i][j]);
                }
                System.out.println();
            }
        }catch(FileNotFoundException e) {
                System.out.println("File" + filepath + " not found");
        }
    }
}
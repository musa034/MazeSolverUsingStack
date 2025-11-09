package com.musaahotoro;

public class Coordinate {
    private int rows;
    private int columns;

    Coordinate(int rows, int columns) {
        if(rows >= 0 && columns >= 0) {
            this.rows = rows;
            this.columns = columns;
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    @Override
    public String toString() {
        return "(" + rows + ", " + columns + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || (this.getClass() != obj.getClass())) {
            return false;
        }

        Coordinate other = (Coordinate) obj;
        return this.rows == other.rows && this.columns == other.columns;
    }


}

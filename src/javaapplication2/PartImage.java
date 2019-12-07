package javaapplication2;

import javafx.geometry.Point2D;

public class PartImage {
    private boolean[][]     pixels;
    private boolean[][]     visited;
    private int             rows;
    private int             cols;
    
    public PartImage(int r, int c) {
        rows = r;
        cols = c;
        visited = new boolean[r][c];
        pixels = new boolean[r][c];
    }
    
    public PartImage(int rw, int cl, byte[][] data) {
        this(rw,cl);
        for (int r=0; r<10; r++) {
            for (int c=0; c<10; c++) {
                if (data[r][c] == 1)
                    pixels[r][c] = true;
                else
                    pixels[r][c]= false;
            }
        }
    }
    
    public int getRows() { return rows; }
    public int getCols() { return cols; }
    public boolean getPixel(int r, int c) { return pixels[r][c];}
    public void setPixel(int r, int c, boolean val){pixels[r][c]=val; }
    
    
    // You will re-write the 5 methods below
    public void print() {
    
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getCols(); j++) {
                if(pixels[i][j]==true)
                    System.out.print("* ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }
    
    }
    public Point2D findStart() {
        Point2D point2D;
        
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getCols(); j++) {
                if(pixels[i][j]==true){
                    point2D = new Point2D(i, j);
                    //System.out.println("Point2D [x = "+point2D.getX()+", y = "+point2D.getY()+"]");
                    return point2D;
                }
            }
            
        }
        return null;
    }
    public int partSize() { 
        
        int count=0;
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getCols(); j++) {
                if(pixels[i][j]==true)
                    count++;
            }
        }
    return count;
    }
    
    private void expandFrom(int currentRow, int currentColumn) {
        if (getPixel(currentRow, currentColumn) == false) {
            return;
        }

        else {
            setPixel(currentRow, currentColumn, false);

            

            if (currentColumn + 1 < cols) {
                expandFrom(currentRow, currentColumn + 1);
            }

            if (currentRow - 1 >= 0) {
                expandFrom(currentRow - 1, currentColumn);
            }
            
            if (currentColumn - 1 >= 0) {
                expandFrom(currentRow, currentColumn - 1);
            }

            if (currentRow + 1 < rows) {
                expandFrom(currentRow + 1, currentColumn);
            }
        }
    }

    private int perimeterOf(int currentRow, int currentColumn) {
        int side = 0;

        if (visited[currentRow][currentColumn] == true || getPixel(currentRow, currentColumn) == false) {
            return 0;
        }

        if (getPixel(currentRow, currentColumn) == true) {
            if (currentColumn-1 < 0 || !getPixel(currentRow, currentColumn-1)) {
                side++;
            }
            if (currentColumn+1 >= cols || !getPixel(currentRow, currentColumn+1)) {
                side++;
            }
            if (currentRow-1 < 0 || !getPixel(currentRow-1, currentColumn)) {
                side++;
            }
            if (currentRow+1 >= rows || !getPixel(currentRow+1, currentColumn)) {
                side++;
            }
            
        }

        visited[currentRow][currentColumn] = true;

        if (currentColumn + 1 < cols) {
            side = side + perimeterOf(currentRow, currentColumn + 1);
        }

        if (currentRow - 1 >= 0) {
            side = side + perimeterOf(currentRow - 1, currentColumn);
        }
        if (currentColumn - 1 >= 0) {
            side = side + perimeterOf(currentRow, currentColumn - 1);
        }

        if (currentRow + 1 < rows) {
            side = side + perimeterOf(currentRow + 1, currentColumn);
        }

        

        return side;
    }
    
    public boolean isBroken(){
        Point2D p = findStart();
        expandFrom((int)p.getX(), (int)p.getY());
        return (partSize() != 0);
    }
    
    public int perimeter() {
        Point2D p = findStart();
        return perimeterOf((int)p.getX(), (int)p.getY());
    }
    
    public static PartImage exampleA() {
        byte[][] pix = {{0,0,0,0,0,0,0,0,0,0},
            {0,1,1,1,1,1,1,0,0,0},
            {0,1,1,1,1,1,1,0,0,0},
            {0,1,1,1,1,1,1,1,1,0},
            {0,0,0,1,1,1,1,1,1,0},
            {0,1,1,1,1,1,1,1,1,0},
            {0,1,1,1,1,1,1,1,1,0},
            {0,1,1,1,1,1,1,0,0,0},
            {0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,0,0,0}};
        return new PartImage(10,10, pix);
    }
    public static PartImage exampleB() {
        byte[][] pix = {{1,0,1,0,1,0,1,0,0,0},
            {1,0,1,0,1,0,1,1,1,1},
            {1,0,1,0,1,0,1,0,0,0},
            {1,0,1,0,1,0,1,1,1,1},
            {1,0,1,0,1,0,1,0,0,0},
            {1,0,1,0,1,0,1,1,1,1},
            {1,1,1,1,1,1,1,0,0,0},
            {0,1,0,1,0,0,1,1,1,1},
            {0,1,0,1,0,0,1,0,0,0},
            {0,1,0,1,0,0,1,0,0,0}};
        return new PartImage(10,10, pix);
    }
    public static PartImage exampleC() {
        byte[][] pix = {{1,1,1,0,0,0,1,0,0,0},
            {1,1,1,1,0,0,1,1,1,0},
            {1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,0,0,1,0,0,0},
            {0,0,1,0,0,0,0,0,0,0},
            {1,0,0,0,1,1,0,1,1,1},
            {1,1,0,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {0,0,1,1,0,1,1,1,1,1},
            {0,0,1,0,0,0,1,1,0,0}};
        return new PartImage(10,10, pix);
    }
    public static PartImage exampleD() {
        byte[][] pix = {{1,0,1,0,1,0,1,1,0,0},
            {1,0,1,0,0,0,1,0,0,0},
            {0,0,0,0,0,0,0,0,1,1},
            {1,0,1,1,1,1,1,1,1,0},
            {1,0,0,1,0,0,1,0,0,0},
            {1,1,0,0,0,1,1,0,0,1},
            {0,1,0,0,0,0,0,0,1,1},
            {0,1,0,1,0,0,0,0,0,0},
            {0,0,0,1,1,1,0,0,0,0},
            {0,0,0,0,0,1,1,0,0,0}};
        return new PartImage(10,10, pix);
    }
}

package com.beukot.easy;

import java.util.ArrayList;

/**
 * Flood Fill
 * https://leetcode.com/problems/flood-fill/description/
 * #733
 */
public class FloodFill {
    /**
     * Initialize new Flood Fill problem solver
     */
    public FloodFill() {
    }

    /**
     * You are given an image represented by an m x n grid of integers image, where
     * image[i][j] represents the pixel value of the image. You are also given three
     * integers sr, sc, and color. Your task is to perform a flood fill on the image
     * starting from the pixel image[sr][sc].
     * 
     * To perform a flood fill:
     * 
     * Begin with the starting pixel and change its color to color.
     * Perform the same process for each pixel that is directly adjacent (pixels
     * that share a side with the original pixel, either horizontally or vertically)
     * and shares the same color as the starting pixel.
     * Keep repeating this process by checking neighboring pixels of the updated
     * pixels and modifying their color if it matches the original color of the
     * starting pixel.
     * The process stops when there are no more adjacent pixels of the original
     * color to update.
     * 
     * Return the modified image after performing the flood fill.
     * 
     * @param image
     *            - m x n grid of integers images
     * 
     * @param sr
     *            - starting row coordinate
     * 
     * @param sc
     *            - starting pixel coordinate
     * 
     * @param color
     *            - color to flood fill with
     * 
     * @return the modified image after performing the flood fill
     * 
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image == null || image.length == 0)
            return image;
        int rows = image.length;
        int cols = image[0].length;

        int scolor = image[sr][sc];
        int[][] visited = new int[rows][cols];
        for (int y = 0; y < rows; y++)
            for (int x = 0; x < cols; x++)
                visited[y][x] = 0;

        class Tuple {
            public int row;
            public int col;

            public Tuple(int row, int col) {
                this.row = row;
                this.col = col;
            }
        }

        ArrayList<Tuple> process = new ArrayList<Tuple>();

        process.add(new Tuple(sr, sc));
        visited[sr][sc] = 1;

        Tuple p;
        while (!process.isEmpty()) {
            p = process.remove(0);
            image[p.row][p.col] = color;

            if (p.col > 0 && visited[p.row][p.col - 1] == 0 && image[p.row][p.col - 1] == scolor) {
                process.add(new Tuple(p.row, p.col - 1));
                visited[p.row][p.col - 1] = 1;
            }
            if (p.col < cols - 1 && visited[p.row][p.col + 1] == 0 && image[p.row][p.col + 1] == scolor) {
                process.add(new Tuple(p.row, p.col + 1));
                visited[p.row][p.col + 1] = 1;
            }
            if (p.row > 0 && visited[p.row - 1][p.col] == 0 && image[p.row - 1][p.col] == scolor) {
                process.add(new Tuple(p.row - 1, p.col));
                visited[p.row - 1][p.col] = 1;
            }
            if (p.row < rows - 1 && visited[p.row + 1][p.col] == 0 && image[p.row + 1][p.col] == scolor) {
                process.add(new Tuple(p.row + 1, p.col));
                visited[p.row + 1][p.col] = 1;
            }
        }
        return image;
    }
}

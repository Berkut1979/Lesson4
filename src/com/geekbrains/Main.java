package com.geekbrains;

import java.util.Arrays;

public class TiTacToe {

    private static final int SIZE = 3;
    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static final char DOT_EMPTY = '.';
    private static final char [][] MAP = new char[SIZE][SIZE];

    public static void main(String[] args) {
        initMap();
        printMap();
    }

    private static void humanTurn()
    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(MAP[i], DOT_EMPTY);
        }
    }

    private static void printMap() {
        printHeader();
        printBody();
    }
    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    private static void printBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
package com.example.demo.algorithim.service;

/**
 * packageName: com.example.demo.algorithim.service
 * fileName   : DfsService
 * author     : MinHye_Sim
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08   MinHye_Sim   최초 생성
 */
public interface DfsService {
    int targetNumber(int[] numbers, int target);
    int network(int n, int[][] computers);
    int wordChange(String begin, String target, String[] words);
    String[] trip(String[][] tickets);





    }

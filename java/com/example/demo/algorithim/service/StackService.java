package com.example.demo.algorithim.service;

/**
 * packageName: com.example.demo.algorithim.service
 * fileName   : StackService
 * author     : MinHye_Sim
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08   MinHye_Sim   최초 생성
 */
public interface StackService {
    int[] develop(int[] progresses, int[] speeds);
    int printer(int[] priorities, int location);
    int truck(int bridge_length, int weight, int[] truck_weights);
    int[] stock(int[] prices);




}

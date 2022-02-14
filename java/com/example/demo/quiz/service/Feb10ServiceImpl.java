package com.example.demo.quiz.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb10ServiceImpl
 * author     : MinHye_Sim
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11   MinHye_Sim   최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service{
    @Override
    public void sort3() {

    }

    @Override
    public void sort2() {

    }

    @Override
    public void square() {

    }

    @Override
    public void zigzag() {

        /**
         * author : 심민혜
         * desc : 지그재그
         * 목표 : 랜덤 값을 n*n구조의 2차원 배열로 지그재그(ㄹ자)형태로 출력하기
         *
         * (출처 : http://ontheinfo.com/2241)
         * */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] number = new int[a][a];
        int count = 1;
        //숫자 1부터 출력할 수 있도록 한다.
        int i;
        int j;

        for(i=0; i < a; i++){
            //행의 값에 따라 진행한다.

            if ((i%2)==0){
                //i를 2로 나눠 나머지가 0일 경우(짝수), 숫자가 입력되는 방향을 결정한다.

                for(j =0; j < a; j++){
                    // j의 값이 1씩 증가하면서 왼쪽에서 오른쪽 방향(--->)으로 count 숫자가 정방향으로 입력된다.
                    // 예로 3을 입력받으면 [0][0],[0][1],[0][2] 순서로 숫자가 입력된다.
                    number[i][j] = count;
                    //해당 배열방에 count 숫자를 저장한다.
                    count++;
                    //count 값을 증가시키면서 차례대로 방에 넣는다.
                }
            }else{
                // i를 2로 나눈 나머지가 0일 아닐경우(홀수)의 숫자가 입력되는 방향을 결정한다.

                for(j =a-1; j>=0; j--){
                    // [1][2],[1][1],[1][0]순서로 오른쪽에서 왼쪽 방향(<---)으로 count 숫자가 역방향으로 입력된다.

                    number[i][j]=count;
                    count++;
                    // count 값을 증가시키면서 차례대로 방에 넣는다.
                }
            }
        }

        //이중 배열은 2개의 인덱스 값을 가지기 때문에 행과 열 각각에 해당되는 값을 이중 for문으로 한다.

        for (i=0; i<a; i++){
            //배열의 행에 해당
            for (j=0; j<a; j++){
                // 배열의 열에 해당
                System.out.print(number[i][j]+"\t");

            }
            System.out.println();
        }




        }



    @Override
    public void star() {

    }
}
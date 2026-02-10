package com.leetcode;

import java.util.*;

public class P1718 {

/**
 * <a href="https://leetcode.com/problems/construct-the-lexicographically-largest-valid-sequence/">
 *     1718. Construct the Lexicographically Largest Valid Sequence</a>
 */

    public int[] constructDistancedSequence(int n) {
        // 5,3,1,4,3,5,2,4,2
        // 2
        // 2 1 2
        // 3
        // 3 2 1 23 3 x
        // f t t f t
        
        // 3 1 2 3 2 // 0
        // x 번재에 값을 넣어야 할때 해당 값 이상 들어가게 되는지 검사 해야 되는 로직이 필요함
        // 이때 필요한 자료구조를 알 수 없음.
        // brute force 로 시작.
        // 2번의 데이터 입력을 알아야 함. int[position][count] 를 사용
        // boolean array 를 생성해서 false 로 초기화 해놓고 n 보다 낮아지면서 사용하면 됨. 
        // candiate 값을 boolean 대신 들어가야 할 값으로 교체후 이후에 해당 값을 전부다 그 값으로 교체함.
        int[] candiate = new int[n*2 - 1];
        int[] result = new int[n*2 - 1];
        int idx = 0;

        for(int j = 0; j <= n ; j++) {
            for(int i = n; n > 0; n--) {
                if(idx < n && candiate[idx] == 0) {
                    result[idx] = n;
                    if(idx + n < result.length && candiate[idx + n] == 0) {
                        result[idx + n] = n;
                        candiate[idx + n] = n;
                        idx++;
                    }
                    break;
                }
                idx++;
                if(idx >= 3 ) break;
            }
          if(idx++ >= 2 ) break;
        }
        pf(result);

        for(int i = 0; i <= result.length ; n++) {
            if (result[i] == 0) {
                result[i] = candiate[i];
            }
        }

        return result;        
    }

    void pf(int[] p) {
        for(int i = 0; i < p.length; i++) {
            System.out.print(p[i] + ", " );
        }
        System.out.println();
    }
}

package kr.co.programmers;

import java.util.*;

public class P388353 {
    /*
A 회사의 물류창고에는 알파벳 대문자로 종류를 구분하는 컨테이너가 세로로 n 줄, 가로로 m줄 총 n x m개 놓여 있습니다.
특정 종류 컨테이너의 출고 요청이 들어올 때마다 지게차로 창고에서 접근이 가능한 해당 종류의 컨테이너를 모두 꺼냅니다.
접근이 가능한 컨테이너란 4면 중 적어도 1면이 창고 외부와 연결된 컨테이너를 말합니다.

최근 이 물류 창고에서 창고 외부와 연결되지 않은 컨테이너도 꺼낼 수 있도록 크레인을 도입했습니다.
크레인을 사용하면 요청된 종류의 모든 컨테이너를 꺼냅니다.

물류창고-1-1.drawio.png

위 그림처럼 세로로 4줄, 가로로 5줄이 놓인 창고를 예로 들어보겠습니다.
이때 "A", "BB", "A" 순서대로 해당 종류의 컨테이너 출고 요청이 들어왔다고 가정하겠습니다.
“A”처럼 알파벳 하나로만 출고 요청이 들어올 경우 지게차를 사용해 출고 요청이 들어온 순간 접근 가능한 컨테이너를 꺼냅니다.
"BB"처럼 같은 알파벳이 두 번 반복된 경우는 크레인을 사용해 요청된 종류의 모든 컨테이너를 꺼냅니다.

물류창고-1-2.drawio.png

위 그림처럼 컨테이너가 꺼내져 3번의 출고 요청 이후 남은 컨테이너는 11개입니다.
두 번째 요청은 크레인을 활용해 모든 B 컨테이너를 꺼냈음을 유의해 주세요.
세 번째 요청이 들어왔을 때 2행 2열의 A 컨테이너만 접근이 가능하고 2행 3열의 A 컨테이너는 접근이 불가능했음을 유의해 주세요.

처음 물류창고에 놓인 컨테이너의 정보를 담은 1차원 문자열 배열 storage와
출고할 컨테이너의 종류와 출고방법을 요청 순서대로 담은 1차원 문자열 배열 requests가 매개변수로 주어집니다.
이때 모든 요청을 순서대로 완료한 후 남은 컨테이너의 수를 return 하도록 solution 함수를 완성해 주세요.

 */
    public int solution(String[] storage, String[] requests) {
        int removeCount = 0;
        char[][] containers = new char[storage.length][storage[0].length()];


        for (int i = 0; i < storage.length; i++) {
            for (int j = 0; j < storage[i].length(); j++) {
                containers[i][j] = storage[i].charAt(j);
            }
        }


        for (String request : requests) {
            char c = request.charAt(0);
            if (request.length() == 1) {
                forklift(containers, c);
            } else {
                crane(containers, c);
            }
        }

        for (char[] container : containers) {
            for (int i = 0; i < container.length; i++) {
                if (container[i] != ' ') {
                    removeCount++;
                }

            }
        }


        return removeCount;
    }

    private void crane(char[][] containers, char c) {
        for (int x = 0; x < containers.length; x++) {
            for (int y = 0; y < containers[0].length; y++) {
                if (containers[x][y] == c) {
                    containers[x][y] = ' ';
                }
            }
        }
    }

    private void forklift(char[][] containers, char c) {
        int xl = containers.length;
        int yl = containers[0].length;
        boolean[][] visited = new boolean[xl][yl];

        for (int y = 0; y < yl; y++) {
            dfs(0, y, containers, c, visited);
            dfs(xl - 1, y, containers, c, visited);
        }

        for (int x = 0; x < xl; x++) {
            dfs(x, 0, containers, c, visited);
            dfs(x, yl - 1, containers, c, visited);
        }
    }

    private void dfs(int x, int y, char[][] containers,char c, boolean[][] visited) {
        if (x < 0 || x >= containers.length || y < 0 || y >= containers[x].length || visited[x][y]) {
            return;
        }
        visited[x][y] = true;

        if (containers[x][y] == c) {
            containers[x][y] = ' ';
        } else if (containers[x][y] == ' ') {
            dfs(x + 1, y, containers, c, visited);
            dfs(x, y + 1, containers, c, visited);
            dfs(x - 1, y, containers, c, visited);
            dfs(x, y - 1, containers, c, visited);
        }
    }
}

import java.util.*;

public class Test {
    // 전역 배열 (점수판)
    public static int[] arr;
    // 최대 값
    public static int max = 0;
    // dfs 함수 (인덱스, 깊이, 변동 제한 수)
    public static void dfs(int k, int cnt, int chance) {
        // 만약 깊이와 제한 수와 같다면(다 움직였다면)
        if(chance == cnt) {
            // Stringbuffer를 string으로 변환하고 parseInt 적용은 가능(그냥 String은 불가능)
            StringBuffer sb = new StringBuffer();
            for(int i : arr)
                sb.append(i);
            // 최대값 비교
            max = Math.max(max, Integer.parseInt(sb.toString()));
            return;
        }
        //전 범위 탐색 (시작 인덱스 ~ 끝)
        for(int i = k ; i < arr.length ; i++)
            // 전 범위 탐색(시작 + 1 ~ 끝)
            for(int j = i + 1 ; j < arr.length ; j++)
                // 만약 순서를 바꿀 필요가 있다면
                if(arr[i] <= arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    // dfs 재귀 호출 (깊이는 1 추가)
                    dfs(i, cnt + 1, chance);
                    // 다시 swap 해서 자리 되돌림
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case = 1 ; test_case <= T ; test_case++) {
            // max는 항상 초기화 해줘야함
            max = 0;
            // 번호판 입력
            int num = sc.nextInt();
            // 제한 횟수 입력
            int chance = sc.nextInt();
            // int -> int[] (외워둘것)
            arr = Integer.toString(num).chars().map(c -> c - '0').toArray();
            // dfs 실행
            dfs(0, 0, chance);
            System.out.println("#" + test_case + " " + max);
        }
        return;
    }
}
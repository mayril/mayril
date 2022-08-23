import java.util.Arrays;
import java.util.Scanner;

public class Test {
    static int[] arr;
    static int size;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            arr = new int[N];
            size = 0;
            sb.append("#").append(tc).append(" ");
            for (int i = 0; i < N; i++) {
                int op = sc.nextInt();
                if (op == 1)
                    add(sc.nextInt());
                else
                    sb.append(remove()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void add(int n) {
        // 마지막 한칸 뒤에 새로운 원소를 넣고 size도 하나 늘려줍니다.
        arr[++size] = n;
        // 마지막 노드의 위치를 기억합니다.
        int cur = size;
        // 루트까지 아직 오지 않았거나, 내 부모가 나보다 작다면 교환해줍니다.
        while (cur > 1 && arr[cur] > arr[cur / 2]) {
            int tmp = arr[cur];
            arr[cur] = arr[cur / 2];
            arr[cur / 2] = tmp;
            cur /= 2;
        }
    }

    static int remove() {
        // 없으면 -1
        if (size == 0)
            return -1;
        // 꺼낼 원소는 루트입니다.
        int n = arr[1];
        // 마지막 원소를 루트로 보냅니다.
        arr[1] = arr[size];
        // 마지막 원소가 있던 자리는 지워줍니다.
        arr[size] = -1;
        // 루트부터 출발.
        int cur = 1;
        // 왼쪽으로 자식이 존재한다면 계속 반복합니다.
        while ((cur * 2) < size) {
            // 왼쪽 친구를 일단 큰놈이라고 가정하고 기억합니다.
            int max = arr[cur * 2];
            int maxPos = cur * 2;
            // 오른쪽이 존재한다면 오른쪽과 비교해서 더큰놈을 갱신합니다.
            if ((cur * 2 + 1) < size) {
                if (max < arr[cur * 2 + 1]) {
                    max = arr[cur * 2 + 1];
                    maxPos = cur * 2 + 1;
                }
            }
            // 둘중에 큰놈이 기억된 그 값이 부모인 나보다 작다면 종료합니다.
            if (arr[cur] > max) {
                break;
            }
            // 아니면 큰놈과 교환해줍니다.
            int tmp = arr[cur];
            arr[cur] = arr[maxPos];
            arr[maxPos] = tmp;
            cur = maxPos;
        }
        size--;
        return n;
    }
}
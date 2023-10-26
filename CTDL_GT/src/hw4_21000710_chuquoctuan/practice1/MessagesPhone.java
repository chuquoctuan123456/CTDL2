package hw4_21000710_chuquoctuan.practice1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Ex19
/*
    * Cho dãy a là các SĐT sẽ gửi tin nhắn cho Huyền.
    * Hỏi sau khi nhận được tin nhắn cuối cùng thì màn hình của Huyền đang hiển thì tin nhắn của các SĐT nào,
    * đưa ra theo thứ tự từ trên xuống dưới của màn hình.
    *
 */
/*
    * input :
    * 1 2 1 3 4
    * 3
    * output:
    * 2 3 4
 */
public class MessagesPhone {
    public static String messages(int[] array,int k ){
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();

        boolean check = false;
        for(int phone : array){

            if(queue.size() >= k) {
                queue.poll();
            }
            // Check phone in queue
            for(Integer element : queue){
                if(phone == element){
                    check = true;
                    break;
                }
            }
            // If check = true -> keep queue ,else -> add queue
            if(check){
                check = false;
                continue;
            }else{
                queue.offer(phone);
            }

        }
        for(Integer element : queue){
            stringBuilder.append(element + " ");
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input length array : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Input elemeent : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Input k : ");
        int k = sc.nextInt();

        String result = messages(array, k);
        System.out.println(result);
    }
}

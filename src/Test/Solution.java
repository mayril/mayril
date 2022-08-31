package Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
 
public class Solution{
	
	static class Node{
		int data;
		Node link;
		public Node(int data){
			this.data=data;
			this.link=null;
		}
	}
	
	static class LinkedQueue{	
		static Node front =null;
		static Node rear=null;
		static int size=0;
		//isEmpty
		//enQueue
		//deQueue
		//printQueue
		
		void enQueue(int e) {
			Node node=new Node(e);
			if (size==0) {
				front=node;
				rear=node;
			}else {
				rear.link=node;
				rear=node;
			}
			size++;
		}
		
		int deQueue() {			
			if (size==0) {
				return 0;
			}else {
				Node de=front;
				int item=front.data;
				front=front.link;
				size--;
				return item;
			}			
		}

		void printQueue(int e) {
			 Node node=front;
	         while(node!=null) {
	        	 System.out.print(node.data+" ");
	             node=node.link;
	         }
	         System.out.println();	
		}
		
		boolean isEmpty(){
			if (size==0) {
				return true;
			}
			return false;		
		}
	}

	
	
 
public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    //Scanner sc = new Scanner(System.in);
    //int T=Integer.parseInt(br.readLine());
    int T=10;
    for(int test_case = 1; test_case <= T; test_case++){ 
        int t=Integer.parseInt(br.readLine());
        LinkedQueue lq=new LinkedQueue();
        //Queue<Integer> queue=new LinkedList<Integer>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        for (int i = 0; i < 8; i++) {
        	lq.enQueue(Integer.parseInt(st.nextToken()));
        }
         
        boolean t2=true;
         
        while (t2) {
            for (int i = 1; i <= 5; i++) {
                int tmp=lq.deQueue()-i;
                if (tmp>0) {
                	lq.enQueue(tmp);
                }else {
                	lq.enQueue(0);
                    t2=false;
                    break;
                }
 
            }       
        }
         
        System.out.print("#"+test_case+" ");
        for (int i = 0; i < 8; i++) {
            System.out.print(lq.deQueue()+" ");
        }
        System.out.println();
         
    }
     
     
    }

}


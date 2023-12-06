package colletion.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

	public static void main(String[] args) {
		
		/* Queue
		 * 
		 * Queue는 선형 메모리 공간에 데이터를 저장하는
		 * 선입선출(FIFO - First In First Out)방식의 자료구조
		 */
		
		/* Queue 자체로는 인터페이스이기 때문에 인스턴스 생성이 불가능하다. */
//		Queue<String> que = new Queue<String>() {};
		
		/* Queue 인터페이스를 상속받는 하위 인터페이스들은
		 * Deque, BlockingQueue, BlockingDeque, TransferQueue 등등 다양하지만
		 * 대부분 큐는 LinkedList를 이용한다.
		 * */
		
		Queue<String> que = new LinkedList<>();//LinkedList는 List도 상속받았지만, 
		//queue도 상속받았다.
		
		que.offer("first");
		que.offer("second");
		que.offer("third");
		que.offer("fourth");
		que.offer("fifth");
		
		System.out.println(que);
		
		/* 큐에서 데이터를 꺼낼 때는 2가지가 있다.
		 * peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 바노한
		 * poll() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환하고 제거한다.(pop이랑 같음)
		 * */
		
		System.out.println("peek() : " + que.peek());
		System.out.println("peek() : " + que.peek());
		
		System.out.println(que);
		System.out.println("poll() : " + que.poll());
		System.out.println("poll() : " + que.poll()); 
		//Stack은 계속 빼면 EmptyStackException이 나오는데
		//얘는 계속 빼면 null값이 나옴

		System.out.println(que);
		
		
		
	}
}

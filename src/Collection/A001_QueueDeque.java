package Collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class A001_QueueDeque {

	public static void main(String[] args) {
		/*
		 * Collection | Queue | Deque | LinkedList and ArrayDeque==>>implementing
		 * classes to Deque interface
		 * 
		 * Queue Interface extends Collection interface LinkedList , PriorityQueue
		 * classes implements this interface
		 * 
		 * 
		 * Why do we have a queue in real life?? in a line whoever comes first gets in line first 
		 * First in first out
		 */
//==========================================================
		/*
		 * QUEUE METHODS Throws exception | Returns special value Insert>> add(e) |
		 * offer(e) Remove>> remove() | poll()=> if you dont have more item poll does
		 * not throw an exception,NOT LIKE REMOVE Examine>> element() | peek()
		 * 
		 */

		Queue<Integer> queue = new LinkedList<>();

// there is duplication
//==>>ADDING HAVE 2 VERSIONS add(e)	and  offer(e)
		queue.offer(1);
		queue.offer(4);
		queue.offer(3);
		queue.offer(6);
		queue.offer(9);
		queue.addAll(Arrays.asList(4, 9, 53));
		// Queue does not maintain unique list of elements

		System.out.println(queue);// [1, 4, 3, 6, 9, 4, 9, 53] ==>First in first out HOW??

//[1, 4, 3, 6, 9, 4, 9, 53]		
//REMOVING has 2 versions	remove() and poll()
		// System.out.println(queue.remove(4)); returns boolean
		System.out.println(queue.remove());// 1==>First in first out
		System.out.println(queue.remove());// 4==>First in first out
		System.out.println(queue.poll()); // 3==>First in first out IT IS SAFER does not return exception=>Lets see
		System.out.println(queue.poll());// 6
		System.out.println(queue.poll());// 9
		System.out.println(queue.poll());// 4
		System.out.println(queue.poll());// 9
		System.out.println(queue.poll());// 53
		System.out.println(queue.poll());// no more element to be removed it SO returns null
		// System.out.println(queue.remove());//throws an exception!!!!!!!!!!!

// element() and peek()
		queue.addAll(Arrays.asList(4, 9, 53, 7, 12));
		System.out.println(queue.peek());// 4
		System.out.println(queue.peek());// 4
		System.out.println(queue.poll());// 4 removed
		System.out.println(queue.peek());// 9
		System.out.println(queue.element());// 9
		System.out.println(queue.remove());/// 9 removed
		System.out.println(queue.element());// 53

		// remove with itearting over each element
		while (!queue.isEmpty()) {
			System.out.println(queue.poll() + " to be removed in loop");
			// System.out.println(queue.remove());
		}

//	53 to be removed in loop
//	7 to be removed in loop
//	12 to be removed in loop

// there is no items at all it is empty
		System.out.println(queue.size());			// 0
		System.out.println(queue.poll()); 			// null
//		System.out.println(queue.remove());			// gives exception if there is no such an element
		System.out.println(queue.peek());
//		System.out.println(queue.element());		// gives exception if there is no element
		

//========= DEQUE : last in first out =======================
//		push:add  
//		pop:remove  
//		getFirst/peekFirst - getLast/peekLast
//-----------------------------------------------------------------		
		Deque<Integer> deq = new ArrayDeque<>();
		deq.push(1);
		deq.push(3);
		deq.push(4);
		deq.push(6);
		deq.push(20);
		deq.push(8);
		
		System.out.println(deq);			// [8, 20, 6, 4, 3, 1]	
		deq.pop();						// 8 out  -> [20, 6, 4, 3, 1]  (last in first out)
		deq.pop();						// 20 out -> [ 6, 4, 3, 1]    (last in first out)
		
		System.out.println(deq.peekFirst());	// 6
		System.out.println(deq.getFirst());		// 6
		System.out.println(deq.peekLast());		// 1
		System.out.println(deq.getLast());		// 1
		
		while( !deq.isEmpty() )
			deq.pop();	
		
		System.out.println(deq);			// []
		System.out.println(deq.peekFirst());	// null
//		System.out.println(deq.getFirst());		// java.util.NoSuchElementException
		System.out.println(deq.peekLast());		// null
//		System.out.println(deq.getLast());		// java.util.NoSuchElementException
			
	}

}
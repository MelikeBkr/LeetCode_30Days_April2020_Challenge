/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head)
    {
        ListNode middle, cursor; 
		middle = cursor = head;
        int counter = 0;
 
		while(cursor !=null) 
        { 
			cursor = cursor.next; 
            counter++;
			if(cursor != null && cursor.next != null) { 
				middle = middle.next; 
				cursor = cursor.next; 
                counter++;
			} 
		} 
        
        if(counter%2==0)
        {
            middle = middle.next;
        }
 
		return middle; 
    }
}
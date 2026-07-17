// Last updated: 17/07/2026, 15:10:29
import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> s=new Stack<>(); 
        for(String op:operations)
        {
            if(op.equals("C"))
            {
                s.pop();
            }
            else if(op.equals("D"))
            {
                s.push(2*s.peek());
            }
            else if(op.equals("+")){
                int top=s.pop();
                int newscore=top+s.peek();
                s.push(top);
                s.push(newscore);
            }
            else{
                s.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int score:s)
        {
             sum+=score;
        }
        return sum;
    }
}
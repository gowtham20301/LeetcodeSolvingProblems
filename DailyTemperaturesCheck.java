package LeetcodeSolvingProblems;

import java.util.Stack;

public class DailyTemperaturesCheck {
        public int[] dailyTemperatures(int[] temperatures) {
            Stack<Integer> stack= new Stack<Integer>();
            int[] days=new int[temperatures.length];
            for(int i=0;i< temperatures.length;i++)
            {
                if(stack.size()==0 || temperatures[i]<=temperatures[stack.peek()])
                {
                    stack.push(i);

                }
                else
                {

                    while(stack.size()>0 && temperatures[i]> temperatures[stack.peek()])
                    {
                        int last=stack.pop();
                        days[last] = i-last;
                    }
                    stack.push(i);
                }
            }
            return days;
        }

    }


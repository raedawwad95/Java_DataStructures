public class Stack {
    //your code is here
	int []stack=new int[5];
	int x=0;
    public void push(int pushedElement){
       //your code is here
    	stack[x]=pushedElement;
    	System.out.println(stack[x]);
    	x++;
    }
    public void pop() {
        //your code is here
    	
    		stack[x]=0;	
    		
    	x--;
    	System.out.println(stack[x]);
    }

}
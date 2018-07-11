public class Queue {
   // your code is here
	int []queue=new int[5] ;
	int x=0;
    public void push(int pushedElement){
       //your code is here
    	
    	queue[x]=pushedElement;
    	x++;
    }
    public void pop(){
    	for(int i=0;i<queue.length-1;i++){
    		queue[i]=queue[i+1];
    	}
    	x--;
        //your code is here
    }
	public void display(){
        //your code is here
		for(int i=0;i<queue.length;i++){
    		System.out.println(queue[i]);
    	}
    }
    

}
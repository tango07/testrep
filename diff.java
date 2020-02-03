import java.util.*;
class stack{
	static class qu
	{
		static Stack<Integer> s=new Stack<Integer>();
		static Stack<Integer> k=new Stack<Integer>();
		public void in(int x)
		{
			while(!s.isEmpty()){
				k.push(s.pop());
			}
			s.push(x);
			while(!k.isEmpty()){
				s.push(k.pop());
			}
		}
		public void out(){
			System.out.println(s.pop());
		}
	}
	public static void main(String[] args){
			qu q=new qu();
			q.in(5);q.in(9);q.in(10);q.in(67);q.in(8);
			q.out();q.out();q.out();

		
	}
}
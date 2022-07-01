package CacheEviction;

import java.util.LinkedList;
import java.util.Queue;

public class User implements cacheEvictionInterface{

	
	Queue<String>queue=new LinkedList<>();
	

	@Override
	public String eviction() {
		// TODO Auto-generated method stub
		return queue.poll();
		
	}

	@Override
	public void put(String key) {
		// TODO Auto-generated method stub
		queue.add(key);
		
	}

//	@Override
//	public String pop() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}

package CacheEviction;
import java.util.*;

public class cacheClass {
	
	int cacheSize;
	HashMap<String,String>hmap=new HashMap<>();
	cacheEvictionInterface obj;
	
	public void insert(String key,String value) {
		if(hmap.size()<cacheSize) {
			hmap.put(key, value);
			obj.put(key);
		}else {
			//System.out.println("eviction called: "+obj);
			String removeKey=obj.eviction();
			//System.out.println("eviction called: "+removeKey);
			hmap.remove(removeKey);
			hmap.put(key, value);
			obj.put(key);
		}
		
	}
	
	public void remove(String key) {
		if(hmap.containsKey(key)) {
			hmap.remove(key);
			obj.eviction();
		}
		
	}
	
	public void Update(String key,String value) {
		if(hmap.containsKey(key)) {
			hmap.put(key,value);
		}
		
	}
	
	public String read(String key) {
		if(hmap.containsKey(key)) {
			return hmap.remove(key);
		}
		return "-1";		
	}
	
	public void printCache() {
		System.out.println(hmap);
	}

	public cacheClass(int cacheSize, cacheEvictionInterface obj) {
		super();
		this.cacheSize = cacheSize;
		this.obj = obj;
	}
	
	
	
	
	

}

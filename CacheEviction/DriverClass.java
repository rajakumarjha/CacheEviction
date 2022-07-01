package CacheEviction;

public class DriverClass {
	
	static User u1=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			u1=new User();
			int cacheSize=3;
			cacheClass cache=new cacheClass(cacheSize,u1);
			
			cache.insert("k1", "v1");
			cache.printCache();
			cache.insert("k2", "v2");
			cache.printCache();
			cache.insert("k3", "v3");
			cache.printCache();
			cache.insert("k4", "v4");
			cache.printCache();
			cache.remove("k2");
			cache.printCache();
			cache.insert("k5", "v5");
			cache.printCache();
			cache.insert("k6", "v6");
			cache.printCache();
			cache.Update("k3", "raja");
			cache.insert("k7", "v7");
			cache.printCache();
			cache.printCache();
			
			

	}

}

class Info{
	int distance;
	int houseno;

	Info(int x,int y)
	{
		distance = x;
		houseno = y;
	}
}

class Compare implements Comparator<Info>{ 
	public int compare (Info p1,Info p2 )
	{
		if (p1.distance == p2.distance)	{
			if (p1.houseno < p2.houseno)
				return +1;
			if (p1.houseno > p2.houseno)
				return -1;
			return 0;
		}

		else {
		   	if (p1.distance < p2.distance)
				return +1;
			if (p1.distance > p2.distance)
				return -1;
			return 0;
		}
	}
}

class lucy 
{ 
	public  ArrayList<Integer> Kclosest(int arr[], int n, int x, int k) 
	{ 
		ArrayList<Integer> result= new ArrayList<Integer>();
		PriorityQueue<Info> pq = new PriorityQueue<Info>(k, new Compare()); 

		for (int i = 0; i < k; i++) 
		{
			Info obj = new Info(Math.abs(arr[i] - x) , arr[i] );
			pq.add(obj); 
		}

		for (int i = k; i < n; i++) 
		{ 
			int diff = Math.abs(arr[i] - x); 
			if (diff > pq.peek().distance) 
				continue; 

			if (diff == pq.peek().distance && arr[i] > pq.peek().houseno) 
				continue; 

			pq.remove();
			Info obj = new Info(Math.abs(arr[i] - x) , arr[i] );
			pq.add(obj);
		} 
		while (pq.size() >0) { 
			result.add(pq.peek().houseno);
			pq.remove();
		}
		Collections.sort(result);
		return result;
	}    
} 
class trap_rain_water{
	static long trappingWater(int arr[], int n) { 
        
        int left[] = new int[n];
        
        int right[] = new int[n];
        
        left[0] = arr[0];
        for (int i = 1;i < n;i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        
        right[n - 1] = arr[n - 1];
        for(int i = n - 2;i >= 0;i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        
        long water = 0;
        for (int i = 1;i < n - 1;i++) {
            water += Math.max(0, Math.min(left[i], right[i]) - arr[i]);
        }
        return water;
    } 
}
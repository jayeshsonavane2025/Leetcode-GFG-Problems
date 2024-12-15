class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                double a1 = (double)a[0]/(double)a[1];
                double a2 = (double)(a[0]+1)/(double)(a[1]+1);
                
                double d1 = a2 - a1;
                
                double b1 = (double)b[0]/(double)b[1];
                double b2 = (double)(b[0]+1)/(double)(b[1]+1);
                
                double d2 = b2 - b1;
                
                return -Double.compare(d1, d2);
            }
        });
        
        for(int[] it: classes)
            pq.offer(it);
        
        while(extraStudents-- != 0){   
            int[] arr = pq.poll();
            
            arr[0] += 1;
            arr[1] += 1;
            
            pq.offer(arr);
        }
    
        double sum = 0;
        
        while(!pq.isEmpty())
            sum += (double)pq.peek()[0]/(double)pq.poll()[1];
        
        return (double)sum/(double)classes.length;
    }
}
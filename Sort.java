public class Sort {
    public static int keycount =0;
    private static int [] array1024 = randomnumbers(1024);
    private static int [] array32768 = randomnumbers(32768);
    private static int [] array1048576 = randomnumbers(1048576);
    
    public void Quicksort() {
    	
    	int[] s_elements = {1,4,6,7,9,11,14,17,24,28,33,37,41,44,48,53,58,65,69,74,80,86,92,100,102,104,107,119,122,125,135,140};
        int [] rs_elements= {140,135,125,122,119,107,104,102,100,92,86,80,74,69,65,58,53,48,44,41,37,33,28,24,17,14,11,9,7,6,4,1};
        int [] random32 = {191,135,478,33,6,7234,78,56,23,2,2396,34557,65446,865,1245,8066,3456,743,66,2444,567,787,9189,1334,7766,876,8899,5167,7819,573,7788,1856};

        int start=0;
        int end=s_elements.length - 1;
        int rend=random32.length - 1;
        
        System.out.println("QuickSort");
        final long startTime_sorted_quick = System.nanoTime();
        quickSort(s_elements,start,end);
        final long endTime_sorted_quick = System.nanoTime();
        print(s_elements);
        System.out.println("No. of key Comparisons Sorted : "+Sort.keycount);
        System.out.println("Time Sorted: "+ ((endTime_sorted_quick - startTime_sorted_quick)/1e6));
        Sort.keycount = 0;

        final long startTime_unsorted_quick = System.nanoTime();
        quickSort(rs_elements,start,end);
        final long endTime_unsorted_quick = System.nanoTime();
        print(rs_elements);
        System.out.println("No. of key Comparisons Reverse : "+Sort.keycount);
        System.out.println("Time Reverse: "+ ((endTime_unsorted_quick - startTime_unsorted_quick)/1e6));
        Sort.keycount = 0;

        final long startTime_r32_quick = System.nanoTime();
        quickSort(random32,start,rend);
        final long endTime_r32_quick = System.nanoTime();
        print(random32);
        System.out.println("No. of key Comparisons Array 32 : "+Sort.keycount);
        System.out.println("Time Array32: "+ ((endTime_r32_quick - startTime_r32_quick)/1e6));
        Sort.keycount = 0;

        final long startTime_r1024_quick = System.nanoTime();
        quickSort(array1024,start,rend);
        final long endTime_r1024_quick = System.nanoTime();
        print(array1024);
        System.out.println("No. of key Comparisons Array 1024 : "+Sort.keycount);
        System.out.println("Time Array1024: "+ ((endTime_r1024_quick - startTime_r1024_quick)/1e6));
        Sort.keycount = 0;

        final long startTime_r32768_quick = System.nanoTime();
        quickSort(array32768,start,rend);
        final long endTime_r32768_quick = System.nanoTime();
        print(array32768);
        System.out.println("No. of key Comparisons Array 32768 : "+Sort.keycount);
        System.out.println("Time Array32768: "+ ((endTime_r32768_quick - startTime_r32768_quick)/1e6));
        Sort.keycount = 0;

        final long startTime_r1048576_quick = System.nanoTime();
        quickSort(array1048576,start,rend);
        final long endTime_r1048576_quick = System.nanoTime();
        System.out.println("No. of key Comparisons Array 1048576 : "+Sort.keycount);
        System.out.println("Time Array1048576: "+ ((endTime_r1048576_quick - startTime_r1048576_quick)/1e6));
        Sort.keycount = 0;
        
        }
    
    		public void Mergesort() {
    			
    			int[] s_elements = {1,4,6,7,9,11,14,17,24,28,33,37,41,44,48,53,58,65,69,74,80,86,92,100,102,104,107,119,122,125,135,140};
    	        int [] rs_elements= {140,135,125,122,119,107,104,102,100,92,86,80,74,69,65,58,53,48,44,41,37,33,28,24,17,14,11,9,7,6,4,1};
    	        int [] random32 = {191,135,478,33,6,7234,78,56,23,2,2396,34557,65446,865,1245,8066,3456,743,66,2444,567,787,9189,1334,7766,876,8899,5167,7819,573,7788,1856};
    			
    			System.out.println("MergeSort");
    	        final long startTime_sorted_merge = System.nanoTime();
    	        merge_sort(s_elements, 0, s_elements.length - 1);
    	        final long endTime_sorted_merge = System.nanoTime();
    	        print(s_elements);
    	        System.out.println("No. of key Comparisons Sorted : "+ Sort.keycount);
    	        System.out.println("Time Sorted: "+ ((endTime_sorted_merge - startTime_sorted_merge)/1e6));
    	        Sort.keycount = 0;

    	        final long startTime_unsorted_merge = System.nanoTime();
    	        merge_sort(rs_elements, 0, rs_elements.length - 1);
    	        final long endTime_unsorted_merge = System.nanoTime();
    	        print(rs_elements);
    	        System.out.println("No. of key Comparisons Reverse: "+ Sort.keycount);
    	        System.out.println("Time Reverse: "+ ((endTime_unsorted_merge - startTime_unsorted_merge)/1e6));
    	        Sort.keycount = 0;

    	        final long startTime_r32_merge = System.nanoTime();
    	        merge_sort(random32, 0, random32.length - 1);
    	        final long endTime_r32_merge = System.nanoTime();
    	        print(random32);
    	        System.out.println("No. of key Comparisons Array32 : "+Sort.keycount);
    	        System.out.println("Time Array32: "+ ((endTime_r32_merge - startTime_r32_merge)/1e6));
    	        Sort.keycount = 0;

    	        final long startTime_r1024_merge = System.nanoTime();
    	        merge_sort(array1024, 0, array1024.length - 1);
    	        final long endTime_r1024_merge = System.nanoTime();
    	        print(array1024);
    	        System.out.println("No. of key Comparisons Array1024 : "+Sort.keycount);
    	        System.out.println("Time Array1024: "+ ((endTime_r1024_merge - startTime_r1024_merge)/1e6));
    	        Sort.keycount = 0;

    	        final long startTime_r32768_merge = System.nanoTime();
    	        merge_sort(array32768, 0, array32768.length - 1);
    	        final long endTime_r32768_merge = System.nanoTime();
    	        print(array32768);
    	        System.out.println("No. of key Comparisons Array32768 : "+Sort.keycount);
    	        System.out.println("Time Array32768: "+ ((endTime_r32768_merge - startTime_r32768_merge)/1e6));
    	        Sort.keycount = 0;

    	        final long startTime_r1048576_merge = System.nanoTime();
    	        merge_sort(array1048576, 0, array1048576.length - 1);
    	        final long endTime_r1048576_merge = System.nanoTime();
    	        System.out.println("No. of key Comparisons Array1048576 : "+Sort.keycount);
    	        System.out.println("Time Array1048576: "+ ((endTime_r1048576_merge - startTime_r1048576_merge)/1e6));
    	        Sort.keycount = 0;
    			
    		}

    		public void HeapSort(){
    			
    			int[] s_elements = {1,4,6,7,9,11,14,17,24,28,33,37,41,44,48,53,58,65,69,74,80,86,92,100,102,104,107,119,122,125,135,140};
    	        int [] rs_elements= {140,135,125,122,119,107,104,102,100,92,86,80,74,69,65,58,53,48,44,41,37,33,28,24,17,14,11,9,7,6,4,1};
    	        int [] random32 = {191,135,478,33,6,7234,78,56,23,2,2396,34557,65446,865,1245,8066,3456,743,66,2444,567,787,9189,1334,7766,876,8899,5167,7819,573,7788,1856};
    	        
    	        System.out.println("HeapSort");
    	        final long startTime_relements_heap = System.nanoTime();
    	        heapsort(s_elements);
    	        final long endTime_relements_heap = System.nanoTime();
    	        print(s_elements);
    	        System.out.println("No. of key Comparisons Sorted : "+Sort.keycount);
    	        System.out.println("Time Random s_elements: "+ ((endTime_relements_heap - startTime_relements_heap)/1e6));
    	        Sort.keycount = 0;

    	        
    	        final long startTime_rr_elements_heap = System.nanoTime();
    	        heapsort(rs_elements);
    	        final long endTime_rr_elements_heap = System.nanoTime();
    	        print(rs_elements);
    	        System.out.println("No. of key Comparisons Reverse : "+Sort.keycount);
    	        System.out.println("Time Random rs_elements: "+ ((endTime_rr_elements_heap - startTime_rr_elements_heap)/1e6));
    	        Sort.keycount = 0;

    	        final long startTime_random32_heap = System.nanoTime();
    	        heapsort(random32);
    	        final long endTime_random32_heap = System.nanoTime();
    	        print(random32);
    	        System.out.println("No. of key Comparisons Array32 : "+Sort.keycount);
    	        System.out.println("Time Random Array32: "+ ((endTime_random32_heap - startTime_random32_heap)/1e6));
    	        Sort.keycount = 0;

    	        final long startTime_random1024_heap = System.nanoTime();
    	        heapsort(array1024);
    	        final long endTime_random1024_heap = System.nanoTime();
    	        print(array1024);
    	        System.out.println("No. of key Comparisons Array1024 : "+Sort.keycount);
    	        System.out.println("Time Random Array1024: "+ ((endTime_random1024_heap - startTime_random1024_heap)/1e6));
    	        Sort.keycount = 0;

    	        final long startTime_random32768_heap = System.nanoTime();
    	        heapsort(array32768);
    	        final long endTime_random32768_heap = System.nanoTime();
    	        print(array32768);
    	        System.out.println("No. of key Comparisons Array32768 : "+Sort.keycount);
    	        System.out.println("Time Random Array32768: "+ ((endTime_random32768_heap - startTime_random32768_heap)/1e6));
    	        Sort.keycount = 0;

    	        final long startTime_random1048576_heap = System.nanoTime();
    	        heapsort(array1048576);
    	        final long endTime_random1048576_heap = System.nanoTime();
    	        System.out.println("No. of key Comparisons Array1048576 : "+Sort.keycount);
    	        System.out.println("Time Random Array1048576: "+ ((endTime_random1048576_heap - startTime_random1048576_heap)/1e6));
    	        Sort.keycount = 0;

    	    		}
    		
    public static void main(String[] args) {

    	Sort s = new Sort();
    s.Quicksort();
    s.Mergesort();
    	s.HeapSort();

    }
        
   

    public static int[] randomnumbers (int a)
    {

        int count = 0;
        int [] ranval = new int[a];
        for (int i = 0; i < a; i++)
        {

            ranval[count] = (int) (Math.random() * 5000000);
            count++;

        }
        return ranval;
    }


    public static boolean compare(int x,int y) {
        Sort.keycount++;
        if( x < y){
            return true;
        }else
        {
            return false;
        }
    }
    public static void quickSort(int elements[],int start,int end) {
        if (start < end) {
            int pivot = partition(elements, start, end);
            quickSort(elements, start, pivot - 1);
            quickSort(elements, pivot + 1, end);
        }
    }

    public static int partition(int elements[],int start,int end){
        int pivot = elements[end];
        int i = start;
        for(int  j=start ; j<= end -1 ;j++){
            if(compare(elements[j],pivot)){
                int temp = elements[i];
                elements[i] = elements[j];
                elements[j] = temp;
                i++;
            }
        }
        elements[end] = elements[i];
        elements[i] = pivot;
        return i;
    }

    public static void merge_sort(int[] elements, int start, int end){
        if(start < end){
            int mid = (int)Math.floor((start+end)/2) ;
            merge_sort(elements, start, mid);
            merge_sort(elements, mid + 1, end);
            move(elements, start, mid, end);
        }
    }

    public static void move(int[] array, int start, int mid, int end){
        int part1 = mid - start + 1;
        int part2 = end - mid;
        int[] t1 = new int[part1];
        int[] t2 = new int[part2];

        for(int i = 0; i < part1; i++){
            t1[i] = array[start + i];
        }

        for(int j = 0; j < part2; j++){
            t2[j] = array[mid + 1 + j];
        }

        int i=0,j=0;
        for(int k=start;k<=end;k++){

            if ((j>=part2) || (i<part1 && compare(t1[i],t2[j]))) {
                array[k] = t1[i];
                i++;
            }else {
                array[k]=t2[j];
                j++;
            }

        }

    }

    private static void swap(int [] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void pushDown(int [] array, int index, int end) {
        int left = 2 * index + 1;
        if (left > end) {
            left = -1;
        }

        int right = 2 * index + 2;
        if (right > end) {
            right = -1;
        }
        if (left != -1 && COMPAREG(array[left], array[index])) {
            swap(array, left, index);
            pushDown(array, left, end);
        }
        if (right != -1 && COMPAREG(array[right], array[index])) {
            swap(array, right, index);
            pushDown(array, right, end);
        }
    }

    public static void heapify(int [] array, int end) {
        int index;

        if (end < 0) {
            index = -1;
        }else{
            index = (end - 1) / 2;
        }
        while (index >= 0) {
            pushDown(array, index, end);
            index--;
        }
    }

    public static void heapsort(int [] array) {
        heapify(array, array.length - 1);

        int end = array.length - 1;
        while (end > 0) {
            swap(array, 0, end);
            end--;
            pushDown(array, 0, end);
        }
    }

    public static boolean COMPAREG(int X, int Y){
        keycount++;
        if(X > Y){
            return true;
        }else{
            return false;
        }

    }


    public static void print(int elements[]){
        for (int i = 0; i <elements.length; i++) {
            System.out.print(elements[i]+" ");
        }
        System.out.println();
    }
}
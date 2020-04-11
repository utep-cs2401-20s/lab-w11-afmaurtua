public class newSorting {
    public void newSorting(int [] A, int size) {
        int[] LA = new int[0];
        int[] RA = new int[0];
        if (A.length <= size) {
            quickSort(A, start, end);
        } else {
            int middle = A.length / 2;
            LA = new int[middle];
            RA = new int[A.length];

            //left side
            for (int i = 0; i < LA.length; i++) {
                LA[i] = A[i];
            }
            //right side
            for (int i = 0; i < RA.length; i++) {
                RA[i] = RA[middle + 1];
            }
        }

        //RecursiveCAll
        newSorting(LA, size);
        newSorting(RA, size);

        public void mergeSortedHalves(int[]A, int RSide, int LSide, int m){
            //finding the sizes of the two sorted arrays that need to be merged
            int R1 = m - 1 + 1;
            int L1 = RSide - m;

            //temps arrays
            int [] R = new int [R1];
            int [] L = new int [L1];

            //coping the right side and left side for temp arrays
            for(int i = 0; i < R1; i++){
                R[i] = A[1 + i];
            }
            for(int j = 0; j < L1; j++){
                L[j] = A[m + 1 + j];
            }
            //merging both arrays
            // intiaizing the first index of both arrays
            int i = 0;
            int j = 0;

            //initializing the first index of merged subarray
            int k = 1;
            while(i < R1 && j < L1){ //able to merge both sides
                if(L[j] <= R[i]){
                    A[k] = L[j];
                    i++;
                }
                else{
                    A[k] = R[i];
                }
                k++;
            }
            while (i < R1){ //Checking the condition on the right side
                A[k] = R[i];
                i++;
                k++;

            }
            while(j < L1){ //checking the condition on the left side
                A[k] = L[j];
                j++;
                k++;
            }


        }

        public void quickSort(int[] A, int start, int end){
            end = A.length - 1;
            start = A[0];
            int pivot = A[start];

            for (int i = start; i < end; i++) {
                if (A[i] <= pivot) {
                    start++;
                    int temp = pivot;
                    pivot = A[i]; //swapping values
                    A[i] = temp;
                }
            }
            //swapping the pivot
            int temp = A[i+1];
            A[i + 1] = A[i];
            A[i] = temp;

            return i + 1;

        }
    }
}

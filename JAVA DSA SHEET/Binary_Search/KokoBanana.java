package Binary_Search;

public class KokoBanana {

    static int findMax(int piles[]){
        int maxi = piles[0];
        for(int ele : piles){
            if(ele > maxi) maxi = ele;
        }
        return maxi;
    }

    static long calcHours(int piles[], int mid){
        long hr = 0;
        for(int ele : piles){
            hr += (ele / mid);
            if(ele % mid != 0) hr++;
        }
        return hr;
    }

    static int search(int piles[], int h){
        int low = 1;
        int high = findMax(piles);

        while(low <= high){
            int mid = (low + high) / 2;
            long hrs = calcHours(piles, mid);

            if(hrs <= h){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static int minEatingSpeed(int[] piles, int h) {
        return search(piles, h);
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + result);
    }
}

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i <= arr[j]) {
            arrayList.add(arr[j]);
            i++;

            if (i == arr[j]) {
                j++;

                if (j == arr.length) break;

                i = 0;
            }


        }

        return arrayList.stream().mapToInt(x -> x).toArray();
    }
}
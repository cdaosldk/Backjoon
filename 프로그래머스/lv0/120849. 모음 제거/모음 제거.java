import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {

        List<String> myStringList = new ArrayList<>();

        int array = my_string.length();

        for (int i = 0; i < array; i++) {
            myStringList.add(i, String.valueOf(my_string.charAt(i)));
        }

        myStringList = myStringList.stream().filter(s -> s.matches("[^aeiou]$")).collect(Collectors.toList()); //.toList()와 차이??

        return String.join("", myStringList);
    }
}
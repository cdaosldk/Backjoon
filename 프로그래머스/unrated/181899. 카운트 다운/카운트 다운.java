import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;




public class Solution {
  public List<Integer> solution(int start, int end) {

    List<Integer> collect = IntStream.rangeClosed(end, start).boxed().collect(Collectors.toList());

    Collections.reverse(collect);

    return collect;
  }

}
import java.util.LinkedList;
import java.util.List;

public class Combine {

    private List<List<Integer>> result = new LinkedList<>();
    private int n;
    private int k;


    public void backtrack(int first, LinkedList<Integer> current){
        if(current.size() == k){
            result.add(new LinkedList<>(current));
        }
        for(int i=first; i<=n; i++){
            current.add(i);
            backtrack(i+1,current);
            current.removeLast();
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backtrack(1, new LinkedList<Integer>());
        return result;

    }
}

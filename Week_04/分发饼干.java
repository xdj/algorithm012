import java.util.Arrays;

public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gCount = 0;
        int sCount = 0;
        while (gCount < g.length && sCount < s.length){
            if (g[gCount] <= s[sCount]) {
                gCount++;
            }
            sCount++;
        }
        return gCount;
    }
}

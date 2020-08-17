学习笔记

###个人认为贪心算法是一种算法思想，并没有固定的算法模板。

###二分查找，寻找一个半有序数组。每次都定位到数组的中间位置，判断是否后一位置大于当前位置，如果不是，则当前位置就是无序的起点。如果当前位置有序，则将数组一分为二，拆分后的数组继续执行此方法。代码如下

```
import java.util.ArrayList;

public class FindNonOrder {
    private ArrayList<Integer> answer;
    
    public void findNonOrder(int order[],int start,int end){
        if(end == start){
            return;
        }
        if (end == start + 1) {
            if(order[end] < order[start]){
                answer.add(start);
                return;
            }
        }
        int tmp = start + (end-start)/2;
        if(order[tmp+1] < order[tmp]){
            answer.add(tmp);
            return;
        }
        findNonOrder(order,start,tmp);
        findNonOrder(order,tmp+1,end);

    }
}
```
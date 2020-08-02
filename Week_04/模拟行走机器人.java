import java.util.HashSet;
import java.util.Set;

public class RobotSim {
    public int robotSim(int[] commands, int[][] obstacles) {
        int result = 0,direction = 0,x = 0,y = 0;
        int[][] move = {{0,1},{1,0},{0,-1},{-1,0}};
        Set<String> obstacleSet = new HashSet();
        for(int [] obstacle : obstacles){
            obstacleSet.add(obstacle[0]+","+obstacle[1]);
        }
        for(int command : commands){
            int next_x = 0,next_y = 0;
            if (command >= 0 ){
                for(int i = 0; i < command; i++){
                    next_x = x + move[direction][0];
                    next_y = y + move[direction][1];
                    if(obstacleSet.contains(next_x+","+next_y)) {
                        break;
                    }
                    x = next_x;
                    y = next_y;
                    result = Math.max(result, x*x + y*y);
                }
            }else{
                direction = command == -1 ? (direction + 1) % 4 : (direction + 3) % 4;
            }
        }
        return result;
    }

}

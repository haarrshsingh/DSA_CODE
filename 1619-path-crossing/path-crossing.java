class Solution {
    public boolean isPathCrossing(String path) {
       Set<String> visited = new HashSet<>();
       int x=0, y = 0;
       visited.add("0,0");
       for(char dir : path.toCharArray()){
        if(dir == 'N')y++;
        else if(dir == 'S')y--;
        else if(dir == 'E')x++;
        else if(dir == 'W')x--;
        String position = x + ","+y;
        if(visited.contains(position)) return true;
        visited.add(position);
       } 
       return false;
    }
}
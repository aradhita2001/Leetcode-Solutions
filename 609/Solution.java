import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        
        List<List<String>> ans = new ArrayList<List<String>>();
        
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String path : paths){

            String dir = path.substring(0, path.indexOf(" "));

            int idx = path.indexOf(" ");
            while(idx != -1){
                int startIndex = idx + path.substring(idx).indexOf("(");
                int endIndex =  idx + path.substring(idx).indexOf(")");
                String content = path.substring(startIndex + 1, endIndex);

                System.out.println(content);

                String fileName = path.substring(idx + 1, startIndex);
                String filePath = dir + "/" + fileName;

                ArrayList<String> curr = map.getOrDefault(content, new ArrayList<String>());
                curr.add(filePath);

                map.put(content, curr);

                path = path.substring(idx + 1);
                idx = path.indexOf(" ");
            }
        }

        for(String content : map.keySet()){
            if(map.get(content).size() > 1) ans.add(map.get(content));
        }
        return ans;
    }
}
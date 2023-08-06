import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String cpdomain : cpdomains) {
            int count = Integer.parseInt(cpdomain.substring(0, cpdomain.indexOf(" ")));
            String domain = cpdomain.substring(cpdomain.indexOf(" ") + 1);

            while (!domain.equals("")) {
                map.put(domain, map.getOrDefault(domain, 0) + count);

                if (domain.indexOf(".") == -1) // to handle top level where no "." is present
                    break;
                domain = domain.substring(domain.indexOf(".") + 1);
            }
        }

        List<String> answer = new ArrayList<String>();

        for (String domain : map.keySet()) {
            answer.add(map.get(domain) + " " + domain);
        }

        return answer;
    }
}
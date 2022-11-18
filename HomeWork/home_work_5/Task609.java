package home_work_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task609 {
    public static void main(String[] args) {
        String[] paths = new String[] {"root/a 1.txt(abcd) 2.txt(efsfgh)","root/c 3.txt(abdfcd)","root/c/d 4.txt(efggdfh)"};
        Solution sol = new Solution();
        List<List<String>> result = sol.findDuplicate(paths);
        System.out.println(result);
    }
}
// мапа: паполнение файла - массив с путями (папки + название файлов)
class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();

        for (String path : paths) {
            String[] pathsFiles = path.split(" ");

            for (int i = 1; i < pathsFiles.length; i++) {
                int indexStartContent = pathsFiles[i].indexOf('(');
                String content = pathsFiles[i].substring(indexStartContent);
                map.putIfAbsent(content, new ArrayList<>());
                map.get(content).add(pathsFiles[0] + "/" + pathsFiles[i].substring(0, indexStartContent));
            }
        }

        List<List<String>> sol = new ArrayList<>();
    
        for (List<String> ways : map.values()) {
            if (ways.size() > 1) {
                sol.add(ways);
            }
        }
        return sol;
    }
}
import java.util.Stack;

public class SymplifyPath {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public String simplifyPath(String path) {
        String[] address = path.split("/");
        Stack<String> directory = new Stack<>();
        StringBuilder newPath = new StringBuilder();

        for (String token : address) {
            if (".".equals(token) || "".equals(token)) {
                continue;
            }
            if ("..".equals(token)) {
                if (!directory.empty()){
                    directory.pop(); 
                }
            } else {
                directory.push(token);
            }
        }
        
        if (directory.empty()) {
            return "/";
        }
        while (!directory.empty()) {
            newPath.insert(0, directory.pop());
            newPath.insert(0, "/");
        }
        return newPath.toString();
    }
}
import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        Example e = new Example();
        String s = e.reverse("abc", new ArrayList<>());        
        System.out.println(s);
    }

    public String reverse(String str, List<String> list) {
        if(list == null)
            list = new ArrayList<>();
        if(str == null){
            str = "";
            return str;
        }
            
        for(int i = str.length()-1; i>=0 ; i--){
            list.add(str.substring(i));
            str = str.substring(0, i);
        }
         
        StringBuffer sb = new StringBuffer();
        for (String s : list) {
            sb.append(s);
        }
        return sb.toString();          
                   
    }
}

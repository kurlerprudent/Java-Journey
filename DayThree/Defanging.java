package DayThree;

public class Defanging {

    public static String Defanger(String address){
        StringBuilder sb = new StringBuilder();
        char formatted[] = address.toCharArray();
        for(char c:formatted){
            if (c == '.') {
                sb.append("[.]");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

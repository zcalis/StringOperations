public class StringModifier {
    public static void main(String[] args) {
        System.out.println(StringModifier.longestWord("The cow jumped over the moon."));
    }

    public static String longestWord(String input) {
        String output = "";
        if (input.length() > 0) {
            input=input.trim();
            String[] temp = input.split(" ");
            output = temp[0];
            for (int i = 0; i < temp.length; i++) {
                if (temp[i].length() > output.length()) {
                    output = temp[i];
                }
            }
            return output + " and its length is " + output.length() + " character(s)";
        } else {
            return "Input cannot be empty";
        }
    }

    public static String shortestWord(String input) {
        String output = "";
        if (input.length() > 0) {
            input=input.trim();
            String[] temp = input.split(" ");
            output = temp[0];
            for (int i = 0; i < temp.length; i++) {
                if (temp[i].length() < output.length()) {
                    output = temp[i];
                }
            }
            return output + " and its length is " + output.length() + " character(s)";
        } else {
            return "Input cannot be empty";
        }
    }
}

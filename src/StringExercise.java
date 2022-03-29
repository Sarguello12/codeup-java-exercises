public class StringExercise {
    public static void main (String[] args){
        String doNotNeed = "We don't need no education";
        System.out.println(doNotNeed + '\n' + doNotNeed.replace("education", "thought control"));

        String wQuotes = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(wQuotes);

        String windows = "In windows, the main drive is usually C:|";
        System.out.println(windows.replace("|", "\\"));

        String slashes = "I can do backslashes |, double backslashes ||, " + '\n' + "and the amazing triple backslash |||!";
        System.out.println(slashes.replace("|", "\\"));
    }
}

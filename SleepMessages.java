public class SleepMessages {
    public static void main(String args[])
        throws InterruptedException {
        String importantInfo[] = {
            "Sayan eat goats",
            "Sayan loves his akroats",
            "goats have bigger lamp than Sayan",
            "Sayan has a sed lyf"
        };

        for (int i = 0;
             i < importantInfo.length;
             i++) {
            //Pause for 4 seconds
            Thread.sleep(2000);
            //Print a message
            System.out.println(importantInfo[i]);
        }
    }
}
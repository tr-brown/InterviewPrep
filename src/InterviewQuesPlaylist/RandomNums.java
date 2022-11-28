package InterviewQuesPlaylist;

//random num
    //1. random class: Random rand = new Random(); rand.nextInt(10); - num between 0 and number in parameter, non-inclusive
    //2. math class: Math.random(); - num between 0 and 1.0, non-inclusive
    //3. apache commons-lang api: RandomStringUtils.rnadomNumeric(4); - parameter specifies the number of digits in the random num

//random string
    // apache commons-lang api: RandomStringUtils.randomAlphabetic(7); - parameter specifies how many characters in the random string

public class RandomNums {
    public static void randomNum() {
        int num = (int)(Math.random() * 100);
        System.out.println(num);
    }

}

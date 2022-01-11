package baitap.FizzBuzz;

public class FizzBuzz {
    private int num;

    public FizzBuzz(int num) {
        this.num = num;
    }

    public FizzBuzz() {
    }

    public static String hangChuc(int num) {
        String hangChucWord = "";
        switch (num) {
            case 2:
                hangChucWord = "twenty";
                break;
            case 3:
                hangChucWord = "thirty";
                break;
            case 4:
                hangChucWord = "forty";
                break;
            case 5:
                hangChucWord = "fifty";
                break;
            case 6:
                hangChucWord = "sixty";
                break;
            case 7:
                hangChucWord = "seventy";
                break;
            case 8:
                hangChucWord = "eighty";
                break;
            case 9:
                hangChucWord = "ninety";
                break;
        }
        return hangChucWord;
    }

    public static String donVi(int num) {
        String donViWord = "";
        switch (num) {
            case 1:
                donViWord = "one";
                break;
            case 2:
                donViWord = "two";
                break;
            case 3:
                donViWord = "three";
                break;
            case 4:
                donViWord = "four";
                break;
            case 5:
                donViWord = "five";
                break;
            case 6:
                donViWord = "six";
                break;
            case 7:
                donViWord = "seven";
                break;
            case 8:
                donViWord = "eight";
                break;
            case 9:
                donViWord = "nine";
                break;
            case 10:
                donViWord = "ten";
                break;
            case 11:
                donViWord = "eleven";
                break;
            case 12:
                donViWord = "twelve";
                break;
            case 13:
                donViWord = "thirteen";
                break;
            case 14:
                donViWord = "fourteen";
                break;
            case 15:
                donViWord = "fifteen";
                break;
            case 16:
                donViWord = "sixteen";
                break;
            case 17:
                donViWord = "seventeen";
                break;
            case 18:
                donViWord = "eighteen";
                break;
            case 19:
                donViWord = "nineteen";
                break;
        }
        return donViWord;
    }

    public static void getWord(int num) {
        int hangChuc = num / 10;
        int hangDonVi = num % 10;
        if (num < 0 || num > 99) {
            System.out.println("Nhập sai rồi, không đọc được đâu");
        } else if (num == 0) {
            System.out.println("zero");
        } else if (num < 20) {
            String word = donVi(num);
            System.out.println(word);
        } else {
            String word;
            if (hangChuc == 1) {
                word = donVi(num);
            } else {
                word = hangChuc(hangChuc) + " - " + donVi(hangDonVi);
            }
            System.out.println(word);
        }
    }

    public static String getResult(int num) {
        String str = "";
        int hangChuc = num / 10;
        int hangDonVi = num % 10;
        if (num % 15 == 0) {
            str = "FizzBuzz";
        } else if (num % 3 == 0 || hangChuc == 3 || hangDonVi == 3) {
            str = "Fizz";
        } else if (num % 5 == 0 || hangChuc == 5 || hangDonVi == 5) {
            str = "Buzz";
        }
        return str;
    }
}

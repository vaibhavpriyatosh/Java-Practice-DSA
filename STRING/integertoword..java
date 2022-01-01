class integertoword {
    String convertToWords(long n) {
        // code here
        String out="";
        out += numToWords(((int)n / 10000000), "crore ");
        out += numToWords((((int)n / 100000) % 100), "lakh ");
        out += numToWords((((int)n / 1000) % 100), "thousand ");
        out += numToWords((((int)n / 100) % 10), "hundred ");
        if (n > 100 && (n % 100 != 0)){
            out += "and ";
        }
        out += numToWords(((int)n % 100), "");
        return out;
    }
    String numToWords(int n, String s){
        String one[] = { "", "one ", "two ", "three ", "four ",
                 "five ", "six ", "seven ", "eight ",
                 "nine ", "ten ", "eleven ", "twelve ",
                 "thirteen ", "fourteen ", "fifteen ",
                 "sixteen ", "seventeen ", "eighteen ",
                 "nineteen " };
        String ten[] = { "", "", "twenty ", "thirty ", "forty ",
                 "fifty ", "sixty ", "seventy ", "eighty ",
                 "ninety " };
        String str = "";
        if(n>19){
            str += ten[n / 10] + one[n % 10];
        }
        else{
            str += one[n];
        }
        if(n != 0){
            str += s;
        }
        return str;
    }
}
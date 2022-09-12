
public class armStrong{

    public static void main(String[] args) {
        int n=464464,c=0,j=0,g,r;
        g=n;
        for(;g!=0;g/=10,++c);
        g=n;
        for(;g!=0;g/=10){
            r=g%10;
            j+=Math.pow(r, c);
        }
        System.out.println((n==j)?"armStrong":"not Armstrong");
        // int number = 1634, originalNumber, remainder, result = 0, n = 0;

        // originalNumber = number;

        // for (;originalNumber != 0; originalNumber /= 10, ++n);

        // originalNumber = number;

        // for (;originalNumber != 0; originalNumber /= 10)
        // {
        //     remainder = originalNumber % 10;
        //     result += Math.pow(remainder, n);
        // }
        // System.out.println(result);

    }
}
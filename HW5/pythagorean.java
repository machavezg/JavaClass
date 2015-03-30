/**
 * Miguel A. Chavez 2037320
 * CIS182
 */
public class pythagorean {
    public static void main(String[] args) {
        int a, b, c;
        for(a = 1; a <= 500; a++){
            for(b = 1; b <= 500; b++){
                for(c = 1; c <= 500; c++){
                    if((a*a)+(b*b) == (c*c)){
                        System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
                    }
                }
            }
        }
    }    
}

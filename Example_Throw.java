public class Example_Throw {
    public static void main(String[] args) {
        int age = 21;
        if (age>=21){
            throw new Eligibale("you are elligibalfor voting");
        }else {
            throw new NotEligibale("you rae not elligibale for the voting");
        }
    }
}
class NotEligibale extends RuntimeException{
    public NotEligibale (String msg){
        super(msg);
    }
}

class Eligibale extends RuntimeException{
    public Eligibale (String msg){
        super(msg);
    }
}
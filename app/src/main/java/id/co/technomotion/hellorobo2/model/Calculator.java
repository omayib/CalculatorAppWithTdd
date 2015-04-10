package id.co.technomotion.hellorobo2.model;

/**
 * Created by omayib on 4/6/15.
 */
public class Calculator {

    public Operand calculate(double firstInput) {
        return new Operand(firstInput);
    }

    public class Operand{
        private double first;

        public Operand(double first) {
            this.first = first;
        }
        public String addBy(double secondInput){
            return String.valueOf(first+secondInput);
        }
        public String substractBy(double secondInput){
            return String.valueOf(first-secondInput);
        }
        public String multiplyBy(double secondInput){
            return String.valueOf(first*secondInput);
        }
        public String divideBy(double secondInput){
            return String.valueOf(first/secondInput);
        }
    }


}

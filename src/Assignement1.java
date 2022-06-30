public class Assignement1 {

        /*
         * აბრუნებს გადმოცემული ორი რიცხვის ჯამს
         */
        private static int sum(int firstNum, int secondNum) {
            return firstNum + secondNum;
        }

        /*
         * აბრუნებს გადმოცემული ორი რიცხვის სხვაობას
         */
        private static int substraction(int firstNum, int secondNum) {
            return firstNum - secondNum;
        }

        /*
         * აბრუნებს გადმოცემული ორი რიცხვის ნამრავლს
         */
        private static int multiply(int firstNum, int secondNum) {
            return firstNum * secondNum;
        }

        /*public class Assignment1 {
         * აბრუნებს გადმოცემული ორი რიცხვის განაყოფს
         */
        private static int divide(int firstNum, int secondNum) {
            return firstNum / secondNum;
        }
        private static void printSumResult() {
            int jami = sum(10, 5);
            System.out.println("შემოყვანილი ორი რიცხვის ჯამია: " + jami);
        }

        private static void printSubtractionResult() {
            int sxvaoba = substraction(10, 5);
            System.out.println("შემოყვანილი ორი რიცხვის სხვაობაა: " + sxvaoba);
        }

        private static void printMultiplyResult() {
            int namravli = multiply(10, 5);
            System.out.println("შემოყვანილი ორი რიცხვის ნამრავლია: " + namravli);
        }

        private static void printDivideResult() {
            int ganayofi = divide(10, 5);
            System.out.println("შემოყვანილი ორი რიცხვის განაყოფია: " + ganayofi);
        }

        private static void printResult() {
            printSumResult();
            printSubtractionResult();
            printMultiplyResult();
            printDivideResult();
        }

        public static void main(String[] args) {
            printResult();
        }
    }



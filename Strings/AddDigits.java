/*
 * Provied an int "12345" Add up all its digits 1 + 2 + 3...
 * Until the sum is one digit (0-9)
*/
class AddDigits {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0){
            return 9;
        } else {
            return num % 9;
        }
    }
}

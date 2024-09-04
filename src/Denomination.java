public record Denomination(String name, double amt, String form, String img) {
    //Names of Denominations
    //Hundred Dollar note, Fifty-Dollar Note, Ten-Dollar Note, Five-Dollar Note, One-Dollar Note, Quarter, Dime, Nickel, Penny

    public String toString() {

        //form = this.form;

        //if (amt>=1.00) {
        //form = "bill";
        //return name + " " + amt + form + " " + img;
        // }
        //else{
        // form = "coin";
        return name + " " + amt + " " + form + " " + img;

    }
}

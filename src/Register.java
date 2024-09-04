public class Register {

    private static final Denomination[] guidelines = {
            new Denomination ("Hundred Dollar Bill", 100.0,"bill", "Hundred_Note.png"),
            new Denomination ("Fifty Dollar Bill", 50.0, "bill","Fifty_Note.png"),
            new Denomination ("Twenty Dollar Bill", 20.0, "bill","Twenty_Note.png"),
            new Denomination ("Ten Dollar Bill", 10.0, "bill","Ten_Note.png"),
            new Denomination ("Five Dollar Bill", 5.0, "bill","Five_Note.png"),
            new Denomination ("One Dollar Bill", 1.0, "bill","One_Note.png"),
            new Denomination ("Quarter", 0.25, "coin","quarter.png"),
            new Denomination ("Dime", 0.10, "coin","dime.png"),
            new Denomination ("Nickel", 0.05, "coin","nickel.png"),
            new Denomination ("Penny", 0.01, "coin","penny.png")

    };

    /*Logic is the same for each of the calculations below. If the total amount is more than the denomination of the bill,
    the amount is divided by the denomination. count truncates the amount into a set even number of bills. count represents quantity. The number of bills of each denomination
    subtracted from the total amount gives the amount to pass to the next denomination.
     */
    public Purse makeChange(double amt) {
        Purse purseObj = new Purse();
        if (amt >= 100.00){
            int count = (int)(amt / 100.00);
            purseObj.add(new Denomination ("Hundred Dollar Bill", 100.0,"bill", "Hundred_Note.png"), count);
            amt = amt - (count*100.00);
        }
        if (amt >= 50.00 && amt < 100.00){
            int count = (int)(amt / 50.00);
            purseObj.add(new Denomination ("Fifty Dollar Bill", 50.0, "bill","Fifty_Note.png"), count);
            amt = amt - (count*50.00);
        }
        if (amt >= 20.00 && amt <50.00){
            int count = (int)(amt / 20.00);
            purseObj.add(new Denomination ("Twenty Dollar Bill", 20.0, "bill","Twenty_Note.png"), count);
            amt = amt - (count*20.00);
        }
        if (amt >= 10.00 && amt <20.00){
            int count = (int)(amt / 10.00);
            purseObj.add(new Denomination ("Ten Dollar Bill", 10.0, "bill","Ten_Note.png"), count);
            amt = amt - (count*10.00);
        }
        if (amt >= 5.00 && amt <10.00){
            int count = (int)(amt / 5.00);
            purseObj.add(new Denomination ("Five Dollar Bill", 5.0, "bill","Five_note.png"), count);
            amt = amt - (count*5.00);
        }
        if (amt >= 1.00 && amt <5.00){
            int count = (int)(amt);
            purseObj.add(new Denomination ("One Dollar Bill", 1.0, "bill","one_note.png"), count);
            amt = amt - (count*1.00);
        }
        if (amt >= 0.25 && amt <1.00){
            int count = (int)(amt / 0.25);
            purseObj.add(new Denomination ("Quarter", 0.25, "coin","quarter.png"), count);
            amt = amt - (count*0.25);
        }
        if (amt >= 0.10 && amt <0.25){
            int count = (int)(amt / 0.10);
            purseObj.add(new Denomination ("Dime", 0.10, "coin","dime.png"), count);
            amt = amt - (count*0.10);
        }
        if (amt >= 0.05 && amt <0.10){
            int count = (int)(amt / 0.05);
            purseObj.add(new Denomination ("Nickel", 0.05, "coin","nickel.png"), count);
            amt = amt - (count*0.05);
        }
        if (amt >= 0.0001 && amt <0.05){
            int count = (int)(amt / 0.01);
            purseObj.add(new Denomination ("Penny", 0.01, "coin","penny.png"), count);
            amt = amt - (count*0.01);
        }
        if (amt >= 0.005){
            purseObj.add(new Denomination ("Penny", 0.01, "coin","penny.png"), 1);
        }





        return purseObj;
    }
}
package patterns.structural.adaptor;

public class client {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rPeg = new RoundPeg(5);
        if(hole.fits(rPeg)){
            System.out.println("Round Peg R5 fits hole R5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        //! hole.fits(smallSqPeg) //won't compile

        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSqPeg);
        if(hole.fits(smallAdapter)){
            System.out.println("small square fits the hole");
        }

    }
}

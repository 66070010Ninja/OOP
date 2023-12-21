public class Fraction {
    public int topN;
    public int btmN;

    public String toFraction() {
        String num = topN+"/"+btmN;
        return num;
    }

    public String toFloat() {
        double topB = (double)topN;
        double btmB = (double)btmN;
        String num = Double.toString(topB/btmB);
        return num;
    }

    public void addFraction(Fraction f) {
        if (btmN == f.btmN) {
            topN = topN + f.topN;
            btmN = f.btmN;
        }
        else {
            topN = topN*f.btmN+f.topN*btmN;
            btmN = btmN*f.btmN;
        }
    }

    public boolean myEquals(Fraction x) {
        double topB = (double)topN;
        double btmB = (double)btmN;
        double topC = (double)x.topN;
        double btmC = (double)x.btmN;
        if (topB/btmB == topC/btmC) {
            return true;
        }
        else {
            return false;
        }
    }

    public void LowestTermFrac() {
        double topB = (double)topN;
        double btmB = (double)btmN;
        if (btmB%topB == 0) {
            for (int i = topN; i != 0; i--) {
                double j = (double)i;
                if ((topB%j == 0)&&(btmB%j == 0)) {
                    topN = (int)(topB/j);
                    btmN = (int)(btmB/j);
                    break;
                }
            }
        }
    }
}

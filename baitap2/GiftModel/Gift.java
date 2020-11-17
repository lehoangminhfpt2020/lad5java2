package java2.lad5.baitap2.GiftModel;

public class Gift {
    private int GID;
    private String Gname;
    private double GPrice;
    private int Gqty;

    public Gift(int GID, String Gname,double GPrice, int Gqty){
        this.GID=GID;
        this.Gname=Gname;
        this.GPrice=GPrice;
        this.Gqty=Gqty;
    }
    public Gift() {
        this.GID = 0;
        this.Gname = "";
        this.GPrice = 0;
        this.Gqty = 0;
    }

    public int getGID() {
        return GID;
    }

    public void setGID(int GID) {
        this.GID = GID;
    }

    public String getGname() {
        return Gname;
    }

    public void setGname(String gname) {
        Gname = gname;
    }

    public double getGPrice() {
        return GPrice;
    }

    public void setGPrice(double GPrice) {
        this.GPrice = GPrice;
    }

    public int getGqty() {
        return Gqty;
    }

    public void setGqty(int Gqty) {
        Gqty = Gqty;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "GID=" + GID +
                ", Gname='" + Gname + '\'' +
                ", GPrice=" + GPrice +
                ", Gqty=" + Gqty +
                '}';
    }
}

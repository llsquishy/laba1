package breakfast;

public class Coffee extends Food {
    String aroma;

    public Coffee(String aroma) {
        super("Кофе");
        this.aroma = aroma;
    }

    @Override
    public void consume() {
        System.out.println(this + "выпит");
    }

    public String GetNameAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Coffee))
                return false;
            return aroma.equals(((Coffee) arg0).aroma);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " аромата '" + aroma.toUpperCase() + "'";
    }
}

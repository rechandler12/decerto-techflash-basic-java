class Static {
    public static void main(String[] args) {
        PoleFigury poleFigury = new Trojkat(2);

        prostokat.setA(3);
        prostokat.setB(4);

        System.out.println("pole powierzchni figury: " + prostokat.getPole());
    }
}

interface PoleFigury {
    double getPole();
}

interface ObwodFigury {
    double getObwod();
}

class Trojkat implements PoleFigury, ObwodFigury {
    private final int a;
    private final int h;

    Trojkat(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getPole() {
        return 0.5 * a * h;
    }
}

class Prostokat extends Figura {
    private int a;
    private int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPole() {
        return a * b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}

class Kwadrat extends Prostokat {

    public Kwadrat(int a) {
        super(a, a);
    }
}

class Kolo extends Figura {
    private final int r;

    Kolo(int r) {
        this.r = r;
    }

    @Override
    double getPole() {
        return Math.PI * Math.pow(r, 2);
    }
}

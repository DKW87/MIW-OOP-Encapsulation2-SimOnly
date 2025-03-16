package Model;

public class Verbruik {

    private static final double BASIS_KOSTEN = 9.95;
    private static final int VERBRUIK_ABONNEMENT = 3000;
    private static final double MEERPRIJS_MB = 0.025;
    private String maand;
    private int hoeveelheidMb;
    private double kosten;

    public Verbruik(String maand, int hoeveelheidMb) {
        this.maand = maand;
        this.hoeveelheidMb = hoeveelheidMb;
        this.kosten = this.berekenKosten();
    }

    public Verbruik(String maand) {
        this(maand, 0);
    }

    public Verbruik() {
        this("Onbekend");
    }

    public double berekenKosten() {
        double maandelijkseKosten = BASIS_KOSTEN;

        if (this.hoeveelheidMb > VERBRUIK_ABONNEMENT) {
            maandelijkseKosten = BASIS_KOSTEN + ((this.hoeveelheidMb - VERBRUIK_ABONNEMENT) * MEERPRIJS_MB);
        }

        return maandelijkseKosten;
    }

    public void toonVerbruik() {

        if (this.hoeveelheidMb > VERBRUIK_ABONNEMENT) {
            System.out.printf("%-10s %7d %7.2f %20s %n", this.maand, this.hoeveelheidMb, this.kosten, "buiten je bundel!");
        } else {
            System.out.printf("%-10s %7d %7.2f %n", this.maand, this.hoeveelheidMb, this.kosten);
        }

    }

    public String getMaand() {
        return maand;
    }

    public void setHoeveelheidMb(int hoeveelheidMb) {
        this.hoeveelheidMb = hoeveelheidMb;
        this.kosten = this.berekenKosten();
    }

}

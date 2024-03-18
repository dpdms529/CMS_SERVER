package jbnu.it.cms.domain.entity;

public enum GpType {
    APlus("A+"),
    A("A"),
    BPlus("B+"),
    B("B"),
    CPlus("C+"),
    C("C"),
    DPlus("D+"),
    D("D"),
    Pass("P"),
    Fail("F");

    private String gp;

    GpType(String gp) {
        this.gp = gp;
    }

    public String getGp() {
        return gp;
    }
}

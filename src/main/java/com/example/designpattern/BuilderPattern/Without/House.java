package com.example.designpattern.BuilderPattern.Without;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarden;
    private boolean hasGarage;
    private boolean hasSwimmingPool;


    // Messy Constructor
    public House(String foundation, String structure, String roof, boolean hasGarden, boolean hasGarage, boolean hasSwimmingPool) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.hasGarden = hasGarden;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House {" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarden=" + hasGarden +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }


}

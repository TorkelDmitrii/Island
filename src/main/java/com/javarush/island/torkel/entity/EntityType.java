package com.javarush.island.torkel.entity;

public enum EntityType {
    BEAR("Медведь", "\uD83D\uDC3B", 500, 5, 2, 80),
    BOA("Удав", "\uD83D\uDC0D", 15, 30, 1, 3),
    BOAR("Кабан", "\uD83D\uDC17", 400, 50, 2, 50),
    BUFFALO("Буйвол", "\uD83D\uDC03", 700, 10, 3, 100),
    CATERPILLAR("Гусеница", "\uD83D\uDC1B", 0.01, 1000, 0, 0),
    DEER("Олень", "\uD83E\uDD8C", 300, 20, 4, 50),
    DUCK("Утка", "\uD83E\uDD86", 1, 200, 4, 0.15),
    EAGLE("Орёл", "\uD83E\uDD85", 6, 20, 3, 1),
    FOX("Лиса", "\uD83E\uDD8A", 8, 30, 2, 2),
    GOAT("Коза", "\uD83D\uDC10", 60, 140, 3, 10),
    HORSE("Лошадь", "\uD83D\uDC0E", 400, 20, 4, 60),
    MOUSE("Мышь", "\uD83D\uDC01", 0.05, 500, 1, 0.01),
    PLANT("Растения", "\uD83C\uDF40", 1, 200, 0, 0),
    RABBIT("Кролик", "\uD83D\uDC07", 2, 150, 2, 0.45),
    SHEEP("Овца", "\uD83D\uDC11", 70, 140, 3, 15),
    WOLF("Волк", "\uD83D\uDC3A", 50, 30, 3, 8);

    private final double maxWeight;
    private final int maxCount;
    private final int maxSpeed;
    private final double maxFood;
    private String name;
    private String icon;

    EntityType(String name, String icon, double maxWeight, int maxCount, int maxSpeed, double maxFood) {
        this.name = name;
        this.icon = icon;
        this.maxWeight = maxWeight;
        this.maxCount = maxCount;
        this.maxSpeed = maxSpeed;
        this.maxFood = maxFood;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxFood() {
        return maxFood;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }


}

package com.geektech;

public class Chair {
    private String material;
    private double height;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            System.out.println("Ошибка знчения");
            this.height = generateHeight();
        }else {
            this.height = height;
        }
    }

    private double generateHeight(){
        return 1;
    }
}


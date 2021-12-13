package com.company;

public class Vectors {
    private Double x;
    private Double y;
    private Double z;
    private Double vectorLength;
    private Double vector1[] = new Double[2];
    private Double vector2[] = new Double[2];
    private Double scalarProduct;
    private Double vectorsProduct;
    private Double vectorsProductX;
    private Double vectorsProductY;
    private Double vectorsProductZ;
    private Double cosCorner;
    private Double vectorSum[] = new Double[2];
    private Double vectorDifference[] = new Double[2];
    private int numberVectors;
    private Double randomVectors[][];

    public Vectors(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.vectorLength = Math.sqrt((x * x) + (y * y) + (z * z));

    }

    public Double GetVectorLength(){
        return this.vectorLength;
   }

    public Double GetScalarProduct(){
        return scalarProduct;
    }

    public Double GetVectorsProduct(){
        return vectorsProduct;
    }

    public Double GetCosCorner(){
        return cosCorner;
    }

    public Double[] GetVectorSum(){
        return vectorSum;
    }

    public Double[] GetVectorDifference(){
        return vectorDifference;
    }

    public Double[][] GetRandomsVector(){
        return randomVectors;
    }

    public void VectorsProduct(Double vector1[], Double vector2[]) {
        vectorsProductX = ((vector1[1] * vector2[2]) - (vector1[2] * vector2[1]));
        vectorsProductY = ((vector1[0] * vector2[2]) - (vector1[2] * vector2[0]));
        vectorsProductZ = ((vector1[0] * vector2[1]) - (vector1[1] * vector2[0]));
        vectorsProduct = Math.sqrt((vectorsProductX * vectorsProductX) + (vectorsProductY * vectorsProductY) +
                + (vectorsProductZ * vectorsProductZ));
    }

    public void ScalarProduct(Double vector1[], Double vector2[]) {
        scalarProduct = ((vector1[0] * vector2[0]) + (vector1[1] * vector2[1]) + (vector1[2] * vector2[2]));
    }

    public  void  CornerBetweenVectors(Double vector1[], Double vector2[]){
        cosCorner = scalarProduct / ( Math.sqrt((vector1[0] * vector1[0]) + (vector1[1] * vector1[1]) +
                + (vector1[2] * vector1[2])) * Math.sqrt((vector2[0] * vector2[0]) + (vector2[1] * vector2[1]) +
                + (vector2[2] * vector2[2])));
    }

    public void VectorSum(Double vector1[], Double vector2[]){
        vectorSum[0] = vector1[0] + vector2[0];
        vectorSum[1] = vector1[1] + vector2[1];
        vectorSum[2] = vector1[2] + vector2[2];
    }

    public void VectorDifference(Double vector1[], Double vector2[]){
        vectorDifference[0] = vector1[0] - vector2[0];
        vectorDifference[1] = vector1[1] - vector2[1];
        vectorDifference[2] = vector1[2] - vector2[2];
    }

    public static void VectorsRandom(int numberVectors){
         Double randomVectors[][] = new Double[numberVectors][2];

        for (int i = 0; i < numberVectors; i++) {
            for (int j = 0; j < 3; j++) {
                randomVectors[i][j] = (Math.random() * (100));
            }
        }
    }
}

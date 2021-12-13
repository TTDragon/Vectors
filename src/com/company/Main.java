package com.company;

public class Main {

    public static void main(String[] args) {
	Vectors vectors = new Vectors(2.0, 5.0, 6.0 );
        //vectors.VectorsProduct();
    System.out.println(vectors.GetVectorLength());
    System.out.println(vectors.GetVectorsProduct());
    System.out.println(vectors.GetScalarProduct());
    System.out.println(vectors.GetCosCorner());
    System.out.println(vectors.GetVectorSum());
    System.out.println(vectors.GetVectorDifference());
    }
}

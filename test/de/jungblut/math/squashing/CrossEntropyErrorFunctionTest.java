package de.jungblut.math.squashing;

import junit.framework.TestCase;

import org.junit.Test;

import de.jungblut.math.DoubleMatrix;
import de.jungblut.math.dense.DenseDoubleMatrix;

public class CrossEntropyErrorFunctionTest extends TestCase {
  @Test
  public void testSoftmaxError() {
    DoubleMatrix y = new DenseDoubleMatrix(new double[][] {
        { 0d, 1d, 0.5d, 1d, 0.2d }, { 1d, 0d, 0.5d, 0d, 0.8d } });
    DoubleMatrix hypothesis = new DenseDoubleMatrix(new double[][] {
        { 0d, 0d, 0d, 1d, 0d }, { 1d, 1d, 1d, 0d, 0d } });
    double error = new CrossEntropyErrorFunction()
        .calculateError(y, hypothesis);
    assertEquals(25d, error);
  }

}

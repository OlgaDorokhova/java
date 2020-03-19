/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.linalg.sparse;

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.family.TNumber;
import org.tensorflow.types.family.TType;

/**
 * Calculates the gradient of the SparseMatrixSoftmax op.
 */
@Operator(group = "linalg.sparse")
public final class SparseMatrixSoftmaxGrad extends PrimitiveOp implements Operand<TType> {
  
  /**
   * Factory method to create a class wrapping a new SparseMatrixSoftmaxGrad operation.
   * 
   * @param scope current scope
   * @param softmax A CSRSparseMatrix.
   * @param gradSoftmax The gradient of `softmax`.
   * @param type 
   * @return a new instance of SparseMatrixSoftmaxGrad
   */
  @Endpoint(describeByClass = true)
  public static <T extends TNumber> SparseMatrixSoftmaxGrad create(Scope scope, Operand<?> softmax, Operand<?> gradSoftmax, DataType<T> type) {
    OperationBuilder opBuilder = scope.env().opBuilder("SparseMatrixSoftmaxGrad", scope.makeOpName("SparseMatrixSoftmaxGrad"));
    opBuilder.addInput(softmax.asOutput());
    opBuilder.addInput(gradSoftmax.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("type", type);
    return new SparseMatrixSoftmaxGrad(opBuilder.build());
  }
  
  /**
   * The output gradient.
   */
  public Output<?> gradient() {
    return gradient;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<TType> asOutput() {
    return (Output<TType>) gradient;
  }
  
  private Output<?> gradient;
  
  private SparseMatrixSoftmaxGrad(Operation operation) {
    super(operation);
    int outputIdx = 0;
    gradient = operation.output(outputIdx++);
  }
}
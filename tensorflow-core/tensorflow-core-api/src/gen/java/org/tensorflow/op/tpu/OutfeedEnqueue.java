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

package org.tensorflow.op.tpu;

import java.util.Arrays;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.family.TType;

/**
 * Enqueue a Tensor on the computation outfeed.
 */
public final class OutfeedEnqueue extends RawOp {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "OutfeedEnqueue";

  private OutfeedEnqueue(Operation operation) {
    super(operation);
  }

  /**
   * Factory method to create a class wrapping a new OutfeedEnqueue operation.
   *
   * @param scope current scope
   * @param input A tensor that will be inserted into the outfeed queue.
   * @return a new instance of OutfeedEnqueue
   */
  @Endpoint(
      describeByClass = true
  )
  public static OutfeedEnqueue create(Scope scope, Operand<? extends TType> input) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "OutfeedEnqueue");
    opBuilder.addInput(input.asOutput());
    return new OutfeedEnqueue(opBuilder.build());
  }

  public static class Inputs extends RawOpInputs<OutfeedEnqueue> {
    /**
     * A tensor that will be inserted into the outfeed queue.
     */
    public final Operand<? extends TType> input;

    /**
     * The dtype attribute
     */
    public final DataType dtype;

    public Inputs(GraphOperation op) {
      super(new OutfeedEnqueue(op), op, Arrays.asList("dtype"));
      int inputIndex = 0;
      input = (Operand<? extends TType>) op.input(inputIndex++);
      dtype = op.attributes().getAttrType("dtype");
    }
  }
}

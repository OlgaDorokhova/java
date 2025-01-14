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
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;

/**
 * Shuts down a running distributed TPU system.
 * The op returns an error if no system is running.
 */
public final class ShutdownDistributedTPU extends RawOp {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "ShutdownDistributedTPU";

  private ShutdownDistributedTPU(Operation operation) {
    super(operation);
  }

  /**
   * Factory method to create a class wrapping a new ShutdownDistributedTPU operation.
   *
   * @param scope current scope
   * @return a new instance of ShutdownDistributedTPU
   */
  @Endpoint(
      describeByClass = true
  )
  public static ShutdownDistributedTPU create(Scope scope) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "ShutdownDistributedTPU");
    return new ShutdownDistributedTPU(opBuilder.build());
  }

  public static class Inputs extends RawOpInputs<ShutdownDistributedTPU> {
    public Inputs(GraphOperation op) {
      super(new ShutdownDistributedTPU(op), op, Arrays.asList());
      int inputIndex = 0;
    }
  }
}

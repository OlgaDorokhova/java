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

package org.tensorflow.op.train;

import java.util.Arrays;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.family.TType;

/**
 * Update '*var' by subtracting 'alpha' * 'delta' from it.
 */
@Operator(
    group = "train"
)
public final class ResourceApplyGradientDescent extends RawOp {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "ResourceApplyGradientDescent";

  private ResourceApplyGradientDescent(Operation operation) {
    super(operation);
  }

  /**
   * Factory method to create a class wrapping a new ResourceApplyGradientDescent operation.
   *
   * @param scope current scope
   * @param var Should be from a Variable().
   * @param alpha Scaling factor. Must be a scalar.
   * @param delta The change.
   * @param options carries optional attribute values
   * @param <T> data type for {@code ResourceApplyGradientDescent} output and operands
   * @return a new instance of ResourceApplyGradientDescent
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> ResourceApplyGradientDescent create(Scope scope,
      Operand<? extends TType> var, Operand<T> alpha, Operand<T> delta, Options... options) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "ResourceApplyGradientDescent");
    opBuilder.addInput(var.asOutput());
    opBuilder.addInput(alpha.asOutput());
    opBuilder.addInput(delta.asOutput());
    if (options != null) {
      for (Options opts : options) {
        if (opts.useLocking != null) {
          opBuilder.setAttr("use_locking", opts.useLocking);
        }
      }
    }
    return new ResourceApplyGradientDescent(opBuilder.build());
  }

  /**
   * Sets the useLocking option.
   *
   * @param useLocking If {@code True}, the subtraction will be protected by a lock;
   * otherwise the behavior is undefined, but may exhibit less contention.
   * @return this Options instance.
   */
  public static Options useLocking(Boolean useLocking) {
    return new Options().useLocking(useLocking);
  }

  /**
   * Optional attributes for {@link org.tensorflow.op.train.ResourceApplyGradientDescent}
   */
  public static class Options {
    private Boolean useLocking;

    private Options() {
    }

    /**
     * Sets the useLocking option.
     *
     * @param useLocking If {@code True}, the subtraction will be protected by a lock;
     * otherwise the behavior is undefined, but may exhibit less contention.
     * @return this Options instance.
     */
    public Options useLocking(Boolean useLocking) {
      this.useLocking = useLocking;
      return this;
    }
  }

  public static class Inputs<T extends TType> extends RawOpInputs<ResourceApplyGradientDescent> {
    /**
     * Should be from a Variable().
     */
    public final Operand<? extends TType> var;

    /**
     * Scaling factor. Must be a scalar.
     */
    public final Operand<T> alpha;

    /**
     * The change.
     */
    public final Operand<T> delta;

    /**
     * The T attribute
     */
    public final DataType T;

    /**
     * If `True`, the subtraction will be protected by a lock;
     * otherwise the behavior is undefined, but may exhibit less contention.
     */
    public final boolean useLocking;

    public Inputs(GraphOperation op) {
      super(new ResourceApplyGradientDescent(op), op, Arrays.asList("T", "use_locking"));
      int inputIndex = 0;
      var = (Operand<? extends TType>) op.input(inputIndex++);
      alpha = (Operand<T>) op.input(inputIndex++);
      delta = (Operand<T>) op.input(inputIndex++);
      T = op.attributes().getAttrType("T");
      useLocking = op.attributes().getAttrBool("use_locking");
    }
  }
}

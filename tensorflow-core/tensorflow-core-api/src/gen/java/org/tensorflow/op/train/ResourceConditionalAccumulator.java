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
import org.tensorflow.Output;
import org.tensorflow.ndarray.Shape;
import org.tensorflow.op.Operands;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.family.TType;

/**
 * A conditional accumulator for aggregating gradients.
 * The accumulator accepts gradients marked with local_step greater or
 * equal to the most recent global_step known to the accumulator. The
 * average can be extracted from the accumulator, provided sufficient
 * gradients have been accumulated. Extracting the average automatically
 * resets the aggregate to 0, and increments the global_step recorded by
 * the accumulator.
 * This is a resource version of ConditionalAccumulator that will work in TF2.0
 * with tf.cond version 2.
 */
public final class ResourceConditionalAccumulator extends RawOp implements Operand<TType> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "ResourceConditionalAccumulator";

  private Output<? extends TType> handle;

  @SuppressWarnings("unchecked")
  private ResourceConditionalAccumulator(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new ResourceConditionalAccumulator operation.
   *
   * @param scope current scope
   * @param dtype The type of the value being accumulated.
   * @param shape The shape of the values, can be [], in which case shape is unknown.
   * @param options carries optional attribute values
   * @param <T> data type for {@code ResourceConditionalAccumulator} output and operands
   * @return a new instance of ResourceConditionalAccumulator
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> ResourceConditionalAccumulator create(Scope scope, Class<T> dtype,
      Shape shape, Options... options) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "ResourceConditionalAccumulator");
    opBuilder.setAttr("dtype", Operands.toDataType(dtype));
    opBuilder.setAttr("shape", shape);
    if (options != null) {
      for (Options opts : options) {
        if (opts.container != null) {
          opBuilder.setAttr("container", opts.container);
        }
        if (opts.sharedName != null) {
          opBuilder.setAttr("shared_name", opts.sharedName);
        }
        if (opts.reductionType != null) {
          opBuilder.setAttr("reduction_type", opts.reductionType);
        }
      }
    }
    return new ResourceConditionalAccumulator(opBuilder.build());
  }

  /**
   * Sets the container option.
   *
   * @param container If non-empty, this accumulator is placed in the given container.
   * Otherwise, a default container is used.
   * @return this Options instance.
   */
  public static Options container(String container) {
    return new Options().container(container);
  }

  /**
   * Sets the sharedName option.
   *
   * @param sharedName If non-empty, this accumulator will be shared under the
   * given name across multiple sessions.
   * @return this Options instance.
   */
  public static Options sharedName(String sharedName) {
    return new Options().sharedName(sharedName);
  }

  /**
   * Sets the reductionType option.
   *
   * @param reductionType the reductionType option
   * @return this Options instance.
   */
  public static Options reductionType(String reductionType) {
    return new Options().reductionType(reductionType);
  }

  /**
   * Gets handle.
   * The handle to the accumulator.
   * @return handle.
   */
  public Output<? extends TType> handle() {
    return handle;
  }

  @Override
  @SuppressWarnings("unchecked")
  public Output<TType> asOutput() {
    return (Output<TType>) handle;
  }

  /**
   * Optional attributes for {@link org.tensorflow.op.train.ResourceConditionalAccumulator}
   */
  public static class Options {
    private String container;

    private String sharedName;

    private String reductionType;

    private Options() {
    }

    /**
     * Sets the container option.
     *
     * @param container If non-empty, this accumulator is placed in the given container.
     * Otherwise, a default container is used.
     * @return this Options instance.
     */
    public Options container(String container) {
      this.container = container;
      return this;
    }

    /**
     * Sets the sharedName option.
     *
     * @param sharedName If non-empty, this accumulator will be shared under the
     * given name across multiple sessions.
     * @return this Options instance.
     */
    public Options sharedName(String sharedName) {
      this.sharedName = sharedName;
      return this;
    }

    /**
     * Sets the reductionType option.
     *
     * @param reductionType the reductionType option
     * @return this Options instance.
     */
    public Options reductionType(String reductionType) {
      this.reductionType = reductionType;
      return this;
    }
  }

  public static class Inputs extends RawOpInputs<ResourceConditionalAccumulator> {
    /**
     * The type of the value being accumulated.
     */
    public final DataType dtype;

    /**
     * The shape of the values, can be [], in which case shape is unknown.
     */
    public final Shape shape;

    /**
     * If non-empty, this accumulator is placed in the given container.
     * Otherwise, a default container is used.
     */
    public final String container;

    /**
     * If non-empty, this accumulator will be shared under the
     * given name across multiple sessions.
     */
    public final String sharedName;

    /**
     * The reductionType attribute
     */
    public final String reductionType;

    public Inputs(GraphOperation op) {
      super(new ResourceConditionalAccumulator(op), op, Arrays.asList("dtype", "shape", "container", "shared_name", "reduction_type"));
      int inputIndex = 0;
      dtype = op.attributes().getAttrType("dtype");
      shape = op.attributes().getAttrShape("shape");
      container = op.attributes().getAttrString("container");
      sharedName = op.attributes().getAttrString("shared_name");
      reductionType = op.attributes().getAttrString("reduction_type");
    }
  }
}

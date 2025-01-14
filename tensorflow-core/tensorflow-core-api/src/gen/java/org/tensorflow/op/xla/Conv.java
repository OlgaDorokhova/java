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

package org.tensorflow.op.xla;

import java.util.Arrays;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.Operands;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.family.TNumber;
import org.tensorflow.types.family.TType;

/**
 * Wraps the XLA ConvGeneralDilated operator, documented at
 * https://www.tensorflow.org/performance/xla/operation_semantics#conv_convolution
 * .
 *
 * @param <W> data type for {@code output} output
 */
@Operator(
    group = "xla"
)
public final class Conv<W extends TType> extends RawOp implements Operand<W> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "XlaConvV2";

  private Output<W> output;

  private Conv(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new XlaConvV2 operation.
   *
   * @param scope current scope
   * @param lhs the input tensor
   * @param rhs the kernel tensor
   * @param windowStrides the inter-window strides
   * @param padding the padding to apply at the start and end of each input dimensions
   * @param lhsDilation dilation to apply between input elements
   * @param rhsDilation dilation to apply between kernel elements
   * @param featureGroupCount number of feature groups for grouped convolution.
   * @param dimensionNumbers a serialized xla::ConvolutionDimensionNumbers proto.
   * @param precisionConfig a serialized xla::PrecisionConfig proto.
   * @param preferredElementType The type of the tensor.
   * @param <W> data type for {@code XlaConvV2} output and operands
   * @param <V> data type for {@code XlaConvV2} output and operands
   * @return a new instance of Conv
   */
  @Endpoint(
      describeByClass = true
  )
  public static <W extends TType, V extends TNumber> Conv<W> create(Scope scope,
      Operand<? extends TType> lhs, Operand<? extends TType> rhs, Operand<V> windowStrides,
      Operand<V> padding, Operand<V> lhsDilation, Operand<V> rhsDilation,
      Operand<V> featureGroupCount, String dimensionNumbers, String precisionConfig,
      Class<W> preferredElementType) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "Conv");
    opBuilder.addInput(lhs.asOutput());
    opBuilder.addInput(rhs.asOutput());
    opBuilder.addInput(windowStrides.asOutput());
    opBuilder.addInput(padding.asOutput());
    opBuilder.addInput(lhsDilation.asOutput());
    opBuilder.addInput(rhsDilation.asOutput());
    opBuilder.addInput(featureGroupCount.asOutput());
    opBuilder.setAttr("dimension_numbers", dimensionNumbers);
    opBuilder.setAttr("precision_config", precisionConfig);
    opBuilder.setAttr("preferred_element_type", Operands.toDataType(preferredElementType));
    return new Conv<>(opBuilder.build());
  }

  /**
   * Gets output.
   *
   * @return output.
   */
  public Output<W> output() {
    return output;
  }

  @Override
  public Output<W> asOutput() {
    return output;
  }

  public static class Inputs<V extends TNumber> extends RawOpInputs<Conv<?>> {
    /**
     * the input tensor
     */
    public final Operand<? extends TType> lhs;

    /**
     * the kernel tensor
     */
    public final Operand<? extends TType> rhs;

    /**
     * the inter-window strides
     */
    public final Operand<V> windowStrides;

    /**
     * the padding to apply at the start and end of each input dimensions
     */
    public final Operand<V> padding;

    /**
     * dilation to apply between input elements
     */
    public final Operand<V> lhsDilation;

    /**
     * dilation to apply between kernel elements
     */
    public final Operand<V> rhsDilation;

    /**
     * number of feature groups for grouped convolution.
     */
    public final Operand<V> featureGroupCount;

    /**
     * The LhsT attribute
     */
    public final DataType LhsT;

    /**
     * The RhsT attribute
     */
    public final DataType RhsT;

    /**
     * The Tindices attribute
     */
    public final DataType Tindices;

    /**
     * a serialized xla::ConvolutionDimensionNumbers proto.
     */
    public final String dimensionNumbers;

    /**
     * a serialized xla::PrecisionConfig proto.
     */
    public final String precisionConfig;

    /**
     * The type of the tensor.
     */
    public final DataType preferredElementType;

    public Inputs(GraphOperation op) {
      super(new Conv<>(op), op, Arrays.asList("LhsT", "RhsT", "Tindices", "dimension_numbers", "precision_config", "preferred_element_type"));
      int inputIndex = 0;
      lhs = (Operand<? extends TType>) op.input(inputIndex++);
      rhs = (Operand<? extends TType>) op.input(inputIndex++);
      windowStrides = (Operand<V>) op.input(inputIndex++);
      padding = (Operand<V>) op.input(inputIndex++);
      lhsDilation = (Operand<V>) op.input(inputIndex++);
      rhsDilation = (Operand<V>) op.input(inputIndex++);
      featureGroupCount = (Operand<V>) op.input(inputIndex++);
      LhsT = op.attributes().getAttrType("LhsT");
      RhsT = op.attributes().getAttrType("RhsT");
      Tindices = op.attributes().getAttrType("Tindices");
      dimensionNumbers = op.attributes().getAttrString("dimension_numbers");
      precisionConfig = op.attributes().getAttrString("precision_config");
      preferredElementType = op.attributes().getAttrType("preferred_element_type");
    }
  }
}

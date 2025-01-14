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

package org.tensorflow.op.io;

import java.util.Arrays;
import java.util.List;
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
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.TInt64;
import org.tensorflow.types.TString;
import org.tensorflow.types.family.TType;

/**
 * Transforms a scalar brain.SequenceExample proto (as strings) into typed tensors.
 */
@Operator(
    group = "io"
)
public final class ParseSingleSequenceExample extends RawOp {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "ParseSingleSequenceExample";

  private List<Output<TInt64>> contextSparseIndices;

  private List<Output<?>> contextSparseValues;

  private List<Output<TInt64>> contextSparseShapes;

  private List<Output<?>> contextDenseValues;

  private List<Output<TInt64>> featureListSparseIndices;

  private List<Output<?>> featureListSparseValues;

  private List<Output<TInt64>> featureListSparseShapes;

  private List<Output<?>> featureListDenseValues;

  @SuppressWarnings("unchecked")
  private ParseSingleSequenceExample(Operation operation) {
    super(operation);
    int outputIdx = 0;
    int contextSparseIndicesLength = operation.outputListLength("context_sparse_indices");
    contextSparseIndices = Arrays.asList((Output<TInt64>[]) operation.outputList(outputIdx, contextSparseIndicesLength));
    outputIdx += contextSparseIndicesLength;
    int contextSparseValuesLength = operation.outputListLength("context_sparse_values");
    contextSparseValues = Arrays.asList(operation.outputList(outputIdx, contextSparseValuesLength));
    outputIdx += contextSparseValuesLength;
    int contextSparseShapesLength = operation.outputListLength("context_sparse_shapes");
    contextSparseShapes = Arrays.asList((Output<TInt64>[]) operation.outputList(outputIdx, contextSparseShapesLength));
    outputIdx += contextSparseShapesLength;
    int contextDenseValuesLength = operation.outputListLength("context_dense_values");
    contextDenseValues = Arrays.asList(operation.outputList(outputIdx, contextDenseValuesLength));
    outputIdx += contextDenseValuesLength;
    int featureListSparseIndicesLength = operation.outputListLength("feature_list_sparse_indices");
    featureListSparseIndices = Arrays.asList((Output<TInt64>[]) operation.outputList(outputIdx, featureListSparseIndicesLength));
    outputIdx += featureListSparseIndicesLength;
    int featureListSparseValuesLength = operation.outputListLength("feature_list_sparse_values");
    featureListSparseValues = Arrays.asList(operation.outputList(outputIdx, featureListSparseValuesLength));
    outputIdx += featureListSparseValuesLength;
    int featureListSparseShapesLength = operation.outputListLength("feature_list_sparse_shapes");
    featureListSparseShapes = Arrays.asList((Output<TInt64>[]) operation.outputList(outputIdx, featureListSparseShapesLength));
    outputIdx += featureListSparseShapesLength;
    int featureListDenseValuesLength = operation.outputListLength("feature_list_dense_values");
    featureListDenseValues = Arrays.asList(operation.outputList(outputIdx, featureListDenseValuesLength));
    outputIdx += featureListDenseValuesLength;
  }

  /**
   * Factory method to create a class wrapping a new ParseSingleSequenceExample operation.
   *
   * @param scope current scope
   * @param serialized A scalar containing a binary serialized SequenceExample proto.
   * @param featureListDenseMissingAssumedEmpty A vector listing the
   * FeatureList keys which may be missing from the SequenceExample.  If the
   * associated FeatureList is missing, it is treated as empty.  By default,
   * any FeatureList not listed in this vector must exist in the SequenceExample.
   * @param contextSparseKeys A list of Ncontext_sparse string Tensors (scalars).
   * The keys expected in the Examples' features associated with context_sparse
   * values.
   * @param contextDenseKeys A list of Ncontext_dense string Tensors (scalars).
   * The keys expected in the SequenceExamples' context features associated with
   * dense values.
   * @param featureListSparseKeys A list of Nfeature_list_sparse string Tensors
   * (scalars).  The keys expected in the FeatureLists associated with sparse
   * values.
   * @param featureListDenseKeys A list of Nfeature_list_dense string Tensors (scalars).
   * The keys expected in the SequenceExamples' feature_lists associated
   * with lists of dense values.
   * @param contextDenseDefaults A list of Ncontext_dense Tensors (some may be empty).
   * context_dense_defaults[j] provides default values
   * when the SequenceExample's context map lacks context_dense_key[j].
   * If an empty Tensor is provided for context_dense_defaults[j],
   * then the Feature context_dense_keys[j] is required.
   * The input type is inferred from context_dense_defaults[j], even when it's
   * empty.  If context_dense_defaults[j] is not empty, its shape must match
   * context_dense_shapes[j].
   * @param debugName A scalar containing the name of the serialized proto.
   * May contain, for example, table key (descriptive) name for the
   * corresponding serialized proto.  This is purely useful for debugging
   * purposes, and the presence of values here has no effect on the output.
   * May also be an empty scalar if no name is available.
   * @param contextSparseTypes A list of Ncontext_sparse types; the data types of data in
   * each context Feature given in context_sparse_keys.
   * Currently the ParseSingleSequenceExample supports DT_FLOAT (FloatList),
   * DT_INT64 (Int64List), and DT_STRING (BytesList).
   * @param featureListDenseTypes The value of the featureListDenseTypes attribute
   * @param featureListSparseTypes A list of Nfeature_list_sparse types; the data types
   * of data in each FeatureList given in feature_list_sparse_keys.
   * Currently the ParseSingleSequenceExample supports DT_FLOAT (FloatList),
   * DT_INT64 (Int64List), and DT_STRING (BytesList).
   * @param options carries optional attribute values
   * @return a new instance of ParseSingleSequenceExample
   */
  @Endpoint(
      describeByClass = true
  )
  public static ParseSingleSequenceExample create(Scope scope, Operand<TString> serialized,
      Operand<TString> featureListDenseMissingAssumedEmpty,
      Iterable<Operand<TString>> contextSparseKeys, Iterable<Operand<TString>> contextDenseKeys,
      Iterable<Operand<TString>> featureListSparseKeys,
      Iterable<Operand<TString>> featureListDenseKeys, Iterable<Operand<?>> contextDenseDefaults,
      Operand<TString> debugName, List<Class<? extends TType>> contextSparseTypes,
      List<Class<? extends TType>> featureListDenseTypes,
      List<Class<? extends TType>> featureListSparseTypes, Options... options) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "ParseSingleSequenceExample");
    opBuilder.addInput(serialized.asOutput());
    opBuilder.addInput(featureListDenseMissingAssumedEmpty.asOutput());
    opBuilder.addInputList(Operands.asOutputs(contextSparseKeys));
    opBuilder.addInputList(Operands.asOutputs(contextDenseKeys));
    opBuilder.addInputList(Operands.asOutputs(featureListSparseKeys));
    opBuilder.addInputList(Operands.asOutputs(featureListDenseKeys));
    opBuilder.addInputList(Operands.asOutputs(contextDenseDefaults));
    opBuilder.addInput(debugName.asOutput());
    opBuilder.setAttr("context_sparse_types", Operands.toDataTypes(contextSparseTypes));
    opBuilder.setAttr("feature_list_dense_types", Operands.toDataTypes(featureListDenseTypes));
    opBuilder.setAttr("feature_list_sparse_types", Operands.toDataTypes(featureListSparseTypes));
    if (options != null) {
      for (Options opts : options) {
        if (opts.NcontextSparse != null) {
          opBuilder.setAttr("Ncontext_sparse", opts.NcontextSparse);
        }
        if (opts.NcontextDense != null) {
          opBuilder.setAttr("Ncontext_dense", opts.NcontextDense);
        }
        if (opts.NfeatureListSparse != null) {
          opBuilder.setAttr("Nfeature_list_sparse", opts.NfeatureListSparse);
        }
        if (opts.NfeatureListDense != null) {
          opBuilder.setAttr("Nfeature_list_dense", opts.NfeatureListDense);
        }
        if (opts.contextDenseShapes != null) {
          Shape[] contextDenseShapesArray = new Shape[opts.contextDenseShapes.size()];
          for (int i = 0 ; i < contextDenseShapesArray.length ; i++) {
            contextDenseShapesArray[i] = opts.contextDenseShapes.get(i);
          }
          opBuilder.setAttr("context_dense_shapes", contextDenseShapesArray);
        }
        if (opts.featureListDenseShapes != null) {
          Shape[] featureListDenseShapesArray = new Shape[opts.featureListDenseShapes.size()];
          for (int i = 0 ; i < featureListDenseShapesArray.length ; i++) {
            featureListDenseShapesArray[i] = opts.featureListDenseShapes.get(i);
          }
          opBuilder.setAttr("feature_list_dense_shapes", featureListDenseShapesArray);
        }
      }
    }
    return new ParseSingleSequenceExample(opBuilder.build());
  }

  /**
   * Sets the NcontextSparse option.
   *
   * @param NcontextSparse the NcontextSparse option
   * @return this Options instance.
   */
  public static Options NcontextSparse(Long NcontextSparse) {
    return new Options().NcontextSparse(NcontextSparse);
  }

  /**
   * Sets the NcontextDense option.
   *
   * @param NcontextDense the NcontextDense option
   * @return this Options instance.
   */
  public static Options NcontextDense(Long NcontextDense) {
    return new Options().NcontextDense(NcontextDense);
  }

  /**
   * Sets the NfeatureListSparse option.
   *
   * @param NfeatureListSparse the NfeatureListSparse option
   * @return this Options instance.
   */
  public static Options NfeatureListSparse(Long NfeatureListSparse) {
    return new Options().NfeatureListSparse(NfeatureListSparse);
  }

  /**
   * Sets the NfeatureListDense option.
   *
   * @param NfeatureListDense the NfeatureListDense option
   * @return this Options instance.
   */
  public static Options NfeatureListDense(Long NfeatureListDense) {
    return new Options().NfeatureListDense(NfeatureListDense);
  }

  /**
   * Sets the contextDenseShapes option.
   *
   * @param contextDenseShapes A list of Ncontext_dense shapes; the shapes of data in
   * each context Feature given in context_dense_keys.
   * The number of elements in the Feature corresponding to context_dense_key[j]
   * must always equal context_dense_shapes[j].NumEntries().
   * The shape of context_dense_values[j] will match context_dense_shapes[j].
   * @return this Options instance.
   */
  public static Options contextDenseShapes(List<Shape> contextDenseShapes) {
    return new Options().contextDenseShapes(contextDenseShapes);
  }

  /**
   * Sets the contextDenseShapes option.
   *
   * @param contextDenseShapes A list of Ncontext_dense shapes; the shapes of data in
   * each context Feature given in context_dense_keys.
   * The number of elements in the Feature corresponding to context_dense_key[j]
   * must always equal context_dense_shapes[j].NumEntries().
   * The shape of context_dense_values[j] will match context_dense_shapes[j].
   * @return this Options instance.
   */
  public static Options contextDenseShapes(Shape... contextDenseShapes) {
    return new Options().contextDenseShapes(contextDenseShapes);
  }

  /**
   * Sets the featureListDenseShapes option.
   *
   * @param featureListDenseShapes A list of Nfeature_list_dense shapes; the shapes of
   * data in each FeatureList given in feature_list_dense_keys.
   * The shape of each Feature in the FeatureList corresponding to
   * feature_list_dense_key[j] must always equal
   * feature_list_dense_shapes[j].NumEntries().
   * @return this Options instance.
   */
  public static Options featureListDenseShapes(List<Shape> featureListDenseShapes) {
    return new Options().featureListDenseShapes(featureListDenseShapes);
  }

  /**
   * Sets the featureListDenseShapes option.
   *
   * @param featureListDenseShapes A list of Nfeature_list_dense shapes; the shapes of
   * data in each FeatureList given in feature_list_dense_keys.
   * The shape of each Feature in the FeatureList corresponding to
   * feature_list_dense_key[j] must always equal
   * feature_list_dense_shapes[j].NumEntries().
   * @return this Options instance.
   */
  public static Options featureListDenseShapes(Shape... featureListDenseShapes) {
    return new Options().featureListDenseShapes(featureListDenseShapes);
  }

  /**
   * Gets contextSparseIndices.
   *
   * @return contextSparseIndices.
   */
  public List<Output<TInt64>> contextSparseIndices() {
    return contextSparseIndices;
  }

  /**
   * Gets contextSparseValues.
   *
   * @return contextSparseValues.
   */
  public List<Output<?>> contextSparseValues() {
    return contextSparseValues;
  }

  /**
   * Gets contextSparseShapes.
   *
   * @return contextSparseShapes.
   */
  public List<Output<TInt64>> contextSparseShapes() {
    return contextSparseShapes;
  }

  /**
   * Gets contextDenseValues.
   *
   * @return contextDenseValues.
   */
  public List<Output<?>> contextDenseValues() {
    return contextDenseValues;
  }

  /**
   * Gets featureListSparseIndices.
   *
   * @return featureListSparseIndices.
   */
  public List<Output<TInt64>> featureListSparseIndices() {
    return featureListSparseIndices;
  }

  /**
   * Gets featureListSparseValues.
   *
   * @return featureListSparseValues.
   */
  public List<Output<?>> featureListSparseValues() {
    return featureListSparseValues;
  }

  /**
   * Gets featureListSparseShapes.
   *
   * @return featureListSparseShapes.
   */
  public List<Output<TInt64>> featureListSparseShapes() {
    return featureListSparseShapes;
  }

  /**
   * Gets featureListDenseValues.
   *
   * @return featureListDenseValues.
   */
  public List<Output<?>> featureListDenseValues() {
    return featureListDenseValues;
  }

  /**
   * Optional attributes for {@link org.tensorflow.op.io.ParseSingleSequenceExample}
   */
  public static class Options {
    private Long NcontextSparse;

    private Long NcontextDense;

    private Long NfeatureListSparse;

    private Long NfeatureListDense;

    private List<Shape> contextDenseShapes;

    private List<Shape> featureListDenseShapes;

    private Options() {
    }

    /**
     * Sets the NcontextSparse option.
     *
     * @param NcontextSparse the NcontextSparse option
     * @return this Options instance.
     */
    public Options NcontextSparse(Long NcontextSparse) {
      this.NcontextSparse = NcontextSparse;
      return this;
    }

    /**
     * Sets the NcontextDense option.
     *
     * @param NcontextDense the NcontextDense option
     * @return this Options instance.
     */
    public Options NcontextDense(Long NcontextDense) {
      this.NcontextDense = NcontextDense;
      return this;
    }

    /**
     * Sets the NfeatureListSparse option.
     *
     * @param NfeatureListSparse the NfeatureListSparse option
     * @return this Options instance.
     */
    public Options NfeatureListSparse(Long NfeatureListSparse) {
      this.NfeatureListSparse = NfeatureListSparse;
      return this;
    }

    /**
     * Sets the NfeatureListDense option.
     *
     * @param NfeatureListDense the NfeatureListDense option
     * @return this Options instance.
     */
    public Options NfeatureListDense(Long NfeatureListDense) {
      this.NfeatureListDense = NfeatureListDense;
      return this;
    }

    /**
     * Sets the contextDenseShapes option.
     *
     * @param contextDenseShapes A list of Ncontext_dense shapes; the shapes of data in
     * each context Feature given in context_dense_keys.
     * The number of elements in the Feature corresponding to context_dense_key[j]
     * must always equal context_dense_shapes[j].NumEntries().
     * The shape of context_dense_values[j] will match context_dense_shapes[j].
     * @return this Options instance.
     */
    public Options contextDenseShapes(List<Shape> contextDenseShapes) {
      this.contextDenseShapes = contextDenseShapes;
      return this;
    }

    /**
     * Sets the contextDenseShapes option.
     *
     * @param contextDenseShapes A list of Ncontext_dense shapes; the shapes of data in
     * each context Feature given in context_dense_keys.
     * The number of elements in the Feature corresponding to context_dense_key[j]
     * must always equal context_dense_shapes[j].NumEntries().
     * The shape of context_dense_values[j] will match context_dense_shapes[j].
     * @return this Options instance.
     */
    public Options contextDenseShapes(Shape... contextDenseShapes) {
      this.contextDenseShapes = Arrays.asList(contextDenseShapes);
      return this;
    }

    /**
     * Sets the featureListDenseShapes option.
     *
     * @param featureListDenseShapes A list of Nfeature_list_dense shapes; the shapes of
     * data in each FeatureList given in feature_list_dense_keys.
     * The shape of each Feature in the FeatureList corresponding to
     * feature_list_dense_key[j] must always equal
     * feature_list_dense_shapes[j].NumEntries().
     * @return this Options instance.
     */
    public Options featureListDenseShapes(List<Shape> featureListDenseShapes) {
      this.featureListDenseShapes = featureListDenseShapes;
      return this;
    }

    /**
     * Sets the featureListDenseShapes option.
     *
     * @param featureListDenseShapes A list of Nfeature_list_dense shapes; the shapes of
     * data in each FeatureList given in feature_list_dense_keys.
     * The shape of each Feature in the FeatureList corresponding to
     * feature_list_dense_key[j] must always equal
     * feature_list_dense_shapes[j].NumEntries().
     * @return this Options instance.
     */
    public Options featureListDenseShapes(Shape... featureListDenseShapes) {
      this.featureListDenseShapes = Arrays.asList(featureListDenseShapes);
      return this;
    }
  }

  public static class Inputs extends RawOpInputs<ParseSingleSequenceExample> {
    /**
     * A scalar containing a binary serialized SequenceExample proto.
     */
    public final Operand<TString> serialized;

    /**
     * A vector listing the
     * FeatureList keys which may be missing from the SequenceExample.  If the
     * associated FeatureList is missing, it is treated as empty.  By default,
     * any FeatureList not listed in this vector must exist in the SequenceExample.
     */
    public final Operand<TString> featureListDenseMissingAssumedEmpty;

    /**
     * A list of Ncontext_sparse string Tensors (scalars).
     * The keys expected in the Examples' features associated with context_sparse
     * values.
     */
    public final Iterable<Operand<TString>> contextSparseKeys;

    /**
     * A list of Ncontext_dense string Tensors (scalars).
     * The keys expected in the SequenceExamples' context features associated with
     * dense values.
     */
    public final Iterable<Operand<TString>> contextDenseKeys;

    /**
     * A list of Nfeature_list_sparse string Tensors
     * (scalars).  The keys expected in the FeatureLists associated with sparse
     * values.
     */
    public final Iterable<Operand<TString>> featureListSparseKeys;

    /**
     * A list of Nfeature_list_dense string Tensors (scalars).
     * The keys expected in the SequenceExamples' feature_lists associated
     * with lists of dense values.
     */
    public final Iterable<Operand<TString>> featureListDenseKeys;

    /**
     * A list of Ncontext_dense Tensors (some may be empty).
     * context_dense_defaults[j] provides default values
     * when the SequenceExample's context map lacks context_dense_key[j].
     * If an empty Tensor is provided for context_dense_defaults[j],
     * then the Feature context_dense_keys[j] is required.
     * The input type is inferred from context_dense_defaults[j], even when it's
     * empty.  If context_dense_defaults[j] is not empty, its shape must match
     * context_dense_shapes[j].
     */
    public final Iterable<Operand<?>> contextDenseDefaults;

    /**
     * A scalar containing the name of the serialized proto.
     * May contain, for example, table key (descriptive) name for the
     * corresponding serialized proto.  This is purely useful for debugging
     * purposes, and the presence of values here has no effect on the output.
     * May also be an empty scalar if no name is available.
     */
    public final Operand<TString> debugName;

    /**
     * A list of Ncontext_sparse types; the data types of data in
     * each context Feature given in context_sparse_keys.
     * Currently the ParseSingleSequenceExample supports DT_FLOAT (FloatList),
     * DT_INT64 (Int64List), and DT_STRING (BytesList).
     */
    public final DataType[] contextSparseTypes;

    /**
     * The TcontextDense attribute
     */
    public final DataType[] TcontextDense;

    /**
     * The featureListDenseTypes attribute
     */
    public final DataType[] featureListDenseTypes;

    /**
     * A list of Ncontext_dense shapes; the shapes of data in
     * each context Feature given in context_dense_keys.
     * The number of elements in the Feature corresponding to context_dense_key[j]
     * must always equal context_dense_shapes[j].NumEntries().
     * The shape of context_dense_values[j] will match context_dense_shapes[j].
     */
    public final Shape[] contextDenseShapes;

    /**
     * A list of Nfeature_list_sparse types; the data types
     * of data in each FeatureList given in feature_list_sparse_keys.
     * Currently the ParseSingleSequenceExample supports DT_FLOAT (FloatList),
     * DT_INT64 (Int64List), and DT_STRING (BytesList).
     */
    public final DataType[] featureListSparseTypes;

    /**
     * A list of Nfeature_list_dense shapes; the shapes of
     * data in each FeatureList given in feature_list_dense_keys.
     * The shape of each Feature in the FeatureList corresponding to
     * feature_list_dense_key[j] must always equal
     * feature_list_dense_shapes[j].NumEntries().
     */
    public final Shape[] featureListDenseShapes;

    public Inputs(GraphOperation op) {
      super(new ParseSingleSequenceExample(op), op, Arrays.asList("context_sparse_types", "Tcontext_dense", "feature_list_dense_types", "context_dense_shapes", "feature_list_sparse_types", "feature_list_dense_shapes"));
      int inputIndex = 0;
      serialized = (Operand<TString>) op.input(inputIndex++);
      featureListDenseMissingAssumedEmpty = (Operand<TString>) op.input(inputIndex++);
      int contextSparseKeysLength = op.inputListLength("context_sparse_keys");
      contextSparseKeys = Arrays.asList((Operand<TString>[]) op.inputList(inputIndex, contextSparseKeysLength));
      inputIndex += contextSparseKeysLength;
      int contextDenseKeysLength = op.inputListLength("context_dense_keys");
      contextDenseKeys = Arrays.asList((Operand<TString>[]) op.inputList(inputIndex, contextDenseKeysLength));
      inputIndex += contextDenseKeysLength;
      int featureListSparseKeysLength = op.inputListLength("feature_list_sparse_keys");
      featureListSparseKeys = Arrays.asList((Operand<TString>[]) op.inputList(inputIndex, featureListSparseKeysLength));
      inputIndex += featureListSparseKeysLength;
      int featureListDenseKeysLength = op.inputListLength("feature_list_dense_keys");
      featureListDenseKeys = Arrays.asList((Operand<TString>[]) op.inputList(inputIndex, featureListDenseKeysLength));
      inputIndex += featureListDenseKeysLength;
      int contextDenseDefaultsLength = op.inputListLength("context_dense_defaults");
      contextDenseDefaults = Arrays.asList((Operand<?>[]) op.inputList(inputIndex, contextDenseDefaultsLength));
      inputIndex += contextDenseDefaultsLength;
      debugName = (Operand<TString>) op.input(inputIndex++);
      contextSparseTypes = op.attributes().getAttrTypeList("context_sparse_types");
      TcontextDense = op.attributes().getAttrTypeList("Tcontext_dense");
      featureListDenseTypes = op.attributes().getAttrTypeList("feature_list_dense_types");
      contextDenseShapes = op.attributes().getAttrShapeList("context_dense_shapes");
      featureListSparseTypes = op.attributes().getAttrTypeList("feature_list_sparse_types");
      featureListDenseShapes = op.attributes().getAttrShapeList("feature_list_dense_shapes");
    }
  }
}

/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ScanResponse implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ScanResponse");
  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField PROPS_FIELD_DESC = new TField("props", TType.STRUCT, (short)2);
  private static final TField CURSORS_FIELD_DESC = new TField("cursors", TType.MAP, (short)3);

  public ResponseCommon result;
  public com.vesoft.nebula.DataSet props;
  public Map<Integer,ScanCursor> cursors;
  public static final int RESULT = 1;
  public static final int PROPS = 2;
  public static final int CURSORS = 3;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(RESULT, new FieldMetaData("result", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, ResponseCommon.class)));
    tmpMetaDataMap.put(PROPS, new FieldMetaData("props", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.DataSet.class)));
    tmpMetaDataMap.put(CURSORS, new FieldMetaData("cursors", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new StructMetaData(TType.STRUCT, ScanCursor.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ScanResponse.class, metaDataMap);
  }

  public ScanResponse() {
  }

  public ScanResponse(
      ResponseCommon result) {
    this();
    this.result = result;
  }

  public ScanResponse(
      ResponseCommon result,
      Map<Integer,ScanCursor> cursors) {
    this();
    this.result = result;
    this.cursors = cursors;
  }

  public ScanResponse(
      ResponseCommon result,
      com.vesoft.nebula.DataSet props,
      Map<Integer,ScanCursor> cursors) {
    this();
    this.result = result;
    this.props = props;
    this.cursors = cursors;
  }

  public static class Builder {
    private ResponseCommon result;
    private com.vesoft.nebula.DataSet props;
    private Map<Integer,ScanCursor> cursors;

    public Builder() {
    }

    public Builder setResult(final ResponseCommon result) {
      this.result = result;
      return this;
    }

    public Builder setProps(final com.vesoft.nebula.DataSet props) {
      this.props = props;
      return this;
    }

    public Builder setCursors(final Map<Integer,ScanCursor> cursors) {
      this.cursors = cursors;
      return this;
    }

    public ScanResponse build() {
      ScanResponse result = new ScanResponse();
      result.setResult(this.result);
      result.setProps(this.props);
      result.setCursors(this.cursors);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScanResponse(ScanResponse other) {
    if (other.isSetResult()) {
      this.result = TBaseHelper.deepCopy(other.result);
    }
    if (other.isSetProps()) {
      this.props = TBaseHelper.deepCopy(other.props);
    }
    if (other.isSetCursors()) {
      this.cursors = TBaseHelper.deepCopy(other.cursors);
    }
  }

  public ScanResponse deepCopy() {
    return new ScanResponse(this);
  }

  public ResponseCommon getResult() {
    return this.result;
  }

  public ScanResponse setResult(ResponseCommon result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  // Returns true if field result is set (has been assigned a value) and false otherwise
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean __value) {
    if (!__value) {
      this.result = null;
    }
  }

  public com.vesoft.nebula.DataSet getProps() {
    return this.props;
  }

  public ScanResponse setProps(com.vesoft.nebula.DataSet props) {
    this.props = props;
    return this;
  }

  public void unsetProps() {
    this.props = null;
  }

  // Returns true if field props is set (has been assigned a value) and false otherwise
  public boolean isSetProps() {
    return this.props != null;
  }

  public void setPropsIsSet(boolean __value) {
    if (!__value) {
      this.props = null;
    }
  }

  public Map<Integer,ScanCursor> getCursors() {
    return this.cursors;
  }

  public ScanResponse setCursors(Map<Integer,ScanCursor> cursors) {
    this.cursors = cursors;
    return this;
  }

  public void unsetCursors() {
    this.cursors = null;
  }

  // Returns true if field cursors is set (has been assigned a value) and false otherwise
  public boolean isSetCursors() {
    return this.cursors != null;
  }

  public void setCursorsIsSet(boolean __value) {
    if (!__value) {
      this.cursors = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case RESULT:
      if (__value == null) {
        unsetResult();
      } else {
        setResult((ResponseCommon)__value);
      }
      break;

    case PROPS:
      if (__value == null) {
        unsetProps();
      } else {
        setProps((com.vesoft.nebula.DataSet)__value);
      }
      break;

    case CURSORS:
      if (__value == null) {
        unsetCursors();
      } else {
        setCursors((Map<Integer,ScanCursor>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case RESULT:
      return getResult();

    case PROPS:
      return getProps();

    case CURSORS:
      return getCursors();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof ScanResponse))
      return false;
    ScanResponse that = (ScanResponse)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetResult(), that.isSetResult(), this.result, that.result)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetProps(), that.isSetProps(), this.props, that.props)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetCursors(), that.isSetCursors(), this.cursors, that.cursors)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {result, props, cursors});
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case RESULT:
          if (__field.type == TType.STRUCT) {
            this.result = new ResponseCommon();
            this.result.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PROPS:
          if (__field.type == TType.STRUCT) {
            this.props = new com.vesoft.nebula.DataSet();
            this.props.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case CURSORS:
          if (__field.type == TType.MAP) {
            {
              TMap _map207 = iprot.readMapBegin();
              this.cursors = new HashMap<Integer,ScanCursor>(Math.max(0, 2*_map207.size));
              for (int _i208 = 0; 
                   (_map207.size < 0) ? iprot.peekMap() : (_i208 < _map207.size); 
                   ++_i208)
              {
                int _key209;
                ScanCursor _val210;
                _key209 = iprot.readI32();
                _val210 = new ScanCursor();
                _val210.read(iprot);
                this.cursors.put(_key209, _val210);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      this.result.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.props != null) {
      if (isSetProps()) {
        oprot.writeFieldBegin(PROPS_FIELD_DESC);
        this.props.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.cursors != null) {
      oprot.writeFieldBegin(CURSORS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.STRUCT, this.cursors.size()));
        for (Map.Entry<Integer, ScanCursor> _iter211 : this.cursors.entrySet())        {
          oprot.writeI32(_iter211.getKey());
          _iter211.getValue().write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("ScanResponse");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("result");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getResult() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getResult(), indent + 1, prettyPrint));
    }
    first = false;
    if (isSetProps())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("props");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getProps() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getProps(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("cursors");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getCursors() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getCursors(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (result == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'result' was not present! Struct: " + toString());
    }
  }

}

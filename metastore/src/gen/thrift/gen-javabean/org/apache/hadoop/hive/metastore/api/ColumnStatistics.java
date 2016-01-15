/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-01-14")
public class ColumnStatistics implements org.apache.thrift.TBase<ColumnStatistics, ColumnStatistics._Fields>, java.io.Serializable, Cloneable, Comparable<ColumnStatistics> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ColumnStatistics");

  private static final org.apache.thrift.protocol.TField STATS_DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("statsDesc", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STATS_OBJ_FIELD_DESC = new org.apache.thrift.protocol.TField("statsObj", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ColumnStatisticsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ColumnStatisticsTupleSchemeFactory());
  }

  private ColumnStatisticsDesc statsDesc; // required
  private List<ColumnStatisticsObj> statsObj; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATS_DESC((short)1, "statsDesc"),
    STATS_OBJ((short)2, "statsObj");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATS_DESC
          return STATS_DESC;
        case 2: // STATS_OBJ
          return STATS_OBJ;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATS_DESC, new org.apache.thrift.meta_data.FieldMetaData("statsDesc", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnStatisticsDesc.class)));
    tmpMap.put(_Fields.STATS_OBJ, new org.apache.thrift.meta_data.FieldMetaData("statsObj", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnStatisticsObj.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ColumnStatistics.class, metaDataMap);
  }

  public ColumnStatistics() {
  }

  public ColumnStatistics(
    ColumnStatisticsDesc statsDesc,
    List<ColumnStatisticsObj> statsObj)
  {
    this();
    this.statsDesc = statsDesc;
    this.statsObj = statsObj;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ColumnStatistics(ColumnStatistics other) {
    if (other.isSetStatsDesc()) {
      this.statsDesc = new ColumnStatisticsDesc(other.statsDesc);
    }
    if (other.isSetStatsObj()) {
      List<ColumnStatisticsObj> __this__statsObj = new ArrayList<ColumnStatisticsObj>(other.statsObj.size());
      for (ColumnStatisticsObj other_element : other.statsObj) {
        __this__statsObj.add(new ColumnStatisticsObj(other_element));
      }
      this.statsObj = __this__statsObj;
    }
  }

  public ColumnStatistics deepCopy() {
    return new ColumnStatistics(this);
  }

  @Override
  public void clear() {
    this.statsDesc = null;
    this.statsObj = null;
  }

  public ColumnStatisticsDesc getStatsDesc() {
    return this.statsDesc;
  }

  public void setStatsDesc(ColumnStatisticsDesc statsDesc) {
    this.statsDesc = statsDesc;
  }

  public void unsetStatsDesc() {
    this.statsDesc = null;
  }

  /** Returns true if field statsDesc is set (has been assigned a value) and false otherwise */
  public boolean isSetStatsDesc() {
    return this.statsDesc != null;
  }

  public void setStatsDescIsSet(boolean value) {
    if (!value) {
      this.statsDesc = null;
    }
  }

  public int getStatsObjSize() {
    return (this.statsObj == null) ? 0 : this.statsObj.size();
  }

  public java.util.Iterator<ColumnStatisticsObj> getStatsObjIterator() {
    return (this.statsObj == null) ? null : this.statsObj.iterator();
  }

  public void addToStatsObj(ColumnStatisticsObj elem) {
    if (this.statsObj == null) {
      this.statsObj = new ArrayList<ColumnStatisticsObj>();
    }
    this.statsObj.add(elem);
  }

  public List<ColumnStatisticsObj> getStatsObj() {
    return this.statsObj;
  }

  public void setStatsObj(List<ColumnStatisticsObj> statsObj) {
    this.statsObj = statsObj;
  }

  public void unsetStatsObj() {
    this.statsObj = null;
  }

  /** Returns true if field statsObj is set (has been assigned a value) and false otherwise */
  public boolean isSetStatsObj() {
    return this.statsObj != null;
  }

  public void setStatsObjIsSet(boolean value) {
    if (!value) {
      this.statsObj = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATS_DESC:
      if (value == null) {
        unsetStatsDesc();
      } else {
        setStatsDesc((ColumnStatisticsDesc)value);
      }
      break;

    case STATS_OBJ:
      if (value == null) {
        unsetStatsObj();
      } else {
        setStatsObj((List<ColumnStatisticsObj>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATS_DESC:
      return getStatsDesc();

    case STATS_OBJ:
      return getStatsObj();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATS_DESC:
      return isSetStatsDesc();
    case STATS_OBJ:
      return isSetStatsObj();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ColumnStatistics)
      return this.equals((ColumnStatistics)that);
    return false;
  }

  public boolean equals(ColumnStatistics that) {
    if (that == null)
      return false;

    boolean this_present_statsDesc = true && this.isSetStatsDesc();
    boolean that_present_statsDesc = true && that.isSetStatsDesc();
    if (this_present_statsDesc || that_present_statsDesc) {
      if (!(this_present_statsDesc && that_present_statsDesc))
        return false;
      if (!this.statsDesc.equals(that.statsDesc))
        return false;
    }

    boolean this_present_statsObj = true && this.isSetStatsObj();
    boolean that_present_statsObj = true && that.isSetStatsObj();
    if (this_present_statsObj || that_present_statsObj) {
      if (!(this_present_statsObj && that_present_statsObj))
        return false;
      if (!this.statsObj.equals(that.statsObj))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_statsDesc = true && (isSetStatsDesc());
    list.add(present_statsDesc);
    if (present_statsDesc)
      list.add(statsDesc);

    boolean present_statsObj = true && (isSetStatsObj());
    list.add(present_statsObj);
    if (present_statsObj)
      list.add(statsObj);

    return list.hashCode();
  }

  @Override
  public int compareTo(ColumnStatistics other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatsDesc()).compareTo(other.isSetStatsDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatsDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statsDesc, other.statsDesc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatsObj()).compareTo(other.isSetStatsObj());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatsObj()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statsObj, other.statsObj);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ColumnStatistics(");
    boolean first = true;

    sb.append("statsDesc:");
    if (this.statsDesc == null) {
      sb.append("null");
    } else {
      sb.append(this.statsDesc);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("statsObj:");
    if (this.statsObj == null) {
      sb.append("null");
    } else {
      sb.append(this.statsObj);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetStatsDesc()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'statsDesc' is unset! Struct:" + toString());
    }

    if (!isSetStatsObj()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'statsObj' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (statsDesc != null) {
      statsDesc.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ColumnStatisticsStandardSchemeFactory implements SchemeFactory {
    public ColumnStatisticsStandardScheme getScheme() {
      return new ColumnStatisticsStandardScheme();
    }
  }

  private static class ColumnStatisticsStandardScheme extends StandardScheme<ColumnStatistics> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ColumnStatistics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATS_DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.statsDesc = new ColumnStatisticsDesc();
              struct.statsDesc.read(iprot);
              struct.setStatsDescIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATS_OBJ
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list270 = iprot.readListBegin();
                struct.statsObj = new ArrayList<ColumnStatisticsObj>(_list270.size);
                ColumnStatisticsObj _elem271;
                for (int _i272 = 0; _i272 < _list270.size; ++_i272)
                {
                  _elem271 = new ColumnStatisticsObj();
                  _elem271.read(iprot);
                  struct.statsObj.add(_elem271);
                }
                iprot.readListEnd();
              }
              struct.setStatsObjIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ColumnStatistics struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.statsDesc != null) {
        oprot.writeFieldBegin(STATS_DESC_FIELD_DESC);
        struct.statsDesc.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.statsObj != null) {
        oprot.writeFieldBegin(STATS_OBJ_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.statsObj.size()));
          for (ColumnStatisticsObj _iter273 : struct.statsObj)
          {
            _iter273.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ColumnStatisticsTupleSchemeFactory implements SchemeFactory {
    public ColumnStatisticsTupleScheme getScheme() {
      return new ColumnStatisticsTupleScheme();
    }
  }

  private static class ColumnStatisticsTupleScheme extends TupleScheme<ColumnStatistics> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ColumnStatistics struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.statsDesc.write(oprot);
      {
        oprot.writeI32(struct.statsObj.size());
        for (ColumnStatisticsObj _iter274 : struct.statsObj)
        {
          _iter274.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ColumnStatistics struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.statsDesc = new ColumnStatisticsDesc();
      struct.statsDesc.read(iprot);
      struct.setStatsDescIsSet(true);
      {
        org.apache.thrift.protocol.TList _list275 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.statsObj = new ArrayList<ColumnStatisticsObj>(_list275.size);
        ColumnStatisticsObj _elem276;
        for (int _i277 = 0; _i277 < _list275.size; ++_i277)
        {
          _elem276 = new ColumnStatisticsObj();
          _elem276.read(iprot);
          struct.statsObj.add(_elem276);
        }
      }
      struct.setStatsObjIsSet(true);
    }
  }

}


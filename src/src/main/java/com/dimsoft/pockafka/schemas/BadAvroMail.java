/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.dimsoft.pockafka.schemas;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BadAvroMail extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8176899757186119151L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BadAvroMail\",\"namespace\":\"com.dimsoft.pockafka.schemas\",\"fields\":[{\"name\":\"mail_to\",\"type\":\"string\",\"doc\":\"Mail to ...\"},{\"name\":\"mail_subject\",\"type\":\"string\",\"doc\":\"Subject of the mail\"},{\"name\":\"mail_conten\",\"type\":\"string\",\"doc\":\"Content of the mail\"},{\"name\":\"mail_status\",\"type\":\"string\",\"doc\":\"Status of the mail\"}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BadAvroMail> ENCODER =
      new BinaryMessageEncoder<BadAvroMail>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BadAvroMail> DECODER =
      new BinaryMessageDecoder<BadAvroMail>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<BadAvroMail> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<BadAvroMail> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BadAvroMail>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this BadAvroMail to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a BadAvroMail from a ByteBuffer. */
  public static BadAvroMail fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Mail to ... */
  @Deprecated public java.lang.CharSequence mail_to;
  /** Subject of the mail */
  @Deprecated public java.lang.CharSequence mail_subject;
  /** Content of the mail */
  @Deprecated public java.lang.CharSequence mail_conten;
  /** Status of the mail */
  @Deprecated public java.lang.CharSequence mail_status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BadAvroMail() {}

  /**
   * All-args constructor.
   * @param mail_to Mail to ...
   * @param mail_subject Subject of the mail
   * @param mail_conten Content of the mail
   * @param mail_status Status of the mail
   */
  public BadAvroMail(java.lang.CharSequence mail_to, java.lang.CharSequence mail_subject, java.lang.CharSequence mail_conten, java.lang.CharSequence mail_status) {
    this.mail_to = mail_to;
    this.mail_subject = mail_subject;
    this.mail_conten = mail_conten;
    this.mail_status = mail_status;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return mail_to;
    case 1: return mail_subject;
    case 2: return mail_conten;
    case 3: return mail_status;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: mail_to = (java.lang.CharSequence)value$; break;
    case 1: mail_subject = (java.lang.CharSequence)value$; break;
    case 2: mail_conten = (java.lang.CharSequence)value$; break;
    case 3: mail_status = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'mail_to' field.
   * @return Mail to ...
   */
  public java.lang.CharSequence getMailTo() {
    return mail_to;
  }

  /**
   * Sets the value of the 'mail_to' field.
   * Mail to ...
   * @param value the value to set.
   */
  public void setMailTo(java.lang.CharSequence value) {
    this.mail_to = value;
  }

  /**
   * Gets the value of the 'mail_subject' field.
   * @return Subject of the mail
   */
  public java.lang.CharSequence getMailSubject() {
    return mail_subject;
  }

  /**
   * Sets the value of the 'mail_subject' field.
   * Subject of the mail
   * @param value the value to set.
   */
  public void setMailSubject(java.lang.CharSequence value) {
    this.mail_subject = value;
  }

  /**
   * Gets the value of the 'mail_conten' field.
   * @return Content of the mail
   */
  public java.lang.CharSequence getMailConten() {
    return mail_conten;
  }

  /**
   * Sets the value of the 'mail_conten' field.
   * Content of the mail
   * @param value the value to set.
   */
  public void setMailConten(java.lang.CharSequence value) {
    this.mail_conten = value;
  }

  /**
   * Gets the value of the 'mail_status' field.
   * @return Status of the mail
   */
  public java.lang.CharSequence getMailStatus() {
    return mail_status;
  }

  /**
   * Sets the value of the 'mail_status' field.
   * Status of the mail
   * @param value the value to set.
   */
  public void setMailStatus(java.lang.CharSequence value) {
    this.mail_status = value;
  }

  /**
   * Creates a new BadAvroMail RecordBuilder.
   * @return A new BadAvroMail RecordBuilder
   */
  public static com.dimsoft.pockafka.schemas.BadAvroMail.Builder newBuilder() {
    return new com.dimsoft.pockafka.schemas.BadAvroMail.Builder();
  }

  /**
   * Creates a new BadAvroMail RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BadAvroMail RecordBuilder
   */
  public static com.dimsoft.pockafka.schemas.BadAvroMail.Builder newBuilder(com.dimsoft.pockafka.schemas.BadAvroMail.Builder other) {
    return new com.dimsoft.pockafka.schemas.BadAvroMail.Builder(other);
  }

  /**
   * Creates a new BadAvroMail RecordBuilder by copying an existing BadAvroMail instance.
   * @param other The existing instance to copy.
   * @return A new BadAvroMail RecordBuilder
   */
  public static com.dimsoft.pockafka.schemas.BadAvroMail.Builder newBuilder(com.dimsoft.pockafka.schemas.BadAvroMail other) {
    return new com.dimsoft.pockafka.schemas.BadAvroMail.Builder(other);
  }

  /**
   * RecordBuilder for BadAvroMail instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BadAvroMail>
    implements org.apache.avro.data.RecordBuilder<BadAvroMail> {

    /** Mail to ... */
    private java.lang.CharSequence mail_to;
    /** Subject of the mail */
    private java.lang.CharSequence mail_subject;
    /** Content of the mail */
    private java.lang.CharSequence mail_conten;
    /** Status of the mail */
    private java.lang.CharSequence mail_status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.dimsoft.pockafka.schemas.BadAvroMail.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.mail_to)) {
        this.mail_to = data().deepCopy(fields()[0].schema(), other.mail_to);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mail_subject)) {
        this.mail_subject = data().deepCopy(fields()[1].schema(), other.mail_subject);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.mail_conten)) {
        this.mail_conten = data().deepCopy(fields()[2].schema(), other.mail_conten);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.mail_status)) {
        this.mail_status = data().deepCopy(fields()[3].schema(), other.mail_status);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing BadAvroMail instance
     * @param other The existing instance to copy.
     */
    private Builder(com.dimsoft.pockafka.schemas.BadAvroMail other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.mail_to)) {
        this.mail_to = data().deepCopy(fields()[0].schema(), other.mail_to);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mail_subject)) {
        this.mail_subject = data().deepCopy(fields()[1].schema(), other.mail_subject);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.mail_conten)) {
        this.mail_conten = data().deepCopy(fields()[2].schema(), other.mail_conten);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.mail_status)) {
        this.mail_status = data().deepCopy(fields()[3].schema(), other.mail_status);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'mail_to' field.
      * Mail to ...
      * @return The value.
      */
    public java.lang.CharSequence getMailTo() {
      return mail_to;
    }

    /**
      * Sets the value of the 'mail_to' field.
      * Mail to ...
      * @param value The value of 'mail_to'.
      * @return This builder.
      */
    public com.dimsoft.pockafka.schemas.BadAvroMail.Builder setMailTo(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.mail_to = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'mail_to' field has been set.
      * Mail to ...
      * @return True if the 'mail_to' field has been set, false otherwise.
      */
    public boolean hasMailTo() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'mail_to' field.
      * Mail to ...
      * @return This builder.
      */
    public com.dimsoft.pockafka.schemas.BadAvroMail.Builder clearMailTo() {
      mail_to = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'mail_subject' field.
      * Subject of the mail
      * @return The value.
      */
    public java.lang.CharSequence getMailSubject() {
      return mail_subject;
    }

    /**
      * Sets the value of the 'mail_subject' field.
      * Subject of the mail
      * @param value The value of 'mail_subject'.
      * @return This builder.
      */
    public com.dimsoft.pockafka.schemas.BadAvroMail.Builder setMailSubject(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.mail_subject = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'mail_subject' field has been set.
      * Subject of the mail
      * @return True if the 'mail_subject' field has been set, false otherwise.
      */
    public boolean hasMailSubject() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'mail_subject' field.
      * Subject of the mail
      * @return This builder.
      */
    public com.dimsoft.pockafka.schemas.BadAvroMail.Builder clearMailSubject() {
      mail_subject = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'mail_conten' field.
      * Content of the mail
      * @return The value.
      */
    public java.lang.CharSequence getMailConten() {
      return mail_conten;
    }

    /**
      * Sets the value of the 'mail_conten' field.
      * Content of the mail
      * @param value The value of 'mail_conten'.
      * @return This builder.
      */
    public com.dimsoft.pockafka.schemas.BadAvroMail.Builder setMailConten(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.mail_conten = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'mail_conten' field has been set.
      * Content of the mail
      * @return True if the 'mail_conten' field has been set, false otherwise.
      */
    public boolean hasMailConten() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'mail_conten' field.
      * Content of the mail
      * @return This builder.
      */
    public com.dimsoft.pockafka.schemas.BadAvroMail.Builder clearMailConten() {
      mail_conten = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'mail_status' field.
      * Status of the mail
      * @return The value.
      */
    public java.lang.CharSequence getMailStatus() {
      return mail_status;
    }

    /**
      * Sets the value of the 'mail_status' field.
      * Status of the mail
      * @param value The value of 'mail_status'.
      * @return This builder.
      */
    public com.dimsoft.pockafka.schemas.BadAvroMail.Builder setMailStatus(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.mail_status = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'mail_status' field has been set.
      * Status of the mail
      * @return True if the 'mail_status' field has been set, false otherwise.
      */
    public boolean hasMailStatus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'mail_status' field.
      * Status of the mail
      * @return This builder.
      */
    public com.dimsoft.pockafka.schemas.BadAvroMail.Builder clearMailStatus() {
      mail_status = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BadAvroMail build() {
      try {
        BadAvroMail record = new BadAvroMail();
        record.mail_to = fieldSetFlags()[0] ? this.mail_to : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.mail_subject = fieldSetFlags()[1] ? this.mail_subject : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.mail_conten = fieldSetFlags()[2] ? this.mail_conten : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.mail_status = fieldSetFlags()[3] ? this.mail_status : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BadAvroMail>
    WRITER$ = (org.apache.avro.io.DatumWriter<BadAvroMail>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BadAvroMail>
    READER$ = (org.apache.avro.io.DatumReader<BadAvroMail>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
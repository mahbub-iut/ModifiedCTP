
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.PrintWriter;/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'MVizMsg'
 * message type.
 */

public class MVizMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 18;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 147;

    /** Create a new MVizMsg of size 18. */
    public MVizMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new MVizMsg of the given data_length. */
    public MVizMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MVizMsg with the given data_length
     * and base offset.
     */
    public MVizMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MVizMsg using the given byte array
     * as backing store.
     */
    public MVizMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MVizMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public MVizMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MVizMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public MVizMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MVizMsg embedded in the given message
     * at the given base offset.
     */
    public MVizMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MVizMsg embedded in the given message
     * at the given base offset and length.
     */
    public MVizMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }
    public void updateDB(int d,int g ,int f, int i){
     
      String url = "jdbc:mysql://localhost:3306/mvizdata";
      String user = "root";
      String password = "007";
	    
      PreparedStatement pst = null;
    
      try {
    	Class.forName("com.mysql.jdbc.Driver");
        Connection con;
        con = DriverManager.getConnection(url, user, password);
        
        pst = con.prepareStatement("INSERT INTO mviz SET origin = ?, count = ?, voltage=?, voltage_cm =?");
        pst.setInt(1, d);
        pst.setInt(2, g);
		pst.setInt(3,f);
  	  	pst.setInt(4,i);
        pst.executeUpdate();
    
      } catch (Exception e) {
      	e.printStackTrace();
	System.out.println("Problem");
      }

    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <MVizMsg> \n";
      int a,b,c,d;
      a=0;
      b=0;
      c=0;
      d=0;
      try {
        s += "  [version=0x"+Long.toHexString(get_version())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [interval=0x"+Long.toHexString(get_interval())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [origin=0x"+Long.toHexString(get_origin())+"]\n";
        a=get_origin();
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [count=0x"+Long.toHexString(get_count())+"]\n";
        b=get_count();
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [reading=0x"+Long.toHexString(get_reading())+"]\n";
        c=get_reading();
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [reading_cm=0x"+Long.toHexString(get_reading_cm())+"]\n";
        d=get_reading_cm();
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [etx=0x"+Long.toHexString(get_etx())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [link_route_value=0x"+Long.toHexString(get_link_route_value())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [link_route_addr=0x"+Long.toHexString(get_link_route_addr())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      	 updateDB(a,b,c,d);
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: version
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'version' is signed (false).
     */
    public static boolean isSigned_version() {
        return false;
    }

    /**
     * Return whether the field 'version' is an array (false).
     */
    public static boolean isArray_version() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'version'
     */
    public static int offset_version() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'version'
     */
    public static int offsetBits_version() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'version'
     */
    public int get_version() {
        return (int)getUIntBEElement(offsetBits_version(), 16);
    }

    /**
     * Set the value of the field 'version'
     */
    public void set_version(int value) {
        setUIntBEElement(offsetBits_version(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'version'
     */
    public static int size_version() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'version'
     */
    public static int sizeBits_version() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: interval
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'interval' is signed (false).
     */
    public static boolean isSigned_interval() {
        return false;
    }

    /**
     * Return whether the field 'interval' is an array (false).
     */
    public static boolean isArray_interval() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'interval'
     */
    public static int offset_interval() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'interval'
     */
    public static int offsetBits_interval() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'interval'
     */
    public int get_interval() {
        return (int)getUIntBEElement(offsetBits_interval(), 16);
    }

    /**
     * Set the value of the field 'interval'
     */
    public void set_interval(int value) {
        setUIntBEElement(offsetBits_interval(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'interval'
     */
    public static int size_interval() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'interval'
     */
    public static int sizeBits_interval() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: origin
    //   Field type: int, unsigned
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'origin' is signed (false).
     */
    public static boolean isSigned_origin() {
        return false;
    }

    /**
     * Return whether the field 'origin' is an array (false).
     */
    public static boolean isArray_origin() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'origin'
     */
    public static int offset_origin() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'origin'
     */
    public static int offsetBits_origin() {
        return 32;
    }

    /**
     * Return the value (as a int) of the field 'origin'
     */
    public int get_origin() {
        return (int)getUIntBEElement(offsetBits_origin(), 16);
    }

    /**
     * Set the value of the field 'origin'
     */
    public void set_origin(int value) {
        setUIntBEElement(offsetBits_origin(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'origin'
     */
    public static int size_origin() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'origin'
     */
    public static int sizeBits_origin() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: count
    //   Field type: int, unsigned
    //   Offset (bits): 48
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'count' is signed (false).
     */
    public static boolean isSigned_count() {
        return false;
    }

    /**
     * Return whether the field 'count' is an array (false).
     */
    public static boolean isArray_count() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'count'
     */
    public static int offset_count() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'count'
     */
    public static int offsetBits_count() {
        return 48;
    }

    /**
     * Return the value (as a int) of the field 'count'
     */
    public int get_count() {
        return (int)getUIntBEElement(offsetBits_count(), 16);
    }

    /**
     * Set the value of the field 'count'
     */
    public void set_count(int value) {
        setUIntBEElement(offsetBits_count(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'count'
     */
    public static int size_count() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'count'
     */
    public static int sizeBits_count() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: reading
    //   Field type: int, unsigned
    //   Offset (bits): 64
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'reading' is signed (false).
     */
    public static boolean isSigned_reading() {
        return false;
    }

    /**
     * Return whether the field 'reading' is an array (false).
     */
    public static boolean isArray_reading() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'reading'
     */
    public static int offset_reading() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'reading'
     */
    public static int offsetBits_reading() {
        return 64;
    }

    /**
     * Return the value (as a int) of the field 'reading'
     */
    public int get_reading() {
        return (int)getUIntBEElement(offsetBits_reading(), 16);
    }

    /**
     * Set the value of the field 'reading'
     */
    public void set_reading(int value) {
        setUIntBEElement(offsetBits_reading(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'reading'
     */
    public static int size_reading() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'reading'
     */
    public static int sizeBits_reading() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: reading_cm
    //   Field type: int, unsigned
    //   Offset (bits): 80
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'reading_cm' is signed (false).
     */
    public static boolean isSigned_reading_cm() {
        return false;
    }

    /**
     * Return whether the field 'reading_cm' is an array (false).
     */
    public static boolean isArray_reading_cm() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'reading_cm'
     */
    public static int offset_reading_cm() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'reading_cm'
     */
    public static int offsetBits_reading_cm() {
        return 80;
    }

    /**
     * Return the value (as a int) of the field 'reading_cm'
     */
    public int get_reading_cm() {
        return (int)getUIntBEElement(offsetBits_reading_cm(), 16);
    }

    /**
     * Set the value of the field 'reading_cm'
     */
    public void set_reading_cm(int value) {
        setUIntBEElement(offsetBits_reading_cm(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'reading_cm'
     */
    public static int size_reading_cm() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'reading_cm'
     */
    public static int sizeBits_reading_cm() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: etx
    //   Field type: int, unsigned
    //   Offset (bits): 96
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'etx' is signed (false).
     */
    public static boolean isSigned_etx() {
        return false;
    }

    /**
     * Return whether the field 'etx' is an array (false).
     */
    public static boolean isArray_etx() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'etx'
     */
    public static int offset_etx() {
        return (96 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'etx'
     */
    public static int offsetBits_etx() {
        return 96;
    }

    /**
     * Return the value (as a int) of the field 'etx'
     */
    public int get_etx() {
        return (int)getUIntBEElement(offsetBits_etx(), 16);
    }

    /**
     * Set the value of the field 'etx'
     */
    public void set_etx(int value) {
        setUIntBEElement(offsetBits_etx(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'etx'
     */
    public static int size_etx() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'etx'
     */
    public static int sizeBits_etx() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: link_route_value
    //   Field type: int, unsigned
    //   Offset (bits): 112
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'link_route_value' is signed (false).
     */
    public static boolean isSigned_link_route_value() {
        return false;
    }

    /**
     * Return whether the field 'link_route_value' is an array (false).
     */
    public static boolean isArray_link_route_value() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'link_route_value'
     */
    public static int offset_link_route_value() {
        return (112 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'link_route_value'
     */
    public static int offsetBits_link_route_value() {
        return 112;
    }

    /**
     * Return the value (as a int) of the field 'link_route_value'
     */
    public int get_link_route_value() {
        return (int)getUIntBEElement(offsetBits_link_route_value(), 16);
    }

    /**
     * Set the value of the field 'link_route_value'
     */
    public void set_link_route_value(int value) {
        setUIntBEElement(offsetBits_link_route_value(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'link_route_value'
     */
    public static int size_link_route_value() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'link_route_value'
     */
    public static int sizeBits_link_route_value() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: link_route_addr
    //   Field type: int, unsigned
    //   Offset (bits): 128
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'link_route_addr' is signed (false).
     */
    public static boolean isSigned_link_route_addr() {
        return false;
    }

    /**
     * Return whether the field 'link_route_addr' is an array (false).
     */
    public static boolean isArray_link_route_addr() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'link_route_addr'
     */
    public static int offset_link_route_addr() {
        return (128 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'link_route_addr'
     */
    public static int offsetBits_link_route_addr() {
        return 128;
    }

    /**
     * Return the value (as a int) of the field 'link_route_addr'
     */
    public int get_link_route_addr() {
        return (int)getUIntBEElement(offsetBits_link_route_addr(), 16);
    }

    /**
     * Set the value of the field 'link_route_addr'
     */
    public void set_link_route_addr(int value) {
        setUIntBEElement(offsetBits_link_route_addr(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'link_route_addr'
     */
    public static int size_link_route_addr() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'link_route_addr'
     */
    public static int sizeBits_link_route_addr() {
        return 16;
    }

}
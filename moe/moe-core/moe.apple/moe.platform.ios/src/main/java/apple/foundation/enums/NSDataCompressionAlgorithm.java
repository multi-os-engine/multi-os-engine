package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Various algorithms provided for compression APIs. See NSData and NSMutableData.
 * 
 * API-Since: 13.0
 */
@Generated
public final class NSDataCompressionAlgorithm {
    @Generated
    private NSDataCompressionAlgorithm() {
    }

    /**
     * LZFSE is the recommended compression algorithm if you don't have a specific reason to use another algorithm. Note
     * that LZFSE is intended for use with Apple devices only. This algorithm generally compresses better than Zlib, but
     * not as well as LZMA. It is generally slower than LZ4.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long LZFSE = 0x0000000000000000L;
    /**
     * LZ4 is appropriate if compression speed is critical. LZ4 generally sacrifices compression ratio in order to
     * achieve its greater speed.
     * This implementation of LZ4 makes a small modification to the standard format, which is described in greater
     * detail in <compression.h>.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long LZ4 = 0x0000000000000001L;
    /**
     * LZMA is appropriate if compression ratio is critical and memory usage and compression speed are not a factor.
     * LZMA is an order of magnitude slower for both compression and decompression than other algorithms. It can also
     * use a very large amount of memory, so if you need to compress large amounts of data on embedded devices with
     * limited memory you should probably avoid LZMA.
     * Encoding uses LZMA level 6 only, but decompression works with any compression level.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long LZMA = 0x0000000000000002L;
    /**
     * Zlib is appropriate if you want a good balance between compression speed and compression ratio, but only if you
     * need interoperability with non-Apple platforms. Otherwise, LZFSE is generally a better choice than Zlib.
     * Encoding uses Zlib level 5 only, but decompression works with any compression level. It uses the raw DEFLATE
     * format as described in IETF RFC 1951.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Zlib = 0x0000000000000003L;
}
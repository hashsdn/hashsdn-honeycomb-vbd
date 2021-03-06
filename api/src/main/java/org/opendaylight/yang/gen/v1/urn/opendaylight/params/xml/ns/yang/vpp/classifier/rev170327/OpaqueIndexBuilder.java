package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.vpp.classifier.rev170327;


/**
 * The purpose of generated class in src/main/java for Union types is to create new instances of unions from a string representation.
 * In some cases it is very difficult to automate it since there can be unions such as (uint32 - uint16), or (string - uint32).
 *
 * The reason behind putting it under src/main/java is:
 * This class is generated in form of a stub and needs to be finished by the user. This class is generated only once to prevent
 * loss of user code.
 *
 */
public class OpaqueIndexBuilder {

    public static OpaqueIndex getDefaultInstance(java.lang.String defaultValue) {
        try {
            final long value = Long.parseLong(defaultValue); // u32 value
            return new OpaqueIndex(value);
        } catch (NumberFormatException e) {
            return new OpaqueIndex(
                org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.vpp.classifier.rev170327.VppNodeBuilder
                    .getDefaultInstance(defaultValue));
        }
    }

}

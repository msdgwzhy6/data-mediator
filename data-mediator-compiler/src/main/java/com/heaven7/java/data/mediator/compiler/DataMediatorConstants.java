package com.heaven7.java.data.mediator.compiler;

/**
 * Created by heaven7 on 2017/9/13 0013.
 */
public final class DataMediatorConstants {

    public static final FieldData FD_SELECTABLE ;

    static {
        FD_SELECTABLE = new FieldData();
        FD_SELECTABLE.setPropertyName("selected");
        FD_SELECTABLE.setTypeCompat(new FieldData.TypeCompat(null, null){
            @Override
            public String toString() {
                return NAME_boolean;
            }
        });
        FD_SELECTABLE.setComplexType(0);
    }

    // some cs of MediatorSharedProperties
    public static final String SIMPLE_NAME_PROPERTY          = "Property";
    public static final String PKG_PROP                      = "com.heaven7.java.data.mediator";
    public static final String PKG_SHARED_PROP               = "com.heaven7.java.data.mediator.factory";
    public static final String PKG_JAVA_BASE_UTIL            = "com.heaven7.java.base.util";

    public static final String SIMPLE_NAME_THROWABLES        = "Throwables";
    public static final String SIMPLE_NAME_ObJECTS           = "Objects";

    public static final String SIMPLE_NAME_SHARED_PROP       = "SharedProperties";
    public static final String SIMPLE_NAME_BASE_MEDIATOR     = "BaseMediator";
    public static final String SIMPLE_NAME_LIST_PROP_EDITOR  = "ListPropertyEditor";
    public static final String SIMPLE_NAME_PROP_INTERCEPTOR  = "PropertyInterceptor";
    public static final String SIMPLE_NAME_DATA_POOL         = "DataPools";
    public static final String SIMPLE_NAME_POOLABLE          = "Poolable";

    //field name of anno
    public static final String STR_PROP_NAME = "propName";
    public static final String STR_SERIA_NAME = "seriaName";
    public static final String STR_FLAGS = "flags";
    public static final String STR_TYPE = "type";
    public static final String STR_COMPLEXT_TYPE = "complexType";

    public static final String NAME_PARCELABLE = "android.os.Parcelable";
    public static final String NAME_COPYA = "com.heaven7.java.data.mediator.ICopyable";
    public static final String NAME_RESET = "com.heaven7.java.data.mediator.IResetable";
    public static final String NAME_SHARE = "com.heaven7.java.data.mediator.IShareable";
    public static final String NAME_SNAP  = "com.heaven7.java.data.mediator.ISnapable";
    public static final String NAME_SERIALIZABLE = "java.io.Serializable";
    public static final String NAME_SELECTABLE   = "com.heaven7.adapter.ISelectable";

    public static final String INTERFACE_SUFFIX = "Module";
    public static final String IMPL_SUFFIX      = "Module_Impl";
    public static final String PROXY_SUFFIX     = "_Proxy";

    public static final String SET_PREFIX   = "set";
    public static final String GET_PREFIX   = "get";
    public static final String IS_PREFIX    = "is";

    public static final String BEGIN_PREFIX   = "begin";
    public static final String EDITOR_SUFFIX  = "Editor";

    public static final String NAME_int      = "int";
    public static final String NAME_long     = "long";
    public static final String NAME_short    = "short";
    public static final String NAME_byte     = "byte";
    public static final String NAME_boolean  = "boolean";
    public static final String NAME_float    = "float";
    public static final String NAME_double   = "double";
    public static final String NAME_char     = "char";

    public static final String NAME_INTEGER    = "java.lang.Integer";
    public static final String NAME_LONG       = "java.lang.Long";
    public static final String NAME_SHORT      = "java.lang.Short";
    public static final String NAME_BYTE       = "java.lang.Byte";
    public static final String NAME_BOOLEAN    = "java.lang.Boolean";
    public static final String NAME_FLOAT      = "java.lang.Float";
    public static final String NAME_DOUBLE     = "java.lang.Double";
    public static final String NAME_CHARACTER  =  "java.lang.Character";

    public static final String NAME_STRING =  "java.lang.String";
    // private static final String NAME_SPARSE_ARRAY =  "android.util.SparseArray";
}

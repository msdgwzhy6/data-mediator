package com.heaven7.data.mediator.demo.testpackage;

import android.os.Parcelable;

import com.heaven7.adapter.ISelectable;
import com.heaven7.java.data.mediator.Field;
import com.heaven7.java.data.mediator.Fields;

import static com.heaven7.java.data.mediator.FieldFlags.COMPLEXT_ARRAY;
import static com.heaven7.java.data.mediator.FieldFlags.COMPLEXT_LIST;
import static com.heaven7.java.data.mediator.FieldFlags.FLAGS_ALL_SCOPES;

/**
 * Created by heaven7 on 2017/8/29 0029.
 */
@Fields({
        @Field(propName = "student", seriaName = "class_1", type = TestBind.class, flags = FLAGS_ALL_SCOPES),
        @Field(propName = "student2", seriaName = "class_2", type = TestBind.class,
                complexType = COMPLEXT_LIST, flags = FLAGS_ALL_SCOPES),
        @Field(propName = "student3", seriaName = "class_3", type = TestBind.class,
                complexType = COMPLEXT_ARRAY, flags = FLAGS_ALL_SCOPES),
        @Field(propName = "student4", seriaName = "class_4", type = TestBind.class, flags = FLAGS_ALL_SCOPES)
})
public interface TestInterface2 extends StudentBind, Parcelable, ISelectable {
}

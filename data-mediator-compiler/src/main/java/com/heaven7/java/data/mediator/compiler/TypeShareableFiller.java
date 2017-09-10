package com.heaven7.java.data.mediator.compiler;

/**
 * Created by heaven7 on 2017/9/1 0001.
 */
/*public*/ class TypeShareableFiller extends TypeResetableFiller {

    @Override
    public String getInterfaceName() {
        return Util.NAME_SHARE;
    }

    @Override
    public int getInterfaceFlag() {
        return FieldData.FLAG_SHARE;
    }

}

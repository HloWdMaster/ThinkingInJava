package myexceptions;


class DynamicFieldsException extends Exception {

}

public class DynamicFields {

    private Object[][] fields;

    public DynamicFields(int initialSize) { //初始化
        fields = new Object[initialSize][2];
        for (int i = 0; i < initialSize; i++) {
            fields[i] = new Object[]{null, null};
        }
    }

    @Override
    public String toString() {  //输出fields
        StringBuilder result = new StringBuilder();
        for (Object[] obj : fields) {
            result.append(obj[0]);
            result.append(":");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }

    private int hasField(String id) {   //判断是否存在当前值
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0])) {
                return i;
            }
        }
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchFieldException { //获取id位置
        int fieldNum = hasField(id);
        if (fieldNum == -1) {
            throw new NoSuchFieldException();
        }
        return fieldNum;
    }

    private int makeField(String id) {  //新增id
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }
        //没有空id ,新增一个
        Object[][] tem = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; i++) {
            tem[i] = fields[i];
        }
        for (int i = fields.length; i < tem.length; i++) {
            tem[i] = new Object[]{null, null};
        }
        return makeField(id);
    }

    public Object getField(String id) throws NoSuchFieldException { //获取id对应的值
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object value) throws DynamicFieldsException {
        if (value == null) {
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());  //与空指针异常连接
            throw dfe;
        }
        int fieldNum = hasField(id);
        if (fieldNum == -1) {   //如果此id没有值
            fieldNum = makeField(id);
        }
        Object result = null;
        try {
            result = getField(id);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        fields[fieldNum][1] = value;
        return fields;
    }

    public static void main(String[] args) {
        DynamicFields df = new DynamicFields(3);
        System.out.println(df);
        try {
            df.setField("d", "A value for d");
            df.setField("numner", "47");
            df.setField("number2", "48");
            System.out.println(df);
            df.setField("number3", 11);
            System.out.println("df:" + df);
            System.out.println("df.getField(\"d\"):"+df.getField("d"));
            Object field = df.setField("d", null);
        } catch (DynamicFieldsException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}



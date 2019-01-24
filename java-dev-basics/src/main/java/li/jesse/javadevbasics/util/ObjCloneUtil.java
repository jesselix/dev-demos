package li.jesse.javadevbasics.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjCloneUtil {

    @SuppressWarnings("unchecked")
    public static  <T>T cloneObj(T obj){

        T retVal = null;

        try{
            // 将对象写入流中
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);


            // 从流中读出对象
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);

            retVal = (T)ois.readObject();

        }catch(Exception e){
            e.printStackTrace();
        }

        return retVal;
    }
}

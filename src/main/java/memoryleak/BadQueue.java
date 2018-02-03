package memoryleak;

import java.util.ArrayList;

public class BadQueue<T> {
    int pos = -1;
    private ArrayList<T> internal = new ArrayList<T>();

    public T dequeue(){
        if(pos > -1){
            return internal.get(pos--);
        }else{
            return null;
        }
    }

    public void queue(T t){
        internal.add(++pos , t);
    }
}
